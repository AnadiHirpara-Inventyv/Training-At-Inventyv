package Flowchart_6;

import java.util.Scanner;

public class printing_product_of_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int product = 1;
        
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
        }
        
        System.out.println("Product: " + product);
    }
    
}
