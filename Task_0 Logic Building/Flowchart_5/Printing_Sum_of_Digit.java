package Flowchart_5;

import java.util.Scanner;

public class Printing_Sum_of_Digit {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter n: ");
        n = scanner.nextInt();

        while (n > 0) {
            sum += n;
            n--;
        }

        System.out.println("Sum: " + sum);
    }
    
}
