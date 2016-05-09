package edu.efrei.collections.annuaire;

import java.util.Scanner;
import java.io.Serializable;

public class Fiche implements Serializable {
    String nom;
    String numero;
    String adresse;
    
    public Fiche() {
        nom = "";
        numero = "";
        adresse = "";
    }
    
    public Fiche(String nom) {
        this();
        this.nom = nom;
    }
    
    public void afficher() {
        System.out.println("nom:     " + nom);
        System.out.println("numero:  " + numero);
        System.out.println("adresse: " + adresse);
    }

    public void saisir() {
        nom     = lireChaine("nom     ", nom);
        numero  = lireChaine("numero  ", numero);
        adresse = lireChaine("adresse ", adresse);
    }
    
    private static String lireChaine(String invite, String valDefaut) {
        System.out.print(invite + " [" + valDefaut + "]: ");
        Scanner scanner = new Scanner(System.in);
        String reponse = scanner.nextLine();
        if (reponse.length() > 0)
            return reponse;
        else
            return valDefaut;
    }
    
    public String toString() {
        return "(" + nom + "; " + numero + "; " + adresse + ")";
    }

	
}