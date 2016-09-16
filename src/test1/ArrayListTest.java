/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author tom
 */
public class ArrayListTest {
    
    public static void main(String[] args) {
        
        // Crée liste 1
        ArrayList liste1 = new ArrayList();
        liste1.add("A");
        liste1.add("B");
        liste1.add(1);
        liste1.add(true);
        liste1.add("Coucou");
        liste1.add(4);
        liste1.add(5);
        liste1.add(6);
        
        // Crée liste contenant éléms à supprimer
        ArrayList<Integer> liste2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            
            liste2.add(i);
        }
        
        // Supprime
        liste1.removeAll(liste2);
        
        // Affiche
        System.out.println( liste1 );
    }
}
