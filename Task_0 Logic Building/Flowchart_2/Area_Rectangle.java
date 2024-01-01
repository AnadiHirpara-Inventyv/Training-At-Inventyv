package Flowchart_2;

import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
        int l, b, A, P;
        
        System.out.print("Enter length [l]: ");
        l = scanner.nextInt();
        
        System.out.print("Enter breadth [b]: ");
        b = scanner.nextInt();
        
        A = l * b;
        System.out.println("Area: " + A);
        
        P = 2 * (l + b);
        System.out.println("Perimeter: " + P);
    }
    
}
