/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author alunos
 */
public class ConectaBanco {
    public static Connection getConexao() throws ClassNotFoundException, SQLException{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/dbcrud";
            String USER = "root";
            String PASSWORD = "";
            return DriverManager.getConnection(URL, USER, PASSWORD);
        
    }
}
