package main;

import java.time.Instant;
import java.util.List;

public class Eseignents extends Etudiant {
    private String specialite;
    private List<Cours> matiere;

    public Eseignents(int id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, String specialite, List<Cours> matiere) {
        super(id, nom, prenom, dateDeNaissance, email, telephone, null, null);
        this.specialite = specialite;
        this.matiere = matiere;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public static void main(String[] args) {
        Eseignents Teacher1 = new Eseignents(1, "Smith", "Alice", java.time.Instant.parse("1975-03-15T08:00:00Z"), "azerty@mail.delta.com", "514-555-8765", "PROG2", "PROG2");
        Eseignents Teacher2 = new Eseignents(2, "Johnson", "Bob", java.time.Instant.parse("1980-07-22T10:15:00Z"), "zeeee@mail.delta.com", "514-555-4321", "PROG1", "PROG1");
    }
}
