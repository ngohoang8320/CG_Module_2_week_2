package exe_circle_class;

public class Circle {
    private double radius = 10;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle with the radius: " + this.radius + ", the color is: " + this.color + ", and its area is: " + area() + ".";
    }
}
