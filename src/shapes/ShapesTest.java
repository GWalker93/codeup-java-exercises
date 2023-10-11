package shapes;

public class ShapesTest {

    public static void main(String[] args) {



        Measurable myShape = new Rectangle(4,5);

        Measurable myShape2 = new Square(6);



        System.out.println(myShape.getArea());

        System.out.println(myShape.getPerimeter());

        System.out.println(myShape2.getArea());

        System.out.println(myShape2.getPerimeter());

//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }
}
