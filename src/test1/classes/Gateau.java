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
public class Gateau{
    
    private static String forme="étoile";
    private String gout;
    private String couleur;

    public Gateau(String gout, String couleur) {
        this.gout = gout;
        this.couleur = couleur;
    }

    
    
    public Gateau() {
        
        this.couleur = "noir";
        this.gout = "chocolat";
    }

    
    
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public static String getForme() {
        return forme;
    }

    public static void setForme(String forme) {
        Gateau.forme = forme;
    }

    public String getGout() {
        return gout;
    }

    public void setGout(String gout) {
        this.gout = gout;
    }

    @Override
    public String toString() {
        return gout + " " + forme + " " + couleur;
    }
    
    
    
}
