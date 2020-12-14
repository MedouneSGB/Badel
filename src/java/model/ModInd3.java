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
public class ModInd3 {
    
    
                private String soutien_immediat;
                private String regi_commerce;
                private String numero_regi_comm;
                private String ninea;
                
                private String numero_ninea;
                private String reference_prof;
                private String numero_reference_prof;
                private String compte_bancaire_sfd;
                
                private String nom_banque_sfd;
                private String numero_compte_banque_sfd;
                private String soutien_parent;
                private String ville_parent;
                
                private String pays_parent;
                private String formulaire_id;

    public String getFormulaire_id() {
        return formulaire_id;
    }

    public void setFormulaire_id(String formulaire_id) {
        this.formulaire_id = formulaire_id;
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

    public String getNumero_regi_comm() {
        return numero_regi_comm;
    }

    public void setNumero_regi_comm(String numero_regi_comm) {
        this.numero_regi_comm = numero_regi_comm;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getNumero_ninea() {
        return numero_ninea;
    }

    public void setNumero_ninea(String numero_ninea) {
        this.numero_ninea = numero_ninea;
    }

    public String getReference_prof() {
        return reference_prof;
    }

    public void setReference_prof(String reference_prof) {
        this.reference_prof = reference_prof;
    }

    public String getNumero_reference_prof() {
        return numero_reference_prof;
    }

    public void setNumero_reference_prof(String numero_reference_prof) {
        this.numero_reference_prof = numero_reference_prof;
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

    public String getNumero_compte_banque_sfd() {
        return numero_compte_banque_sfd;
    }

    public void setNumero_compte_banque_sfd(String numero_compte_banque_sfd) {
        this.numero_compte_banque_sfd = numero_compte_banque_sfd;
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

    public ModInd3(String formulaire_id,String soutien_immediat, String regi_commerce, String numero_regi_comm, String ninea, String numero_ninea, String reference_prof, String numero_reference_prof, String compte_bancaire_sfd, String nom_banque_sfd, String numero_compte_banque_sfd, String soutien_parent, String ville_parent, String pays_parent) {
       
        this.formulaire_id = formulaire_id;
        this.soutien_immediat = soutien_immediat;
        this.regi_commerce = regi_commerce;
        this.numero_regi_comm = numero_regi_comm;
        this.ninea = ninea;
        this.numero_ninea = numero_ninea;
        this.reference_prof = reference_prof;
        this.numero_reference_prof = numero_reference_prof;
        this.compte_bancaire_sfd = compte_bancaire_sfd;
        this.nom_banque_sfd = nom_banque_sfd;
        this.numero_compte_banque_sfd = numero_compte_banque_sfd;
        this.soutien_parent = soutien_parent;
        this.ville_parent = ville_parent;
        this.pays_parent = pays_parent;
    }
                
                
                
    
}
