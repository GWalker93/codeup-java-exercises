import java.util.Scanner;

public class MethodsExercises {

    public static Scanner localScanner = new Scanner(System.in);

    public static int sum(int x, int y) {
        return (x + y);
    }

    public static int sub(int x, int y) {
        return (x - y);
    }

    public static int mul(int x, int y) {
        return (x * y);
    }

    public static int div(int x, int y) {
        return (x / y);
    }

    public static int mol(int x, int y) {
        return (x % y);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println((sum(a, b)));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
        System.out.println(mol(a, b));
    }


        public static int range ( int min, int max){
            System.out.printf("Hello please chose a number between %d and %d%n", min, max);

            int userIntAnswer = localScanner.nextInt();

            if (userIntAnswer < min || userIntAnswer > max) {
                System.out.println("Please try again.");

                return range(min, max);
            }
            System.out.println("Good choice with " + userIntAnswer + ".");
            return userIntAnswer;

        }

        public static void facNumber (String[]args){
            int userSumAnswer = range(4, 10);
            // 1_000_000_000 is the max int can go
            String myOutput = "1";
            long mathBucket = 1;

            for (int i = 1; i <= userSumAnswer; i++) {
                if (i == 1) {
                    System.out.printf("%d! = %-16s = %d%n", i, myOutput, mathBucket);
                    continue;
                }

                mathBucket *= i;
                myOutput += " x " + i;

                System.out.printf("%d! = %-16s = %d%n", i, myOutput, mathBucket);

            }

            localScanner.nextLine();
            System.out.println("Do you want to do it again?");
            String userContinue = localScanner.nextLine();
//
//        if(userContinue.toLowerCase().equals("yes")){
//            range();
        }
    }






