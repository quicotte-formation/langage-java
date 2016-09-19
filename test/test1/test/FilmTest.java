/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import static org.junit.Assert.*;
import test1.classes.Film;

/**
 *
 * @author tom
 */
public class FilmTest {
    
    @Test
    public void test1(){
        
        Film f1 = new Film("Pulp Fiction", 120, "blabla", 1995);
        Film f2 = new Film("Reservoir Dogs", 90, "blabla", 1993);
        
        System.out.println( Film.getNbElem() );
        
        
    }
}
