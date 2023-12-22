// Main.java

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		int counter = 0;
		while(X <= Y) {
			X *= 2;
			counter++;
		}
		System.out.println(counter);
	}
}