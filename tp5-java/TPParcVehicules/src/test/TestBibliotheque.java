
package test;

import entities.*;

public class TestBibliotheque {

    public static void main(String[] args) {

        Bibliotheque b = new Bibliotheque(10);

        Livre l1 = new Livre("Java debutant", "Ahmed", 150);

        Roman r1 = new Roman("Le Petit Prince", "Saint-Exupery", 120, 80.0);

        Manuel m1 = new Manuel("Mathematiques", "Ali", 200, "Universite");

        Revue rev1 = new Revue("Science et Vie", "Octobre", 2026);

        Dictionnaire d1 = new Dictionnaire("Larousse", "Francais");

        b.ajouterDocument(l1);
        b.ajouterDocument(r1);
        b.ajouterDocument(m1);
        b.ajouterDocument(rev1);
        b.ajouterDocument(d1);

        System.out.println("Liste des documents :");
        b.afficherDocuments();

        System.out.println("Nombre de documents : "
                + b.getNombreDocuments());
    }
}
