package edu.efrei.collections.graphes;
public class TestGraphe {

    public static void main(String[] args) {
        Graphe g = new Graphe();
        g.ajouterArete("a", "b", 3);
        g.ajouterArete("a", "f", 5);
        g.ajouterArete("b", "f", 6);
        g.ajouterArete("f", "e", 2);
        g.ajouterArete("b", "e", 4);
        g.ajouterArete("b", "c", 1);
        g.ajouterArete("c", "d", 9);
        g.ajouterArete("e", "d", 7);
        g.ajouterArete("d", "g", 4);
        g.ajouterArete("d", "h", 3);
        g.ajouterArete("d", "i", 5);
        g.ajouterArete("i", "j", 6);
        g.ajouterArete("i", "k", 4);
        g.ajouterArete("k", "k", 3);
        
        g.chemins("a", "i");
    }
}