package Student;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();
        Scanner localScanner = new Scanner(System.in);
        boolean continue1 = false;

        Student student1 = new Student ("Jermaine Lamarr Cole");
        Student student2 = new Student ("Aubrey Drake Graham");
        Student student3 = new Student ("Kendrick Lamar Duckworth");
        Student student4 = new Student ("Gary Maurice \"Joyner\" Lucas Jr.");

        students.put("J Cole", student1);
        students.put("Drake", student2);
        students.put("K Dot", student3);
        students.put("J Lucas", student4);

        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(85);

        student2.addGrade(93);
        student2.addGrade(84);
        student2.addGrade(89);

        student3.addGrade(82);
        student3.addGrade(100);
        student3.addGrade(94);

        student4.addGrade(87);
        student4.addGrade(79);
        student4.addGrade(100);



    do {
        System.out.println("Wanna know how your favorite rapper did in class? Pick one off my list?");

        for (String username : students.keySet()) {
            System.out.printf(" |%s|", username);
        }

        System.out.printf("%n%n");
        String searched = localScanner.nextLine();

        if (students.keySet().contains(searched)) {
            Student foundStudent = students.get(searched);
            System.out.printf("Real Name: %s - Persona: %s%n" + "Current Average %.2f%n", foundStudent.getName(), searched, foundStudent.getGradeAverage()) ;
        }
        else System.out.printf ("%s not found. %n", searched);

        System.out.println("Would you like to check someone else out? Y/N");
        String userAnswer = localScanner.nextLine();

        if (userAnswer.startsWith("y") || userAnswer.startsWith("Y")){
            continue1 = true;
        } else {
            continue1 =false;
        }

        }

        while (continue1);

}}
