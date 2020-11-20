/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbutil.JavaConnect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.new1;
import model.Newdc;


/**
 *
 * @author user
 */
public class dataAccess {
     public void addNew(new1 n){
        try {
            
            System.out.println(n.getPrenom()+" "+n.getInscritPar());
            PreparedStatement ps = JavaConnect.getPreparedStatement("insert into demandeurindiv (id, Prenom, Nom, DateNaiss, LieuNaiss, CNI, Civilite, tAge, Adresse, Sit_Matrimoniale, Tel1, Tel2, PrenomP, PrenomM, NomM, Scolarisation, Niv_Scolarisation, inscritPar, login, pass) values (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, n.getPrenom());
            ps.setString(2, n.getNom());
            ps.setString(3, n.getDateNaissance());
            ps.setString(4, n.getLieuNaissance());
            ps.setString(5, n.getCni());
            ps.setString(6, n.getCivilite());
            ps.setString(7, n.gettAge());
            ps.setString(8, n.getAdresse());
            ps.setString(9, n.getSituationMatrim());
            ps.setString(10, n.getTel1());
            ps.setString(11, n.getTel2());
            ps.setString(12, n.getPrenomPere());
            ps.setString(13, n.getPrenomMere());
            ps.setString(14, n.getNomMere());
            ps.setString(15, n.getEtudes());
            ps.setString(16, n.getNiveau());
            ps.setString(17, n.getInscritPar());
            ps.setString(18, n.getLogin());
            ps.setString(19, n.getPass());
            
            
            
            
            ps.executeUpdate();
            System.out.println("Tout est ok"+n.getNom());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         public void addNew(Newdc ndc){
        try {
            
            System.out.println(ndc.getPrenom()+" "+ndc.getCommune());
            PreparedStatement ps = JavaConnect.getPreparedStatement("insert into demandeurcollectif (Id, Statut, Prenom, Nom, Denomination, Sigle, Tel1, Tel2, LieuResidence, Region, Departement, Commune) values (NULL,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, ndc.getStatut());
            ps.setString(2, ndc.getPrenom());
            ps.setString(3, ndc.getNom());
            ps.setString(4, ndc.getDenomination());
            ps.setString(5, ndc.getSigle());
            ps.setString(6, ndc.getTel1());
            ps.setString(7, ndc.getTel2());
            ps.setString(8, ndc.getLieuResidence());
            ps.setString(9, ndc.getRegion());
            ps.setString(10, ndc.getDepartement());
            ps.setString(11, ndc.getCommune());
            
            ps.executeUpdate();
            System.out.println("Tout est ok"+ndc.getNom());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
