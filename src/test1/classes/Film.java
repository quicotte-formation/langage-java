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
public class Film {

    private static long nbElem = 0;
    private String titre;
    private Integer dureeEnMinutes;
    private String synopsis;
    private Integer annee;

    public Film(String titre, Integer dureeEnMinutes, String synopsis, Integer annee) {
        this();
        this.titre = titre;
        this.dureeEnMinutes = dureeEnMinutes;
        this.synopsis = synopsis;
        this.annee = annee;
    }

    public static long getNbElem() {
        return nbElem;
    }

    public Film() {
        nbElem++;
    }

    @Override
    public String toString() {
        return "FILM: titre=" + titre + " synopsis=" + synopsis;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getDureeEnMinutes() {
        return dureeEnMinutes;
    }

    public void setDureeEnMinutes(Integer dureeEnMinutes) {
        this.dureeEnMinutes = dureeEnMinutes;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

}
