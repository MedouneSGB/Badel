/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbutil.JavaConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author user
 */
public class dataAccess {
    
    PreparedStatement pst;
    ResultSet rs;
    String val = null;

    public void addNewInd(ModInd n) {
        try {

            System.out.println(n.getPrenom() + " " + n.getInscritPar());
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
            System.out.println("Tout est ok" + n.getNom());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsCol1(ModCol1 ndc) {
        try {

            System.out.println(ndc.getTitre()+ " " + ndc.getCommune());
            PreparedStatement ps = JavaConnect.getPreparedStatement("insert into p1demandeurcollectif (idDC, formulaire_id, titre, nat_juridique, denomination, reconnaisance_juridique, pays, region, departement, commune, hors_senegal, date_creation, total_membre, total_homme, total_femme) values (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, ndc.getFormulaire_id());
            ps.setString(2, ndc.getTitre());
            ps.setString(3, ndc.getNat_juridique());
            ps.setString(4, ndc.getDenomination());
            ps.setString(5, ndc.getReconnaisance_juridique());
            ps.setString(6, ndc.getPays());
            ps.setString(7, ndc.getRegion());
            ps.setString(8, ndc.getDepartement());
            ps.setString(9, ndc.getCommune());
            ps.setString(10, ndc.getHors_senegal());
            ps.setString(11, ndc.getDate_creation());
            ps.setString(12, ndc.getTotal_membre());
            ps.setString(13, ndc.getTotal_homme());
            ps.setString(14, ndc.getTotal_femme());

            ps.executeUpdate();
            System.out.println("Tout est ok" + ndc.getTitre());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addLogin(ModLogin ModLogin) {
        try {

            PreparedStatement ps = JavaConnect.getPreparedStatement("insert into login (Id, Prenom, Nom, Civilite, Login, Pass, Role) values (NULL,?,?,?,?,?,?)");
            ps.setString(1, ModLogin.getPrenom());
            ps.setString(2, ModLogin.getNom());
            ps.setString(3, ModLogin.getCivilite());
            ps.setString(4, ModLogin.getLogin());
            ps.setString(5, ModLogin.getPass());
            ps.setString(6, ModLogin.getRole());

            ps.executeUpdate();
            System.out.println("Tout est ok" + ModLogin.getNom());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String IdentAdmin(ModConClient modConClient) {
        Connection con = new dbutil.JavaConnect().createConnection();

            System.out.println("La Methode de connexion 0 marche");
        String sql = "SELECT * FROM loginadmin where Pseudo=? and Password=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, modConClient.getLogin());
            pst.setString(2, modConClient.getPass());
            rs = pst.executeQuery();

            System.out.println("La Methode de connexion 1 marche");
            if (rs.next()) {
                String a = rs.getString(1);
                val = "ok" + a;
            } else {
                val = "no";
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return val;

    }
}
