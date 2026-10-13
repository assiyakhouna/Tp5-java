
package entities;

public class Bibliotheque {

    private int capacite;
    private Document[] documents;
    private int nombreDocuments;

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        this.documents = new Document[capacite];
        this.nombreDocuments = 0;
    }

    public boolean ajouterDocument(Document document) {
        if (nombreDocuments < capacite) {
            documents[nombreDocuments] = document;
            nombreDocuments++;
            return true;
        }
        return false;
    }

    public void afficherDocuments() {
        for (int i = 0; i < nombreDocuments; i++) {
            System.out.println(documents[i]);
        }
    }

    public int getNombreDocuments() {
        return nombreDocuments;
    }

    public int getCapacite() {
        return capacite;
    }
}
