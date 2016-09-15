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
public class Collections {
    
    public static void main(String[] args) {
        
        ArrayList<String> liste = new ArrayList<String>();
        
        liste.add("A");
        liste.add("B");
        liste.add("B");
        liste.add("C");
        System.out.println( liste );
        
        liste.remove( 2 );
        
        
        
        System.out.println( liste.get(2) );
    }
}
