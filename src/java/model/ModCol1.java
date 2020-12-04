/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HP
 */
public class ModCol1 {

    //Déclaration des Variables
    private int IdDC;
    private String titre;
    private String nat_juridique;
    private String denomination;
    private String reconnaisance_juridique;
    private String pays;
    private String region;
    private String departement;
    private String commune;
    private String hors_senegal;
    private String date_creation;
    private String total_membre;
    private String total_homme;
    private String total_femme;
    // Importation Constructeur avec Paramètres  

    public ModCol1(int IdDC, String titre, String nat_juridique, String denomination,
            String reconnaisance_juridique, String pays, String region,
            String departement, String commune, String hors_senegal,
            String date_creation, String total_membre, String total_homme,
            String total_femme) {
        
        this.IdDC = IdDC;
        this.titre = titre;
        this.nat_juridique = nat_juridique;
        this.denomination = denomination;
        this.reconnaisance_juridique = reconnaisance_juridique;
        this.pays = pays;
        this.region = region;
        this.departement = departement;
        this.commune = commune;
        this.hors_senegal = hors_senegal;
        this.date_creation = date_creation;
        this.total_membre = total_membre;
        this.total_homme = total_homme;
        this.total_femme = total_femme;
    }       

    // Importation des Getteurs et Setteurs
    public int getIdDC() {
        return IdDC;
    }

    public void setIdDC(int IdDC) {
        this.IdDC = IdDC;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNat_juridique() {
        return nat_juridique;
    }

    public void setNat_juridique(String nat_juridique) {
        this.nat_juridique = nat_juridique;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getReconnaisance_juridique() {
        return reconnaisance_juridique;
    }

    public void setReconnaisance_juridique(String reconnaisance_juridique) {
        this.reconnaisance_juridique = reconnaisance_juridique;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getHors_senegal() {
        return hors_senegal;
    }

    public void setHors_senegal(String hors_senegal) {
        this.hors_senegal = hors_senegal;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public String getTotal_membre() {
        return total_membre;
    }

    public void setTotal_membre(String total_membre) {
        this.total_membre = total_membre;
    }

    public String getTotal_homme() {
        return total_homme;
    }

    public void setTotal_homme(String total_homme) {
        this.total_homme = total_homme;
    }

    public String getTotal_femme() {
        return total_femme;
    }

    public void setTotal_femme(String total_femme) {
        this.total_femme = total_femme;
    }

}
