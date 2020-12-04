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
public class ModInd1 {

    // Importation Constructeur avec Paramètres
    public ModInd1(int idDI, String prenom, String nom, String tel1, String tel2, String commune_rattach, String commune_actuelle, String titre_accompagnement, String sexe, String tranche_age, String etude, String niveau_etude, 
            String formation_prof, String experience_prof, String domaine_exp_prof, String duree_exp_prof, String statut_exp_prof, String commune_exp_prof, String departement_exp_prof, String region_exp_prof, String autre_region_exp_prof, 
            String hors_sengal_exp_prof, String situation_prof) {
        this.idDI = idDI;
        this.prenom = prenom;
        this.nom = nom;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.commune_rattach = commune_rattach;
        this.commune_actuelle = commune_actuelle;
        this.titre_accompagnement = titre_accompagnement;
        this.sexe = sexe;
        this.tranche_age = tranche_age;
        this.etude = etude;
        this.niveau_etude = niveau_etude;
        this.formation_prof = formation_prof;
        this.experience_prof = experience_prof;
        this.domaine_exp_prof = domaine_exp_prof;
        this.duree_exp_prof = duree_exp_prof;
        this.statut_exp_prof = statut_exp_prof;
        this.commune_exp_prof = commune_exp_prof;
        this.departement_exp_prof = departement_exp_prof;
        this.region_exp_prof = region_exp_prof;
        this.autre_region_exp_prof = autre_region_exp_prof;
        this.hors_sengal_exp_prof = hors_sengal_exp_prof;
        this.situation_prof = situation_prof;
    }
    
    
    
    
    //Déclaration des variables
    
    private int idDI;
    private String prenom;
    private String nom;
    private String tel1;
    private String tel2;
    private String commune_rattach;
    private String commune_actuelle;
    private String titre_accompagnement;
    private String sexe;
    private String tranche_age;
    private String etude;
    private String niveau_etude;
    private String formation_prof;
    private String experience_prof;
    private String domaine_exp_prof;
    private String duree_exp_prof;
    private String statut_exp_prof;
    private String commune_exp_prof;
    private String departement_exp_prof;
    private String region_exp_prof;
    private String autre_region_exp_prof;
    private String hors_sengal_exp_prof;
    private String situation_prof;
      
    
    
    // Importation Getteurs and Setteurs

    public int getIdDI() {
        return idDI;
    }

    public void setIdDI(int idDI) {
        this.idDI = idDI;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getCommune_rattach() {
        return commune_rattach;
    }

    public void setCommune_rattach(String commune_rattach) {
        this.commune_rattach = commune_rattach;
    }

    public String getCommune_actuelle() {
        return commune_actuelle;
    }

    public void setCommune_actuelle(String commune_actuelle) {
        this.commune_actuelle = commune_actuelle;
    }

    public String getTitre_accompagnement() {
        return titre_accompagnement;
    }

    public void setTitre_accompagnement(String titre_accompagnement) {
        this.titre_accompagnement = titre_accompagnement;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTranche_age() {
        return tranche_age;
    }

    public void setTranche_age(String tranche_age) {
        this.tranche_age = tranche_age;
    }

    public String getEtude() {
        return etude;
    }

    public void setEtude(String etude) {
        this.etude = etude;
    }

    public String getNiveau_etude() {
        return niveau_etude;
    }

    public void setNiveau_etude(String niveau_etude) {
        this.niveau_etude = niveau_etude;
    }

    public String getFormation_prof() {
        return formation_prof;
    }

    public void setFormation_prof(String formation_prof) {
        this.formation_prof = formation_prof;
    }

    public String getExperience_prof() {
        return experience_prof;
    }

    public void setExperience_prof(String experience_prof) {
        this.experience_prof = experience_prof;
    }

    public String getDomaine_exp_prof() {
        return domaine_exp_prof;
    }

    public void setDomaine_exp_prof(String domaine_exp_prof) {
        this.domaine_exp_prof = domaine_exp_prof;
    }

    public String getDuree_exp_prof() {
        return duree_exp_prof;
    }

    public void setDuree_exp_prof(String duree_exp_prof) {
        this.duree_exp_prof = duree_exp_prof;
    }

    public String getStatut_exp_prof() {
        return statut_exp_prof;
    }

    public void setStatut_exp_prof(String statut_exp_prof) {
        this.statut_exp_prof = statut_exp_prof;
    }

    public String getCommune_exp_prof() {
        return commune_exp_prof;
    }

    public void setCommune_exp_prof(String commune_exp_prof) {
        this.commune_exp_prof = commune_exp_prof;
    }

    public String getDepartement_exp_prof() {
        return departement_exp_prof;
    }

    public void setDepartement_exp_prof(String departement_exp_prof) {
        this.departement_exp_prof = departement_exp_prof;
    }

    public String getRegion_exp_prof() {
        return region_exp_prof;
    }

    public void setRegion_exp_prof(String region_exp_prof) {
        this.region_exp_prof = region_exp_prof;
    }

    public String getAutre_region_exp_prof() {
        return autre_region_exp_prof;
    }

    public void setAutre_region_exp_prof(String autre_region_exp_prof) {
        this.autre_region_exp_prof = autre_region_exp_prof;
    }

    public String getHors_sengal_exp_prof() {
        return hors_sengal_exp_prof;
    }

    public void setHors_sengal_exp_prof(String hors_sengal_exp_prof) {
        this.hors_sengal_exp_prof = hors_sengal_exp_prof;
    }

    public String getSituation_prof() {
        return situation_prof;
    }

    public void setSituation_prof(String situation_prof) {
        this.situation_prof = situation_prof;
    }
                            
                            
}
