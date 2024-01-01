package Flowchart_7;

import java.util.Scanner;

public class Max_of_2 {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.println("Enter the value of y: ");
        int y = scanner.nextInt();

        if (x >= y) {
            System.out.println("X is Max");
        } else {
            System.out.println("Y is Max");
        }
    }
    
}
