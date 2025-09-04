package main;

import java.time.Instant;

public class examen {
    private int id;
    private Cours cours;
    private Instant date;
    private Coef coef;

    public examen(int id, Cours cours, Instant date, Coef coef) {
        this.id = id;
        this.cours = cours;
        this.date = date;
        this.coef = coef;
    }
    public int getId() {
        return id;
    }
    public Cours getCours() {
        return cours;
    }
    public Instant getDate() {
        return date;
    }
    public Coef getCoef() {
        return coef;
    }
    public double setCoefs(double note) {
        return note * coef.valeur;
    }

    
}
