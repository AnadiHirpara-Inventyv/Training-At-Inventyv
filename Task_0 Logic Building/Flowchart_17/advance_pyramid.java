package Flowchart_17;

import java.util.Scanner;

public class advance_pyramid {
public static void main(String[] args) {
    
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        printNumberPattern(n);

        scanner.close();
    }

    public static void printNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
}    
}
