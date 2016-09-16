/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

/**
 *
 * @author tom
 */
public class CollectionsTest {
    
    @Test
    public void itereSurCles(){
        HashMap<String, String> map = new HashMap<>();
        
        map.put("java", "Langage de prog objet");
        map.put("c", "Langage de prog structuré");
        map.put("ruby", "Langage de script objet");

        for (String key : map.keySet()) {
            
            System.out.println( key + " : " + map.get(key) );
        }
    }
    
    @Test
    public void fusionnerMaps(){
        HashMap<String, String> map = new HashMap<>();
        
        map.put("java", "Langage de prog objet");
        map.put("c", "Langage de prog structuré");
        map.put("ruby", "Langage de script objet");
        
        HashMap<String, String> map2 = new HashMap<>();
        
        map2.put("PHP", "blabla");
        map2.put("Python", "blabla");
        
        map.putAll(map2);
        
        System.out.println( map );
    }
    
    @Test
    public void supprimeLangC(){
        HashMap<String, String> map = new HashMap<>();
        
        map.put("java", "Langage de prog objet");
        map.put("c", "Langage de prog structuré");
        map.put("ruby", "Langage de script objet");
        
        map.remove("c");
        
        System.out.println( map );
    }
    
    @Test
    public void remplateDefRuby(){
        HashMap<String, String> map = new HashMap<>();
        
        map.put("java", "Langage de prog objet");
        map.put("c", "Langage de prog structuré");
        map.put("ruby", "Langage de script objet");
        
        map.replace("ruby", "Super langage");
        
        System.out.println( map );
    }
    
    @Test
    public void recupRuby(){
        
        HashMap<String, String> map = new HashMap<>();
        
        map.put("java", "Langage de prog objet");
        map.put("c", "Langage de prog structuré");
        map.put("ruby", "Langage de script objet");
        
        String def = map.get("ruby");
        
        System.out.println( def );
    }
    
    public void blabla(){
        
        HashMap<String, String> map = new HashMap<>();
        
        map.put("java", "Langage de prog objet");
        map.put("c", "Langage de prog structuré");
        map.put("ruby", "Langage de script objet");
        
        map.size();// Renvoie 3
        map.get("ruby");// Renvoie "Langage de script objet"
        map.keySet();// Renvoie un set avec java,c,ruby
        map.values();// Renvoie toutes les valeurs, pas les clés
        map.putAll(map);// Ajoute une map ds une autre
        map.remove("c");// Supprime l'entrée c dans la map
        map.replace("c", "langage préhistorique");// Remplace
        map.clear();// Vide la map
    }
}
