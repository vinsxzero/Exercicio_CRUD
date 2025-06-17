/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alunos
 */
public class Principal {
    public static void main(String[] args){
        /*model.Games game = new model.Games();
        model.dao.GamesDAO gamedao = new model.dao.GamesDAO();
        game.setCategoria("Ação");
        game.setDatalancamento("15/05/2010");
        game.setNome("Devil May Cry Remastered");
        game.setDesenvolvedora("Capcom");
        game.setNotametacritic(9.65);
        game.setPlataforma("Playstation, Xbox, Windows e Linux");
        game.setPreco(200);
        game.setQuantidadesvendidas(1000000000);
        game.setSinopse("DmC apresenta a história de Dante, o protagonista da série, recontada em um cenário contemporâneo. O Dante de DMC é um adolescente sem respeito a qualquer autoridade, ou mesmo à sociedade como um todo. Dante sabe que não é humano, mas que também não é como os demônios que o atormentaram durante sua vida.");
        
        try{
            gamedao.cadastrar(game);
            System.out.println("Cadastrados");
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Erro...: " + ex.getMessage());
        }*/
        
        /*model.Games game1 = new model.Games();
        model.dao.GamesDAO gamedao1 = new model.dao.GamesDAO();
        game1.setPlataforma("Playstation, Xbox, PC e Switch");
        game1.setPreco(250);
        game1.setNotametacritic(8.65);
        game1.setId(4);
        
        try{
            gamedao1.atualizar(game1);
            System.out.println("Atualizado");
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Erro: "+ ex.getMessage());
        }*/
        /*model.Games game2 =new model.Games();
        model.dao.GamesDAO gamedao2  = new model.dao.GamesDAO();
        game2.setId(3);
        try{
            gamedao2.deletar(game2);
            System.out.println("Deletado");
        }catch(SQLException|ClassNotFoundException ex){
            System.out.println("Erro: "+ ex.getMessage());
        }*/
        
        model.Games game3 =  new model.Games();
        model.dao.GamesDAO gamedao3 = new model.dao.GamesDAO();
        game3.setId(4);
        System.out.println(game3.getId());
        try{
            gamedao3.consultarById(game3);
            System.out.println("ID Consultado");
            if(game3.getNome() != null){
                System.out.println("Id: "+(game3.getId()));
                System.out.println("Nome: "+ (game3.getNome()));
                System.out.println("Categoria: "+ (game3.getCategoria()));
                System.out.println("Nota Metacritic: " + (game3.getNotametacritic()));
                System.out.println("Desenvolvedora: " + game3.getDesenvolvedora());
                System.out.println("Preco: "+ game3.getPreco());
                System.out.println("Nota: "+ game3.getNotametacritic());
                System.out.println("Sinopse: "+ game3.getSinopse());
            }else{
                System.out.println("ID nao encontrado");
            }
        }catch(SQLException |ClassNotFoundException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
       /*
        model.Games game4 = new model.Games();
        model.dao.GamesDAO gamedao4 = new model.dao.GamesDAO();
        try{
            List<model.Games> lgame = gamedao4.consultarTodos();
            for (model.Games game5 : lgame){
                System.out.println("Id: "+(game5.getId()));
                System.out.println("Preco: "+ game5.getPreco());
                System.out.println("Nota: "+ game5.getNotametacritic());
                System.out.println("Sinopse: "+ game5.getSinopse());
            }
        }catch(SQLException |ClassNotFoundException ex){
            System.out.println("Erro: " + ex.getMessage());
        }*/
    }
}
