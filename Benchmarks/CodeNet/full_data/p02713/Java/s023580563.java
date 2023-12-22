

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= k; j++) {
				for (int l = 1; l <= k; l++) {
					ans += gcd(i, gcd(j, l));
				}
			}
		}

		System.out.println(ans);

	}

	private static int gcd(int a, int b) {
		int c = 0;
		int r = 1;

		if (a > b) {

			while (r > 0) {
				r = a % b;
				a = b;
				b = r;
			}
			c = a;

		} else if (b > a) {
			while (r > 0) {
				r = b % a;
				b = a;
				a = r;
			}
			c = b;
		} else {
			c = a;
		}

		return c;
	}

}
