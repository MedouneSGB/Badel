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
public class ModInd3 {

    // Importation Constructeur avec Paramètres  
    public ModInd3(int IdDI, String soutien_immediat, String regi_commerce, String ninea, String ref_prof, String compte_bancaire_sfd, String nom_banque_sfd, String soutien_parent, String ville_parent, String pays_parent) {
        this.IdDI = IdDI;
        this.soutien_immediat = soutien_immediat;
        this.regi_commerce = regi_commerce;
        this.ninea = ninea;
        this.ref_prof = ref_prof;
        this.compte_bancaire_sfd = compte_bancaire_sfd;
        this.nom_banque_sfd = nom_banque_sfd;
        this.soutien_parent = soutien_parent;
        this.ville_parent = ville_parent;
        this.pays_parent = pays_parent;
    }
        
    
    //Déclaration des Variables
       private int IdDI;
       private String soutien_immediat;
       private String regi_commerce;
       private String ninea;
       private String ref_prof;
       private String compte_bancaire_sfd;
       private String nom_banque_sfd;
       private String soutien_parent;
       private String ville_parent;
       private String pays_parent;
                  
    // Importation des Getteurs et Setteurs

    public int getIdDI() {
        return IdDI;
    }

    public void setIdDI(int IdDI) {
        this.IdDI = IdDI;
    }

    public String getSoutien_immediat() {
        return soutien_immediat;
    }

    public void setSoutien_immediat(String soutien_immediat) {
        this.soutien_immediat = soutien_immediat;
    }

    public String getRegi_commerce() {
        return regi_commerce;
    }

    public void setRegi_commerce(String regi_commerce) {
        this.regi_commerce = regi_commerce;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getRef_prof() {
        return ref_prof;
    }

    public void setRef_prof(String ref_prof) {
        this.ref_prof = ref_prof;
    }

    public String getCompte_bancaire_sfd() {
        return compte_bancaire_sfd;
    }

    public void setCompte_bancaire_sfd(String compte_bancaire_sfd) {
        this.compte_bancaire_sfd = compte_bancaire_sfd;
    }

    public String getNom_banque_sfd() {
        return nom_banque_sfd;
    }

    public void setNom_banque_sfd(String nom_banque_sfd) {
        this.nom_banque_sfd = nom_banque_sfd;
    }

    public String getSoutien_parent() {
        return soutien_parent;
    }

    public void setSoutien_parent(String soutien_parent) {
        this.soutien_parent = soutien_parent;
    }

    public String getVille_parent() {
        return ville_parent;
    }

    public void setVille_parent(String ville_parent) {
        this.ville_parent = ville_parent;
    }

    public String getPays_parent() {
        return pays_parent;
    }

    public void setPays_parent(String pays_parent) {
        this.pays_parent = pays_parent;
    }
    
    
}
