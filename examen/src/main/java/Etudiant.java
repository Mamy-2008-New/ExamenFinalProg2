import java.time.Instant;
import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private Instant dateDeNaissance;    
    private String email;
    private String telephone;
    private final String groupe;
    private final String tuteur;

    public Etudiant(int id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, String groupe, String tuteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.telephone = telephone;
        this.groupe = groupe;
        this.tuteur = tuteur;
    }

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public Instant getDateDeNaissance() {
        return dateDeNaissance;
    }
    public String getEmail() {
        return email;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getGroupe() {
        return groupe;
    }
    public String getTuteur() {
        return tuteur;
    }

    public double calculerMoyenne(List<noteEtudiant> notes) {
        double somme = 0;
        int totalCoef = 0;

        for (noteEtudiant noteEtudiant : notes) {
            somme += noteEtudiant.getNote() * noteEtudiant.getCoef().valeur;
            totalCoef += noteEtudiant.getCoef().valeur;
        }

        return totalCoef == 0 ? 0 : somme / totalCoef;
    }
}