/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author HP
 */
public class ModCol2 {
    
     //Déclaration des Variables
            private int idDC;
            private String activ_equip;
            private String activ_equip_depart;
            private String activ_equip_region;
            private String activ_equip_autre_region;
            private String activ_equip_hors_senegal;
            private String activ_economique;
            private String sit_economique;
            private String fonctionnalité;
            private String prise_decision;
            private String charte_relationnelle;
            private String plan_developpement;
            private String manuel_procedure;
            private String part_princ_technique;
            private String part_princ_financier;
            private String app_reseau;
            private String nature_reseau;
            private String localite_reseau;
            private String departement_reseau;
            private String international_reseau;

    // Importation Constructeur avec Paramètres 

    public ModCol2(int idDC, String activ_equip, String activ_equip_depart, String activ_equip_region, 
                    String activ_equip_autre_region, String activ_equip_hors_senegal, String activ_economique, 
                    String sit_economique, String fonctionnalité, String prise_decision, String charte_relationnelle, 
                    String plan_developpement, String manuel_procedure, String part_princ_technique, String part_princ_financier, 
                    String app_reseau, String nature_reseau, String localite_reseau, String departement_reseau, String international_reseau) {
        this.idDC = idDC;
        this.activ_equip = activ_equip;
        this.activ_equip_depart = activ_equip_depart;
        this.activ_equip_region = activ_equip_region;
        this.activ_equip_autre_region = activ_equip_autre_region;
        this.activ_equip_hors_senegal = activ_equip_hors_senegal;
        this.activ_economique = activ_economique;
        this.sit_economique = sit_economique;
        this.fonctionnalité = fonctionnalité;
        this.prise_decision = prise_decision;
        this.charte_relationnelle = charte_relationnelle;
        this.plan_developpement = plan_developpement;
        this.manuel_procedure = manuel_procedure;
        this.part_princ_technique = part_princ_technique;
        this.part_princ_financier = part_princ_financier;
        this.app_reseau = app_reseau;
        this.nature_reseau = nature_reseau;
        this.localite_reseau = localite_reseau;
        this.departement_reseau = departement_reseau;
        this.international_reseau = international_reseau;
    }
            
            
    // Importation des Getteurs et Setteurs

    public int getIdDC() {
        return idDC;
    }

    public void setIdDC(int idDC) {
        this.idDC = idDC;
    }

    public String getActiv_equip() {
        return activ_equip;
    }

    public void setActiv_equip(String activ_equip) {
        this.activ_equip = activ_equip;
    }

    public String getActiv_equip_depart() {
        return activ_equip_depart;
    }

    public void setActiv_equip_depart(String activ_equip_depart) {
        this.activ_equip_depart = activ_equip_depart;
    }

    public String getActiv_equip_region() {
        return activ_equip_region;
    }

    public void setActiv_equip_region(String activ_equip_region) {
        this.activ_equip_region = activ_equip_region;
    }

    public String getActiv_equip_autre_region() {
        return activ_equip_autre_region;
    }

    public void setActiv_equip_autre_region(String activ_equip_autre_region) {
        this.activ_equip_autre_region = activ_equip_autre_region;
    }

    public String getActiv_equip_hors_senegal() {
        return activ_equip_hors_senegal;
    }

    public void setActiv_equip_hors_senegal(String activ_equip_hors_senegal) {
        this.activ_equip_hors_senegal = activ_equip_hors_senegal;
    }

    public String getActiv_economique() {
        return activ_economique;
    }

    public void setActiv_economique(String activ_economique) {
        this.activ_economique = activ_economique;
    }

    public String getSit_economique() {
        return sit_economique;
    }

    public void setSit_economique(String sit_economique) {
        this.sit_economique = sit_economique;
    }

    public String getFonctionnalité() {
        return fonctionnalité;
    }

    public void setFonctionnalité(String fonctionnalité) {
        this.fonctionnalité = fonctionnalité;
    }

    public String getPrise_decision() {
        return prise_decision;
    }

    public void setPrise_decision(String prise_decision) {
        this.prise_decision = prise_decision;
    }

    public String getCharte_relationnelle() {
        return charte_relationnelle;
    }

    public void setCharte_relationnelle(String charte_relationnelle) {
        this.charte_relationnelle = charte_relationnelle;
    }

    public String getPlan_developpement() {
        return plan_developpement;
    }

    public void setPlan_developpement(String plan_developpement) {
        this.plan_developpement = plan_developpement;
    }

    public String getManuel_procedure() {
        return manuel_procedure;
    }

    public void setManuel_procedure(String manuel_procedure) {
        this.manuel_procedure = manuel_procedure;
    }

    public String getPart_princ_technique() {
        return part_princ_technique;
    }

    public void setPart_princ_technique(String part_princ_technique) {
        this.part_princ_technique = part_princ_technique;
    }

    public String getPart_princ_financier() {
        return part_princ_financier;
    }

    public void setPart_princ_financier(String part_princ_financier) {
        this.part_princ_financier = part_princ_financier;
    }

    public String getApp_reseau() {
        return app_reseau;
    }

    public void setApp_reseau(String app_reseau) {
        this.app_reseau = app_reseau;
    }

    public String getNature_reseau() {
        return nature_reseau;
    }

    public void setNature_reseau(String nature_reseau) {
        this.nature_reseau = nature_reseau;
    }

    public String getLocalite_reseau() {
        return localite_reseau;
    }

    public void setLocalite_reseau(String localite_reseau) {
        this.localite_reseau = localite_reseau;
    }

    public String getDepartement_reseau() {
        return departement_reseau;
    }

    public void setDepartement_reseau(String departement_reseau) {
        this.departement_reseau = departement_reseau;
    }

    public String getInternational_reseau() {
        return international_reseau;
    }

    public void setInternational_reseau(String international_reseau) {
        this.international_reseau = international_reseau;
    }
            
}
