import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));


        // original array for names
        Person[] names = new Person[3];
        names[0] = new Person("Gerald");
        names[1] = new Person("Audrey");
        names[2] = new Person("Alex");


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        Person person4 = new Person("August");


        Person[] name3 = addPerson(names, person4);

        // my loop for changing names from mem ref to actual name
        for (int i = 0; i < name3.length ; i++) {
            System.out.println(name3[i].getName());
        }

    }

    //my method for adding new names
    public static Person[] addPerson (Person[] people, Person newPerson){

        Person[] people2 = Arrays.copyOf(people, people.length + 1);
        people2[people2.length - 1] = newPerson;
        System.out.println(Arrays.toString(people2));
        System.out.println(people2[3].getName());
        return people2;

    }
}
