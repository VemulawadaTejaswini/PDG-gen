import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long c = sc.nextLong();
		long d = sc.nextLong();

		long lcm = c * d / gcd(c, d);

		long u = b - a + 1;
		long mC = b / c - (a - 1) / c;
		long mD = b / d - (a - 1) / d;
		long mCD = b / lcm - (a - 1) / lcm;

		long ans = u - mC - mD + mCD;

		System.out.println(ans);

		sc.close();
	}

	static long gcd(long m, long n) {
		long tmp;
		while (m % n != 0) {
			tmp = n;
			n = m % n;
			m = tmp;
		}
		return n;
	}
}
