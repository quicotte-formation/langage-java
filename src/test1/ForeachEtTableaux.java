/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author tom
 */
public class ForeachEtTableaux {
    
    public static void main(String[] args) {
        
        int[] tab = new int[3];
        
        int[][] plateau = new int[3][3];
        
        plateau[2][1] = 123;
        
        for( int indice=0 ; indice<tab.length ; indice++ ){
            tab[indice] = indice + 1;
        }

        tab = new int[4];
        
        // Affiche tab
        for(int elemAct : tab){
            
            System.out.print( elemAct );
        }
    }
}
