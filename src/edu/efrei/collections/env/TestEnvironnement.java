package edu.efrei.collections.env;
import java.util.*;

public class TestEnvironnement {

    static void afficherMap(Map tableAssoc) {
        Set cles = tableAssoc.keySet();
	Object[] tab = cles.toArray(); 
        Arrays.sort(tab); 

        for (int i = 0; i < tab.length; i++) {
            String cle = (String)tab[i];
            String valeur = (String) tableAssoc.get(cle);
            System.out.println("    " + cle + " --> " + valeur);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Proprietes systeme");
        afficherMap(System.getProperties());
        
        System.out.println("\n#########################\nVariables d'environnement");
        afficherMap(System.getenv());
    }
}
