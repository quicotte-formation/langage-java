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
public class Genre {
    
    private static int nbElem;
    
    private String nom;

    public Genre(String nom) {
        this();
        this.nom = nom;
    }

    public Genre() {
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

    @Override
    public String toString() {
        return "Genre{" + "nom=" + nom + '}';
    }
}
