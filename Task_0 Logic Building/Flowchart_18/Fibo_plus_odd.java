package Flowchart_18;

import java.util.Scanner;

public class Fibo_plus_odd {
    public static void main(String[] args) {
            int N, j = 1, a = 1, b = 1, c;

    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();

    while (((j / 2) + 1) < N) {
      System.out.println(a);
      System.out.println(j);

      c = a + b;
      a = b;
      b = c;

      j = j + 2;
    }
    }
    
}
