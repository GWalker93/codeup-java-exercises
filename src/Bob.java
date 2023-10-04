import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        boolean tiredOfBob = false;

        do {

            System.out.println("Hello meet Bob.");
            Scanner myScanner = new Scanner(System.in);
            String userAnswer = myScanner.nextLine();

            if (userAnswer.endsWith("?")) {
                System.out.println("Sure");
            } else if (userAnswer.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userAnswer == ("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Do you really wanna continue this conversation? YES/NO");

            String  userAnswer2= myScanner.nextLine();

            tiredOfBob = userAnswer2.equalsIgnoreCase("yes");
    }
        while(tiredOfBob);
    }
    }
