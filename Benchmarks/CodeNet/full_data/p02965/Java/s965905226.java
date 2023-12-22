import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prepareFact();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = m * 3;
		long ans = H(n, sum);
		for(int i = m * 2 + 1; i <= sum; i ++) {
			long tmp = H(n - 1, sum - i);
			tmp = mod(tmp * (long)n);
			ans = mod(ans - tmp);
		}

		long minus = 0;
		for(int i = m + 2; i <= n; i += 2) {
			long tmp = H(n, (sum - i) / 2);
			tmp = mod(tmp * C(n, i));
			minus = mod(minus + tmp);
		}
		ans = mod(ans - minus);
		System.out.println(ans);
	}

	static long MOD = 998244353;
	public static long mod(long i) {
		return i % MOD + ((i % MOD) < 0 ? MOD : 0);
	}
	
	static long pow(long x, long y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		} else if (y % 2 == 0) {
			long tmp = pow(x, y / 2);
			return mod(tmp * tmp);
		} else {
			long tmp = pow(x, y / 2);
			return mod(mod(tmp * tmp) * x);
		}
	}
	
	static long inv(long x) {
		return pow(x, MOD - 2);
	}
	
	static int MAX_FACT = 2_500_100;
	static long fact[] = new long[MAX_FACT];
	static long invFact[] = new long[MAX_FACT];
	static void prepareFact() {
		fact[0] = 1;
		for(int i = 1; i < MAX_FACT; i ++) {
			fact[i] = mod(fact[i - 1] * i);
		}
		invFact[MAX_FACT - 1] = inv(fact[MAX_FACT - 1]);
		for(int i = MAX_FACT - 1; i > 0; i --) {
			invFact[i - 1] = mod(invFact[i] * i);
		}
	}

	static long P(int n, int r) {
		if(n < 0 || r < 0 || n < r) { return 0; }
		return mod(fact[n] * invFact[n - r]);
	}
	static long C(int n, int r) {
		if(n < 0 || r < 0 || n < r) { return 0; }
		return mod(P(n, r) * invFact[r]);
	}
	static long H(int n, int r) {
		return C((n - 1) + r, r);
	}
}