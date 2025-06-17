/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunos
 */
public class GamesDAO {
    public void cadastrar(model.Games game) throws SQLException, ClassNotFoundException{
        Connection con = util.ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into game(nome, sinopse, datalancamento, preco, plataforma, quantidadesvendidas, categoria, desenvolvedora, notametacritic) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
        comando.setString(1, game.getNome());
        comando.setString(2, game.getSinopse());
        comando.setString(3, game.getDatalancamento());
        comando.setDouble(4, game.getPreco());
        comando.setString(5, game.getPlataforma());
        comando.setDouble(6, game.getQuantidadesvendidas());
        comando.setString(7, game.getCategoria());
        comando.setString(8, game.getDesenvolvedora());
        comando.setDouble(9, game.getNotametacritic());
        comando.execute();
        con.close();
    }
    
    public void deletar(model.Games game) throws SQLException, ClassNotFoundException{
        Connection con = util.ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from game where id = ?");
        comando.setInt(1, game.getId());
        comando.execute();
        con.close();
    }
    
    public void atualizar(model.Games game) throws SQLException, ClassNotFoundException{
        Connection con = util.ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("update game set plataforma = ?, preco= ?, notametacritic = ? where id=?");
        
        comando.setString(1, game.getPlataforma());
        comando.setDouble(2, game.getPreco());
        comando.setDouble(3, game.getNotametacritic());
        comando.setInt(4, game.getId());
        comando.execute();
        con.close();
    }
    public model.Games consultarById(model.Games game) throws ClassNotFoundException, SQLException {
        Connection con = util.ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from game where id = ?");
        comando.setInt(1, game.getId());
        
        ResultSet rs = comando.executeQuery();
        
        if (rs.next()) {
            
            game.setNome(rs.getString("nome"));
            game.setSinopse(rs.getString("sinopse"));
            game.setDatalancamento(rs.getString("datalancamento"));
            game.setPreco(rs.getDouble("preco")); 
            game.setPlataforma(rs.getString("plataforma"));
            game.setQuantidadesvendidas(rs.getDouble("quantidadesvendidas"));
            game.setCategoria(rs.getString("categoria"));
            game.setDesenvolvedora(rs.getString("desenvolvedora"));
            game.setNotametacritic(rs.getDouble("notametacritic"));
        }       
        comando.execute();
        con.close();
        return game;
    }
        public List<model.Games> consultarTodos() throws ClassNotFoundException, SQLException {
        Connection con = util.ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from game");        
        ResultSet rs = comando.executeQuery();        
        List<model.Games> lgames = new ArrayList<model.Games>();
        int cont = 0;
        while(rs.next()){
            model.Games g = new model.Games();
            g.setId(rs.getInt("id"));
            g.setNome(rs.getString("nome"));
            g.setSinopse(rs.getString("sinopse"));
            g.setDatalancamento(rs.getString("datalancamento"));
            g.setPreco(rs.getDouble("preco")); 
            g.setPlataforma(rs.getString("plataforma"));
            g.setQuantidadesvendidas(rs.getDouble("quantidadesvendidas"));
            g.setCategoria(rs.getString("categoria"));
            g.setDesenvolvedora(rs.getString("desenvolvedora"));
            g.setNotametacritic(rs.getDouble("notametacritic")); 
            lgames.add(g);
            cont++;
        }
        System.out.println("Cont..: " + cont);
        con.close();
        return lgames;
    } 
}
