package test;

public class Main {
    public static void main(String[] args) {
        
        
        Tutor1.setLiens(java.util.Arrays.asList(new liens(), new liens()));
        Tutor1.getLiens().add(new liens());
        

        Student1.getExamGrades().add(new noteEtudiant(Student1, Teacher1, 85.5));
        Student1.getExamGrades().add(new noteEtudiant(Student1, Teacher1, 90.0));

        double moyenne = Student1.calculerMoyenne();
        System.out.println("Moyenne de l'étudiant: " + moyenne);
    }
}
