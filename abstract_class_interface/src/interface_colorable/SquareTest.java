package interface_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapeList = new Shape[2];
        shapeList[0] = new Square();
        shapeList[1] = new Rectangle();
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }
}
