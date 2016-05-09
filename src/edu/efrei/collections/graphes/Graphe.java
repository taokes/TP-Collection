package edu.efrei.collections.graphes;
import java.util.*;

public class Graphe {
    Map<String,Sommet> sommets = new HashMap<String,Sommet>();
    
    public Sommet chercherSommet(String etiquette) {
        return sommets.get(etiquette);
    }
    
    public Sommet obtenirSommet(String etiquette) {
        Sommet sommet = chercherSommet(etiquette);
        if (sommet == null) {
            sommet = new Sommet(etiquette);
            sommets.put(etiquette, sommet);
        }
        return sommet;
    } 
    
    public boolean ajouterArete(Sommet sommet1, Sommet sommet2, int poids) {
        if (sommet1.estVoisin(sommet2))
            return false;
        sommet1.ajouterVoisin(sommet2, poids);
        sommet2.ajouterVoisin(sommet1, poids);
        return true;
    }
    
    public boolean ajouterArete(String etiquette1, String etiquette2, int poids) {
        Sommet sommet1 = obtenirSommet(etiquette1); 
        Sommet sommet2 = obtenirSommet(etiquette2); 
        return ajouterArete(sommet1, sommet2, poids);
    }
    
    public void chemins(String nomDepart, String nomArrivee) {
        Sommet depart = obtenirSommet(nomDepart); 
        Sommet arrivee = obtenirSommet(nomArrivee); 
        Stack<Sommet> pile = new Stack<Sommet>();
        pile.push(depart);
        chemins(depart, arrivee, pile);
    }

    private void chemins(Sommet depart, Sommet arrivee, Stack<Sommet> pile) {
        if (depart == arrivee)
            afficher(pile);
        else 
            for (Iterator<Voisin> iter = depart.voisins(); iter.hasNext(); ) {
                Sommet sommet = iter.next().sommet;
                if ( ! pile.contains(sommet)) {
                    pile.push(sommet);
                    chemins(sommet, arrivee, pile);
                    pile.pop();
                }
            }
    }

    private void afficher(AbstractList vect) {
        for (Iterator iter = vect.iterator(); iter.hasNext(); )
            System.out.print(iter.next() + " ");
        System.out.println();
    }    
}