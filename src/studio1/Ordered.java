package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		

		boolean c1 = x>y && x>z;
		boolean c2 = z>y && z>x;
		
		boolean isOrdered = c1||c2;
		
		System.out.print("The order is "+isOrdered);

	}

}
