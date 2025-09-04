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


}
