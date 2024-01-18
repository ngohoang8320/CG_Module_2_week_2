package exe_moveablePoint;

public class TestPoint {
    public static void main(String[] args) {
        MoveablePoint testpoint = new MoveablePoint(10f, 10f);
        testpoint.move();
        testpoint.move();
        System.out.println(testpoint);
    }
}
