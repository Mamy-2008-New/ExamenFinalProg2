import java.time.Instant;

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
}