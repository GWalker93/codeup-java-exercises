package Student;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {

    public static void main(String[] args) {


        Student Gerald = new Student("Gerald");
        Student Jailyn = new Student("Jailyn");
        Student August = new Student("August");
        Student Audrey = new Student("Audrey");
//
//        System.out.println(Gerald.getName());
//        System.out.println(Jailyn.getName());
//        System.out.println(August.getName());
//        System.out.println(Audrey.getName());

        Gerald.addGrade(95);
        Gerald.addGrade(100);
        Gerald.addGrade(70);
        Jailyn.addGrade(80);
        Jailyn.addGrade(60);
        Jailyn.addGrade(100);
        August.addGrade(65);
        August.addGrade(100);
        August.addGrade(93);
        Audrey.addGrade(100);
        Audrey.addGrade(95);
        Audrey.addGrade(97);


        System.out.println("Gerald's final grade is "+Gerald.getGradeAverage());
        System.out.println("Jaiyln's final grade is "+Jailyn.getGradeAverage());
        System.out.println("August's final grade is "+August.getGradeAverage());
        System.out.println("Audrey's final grade is "+Audrey.getGradeAverage());



    }
}
