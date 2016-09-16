/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author tom
 */
public class SetTest {
    
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(3);
        liste.add(4);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        
        liste.addAll(set);
        
        System.out.println( liste );
    }
}
