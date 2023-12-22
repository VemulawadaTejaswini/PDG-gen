

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();

		long d = a;
		a = a-c;
		if(a<0) { a = 0; }
		c = c-d;
		if(c>0) { b = b-c; }
		System.out.println(a+" "+b);
	}
}
