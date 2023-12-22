import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final long K = sc.nextLong();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		if (K == 0) {
			System.out.println(f(0, A));
			return;
		}
		long k = K;
		int numBit = 0;
		while (k > 0) {
			numBit++;
			k = k / 2;
		}

		long n = 0;
		for (int b = numBit - 1; b >= 0; b--) {
			long mask = 1 << b;
			if (n + mask > K) {
				continue;
			}
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if ((A[i] & mask) > 0) {
					cnt++;
				}
			}
			if (cnt < (N - cnt)) {
				n += mask;
			}
		}

		long m = 0;
		for (int b = 0; b < numBit - 1; b++) {
			long mask = 1 << b;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if ((A[i] & mask) > 0) {
					cnt++;
				}
			}
			if (cnt < (N - cnt)) {
				m += mask;
			}
		}

		System.out.println(Math.max(f(n, A), f(m, A)));

		sc.close();
	}

	private long f(long x, long[] a) {
		long res = 0;
		for (int i = 0; i < a.length; i++) {
			res += (x ^ a[i]);
		}
		return res;
	}
}