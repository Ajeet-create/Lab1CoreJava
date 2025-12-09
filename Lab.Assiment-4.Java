/*
Assiment-4
1-Q
* Write a program to enter P,T (principal and time) and calculate
simple interest. Use the Scanner class for taking inputs from the
console. Users will enter the principal amount and time(in years).
Create an if-else statement and modify the interest rate based on the
principal amount. If the amount > 10000 then the interest rate is 10%. If the
amount is between 10000 and 5000 then make the interest rate 8%. For
any amount below 5000 the interest rate should be 5%.

Ans-
Example-

*/
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Determine interest rate based on principal
        double rate;
        if (principal > 10000) {
            rate = 10;
        } else if (principal >= 5000 && principal <= 10000) {
            rate = 8;
        } else {
            rate = 5;
        }

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}

/*
Output
Enter the principal amount: 4500
Enter the time (in years): 2025
Simple Interest: 455625.0

*/


/*
2-Q

*2. Write a program to enter marks of five subjects and calculate total
marks and average. Each subject has a full mark of 100. Give grades
based on average marks. Grades should be Ex (>90%), A (>80%) ,
B(>60%) ,C (>=40%) and F(<40%). Use the Scanner class to take
inputs from the console.

Ans-
Example-

*/
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Input marks for five subjects
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Validate input for marks range 0-100
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                i--; // Repeat input for the same subject
                continue;
            }

            total += marks[i];
        }

        // Calculate average
        double average = total / 5.0;

        // Determine grade based on average
        char grade;
        if (average > 90) {
            grade = 'E'; // Ex
        } else if (average > 80) {
            grade = 'A';
        } else if (average > 60) {
            grade = 'B';
        } else if (average >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output results
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

/*
output
Enter marks for subject 1: 89
Enter marks for subject 2: 58
Enter marks for subject 3: 84
Enter marks for subject 4: 75
Enter marks for subject 5: 69
Total Marks: 375
Average Marks: 75.0
Grade: B

*/


/*
3-Q

*3. Write a program which calculates the monthly bill amount for a
internet subscriber based on the following logic:
1) If the total data consumed is less than 10 GB then bill amount
will be Rs. 300. (Basic charge)
2) If the data consumed is between 10 GB and 30 GB then bill
amount will be basic charge + 5* (Total GB consumed - 10).
That means consumers will be charged Rs 5 for each
additional GB consumed over 10 GB.
3) If the consumer consumes more than 30 GB then
The bill amount = 400 + 3 *(Total GB consumed - 30).
That means the consumer has to pay additional Rs 3 for each
GB above 30GB.
Use if-else block to solve the problem

Ans-
Example-
*/

import java.util.Scanner;

public class InternetBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Basic charge
        final int basicCharge = 300;

        System.out.print("Enter total data consumed in GB: ");
        double dataConsumed = scanner.nextDouble();

        double billAmount;

        if (dataConsumed < 10) {
            billAmount = basicCharge;
        } else if (dataConsumed >= 10 && dataConsumed <= 30) {
            billAmount = basicCharge + 5 * (dataConsumed - 10);
        } else {
            billAmount = 400 + 3 * (dataConsumed - 30);
        }

        System.out.println("Monthly bill amount: Rs. " + billAmount);

        scanner.close();
    }
}

/*
Output
Enter total data consumed in GB: 500
Monthly bill amount: Rs. 1810.0

*/

