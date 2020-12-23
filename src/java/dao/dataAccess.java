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

    // Add Inscription Collective1
    public void InsCol1(ModCol1 ndc) {
        try {

            System.out.println(ndc.getTitre() + " " + ndc.getCommune());
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
        // Add Inscription Collective2

     public void addModCol2(ModCol2 mc2) {
        try {

            System.out.println(mc2.getActiv_equip()+ " " + mc2.getNat_intern_reseau());
            PreparedStatement ps = JavaConnect.getPreparedStatement("insert into p2demandeurcollectif (idDC, formulaire_id, activ_equip, activ_equip_depart, activ_equip_region, activ_equip_autre_region, activ_equip_hors_senegal, activ_economique, mont_cap_social, nbre_empl_perman, nbre_empl_tempor, mont_eparg_mob, mont_endettement, mont_sub_recu, fonctionnalite, prise_decision, charte_relationnelle, plan_developpement, manuel_procedure, part_princ_technique, part_princ_financier, app_reseau, nature_reseau, localite_reseau, departement_reseau, international_reseau, sit_economique ) values (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    
                    ps.setString(1, mc2.getActiv_equip());
                    ps.setString(2, mc2.getActiv_equip_depart());
                    ps.setString(3, mc2.getActiv_equip_region());
                    ps.setString(4, mc2.getActiv_equip_autre_region());
                    ps.setString(5, mc2.getActiv_equip_hors_senegal());
                    ps.setString(6, mc2.getActiv_economique());
                    ps.setString(7, mc2.getMont_cap_social());
                    ps.setString(8, mc2.getNbre_empl_perman());
                    ps.setString(9, mc2.getNbre_empl_tempor());
                    ps.setString(10, mc2.getMont_eparg_mob());
                    ps.setString(11, mc2.getMont_endettement());
                    ps.setString(12, mc2.getMont_sub_recu());   
                    ps.setString(13, mc2.getFonctionnalite());
                    ps.setString(14, mc2.getPrise_decision());
                    ps.setString(15, mc2.getCharte_relationnelle());
                    ps.setString(16, mc2.getPlan_developpement());
                    ps.setString(17, mc2.getManuel_procedure());
                    ps.setString(18, mc2.getPart_princ_technique());
                    ps.setString(19, mc2.getPart_princ_financier());
                    ps.setString(20, mc2.getApp_reseau());
                    ps.setString(21, mc2.getNature_reseau());
                    ps.setString(22, mc2.getLocalite_reseau());
                    ps.setString(23, mc2.getDepartement_reseau());
                    ps.setString(24, mc2.getNat_intern_reseau());
                    ps.setString(25, mc2.getFormulaire_id());  
                    ps.setString(26, mc2.getSit_economique());                   

            ps.executeUpdate();
            System.out.println("Tout est ok" + mc2.getActiv_equip());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Add Login
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

    //Login
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
    
    // Add Inscription Individuelle1
        public void addModInd1(ModInd1 mi1){
        
          try{
            System.out.println(mi1.getPrenom()+" "+mi1.getHors_senegal());
            PreparedStatement ps = JavaConnect.getPreparedStatement("insert into p1demandeurindividuel (idDI, formulaire_id, prenom, nom, tel1, tel2, commune_rattach, commune_actuelle, sexe, tranche_age, etude, niveau_etude, formation_prof, sejour, pays_sejourne, motif_sejour, experience_prof, domaine_exp_prof, duree_exp_prof, statut_exp_prof, commune_exp_prof, departement_exp_prof, region_exp_prof, autre_region_exp_prof, hors_senegal, situation_prof, titre_accompagnement) values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
                ps.setString(1, mi1.getFormulaire_id());
                ps.setString(2, mi1.getPrenom());
                ps.setString(3, mi1.getNom());
                ps.setString(4, mi1.getTel1());
                ps.setString(5, mi1.getTel2());
                ps.setString(6, mi1.getCommune_rattach());
                
                ps.setString(7, mi1.getCommune_actuelle());
                ps.setString(8, mi1.getSexe());
                ps.setString(9, mi1.getTranche_age());
                ps.setString(10, mi1.getEtude());
                ps.setString(11, mi1.getNiveau_etude());
               
                ps.setString(12, mi1.getFormation_prof());
                ps.setString(13, mi1.getSejour());
                ps.setString(14, mi1.getPays_sejourne());
                ps.setString(15, mi1.getMotif_sejour());
                ps.setString(16, mi1.getExperience_prof());
                
                ps.setString(17, mi1.getDomaine_exp_prof());
                ps.setString(18, mi1.getDuree_exp_prof());
                ps.setString(19, mi1.getStatut_exp_prof());
                ps.setString(20, mi1.getCommune_exp_prof());
                ps.setString(21, mi1.getDepartement_exp_prof());
                
                ps.setString(22, mi1.getRegion_exp_prof());
                ps.setString(23, mi1.getAutre_region_exp_prof());
                ps.setString(24, mi1.getHors_senegal());
                ps.setString(25, mi1.getSituation_prof());
                ps.setString(26, mi1.getTitre_accompagnement());
                
                ps.executeUpdate();
                System.out.println("Tout est ok"+mi1.getPays_sejourne());
                  
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
            
                System.out.println("Erreur DAO insert ind-1 ! "+ex);
        }
    } 
    
    
        // Add Inscription Individuelle2
    public void addModInd2(ModInd2 mi2){
        
          try{
            System.out.println(mi2.getCategories()+" "+mi2.getMarqueurs());
            PreparedStatement ps = JavaConnect.getPreparedStatement("insert into p2demandeurindividuel (idDI, formulaire_id, categories, sous_categories, parcours, marqueurs) values (null,?,?,?,?,?)");
            
                ps.setString(1, mi2.getFormulaire_id());
                ps.setString(2, mi2.getCategories());
                ps.setString(3, mi2.getSous_categories());
                ps.setString(4, mi2.getParcours());
                ps.setString(5, mi2.getMarqueurs());
                
                  ps.executeUpdate();
                  System.out.println("Tout est ok"+mi2.getCategories());
                  
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
            
                  System.out.println("Erreur addModInd2"+ex);
        }
          }
          
          // Add Inscription Individuelle3
      public void addModInd3(ModInd3 mi3){
        
          try{
            System.out.println(mi3.getSoutien_immediat()+" "+mi3.getPays_parent());
            PreparedStatement ps = JavaConnect.getPreparedStatement("insert into p3demandeurindividuel (idDI, formulaire_id, soutien_immediat,regi_commerce,numero_regi_comm,ninea,numero_ninea,reference_prof,numero_reference_prof,compte_bancaire_sfd,nom_banque_sfd,numero_compte_banque_sfd,soutien_parent,ville_parent,pays_parent ) values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
                    ps.setString(1, mi3.getFormulaire_id());
                    ps.setString(2, mi3.getSoutien_immediat());
                    ps.setString(3, mi3.getRegi_commerce());
                    ps.setString(4, mi3.getNumero_regi_comm());
                    ps.setString(5, mi3.getNinea());
                    ps.setString(6, mi3.getNumero_ninea());
                    ps.setString(7, mi3.getReference_prof());
                    ps.setString(8, mi3.getNumero_reference_prof());
                    ps.setString(9, mi3.getCompte_bancaire_sfd());
                    ps.setString(10, mi3.getNom_banque_sfd());
                    ps.setString(11, mi3.getNumero_compte_banque_sfd());                
                    ps.setString(12, mi3.getSoutien_immediat());
                    ps.setString(13, mi3.getVille_parent());
                    ps.setString(14, mi3.getPays_parent());
                
                
                        ps.executeUpdate();
                        System.out.println("Tout est ok"+mi3.getSoutien_immediat());
                  
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        // Updates Formulaire Individuelle
      
       // Updates Formulaire Collective
      
      
      // Search Formulaire Individuelle
      
      
      // Search Formulaire Collective
      
      
      //Delete Formulaire Individuelle
      
      
      
      
      // Search Formulaire Individuelle
      
      
      
      
      
      
}
