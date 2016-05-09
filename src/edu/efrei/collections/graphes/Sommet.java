package edu.efrei.collections.graphes;
import java.util.*;

public class Sommet {
    private String etiquette;
    private ArrayList<Voisin> voisins;
    
    public Sommet(String etiquette) {
        this.etiquette = etiquette;
        voisins = new ArrayList<Voisin>();
    }
    
    public boolean estVoisin(Sommet sommet) {
        for (Iterator<Voisin> iter = voisins(); iter.hasNext(); )
            if (iter.next().sommet == sommet)
                return true;
        return false;
    }
    
    public void ajouterVoisin(Sommet sommet, int poids) {
        voisins.add(new Voisin(sommet, poids));
    }
    
    public Iterator<Voisin> voisins() {
        return voisins.iterator();
    }
    
    public String toString() {
        return etiquette;
    }
}