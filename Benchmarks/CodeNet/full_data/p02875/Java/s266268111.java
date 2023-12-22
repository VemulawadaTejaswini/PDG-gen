import java.util.Scanner;

import static java.lang.System.in;

public final class Main {
	static Scanner sc = new Scanner(in);
	static final long MOD = 998244353;

	public static void main(String[] args) {
		int N = sc.nextInt();
		long[] comb = new long[N / 2 + 1];
		long[] cs = new long[comb.length];
		long[] css = new long[comb.length];
		comb[0] = 1;
		css[0] = cs[0] = comb[0];
		long pow2 = 1;
		for (int i = 1; i < comb.length; i++) {
			pow2 *= 2;
			pow2 %= MOD;
			comb[i] = comb[i - 1] * (N / 2 + 1 - i) % MOD;
			comb[i] *= inv(i);
			comb[i] %= MOD;
			cs[i] = comb[i] * pow2;
			cs[i] %= MOD;
			css[i] = (css[i - 1] + cs[i]) % MOD;
		}
		long invalid = 0;
		for (int i = 0; i < N / 2; i++) {
			invalid += cs[i] * css[N / 2 - 1 - i];
			invalid %= MOD;
		}
		invalid *= 2;
		invalid %= MOD;
		long ans = 1;
		for (int i = 0; i < N; i++) {
			ans *= 3;
			ans %= MOD;
		}
		ans += MOD - invalid;
		System.out.println(ans % MOD);
	}

	static long inv(long v) {
		return pow(v, MOD - 2);
	}

	static long pow(long b, long p) {
		if (p == 0) return 1;
		if (p == 1) return b;
		long ret = pow(b, p / 2);
		ret *= ret;
		ret %= MOD;
		if (p % 2 == 1) {
			ret *= b;
			ret %= MOD;
		}
		return ret;
	}
}
