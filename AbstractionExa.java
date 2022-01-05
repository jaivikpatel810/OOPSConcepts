// Java program to demonstrate data Abstraction

import java.util.*;

// Abstract class 
abstract class AbstractionExa {
    
    double length, width;
    // Parameterized constructor
    AbstractionExa(double storeLength, double storeWidth) {
        length = storeLength;
        width = storeWidth;
    }
    
    // Abstract method
    abstract double area();  

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length :");
        int enterLength = scanner.nextInt();
        System.out.println("Enter width :");
        int enterWidth = scanner.nextInt();

        // Call derive class square constructor
        Square square = new Square(enterLength);
        double areaOfSquare = square.area();
        System.out.println(areaOfSquare);

        // Call derive class rectangle constructor
        Rectangle rectangle = new Rectangle(enterLength, enterWidth);
        double areaOfRectangle = rectangle.area();
        System.out.println(areaOfRectangle);
    }
    
}
class Square extends AbstractionExa {

    Square(double squareLength) {
        super(squareLength, squareLength);
    }

    // Abstract method used by derive class
    double area() {
        System.out.println("Area of square is :");
        return (length * width);
    }
    
}
class Rectangle extends AbstractionExa {

    Rectangle(double rectangleLength, double rectangleWidth) {
        super(rectangleLength, rectangleWidth);
    }

    // Abstract method used by derive class
    double area() {
        System.out.println("Area of rectangle is :");
        return (0.5 * length * width);
    }
    
}
