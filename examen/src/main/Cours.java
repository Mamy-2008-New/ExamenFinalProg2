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
}
