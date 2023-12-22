import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long M = in.nextLong();
		long[] a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextLong() / 2;
		}
		long x = a[0];
		for (int i = 1; i < a.length; i++) {
			x = lcm(x, a[i]);
		}

		long count = 0;
		for (int i = 1; i * x <= M; i += 2) {
			count++;
		}
		System.out.println(count);
		in.close();
	}

	static long gcd(long x, long y) {
		if (x < y) {
			long tmp = y;
			y = x;
			x = tmp;
		}
		if (y == 0) {
			return x;
		}
		return gcd(x % y, y);
	}

	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
}