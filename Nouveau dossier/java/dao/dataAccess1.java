/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbUtils.JavaConnect;
import models.ModCol1;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class dataAccess {
    public void addInd1(ModCol1 mc1){
        try{
            System.out.println(mc1.getTitre()+" "+mc1.getTotal_femme());
            PreparedStatement ps = JavaConnect.getPreparedStatement(insert into p1demandeurcollectif()values())
            
            
            
            
            
            
            
        }catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
