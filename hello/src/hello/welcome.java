package hello;

import java.util.*;

public class welcome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.print("enter the value of a:");
		a = s.nextInt();
		System.out.print("enter the value of b:");
		b = s.nextInt();
		System.out.print("enter the value of c:");
		c = s.nextInt();
		int largest = (a > b && a > c) ? a : ((b > a && b > c) ? b : c);
		System.out.println("the largest value is::" + largest);
	}

}
