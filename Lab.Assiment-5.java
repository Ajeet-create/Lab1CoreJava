/*
Assiment-5
1-Q

*1.Write a Java program that takes an array of integers as input from the user and
then calculates the sum and average of the elements in the array. The program
should output the sum and average.

Ans-
Example-

*/

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Taking array inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Output results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
/*
Output
Enter the number of elements: 5
Enter element 1: 23
Enter element 2: 21
Enter element 3: 23
Enter element 4: 26
Enter element 5: 21
Sum of array elements: 114
Average of array elements: 22.8

*/

/*
2-Q

*2. Write a Java program that takes an array of integers as input and sorts it in
ascending order using any sorting algorithm of your choice. Print the sorted
array.

Ans-
Example-
*/

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Bubble sort in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}

/*
Output
Enter number of elements: 5
Enter element 1: 54
Enter element 2: 56
Enter element 3: 51
Enter element 4: 53
Enter element 5: 53
Sorted array in ascending order:
51 53 53 54 56 


*/




