package edu.efrei.collections.arbo;
import java.util.*;

public class Noeud {
    private String info;
    private ArrayList<Noeud> fils;
    
    public Noeud(String info) {
        this.info = info;
        this.fils = null;
    }
    
    public String info() {
        return info;
    }
    
    public boolean estFeuille() {
        return fils == null || fils.size() == 0;
    }
    
    public void ajouterFils(Noeud noeud) {
        if (fils == null)
            fils = new ArrayList<Noeud>();
        fils.add(noeud);
    }
    
    public Iterator<Noeud> fils() {
        return fils.iterator();
    }
    
    public void afficher() {
        afficher("");
    }
    
    private static final String DECALAGE = "   ";
    
    private void afficher(String marge) {
        System.out.println(marge + info);

        if ( ! estFeuille()) {
            marge += DECALAGE;
            Iterator<Noeud> iter = fils();
            while (iter.hasNext())
                iter.next().afficher(marge);
        }
    }
}