package main;

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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<label> getLabels() {
        return labels;
    }
    public void setLabels(List<label> labels) {
        this.labels = labels;
    }
    public List<Coef> getCoefs() {
        return coefs;
    }
    public void setCoefs(List<Coef> coefs) {
        this.coefs = coefs;
    }
    public List<Eseignents> getEnseignants() {
        return enseignants;
    }
    public void setEnseignants(List<Eseignents> enseignants) {
        this.enseignants = enseignants;
    }

    public static void main(String[] args) {
        Cours course1 = new Cours(101, java.util.Arrays.asList(new label(label.TypeLabel.MATIERE, "Mathematics"), new label(label.TypeLabel.NIVEAU, "Beginner")), java.util.Arrays.asList(new Coef(label.TypeLabel.MATIERE, 2), new Coef(label.TypeLabel.NIVEAU, 1)), java.util.Arrays.asList(new Eseignents(1, "Smith", "Alice", java.time.Instant.parse("1975-03-15T08:00:00Z"))));
    }
}
