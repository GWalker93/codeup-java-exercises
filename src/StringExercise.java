public class StringExercise {
    public static void main(String[] args) {

        String ex1 = "We don't need no education";

        System.out.println(ex1.replace("education", "thought control"));

        String ex2 = "Check \"this\" out!, \"s inside of \"s!";

        System.out.println(ex2);

        String ex3 = "In windows, the main drive is usually C:";

        System.out.println(ex3.concat("\\"));

        String ex4 = "I can do backslashes \\, double backslashes \\\\," +
                "and the amazing triple backslash \\\\\\! ";

        System.out.println(ex4);

    }
}
