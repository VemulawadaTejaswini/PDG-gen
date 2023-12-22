// Main.java

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final long X = sc.nextLong();
		final long Y = sc.nextLong();
		final double n = (Math.log(Y/X)/Math.log(2.0) + 1.0);
		final int N = (int)(n - n%1.0);
		System.out.println(N);
	}
}