import java.io.*;
import java.util.*;

class Main {

	static final int M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] x = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
		}

		long[] fact = new long[N];
		fact[0] = 1;
		for (int i = 1; i < N; i++) {
			fact[i] = i * fact[i - 1];
			fact[i] %= M;
		}

		double a = 0;
		double[] c = new double[N];
		c[1] = 1.0;
		for (int i = 2; i < N; i++) {
			c[i] = 1.0 / (double) i + c[i - 1];
		}

		for (int i = 0; i < N - 1; i++) {
			double d = x[i + 1] - x[i];
			d = d * c[i + 1] % M;
			a = (a + d) % M;
		}
		a = (a * fact[N - 1]) % M;
		System.out.println((long) a);
	}
}
