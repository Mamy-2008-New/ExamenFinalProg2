import java.util.List;

public class Cours {
    private int id;
    private List<label> labels;
    private List<Coef> coefs;
    private List<Eseignents> enseignants;

    public Cours(int id, List<label> labels, List<Coef> coefs, List<Eseignents> enseignants) {
        this.id = id;
        this.labels = labels;
        this.coefs = coefs;
        this.enseignants = enseignants;
    }
}
