/*Lab_Assiment-3
1-Q

*
● Create a class Student in Student.java then add member variables
studentName, collegeName of type String
● Add a member variable studentID of type int.
● Make all the member variables as private.
● Add a main method. And print a message “Successful”.
● Compile the class
● Run the class


Ans-

Example-
*/

public class Student {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    public static void main(String[] args) {
        System.out.println("Successful");
    }
}

/*Output
Successful

*/


/*
2-Q

*● Create a new class Employee
● Add member variables: id and age of type int, name of type String and
isPermanent of type boolean
● Now assign values 35.5 to age; See the error message.
● How can you avoid this error? Correct the error by casting.
● Make all the members protected
● Add a main method to it. Print message “Successfully started”.
● Compile the class.

Ans-
Example
*/

public class Employee {
    // Protected member variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.id = 101;
        emp.name = "John Smith";
        emp.isPermanent = true;

        // Assigning 35.5 to age causes error, so cast it explicitly
        emp.age = (int) 35.5;

        System.out.println("Successfully started");
    }
}

/*
Successfully started
*/


/*
3-Q

*● Create a class Person
● Add member variables name as String, age and salary as int
● Initialize the member variable along with declaration.
● Now put the previous Person class in a package com.anudip.learning
● Add a main method. Add a print message “Test Successful”.
● Run the class after compilation.
● Modify the classpaths to see the error messages on the console.

Ans-
Example-
*/

package com.anudip.learning;

public class Person {
    // Member variables initialized during declaration
    protected String name = "Default Name";
    protected int age = 30;
    protected int salary = 50000;

    public static void main(String[] args) {
        System.out.println("Test Successful");
    }
}
/*Output
Test Successful
*/



/*
4-Q

*● Create a class Rectangle
● Add a member variable width and height of type double.
● Create an enum Color with values RED, GREEN, BLUE
● Create a member variable boxColor of type Color. 
● Add a main method.
● In main method just print the enum Color.BLUE (You will notice that Java prints the enum name as it is.)
● Compile and run the class.

Ans-
Example
*/

public class Rectangle {
    // Member variables
    double width;
    double height;

    // Enum declaration
    enum Color {
        RED, GREEN, BLUE
    }

    // Member variable of type Color
    Color boxColor;

    public static void main(String[] args) {
        // Print the enum value Color.BLUE
        System.out.println(Color.BLUE);
    }
}

/*
output
BLUE
*/





















