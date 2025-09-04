package main;

import java.time.Instant;

public class Eseignents extends Etudiant {
    private String specialite;

    public Eseignents(int id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, String specialite) {
        super(id, nom, prenom, dateDeNaissance, email, telephone, null, null);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public static void main(String[] args) {
        Eseignents Teacher1 = new Eseignents(1, "Smith", "Alice", java.time.Instant.parse("1975-03-15T08:00:00Z"), "azerty@mail.delta.com", "514-555-8765", "PROG2");
        Eseignents Teacher2 = new Eseignents(2, "Johnson", "Bob", java.time.Instant.parse("1980-07-22T10:15:00Z"), "zeeee@mail.delta.com", "514-555-4321", "PROG1");
    }
}
