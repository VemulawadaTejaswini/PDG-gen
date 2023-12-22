

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		if (Math.abs(a - b) > 15 || Math.abs(a - c) > 15 || Math.abs(a - d) > 15 || Math.abs(a - e) > 15
				|| Math.abs(b - c) > 15 || Math.abs(b - d) > 15 || Math.abs(b - e) > 15 || Math.abs(c - d) > 15
				|| Math.abs(c - e) > 15 || Math.abs(d - e) > 15) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}

	}

}
