package Flowchart_8;

import java.util.Scanner;

public class Max_of_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Finding the maximum
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        // Displaying the result
        System.out.println("The maximum of the three numbers is: " + max);

        // Closing the scanner
        scanner.close();
    }
}
