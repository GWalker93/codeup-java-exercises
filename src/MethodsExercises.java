import java.util.Scanner;

public class MethodsExercises {

    public static Scanner localScanner = new Scanner(System.in);

    public static int sum(int x, int y)  {return (x+y); }
    public static int sub(int x, int y) {return (x-y); }
    public static int mul(int x, int y)  {return (x*y); }
    public static int div(int x, int y) {return (x/y); }
    public static int mol(int x, int y) {return (x%y); }

//    public static void main (String[] args){
//
//        int a = 10;
//        int b =5;
//
//        System.out.println((sum(a, b)));
//        System.out.println(sub(a, b));
//        System.out.println(mul(a, b));
//        System.out.println(div(a, b));
//        System.out.println(mol(a,b));
//    }

    public static int range (int min, int max) {
        System.out.printf("Hello please chose a number between %d and %d%n", min, max);

        int userIntAnswer = localScanner.nextInt();

        if(userIntAnswer < min || userIntAnswer >max) {
            System.out.println("Please try again.");

            return range(min, max);
        }
        System.out.println("Good choice with " + userIntAnswer + ".");
        return userIntAnswer;

    }

    public static void main (String[] args) {
        range(4, 1_000_000_000);
        // 1_000_000_000 is the max int can go
    }

//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }
//
//    public static void main(String[] args) {
//        count(5);
//    }


}

