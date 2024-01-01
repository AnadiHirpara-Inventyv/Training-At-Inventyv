package Flowchart_3;

import java.util.Scanner;

public class Age_Validation {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter your Age: ");
    int age = scanner.nextInt();
    
    if (age >= 21) {
      System.out.println("Adult");
    } else {
      System.out.println("Not Adult");
    }
    }
    
}
