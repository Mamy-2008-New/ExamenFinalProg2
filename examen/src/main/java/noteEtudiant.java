public class noteEtudiant {
    private Etudiant etudiant;
    private Coef coef;
    private double note;

    public noteEtudiant(Etudiant etudiant, Coef coef, double note) {
        this.etudiant = etudiant;
        this.coef = coef;
        this.note = note;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Coef getCoef() {
        return coef;
    }

    public double getNote() {
        return note;
    }
    
}
