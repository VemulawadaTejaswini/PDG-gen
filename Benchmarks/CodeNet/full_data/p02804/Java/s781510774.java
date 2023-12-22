import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final int M = 1_000_000_007;

	private static class Combination {
		private final int M;
		private long[] fact;
		private long[] ifact;
		private long[] inv;

		public Combination(int n, int M) {
			this.M = M;
			fact = new long[n + 1];
			ifact = new long[n + 1];
			inv = new long[n + 1];

			fact[0] = fact[1] = 1;
			ifact[0] = ifact[1] = 1;
			inv[1] = 1;

			for (int i = 2; i <= n; i++) {
				fact[i] = fact[i - 1] * i % M;
				// p = (p / a * a) + (p % a)
				// 0 ≡ (p / a * a) + (p % a)          (mod p)
				// a^(-1) ≡ - (p % a)^(-1) * (p / a)  (mod p)
				inv[i] = M - inv[M % i] * (M / i) % M;
				ifact[i] = ifact[i - 1] * inv[i] % M;
			}
		}

		public long choose(int n, int k) {
			if (n < k) return 0;
			if (n < 0 || k < 0) return 0;
			return fact[n] * (ifact[k] * ifact[n - k] % M) % M;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);
		long answer = 0;
		Combination c = new Combination(n, M);

		for (int i = 0; i < n; i++) {
			if (i >= k - 1) {
				answer += a[i] * c.choose(i, k - 1);
				answer %= M;
			}

			if (n - 1 - i >= k - 1) {
				answer -= a[i] * c.choose(n - i - 1, k - 1);
				answer %= M;
			}
		}

		System.out.println(answer);
	}
}
