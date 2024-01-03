package Flowchart_11;

import java.util.Scanner;

public class Even_Minus {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
        int n, i = 1, j = 1;
        
        System.out.print("Enter a value for n: ");
        n = scanner.nextInt();
        
        while (i <= n) {
            System.out.println(i * j);
            i++;
            j *= -1;
        }
    }
    
}
