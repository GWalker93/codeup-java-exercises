package util;

import java.util.Scanner;

public class input {

    private static Scanner localScanner = new Scanner(System.in);

    public boolean yesNo (){
        System.out.println("Please type Yes. Not No.");

        String userAnswer = localScanner.next();

        return userAnswer.toLowerCase().equals("yes") || userAnswer.toLowerCase().equals("y");
    };

    public int getInt (int min, int max){

        System.out.printf("Please enter a number between %d and %d%n", min, max);

        int userIntAnswer = localScanner.nextInt();

        if(userIntAnswer < min || userIntAnswer > max){
            System.out.println("Incorrect input detected - please try again");

            return getInt(min, max);
        }

        return userIntAnswer;
    };

    public int getInt () {

        return getInt(1, 10);
    };

    public double getDouble (double min, double max){

        System.out.printf("Please enter a number between %s and %s%n", min, max);

        Double userDoubleAnswer = localScanner.nextDouble();

        if(userDoubleAnswer < min || userDoubleAnswer > max){
            System.out.println("Incorrect input detected - please try again");

            return getDouble(min, max);
        }

        return userDoubleAnswer;
    };

//    public static void main(String[] args) {
//
//        yesNo();
//
//        getInt();
//
////        System.out.println(getInt());
//
//        getDouble(5.56, 20.11);

    };



//    Create a package inside of src named util. Inside of util, create a class named Input that has a private field named scanner. When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//        String getString()
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//        The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//        Create another class named InputTest that has a static main method that uses all the methods from the Input class.