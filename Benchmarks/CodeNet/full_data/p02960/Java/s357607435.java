import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = str.length();
		int max = 13;
		int inv13[] = {0, 1, 7, 9, 10, 8, 11, 2, 5, 3, 4, 6, 12};
		int integer[] = new int[num];
		for(int i = 0; i < num; i ++) {
			integer[i] = str.charAt(i) == '?' ? 10 : str.charAt(i) - '0';
		}
		long dp[][] = new long[num + 1][max];
		dp[0][0] = 1;
		for(int i = 1; i <= num; i ++) {
			if(integer[i - 1] == 10) {
				for(int j = 0; j < max; j ++) {
					for(int k = 0; k < 10; k ++) {
						dp[i][(j + k) % max] = mod(dp[i][(j + k) % max] + dp[i - 1][(j * inv13[10]) % max]);
					}
				}
			}else {
				for(int j = 0; j < max; j ++) {
					dp[i][(j + integer[i - 1]) % max] = dp[i - 1][(j * inv13[10]) % max];
				}
			}
		}
		System.out.println(dp[num][5]);
	}

	static long MOD = (long)Math.pow(10, 9) + 7;
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
	
	static int MAX_FACT = 5_000_100;
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