public class Person {
    private String name;
    public String getName(){

        return String.format("Hello %s.%n", name);
    };
    public void setName (String name) {
        this.name = name;
    };

    public Person (String name){
        this.name = name;
    }

    public Person(){

    }

    public static void main(String[] args){
    Person g = new Person();
    g.setName("Gerald");
    System.out.println(g.getName());


//    Person person1 = new Person();
//    person1.setName("John");
//    Person person2 = new Person();
//    person2.setName("John");
//    System.out.println(person1.getName().equals(person2.getName()));
//    System.out.println(person1 == person2);

//    Person person1 = new Person();
//    person1.setName("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);

//        Person person1 = new Person();
//        person1.setName("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
}


