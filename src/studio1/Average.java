package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Type 1 number");
		int n1 = in.nextInt();
		System.out.println("Type a 2nd number");
		int n2 = in.nextInt();
		System.out.print("The first two integers to be averaged ");
		System.out.print((n1+n2)/2.0);
		
	}

}
