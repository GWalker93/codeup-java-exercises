package shapes;

public class Square extends Quadrilateral{
    public Square(int width) {
        super(width, width);
    }

    @Override
    public int getPerimeter() {
        return 4 * width;
    }

    @Override
    public int getArea() {
        return width * width;
    }


//    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getPerimeter(){
//           return 4 * width;
//}
//
//    public int getArea() {
//        return  width * width;
//    }


}
