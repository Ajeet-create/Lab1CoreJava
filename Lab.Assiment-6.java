/*
Assiment-6
1-Q

● Write a Java program named Car
● The Car class should have the following attributes: make (String), model (String) , year (short) , and price(int) .
● The car class should have a constructor that takes all the attributes.
● Add a main method to instantiate car objects.
● The program should allow the user to create and display objects of each Car Class.

Ans-
Example-

*/
import java.util.Scanner;

public class Car {
    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: Rs." + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Car 1
        System.out.println("Enter details for Car 1:");
        System.out.print("Make: ");
        String make1 = scanner.nextLine();
        System.out.print("Model: ");
        String model1 = scanner.nextLine();
        System.out.print("Year: ");
        short year1 = scanner.nextShort();
        System.out.print("Price: ");
        int price1 = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        Car car1 = new Car(make1, model1, year1, price1);

        // Taking input for Car 2
        System.out.println("\nEnter details for Car 2:");
        System.out.print("Make: ");
        String make2 = scanner.nextLine();
        System.out.print("Model: ");
        String model2 = scanner.nextLine();
        System.out.print("Year: ");
        short year2 = scanner.nextShort();
        System.out.print("Price: ");
        int price2 = scanner.nextInt();

        Car car2 = new Car(make2, model2, year2, price2);

        // Display car details
        System.out.println("\nCar 1 details:");
        car1.displayDetails();

        System.out.println("Car 2 details:");
        car2.displayDetails();

        scanner.close();
    }
}

/*
Output
Enter details for Car 1:
Make: 8552446
Model: BMW M5
Year: 2023
Price: 92656511

Enter details for Car 2:
Make: 131355
Model: G Wagon
Year: 2025
Price: 2598999

Car 1 details:
Car Details:
Make: null
Model: null
Year: 0
Price: Rs.0

Car 2 details:
Car Details:
Make: null
Model: null
Year: 0
Price: Rs.0


*/

/*
2-Q

*Assignment-2.
● Write a Java program that demonstrates method overloading by creating a class called Calculator.
● Add three methods called add().
● The first add() method should take two int variables as arguments and return their sum as int.
● The second add() method should take three int variables as arguments and return their sum as int.
● The third add() method should take two doubles as arguments and return their sum as double.
● The program should allow the user to display the results of each method.

Ans-
Example-

*/

import java.util.Scanner;

public class Calculator {
    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Input and call method 1 (two ints)
        System.out.print("Enter two integers for add(int, int): ");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int sumTwoInts = calc.add(x1, x2);
        System.out.println("Sum of two integers: " + sumTwoInts);

        // Input and call method 2 (three ints)
        System.out.print("Enter three integers for add(int, int, int): ");
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int sumThreeInts = calc.add(y1, y2, y3);
        System.out.println("Sum of three integers: " + sumThreeInts);

        // Input and call method 3 (two doubles)
        System.out.print("Enter two doubles for add(double, double): ");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double sumTwoDoubles = calc.add(d1, d2);
        System.out.println("Sum of two doubles: " + sumTwoDoubles);

        scanner.close();
    }
}
/*
Ouyput

Enter two integers for add(int, int): 56
65
Sum of two integers: 121
Enter three integers for add(int, int, int): 323
323
225
Sum of three integers: 871
Enter two doubles for add(double, double): 333
255
Sum of two doubles: 588.0


*/


/*
3-Q

● Create a Java Bean Class Student.
● Add three attributes
○ private String name;
○ private int age;
○ private String department;
● Add a constructor that takes all three attributes as parameters.
● Add setter and getter methods
● Compile the program.

Ans-
Example-

*/

package TestSelenium;

public class Student {
	
	// Java Bean class for Student
	    // Attributes
	    private String name;
	    private int age;
	    private String department;

	    // Constructor
	    public Student(String name, int age, String department) {
	        this.name = name;
	        this.age = age;
	        this.department = department;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    // Setter methods
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	

	// Main class to test the Student bean
	    public static void main(String[] args) {
	        // Create a Student object
	        Student student = new Student("Alice", 20, "Computer Science");
	        
	        // Print student details
	        System.out.println("Name: " + student.getName());
	        System.out.println("Age: " + student.getAge());
	        System.out.println("Department: " + student.getDepartment());
	    }
	}


/*
Output
Name: Alice
Age: 20
Department: Computer Science

*/
