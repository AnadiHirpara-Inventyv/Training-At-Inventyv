package Flowchart_8;

import java.util.Scanner;

public class Max_of_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        System.out.print("Enter z: ");
        int z = scanner.nextInt();

        if (x >= y) {
            if (y >= z) {
                if (x >= z) {
                    System.out.println("Z");
                    System.out.println("X");
                }
            }
        }

        System.out.println(y);
    }
    
}
