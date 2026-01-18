package solid.openclose.fixed;

public class Main {
    public static void main(String[] args) {
        double totalArea = 0;

        Circle circle = new Circle(8.0);
        Rectangle rectangle = new Rectangle(6, 4);
        Triangle triangle = new Triangle(7, 5);

        System.out.println("Area of the circle: " + circle.calculateArea());
        totalArea += circle.calculateArea();
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        totalArea += rectangle.calculateArea();
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        totalArea += triangle.calculateArea();

        System.out.println("Total area: " + totalArea);


    }
}
