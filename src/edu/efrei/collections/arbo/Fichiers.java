package edu.efrei.collections.arbo;
import java.io.File;

public class Fichiers {
    
    static Noeud repertoireOuFichier(File fic) {
        Noeud res = new Noeud(fic.getName());
        if (fic.isDirectory()) {
            File[] fics = fic.listFiles();
            for (int i = 0; i < fics.length; i++)
                res.ajouterFils(repertoireOuFichier(fics[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        String depart = (String) System.getProperty("user.dir");
        Noeud racine = repertoireOuFichier(new File(depart));
        racine.afficher();
    }
}