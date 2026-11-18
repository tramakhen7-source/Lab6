package Excercie;
import java.util.ArrayList;
import java.util.List;

class Shape {
    public double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;
    public Circle(double radius) { this.radius = radius; }
    @Override public double area() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    double width, height;
    public Rectangle(double width, double height) { this.width = width; this.height = height; }
    @Override public double area() { return width * height; }
}

class Triangle extends Shape {
    double base, height;
    public Triangle(double base, double height) { this.base = base; this.height = height; }
    @Override public double area() { return 0.5 * base * height; }
}

public class Main6 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 5.0));
        shapes.add(new Triangle(3.0, 6.0));

        for (Shape s : shapes) {
            System.out.println("Shape Area: " + s.area());
        }
    }
}