package Student;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grade;

    public Student(String name) {
        this.name = name;

        this.grade= new ArrayList<Integer>();

    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grade.add(grade);
    }

//    // returns the average of the students grades
    public double getGradeAverage() {
               double finalGrade = 0;
        for (int i = 0; i < grade.size(); i++) {
            finalGrade += grade.get(i);}
        return finalGrade / grade.size();
    };
}
