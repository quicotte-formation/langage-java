/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;




/**
 *
 * @author tom
 */
public class MathUtil {

    public static int factorielleRecursive(int nombre){
        
        if( nombre<0 ){
            throw new RuntimeException("Erreur mathématique!");
        }
        
        if( nombre<=1 ){
            return 1;
        }
        
        // nombre > 1
        
        return nombre * factorielleRecursive(nombre-1);
        
    }
    
    public static int factorielle(int nombre){
        
        if( nombre<0 ){
            throw new RuntimeException("Erreur mathématique!");
        }
        
        int res=nombre;
        while( nombre>1 ){
            
            res = res * (nombre-1);
            
            nombre--;
        }
        
        return res;
    }
    
    public static int exposant(int nombre, int puissance){
        
        if( puissance<=0 )
            return 1;
        
        // Puissance > 0
        int resultat = nombre;
        while( puissance>1 ){
         
            resultat = resultat * nombre;
            puissance --;
        }
        
        return resultat;
    }
    
    public static int genererNbrAleatRECURSIVE(int min, int max){
        
        // Renvoie une erreur si min>=max
        if( min>=max )
            throw new RuntimeException("Erreur: min >= max");
        
        // min < max
        int nbAleat = (int) (Math.random()*max);
        if( nbAleat<=max && nbAleat>=min )
            return nbAleat;
        
        return genererNbrAleatRECURSIVE(min, max);
    }
    
    public static int genererNbrAleatITERATIVE(int min, int max){
        
        // Renvoie une erreur si min>=max
        if( min>=max )
            throw new RuntimeException("Erreur: min >= max");
        
        // min < max
        int nbGenere;
        do{
            nbGenere = (int) (Math.random() * max);
        }while(nbGenere<min );
        
        return nbGenere;
    }
    
    public static int genererNbrAleatMATH(int min, int max){
        
        // Renvoie une erreur si min>=max
        if( min>=max )
            throw new RuntimeException("Erreur: min >= max");
        
        // min < max
        
        int res = min + (int)(Math.random() * (max-min));
        
        return res;
    }
    
    public static int genererNbrAleat(){
        
        double nombreSecretDecimal = Math.random() * 100 + 1;
        int nombreSecret = (int) nombreSecretDecimal;
        
        return nombreSecret;
    }
    
    public static int carre(int n) {
        int c = n * n;
        return c;
    }
}
