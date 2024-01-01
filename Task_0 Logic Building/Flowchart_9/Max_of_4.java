package Flowchart_9;

import java.util.Scanner;

public class Max_of_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your First no:");
        int n1=sc.nextInt();

        System.out.println("Enter Your Second no:");
        int n2=sc.nextInt();

        System.out.println("Enter Your Third no:");
        int n3=sc.nextInt();

        System.out.println("Enter Your Forth no:");
        int n4=sc.nextInt();
		
		if(n1>n2 && n1>n3 && n1>n4) {
			System.out.println(n1+ " is greatest");
		} else if(n2>n1 && n2>n3 && n2>n4) {
			System.out.println(n2+ " is greatest");
		} else if(n3>n1 && n3>n2 && n3>n4) {
			System.out.println(n3+ " is greatest");
		} else {
			System.out.println(n4+ " is greatest");
		}
    }
    
}
