package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public int getArea() {
        return length * width;
    }

    //
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea (){
//        return length * width;
//    };
//
//    public int getPerimeter (){
//        return 2 * length + 2 * width;
//    };


}
