import java.io.*;
import java.util.*;

class Main {
	static final int M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[][] a = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextLong();
			}
		}
		a = pow(a, k);
		long answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				answer = (answer + a[i][j]) % M;
			}
		}

		System.out.println(answer);
	}

	private static long[][] pow(long[][] a, long n) {
		long[][] b = e(a.length);
		while (n > 0) {
			if (n % 2 == 1) b = mul(b, a);
			a = mul(a, a);
			n /= 2;
		}

		return b;
	}

	private static long[][] e(int n) {
		long[][] a = new long[n][n];
		for (int i = 0; i < n; i++) {
			a[i][i] = 1;
		}
		return a;
	}

	private static long[][] mul(long[][] a, long[][] b) {
		long[][] c = new long[b.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < a.length; k++) {
					c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % M;
				}
			}
		}
		return c;
	}
}
