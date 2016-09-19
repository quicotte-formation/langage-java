/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import test1.classes.Animal;
import test1.classes.Poisson;
import test1.classes.Serpent;
import test1.classes.Sleepable;
import test1.classes.Tortue;

/**
 *
 * @author tom
 */
public class AnimalTest {

    @Test
    public void sleepableTest(){
        
        Sleepable s = new Poisson();
    }
    
    //@Test
    public void test(){
        
        // Crée liste de 3 animaux
        List<Animal> animaux = new ArrayList<>();
        
        animaux.add( new Poisson() );
        animaux.add( new Serpent() );
        animaux.add( new Tortue() );
        
        // Itère sur la liste, et fait bouger et manger chacun (à sa façon)
        for (Animal animal : animaux) {
            
            System.out.println( animal.getClass().getSimpleName() );
            animal.bouger();
            animal.manger();
        }
    }
}
