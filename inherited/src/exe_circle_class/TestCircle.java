package exe_circle_class;

public class TestCircle {
    public static void main(String[] args) {
        /*Circle circle_1 = new Circle();
        System.out.println(circle_1.toString());

        Circle circle_2 = new Circle();
        circle_2.setRadius(20);
        circle_2.setColor("blue");
        System.out.println(circle_2.toString());

        Circle circle_3 = new Circle(30, "violet");
        System.out.println(circle_3.toString());*/


        Cylinder cylinder_1 = new Cylinder();
        System.out.println(cylinder_1.toString());

        Cylinder cylinder_2 = new Cylinder(10, "blue", 20);
        System.out.println(cylinder_2.toString());

        Cylinder cylinder_3 = new Cylinder();
        cylinder_3.setRadius(10);
        cylinder_3.setColor("violet");
        cylinder_3.setHeight(30);
        System.out.println(cylinder_3.toString());
    }
}
