

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = Math.abs(Integer.parseInt(sc.next()) - X);
		}

		int ans = gcd(x[0], x[1]);

		for (int i = 2; i < n; i++) {
			ans = gcd(ans, x[i]);
		}
		System.out.println(ans);

	}

	static int gcd(int a, int b) {
		int c = a;

		if (a < b) {
			a = b;
			b = c;
		}

		while (b != 0) {
			c = b;
			b = a % b;
			a = c;
		}
		return a;
	}
}
