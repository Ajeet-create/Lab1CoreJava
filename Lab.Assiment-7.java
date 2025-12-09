/*
Assiment-7
1-Q
● Write a Java program to create a class called Vehicle with a method called drive().
● Vehicle should have attributes such as make (String), model (String) , year (int) and maximum Speed (int).
● Create a constructor in Vehicle with all fields as constructor parameters.
● Create a subclass called Car and override constructor. Call super(). 
● Write a function that overrides the drive() method to print (make + “ ” + model + " Car is driving". )
● Also create another subclass Bike extending the vehicle class. 
● Override the drive() method to print (make + “ ” + model + " Bike is driving". )
● Instantiate both Bike and Car class. Print their attributes.

Ans-
Example-
*/

class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // drive method
    public void drive() {
        System.out.println(make + " " + model + " Vehicle is driving");
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Max Speed: " + maximumSpeed);
    }
}

class Car extends Vehicle {

    // Constructor calls super constructor
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}

class Bike extends Vehicle {

    // Constructor calls super constructor
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Instantiate Car object
        Car car = new Car("Toyota", "Corolla", 2020, 180);
        // Instantiate Bike object
        Bike bike = new Bike("Honda", "CBR", 2019, 160);

        // Display details and drive message for Car
        System.out.println("Car Details:");
        car.display();
        car.drive();

        System.out.println();

        // Display details and drive message for Bike
        System.out.println("Bike Details:");
        bike.display();
        bike.drive();
    }
}
/*
Output
Car Details:
Make: Toyota
Model: Corolla
Year: 2020
Max Speed: 180
Toyota Corolla Car is driving

Bike Details:
Make: Honda
Model: CBR
Year: 2019
Max Speed: 160
Honda CBR Bike is driving


*/


2-Q

● Write a Java program to create a class called Shape with a method called getArea().
● Create a subclass called Circle and create a constructor that takes the value of radius(int) as input parameter.
● Override the getArea() method.
● Create a class called square that takes an attribute length. Create a

Ans-
Example-
*/

// Parent Shape class
class Shape {
    // Method to get area (to be overridden)
    public double getArea() {
        return 0;
    }
}

// Circle subclass
class Circle extends Shape {
    private int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Override getArea() to calculate area of circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square subclass
class Square extends Shape {
    private int length;

    // Constructor
    public Square(int length) {
        this.length = length;
    }

    // Override getArea() to calculate area of square
    @Override
    public double getArea() {
        return length * length;
    }
}

// Test class with main method
public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Square square = new Square(5);

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
    }
}
/*
Output
Area of Circle: 153.93804002589985
Area of Square: 25.0

*/
