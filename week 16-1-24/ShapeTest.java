// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate the area of the shape
    abstract double calculateArea();

    // Abstract method to calculate the perimeter of the shape
    abstract double calculatePerimeter();
}

// Subclass Circle
class Circle extends Shape {
    // Radius of the circle
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea method for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of calculatePerimeter method for Circle
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    // Sides of the triangle
    private double side1, side2, side3;

    // Constructor for Triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementation of calculateArea method for Triangle
    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementation of calculatePerimeter method for Triangle
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class to test the Shape subclasses
public class ShapeTest {
    public static void main(String[] args) {
        // Create instances of Circle and Triangle
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Demonstrate calculateArea and calculatePerimeter methods for Circle
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        // Demonstrate calculateArea and calculatePerimeter methods for Triangle
        System.out.println("Triangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
