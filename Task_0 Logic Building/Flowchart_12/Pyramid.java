package Flowchart_12;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        printNumberPattern(numRows);

        scanner.close();
    }

    public static void printNumberPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }
    }
    
}
