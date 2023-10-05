import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjective = {"Clever", "Little", "Lazy", "Quite", "Large", "Honest", "Beautiful", "Aggressive", "Ashamed", "Meaningless"};

        String[] nouns = {"Dragon","Cat","Dog","Turtle","Snake","Birds","Horse","Man","Woman","Tractor"};
//
//        System.out.println(adjective);
//        System.out.println(nouns);
//
//        System.out.println(Arrays.toString(adjective));
//        System.out.println(Arrays.toString(nouns));
//
//        Random random = new Random();
//        int index = random.nextInt(adjective.length);
//        int index1 = random.nextInt(nouns.length);
//        System.out.println(adjective[index]);
//        System.out.println(nouns[index1]);
//
//        System.out.println("Here is your server-name: " + adjective[index] + "-" + nouns[index1]);

        randomString(adjective,nouns);
    }

        public static void randomString(String[] array1, String[] array2) {

            Random random = new Random();
            int index = random.nextInt(array1.length);
            int index1 = random.nextInt(array2.length);
//            System.out.println(adjective[index]);
//            System.out.println(nouns[index1]);

            System.out.println("Here is your server-name: " + array1[index] + "-" + array2[index1]);

        }
}
