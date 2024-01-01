package Flowchart_4;

import java.util.Scanner;

/**
 * printing_no_upto_N
 */
public class printing_no_upto_N {

    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();
        
        int i = 1;
        
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}