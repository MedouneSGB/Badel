/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class JavaConnect {
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps =  null;
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/badel","root","");
        System.out.println("Vous etes connecté a mysql de wampserver");
        ps = con.prepareStatement(sql);
        
        return ps;
    }
    
    com.mysql.jdbc.Connection con;
        public com.mysql.jdbc.Connection createConnection(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = (com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/badel","root","");
                System.out.println("Vous etes connecté a mysql de wampserver");
            }  catch (ClassNotFoundException e){e.printStackTrace();}
               catch (SQLException sqe){sqe.printStackTrace();}
            
            return con;
        }
    
}