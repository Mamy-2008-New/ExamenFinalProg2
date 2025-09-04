import java.time.Instant;
import java.util.List;

public class Tuteur extends Etudiant {
    private List<liens> liens;

    public Tuteur(int id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, List<liens> liens) {
        super(id, nom, prenom, dateDeNaissance, email, telephone, null, null);
        this.liens = liens;
    }
}
