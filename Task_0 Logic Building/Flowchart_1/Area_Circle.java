package Flowchart_1;

import java.util.Scanner;

/**
 * Area_Circle
 */
public class Area_Circle {

      public static void main(String[] args) 
    {
        int r;
        double pi = 3.14;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r = sc.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle: "+area + " m²");
        sc.close();
    } 
    
}