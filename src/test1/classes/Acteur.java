/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author tom
 */
public class Acteur {
    
    private static int nbElem=0;
    private String nom;
    private String prenom;

    public Acteur(String nom, String prenom) {
        this();
        this.nom = nom;
        this.prenom = prenom;
    }

    public Acteur() {
        nbElem++;
    }

    public static int getNbElem() {
        return nbElem;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Acteur{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
}
