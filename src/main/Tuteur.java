package main;

import java.time.Instant;
import java.util.List;

public class Tuteur extends Etudiant {
    private List<liens> liens;

    public Tuteur(int id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, List<liens> liens) {
        super(id, nom, prenom, dateDeNaissance, email, telephone, null, null);
        this.liens = liens;
    }

    public List<liens> getLiens() {
        return liens;
    }
    public void setLiens(List<liens> liens) {
        this.liens = liens;
    }

    public static void main(String[] args) {
        Tuteur Tutor1 = new Tuteur(1, "Doe", "Jane", java.time.Instant.parse("1980-05-20T09:30:00Z"), "compa@com.sad", "514-555-5678", java.util.Arrays.asList(new liens(), new liens()));
    }

}
