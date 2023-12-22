import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		long[] t = new long[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextLong();
		}
		long min = 1;
		for (int i = 0; i < n; i++) {
				min = lcm(min, t[i]);
		}
		System.out.println(min);
	}

	private static long lcm(long m, long n) {
		return m / gcd(m, n) * n;
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}
