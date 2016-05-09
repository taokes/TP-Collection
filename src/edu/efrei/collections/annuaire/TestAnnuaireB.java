package edu.efrei.collections.annuaire;
import java.io.*;
import java.util.Scanner;

public class TestAnnuaireB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Annuaire annuaire;
        try {
            FileInputStream fis = new FileInputStream("annuaire.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            annuaire = (Annuaire) ois.readObject();
            fis.close();
        } catch (Exception ioe) {
            annuaire = new Annuaire();
            System.out.println("Nouvel annuaire");
        }

        for (;;) {
            System.out.print("a toi: ");
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

        try {
            FileOutputStream fos = new FileOutputStream("annuaire.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(annuaire);
            fos.close();
        } catch (Exception ioe) { }

        System.out.println("Au revoir.");
    }
}