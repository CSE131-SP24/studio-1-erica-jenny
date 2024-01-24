package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner textbook = new Scanner(System.in);
		int year = textbook.nextInt();
		
		boolean c1 = year%4 > 0;
		boolean c2 = year/100 > 0 ;
		
	}

}
