package edu.efrei.collections.annuaire;
import java.io.Serializable;
import java.util.*;

public class Annuaire implements Serializable {

    private Map<String,Fiche> table = new HashMap<String,Fiche>(); 
    
    public void afficher(String nom) {
        Fiche fiche = table.get(nom);
        if (fiche != null)
            fiche.afficher();
        else
            System.out.println("Pas de fiche pour " + nom);
    }
    
    public void inserer(String nom) {
        Fiche fiche = table.get(nom);
        if (fiche != null) {
            fiche.afficher();
            System.out.print("Remplacer (O/N)? ");
            Scanner scanner=new Scanner(System.in);
            String rep = scanner.nextLine().trim().toUpperCase();
            if (rep.length() > 0 && rep.charAt(0) != 'O')
                return;
        } else
            fiche = new Fiche(nom);
        
        fiche.saisir();
        
        table.put(fiche.nom, fiche);
    }
    
    public void afficherTout() {
        Iterator<Fiche> iter = table.values().iterator();
        while (iter.hasNext()) {
            System.out.println("---------------------------------------");
            iter.next().afficher();
        }
        System.out.println("---------------------------------------");          
    }
}