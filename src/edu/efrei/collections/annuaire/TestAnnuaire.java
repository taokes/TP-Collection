package edu.efrei.collections.annuaire;
import java.util.Scanner;

public class TestAnnuaire {

    public static void main(String[] args) {
        
        Annuaire annuaire = new Annuaire();
        
        
        
	Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("Pour ajouter une personne  : +");
            System.out.println("Pour afficher une personne  : ?");
            System.out.println("Pour afficher toutes les personnes : !");
            System.out.println("a toi: ");
            String commande = scanner.nextLine().trim();
            if (commande.equals("."))
                break;
            if (commande.length() == 0)
                continue;
            switch (commande.charAt(0)) {
                case '+':
                    annuaire.inserer(commande.substring(1).trim());
                    break;
                case '?':
                    annuaire.afficher(commande.substring(1).trim());
                    break;
                case '!':
                    annuaire.afficherTout();
                    break;
            }
        }
        System.out.println("Au revoir.");
    }
}