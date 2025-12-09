/*
Q1- What is inheritance? Why inheritance is required? Explain with Example?

Ans: Inheritance is an Object-Oriented Programming concept where a new class (called a subclass or derived class) is created based on an existing class (called a superclass or base class). This allows the subclass to inherit fields and methods from the superclass, enabling code reuse and extension of functionalities.
Example-
*/

// Superclass
class Vehicle {
    String make;
    String model;
    int year;
    int maxSpeed;

    // Constructor
    public Vehicle(String make, String model, int year, int maxSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

// Subclass Car
class Car extends Vehicle {
    public Car(String make, String model, int year, int maxSpeed) {
        super(make, model, year, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maxSpeed) {
        super(make, model, year, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 180);
        Bike bike = new Bike("Honda", "CBR", 2021, 150);

        // Printing attributes
        System.out.println("Car make: " + car.make);
        System.out.println("Car model: " + car.model);
        System.out.println("Bike make: " + bike.make);
        System.out.println("Bike model: " + bike.model);

        // Driving
        car.drive();
        bike.drive();
    }
}

/*
Output
Car make: Toyota
Car model: Camry
Bike make: Honda
Bike model: CBR
Toyota Camry Car is driving
Honda CBR Bike is driving

*/


/*
Q2- What is the advantage of Inheritance? Explain with Example?

*/
Code Reusability: No need to write the same code again. Subclasses reuse common features from the superclass.

Extensibility: Easy to add new functionalities or modify existing ones without changing existing code.

Organized Structure: Helps in organizing related classes in hierarchical structure, making maintenance easier.

Polymorphism: Allows overriding methods to provide specific behavior for different subclasses.


/*
Output

*/

/*
Q3- What do you mean by code reusability? Explain with Example?

Ans-Code Reusability refers to the ability to reuse existing code in multiple places rather than rewriting it. Inheritance is a core feature to achieve code reusability in Java.

*/
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a car");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Reusing start() method from Vehicle
        car.display();
    }
}

/*
Output
Vehicle is starting
This is a car

*/