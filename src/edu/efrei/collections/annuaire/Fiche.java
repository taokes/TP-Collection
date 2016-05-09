package edu.efrei.collections.annuaire;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        while (!verifNum(numero)){
        numero  = lireChaine("numero  ", numero);
        }
        adresse = lireChaine("adresse ", adresse);
    }
    
    private boolean verifNum(String numero2) {
        String sPhoneNumber = numero2;     

        Pattern pattern = Pattern.compile("(0|(\\+33)|(0033))[1-9][0-9]{8}");
        Matcher matcher = pattern.matcher(sPhoneNumber);
        
        if (matcher.matches()) {
      	  System.out.println("numero de tel Valide");
      	  return true ;
        }
        else
        {
      	  System.out.println("Le numero de tel doit etre de la forme 0123456789");
  		return false;
        }
   

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