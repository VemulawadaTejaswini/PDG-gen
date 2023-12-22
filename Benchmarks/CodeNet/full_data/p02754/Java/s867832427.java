package atCorder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long b = sc.nextLong();
		long r = sc.nextLong();
		sc.close();

		if (b == 0) {
			System.out.println(0);
			return;
		}
		if (b == 0 && r == 0) {
			System.out.println(0);
			return;
		}
		if (r == 0) {
			System.out.println(n);
			return;
		}

		long m = b + r;
		long p = n / m;
		long h = b * p;
		long g = n % m;

		if (b >= g) {
			System.out.println(h + g);
			return;
		} else if (b < g) {
			long v = b * (p + 1);
			System.out.println(v);
			return;
		}
	}
}