package exe_circle_class;

public class Cylinder extends Circle {
    private double height = 10;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volumn() {
        return super.area() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder have the height: " + this.height + " and the volumn is: " + volumn() + " created by 2 " + super.toString();
    }
}
