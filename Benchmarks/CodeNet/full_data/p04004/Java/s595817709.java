import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static long MOD = 1_000_000_007;
	static long[] pow3 = new long[1_000_000];
	static long[] fact = new long[1_000_000];
	static long[] finv = new long[1_000_000];
	static int N, M, K;

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		if (N > 1000 || M > 1000 || K > 1000) return;
		pow3[0] = 1;
		fact[0] = 1;
		finv[0] = inv(1);
		for (int i = 1; i < pow3.length; ++i) {
			pow3[i] = pow3[i - 1] * 3 % MOD;
			fact[i] = fact[i - 1] * i % MOD;
			finv[i] = inv(fact[i]);
		}
		long ans = 0;
		for (int i = 0; i <= M; ++i) {
			for (int j = 0; j <= K; ++j) {
				ans += solve(i, j);
				ans %= MOD;
			}
		}
		System.out.println(ans);
	}

	static long solve(int b, int c) {
		long ret = pow3[M - b] * pow3[K - c] % MOD;
		ret *= fact[N - 1 + b + c];
		ret %= MOD;
		ret *= finv[N - 1];
		ret %= MOD;
		ret *= finv[b];
		ret %= MOD;
		ret *= finv[c];
		ret %= MOD;
		return ret;
	}

	static long inv(long v) {
		return pow(v, MOD - 2);
	}

	static long pow(long v, long p) {
		if (p == 0) return 1;
		if (p == 1) return v;
		long ret = pow(v, p / 2);
		ret *= ret;
		ret %= MOD;
		if (p % 2 == 1) {
			ret *= v;
			ret %= MOD;
		}
		return ret;
	}

}
