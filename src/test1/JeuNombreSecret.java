/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author tom
 */
public class JeuNombreSecret {

    public static void main(String[] args) throws IOException {

        // Util entre min / max
        String minStr = ConsoleUtil.lireTexte("Minimum:");
        int min = Integer.valueOf(minStr);
        
        String maxStr = ConsoleUtil.lireTexte("Maximum:");
        int max = Integer.valueOf(maxStr);
        
        // Générer nb secret en fonction de ce min / max
        int nombreSecret = MathUtil.genererNbrAleatRECURSIVE(min, max);
        int essai;
        int nbEssais = 0;
                
        do {
            String essaiString = ConsoleUtil.lireTexte("Votre essai:");
            essai = Integer.valueOf(essaiString);

            nbEssais = nbEssais + 1; // nbEssais ++
            
            if (nombreSecret > essai) {
                System.out.println("Plus grand");
            } else if(nombreSecret < essai){
                System.out.println("Plus petit");
            }
            
            
        } while (nombreSecret != essai);
        
        // Partie est gagnée et nbEssais déterminé
        
        // Calcule appréciation
        String appreciation="";
        if( nbEssais<3 ){
            appreciation = "GENIAL!";
        }else if(nbEssais < 6){
            appreciation = "SUPER";
        }
        
        // Affiche score et appréciation
        System.out.println("Gagné en " + nbEssais + " essais" + " : " + appreciation);
    }
}
