

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long cd = gcd(c, d);

		long cdd = c / cd * d;

		long e = b / c - a / c + b / d - a / d - b / cdd + a / cdd;

		if (a % c == 0)
			e++;
		if (a % d == 0)
			e++;
		if (a % cdd == 0)
			e--;

		System.out.println(b - a + 1 - e);

	}

	static long gcd(long l, long m) {
		long n = l;
		if (l < m) {
			l = m;
			m = n;
		}

		while (m != 0) {
			n = m;
			m = l % m;
			l = n;
		}

		return l;
	}

}
