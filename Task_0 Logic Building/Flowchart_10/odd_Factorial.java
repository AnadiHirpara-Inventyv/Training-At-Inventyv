package Flowchart_10;

import java.util.Scanner;

public class odd_Factorial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int i = 3;
        int fact = 1;
        
        while (i <= n * n / 2) {
            System.out.println(fact);
            fact = fact * i * (i - 1);
            i = i + 2;
        }
    }
    
}
