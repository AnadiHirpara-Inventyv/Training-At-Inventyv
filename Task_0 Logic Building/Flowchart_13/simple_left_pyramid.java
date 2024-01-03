package Flowchart_13;

import java.util.Scanner;

public class simple_left_pyramid {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Enter your no:");
        n = scanner.nextInt();

        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
