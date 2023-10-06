package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static Scanner localScanner = new Scanner(System.in);

    count = 0;
    old
    public static void main(String[] args){

        boolean movieComplete = true;

        do {

        System.out.println("What would you like to do?");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        Scanner myScanner = new Scanner(System.in);
        String userAnswer = myScanner.nextLine();

        if (userAnswer.contentEquals ("1")) {
            System.out.println("All");
        } else if (userAnswer.endsWith ("2")) {
            System.out.println("Animated");
        } else if (userAnswer.endsWith ("3")) {
            System.out.println("Drama");
        } else if (userAnswer.endsWith ("4")) {
            System.out.println("Horror");
        } else if (userAnswer.endsWith ("5")) {
            System.out.println("SciFi");
        } else {
            System.out.println("Whatever.");
        }

            System.out.println("Do you wish to continue? YES/NO");

            String  userAnswer2= myScanner.nextLine();

            movieComplete = userAnswer2.equalsIgnoreCase("yes");
        }
        while(movieComplete);

//        return userAnswer:

    }
}
