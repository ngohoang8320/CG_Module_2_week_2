package point_2d_3d;

public class TestPoint {
    public static void main(String[] args) {
        /*Point2D point2D_1 = new Point2D();
        System.out.println(point2D_1.toString());
        point2D_1.setXY(20.1f, 20.1f);
        System.out.println(point2D_1.toString());

        Point2D point2D_2 = new Point2D(10.1f, 10.1f); //Luu y hau to f
        System.out.println(point2D_2.toString());*/

        Point3D point3D_1 = new Point3D();
        System.out.println(point3D_1.toString());
        point3D_1.setXYZ(20.1f, 20.1f, 20.1f);
        System.out.println(point3D_1.toString());

        Point3D point3D_2 = new Point3D(10.1f, 10.1f, 10.1f); //Luu y hau to f
        System.out.println(point3D_2.toString());
    }
}
