package test;

public class Main {
    public static void main(String[] args) {
        Etudiant Student1 = new Etudiant(1, "Doe", "John", java.time.Instant.parse("2008-11-31T10:42:10Z"), "estrala@mail.delta.com", "514-555-1234", "G1", "Jane Doe");
        Tuteur Tutor1 = new Tuteur(1, "Doe", "Jane", java.time.Instant.parse("1980-05-20T09:30:00Z"), "compa@com.sad", "514-555-5678", java.util.Arrays.asList(new liens(), new liens()));
        Tutor1.setLiens(java.util.Arrays.asList(new liens(), new liens()));
        Tutor1.getLiens().add(new liens());
        Eseignents Teacher1 = new Eseignents(1, "Smith", "Alice", java.time.Instant.parse("1975-03-15T08:00:00Z"), "azerty@mail.delta.com", "514-555-8765", "PROG2");

        Student1.getExamGrades().add(new noteEtudiant(Student1, Teacher1, 85.5));
        Student1.getExamGrades().add(new noteEtudiant(Student1, Teacher1, 90.0));
    }
}
