package Flowchart_15;

import java.util.Scanner;

public class odd_minus_factorial {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            long factorial = calculateFactorial(i);
            if (i % 2 == 0) {
                System.out.print("-" + factorial + " ");
            } else {
                System.out.print(factorial + " ");
            }
        }
    }

    private static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
