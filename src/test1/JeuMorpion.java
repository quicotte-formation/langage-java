/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;

/**
 *
 * @author tom
 */
public class JeuMorpion {

    /**
     * Affiche le plateau p dans la console.
     *
     * @param p
     */
    public static void affiche(char[][] p) {

        for (char[] ligneAct : p) {

            for (char elemAct : ligneAct) {

                System.out.print(elemAct);
            }

            System.out.println("");
        }
    }

    public static void saisieEtPlacementCoordonneesJoueur(char[][] tab, char symboleJoueur) throws IOException {

        boolean sortieBoucle = true;
        int x;
        int y;
        do {
            // Saisie coords joueur
            x = ConsoleUtil.lireInt("Joueur " + symboleJoueur + " entrez ligne:");
            y = ConsoleUtil.lireInt("Joueur " + symboleJoueur + " entrez colonne:");

            // Verif coordonnes valides
            if (x < 0 || x > 2 || y < 0 || y > 2) {
                System.out.println("Coordonnées hors plateau");
                sortieBoucle = false;
            }

            // Verif si case libre
            if (tab[x][y] != '.') {
                System.out.println("Case occupée");
                sortieBoucle = false;
            }

        } while (sortieBoucle == false);

        // Placement
        tab[x][y] = symboleJoueur;
    }

    public static void main(String[] args) throws IOException {

        int taille = 3;
        char[][] plateau = new char[taille][taille];

        // Initialie le plateau
        for (int l = 0; l < plateau.length; l++) {

            for (int c = 0; c < plateau[l].length; c++) {

                plateau[l][c] = '.';
            }
        }

        while (true) {
            // Vérif et place coord J1
            saisieEtPlacementCoordonneesJoueur(plateau, 'x');

            // Quitte si fin de partie
            boolean termine = verifieFinDePartie(plateau);
            if (termine == true) {
                System.out.println("JEU TERMINE");
                return;
            }

            // Vérif et place coord J2
            saisieEtPlacementCoordonneesJoueur(plateau, 'o');

            // Quitte si fin de partie
            termine = verifieFinDePartie(plateau);
            if (termine) {
                System.out.println("JEU TERMINE");
                return;
            }

            // Affichage tableau
            affiche(plateau);
        }
    }

    private static boolean verifieFinDePartie(char[][] plateau) {

        if (plateau[0][0] == 'x' && plateau[1][1] == 'x' && plateau[2][2] == 'x') {
            System.err.println("Joueur X gagne");
            return true;
        }

        // Checke ligne 0
        for (int i = 0; i < 3; i++) {
            if (plateau[i][0] == 'x' && plateau[i][1] == 'x' && plateau[i][2] == 'x') {
                System.err.println("Joueur X gagne");
                return true;
            }
        }
        
        return false;
    }
}
