import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numS = sc.nextInt();
		int numT = sc.nextInt();
		long s[] = new long[numS];
		for(int i = 0; i < numS; i ++) {
			s[i] = sc.nextLong();
		}
		long t[] = new long[numT];
		for(int i = 0; i < numT; i ++) {
			t[i] = sc.nextLong();
		}
		long dp[][] = new long[numS + 1][numT + 1];
		long dpSum[][] = new long[numS + 1][numT + 1];
		for(int i = 0; i <= numS; i ++) {
			dp[i][0] = 0;
			dpSum[i][0] = 1;
		}
		for(int i = 0; i <= numT; i ++) {
			dp[0][i] = 0;
			dpSum[0][i] = 1;
		}
		dp[0][0] = 1;

		for(int i = 1; i <= numS; i ++) {
			for(int j = 1; j <= numT; j ++) {
				dpSum[i][j] = mod(dpSum[i - 1][j] + dpSum[i][j - 1] - dpSum[i - 1][j - 1]);
				if(s[i - 1] != t[j - 1]) { dp[i][j] = 0; continue; }
				dp[i][j] = dpSum[i - 1][j - 1];
				dpSum[i][j] = mod(dpSum[i][j] + dp[i][j]);
			}
		}

		long ans = 0;
		for(int i = 0; i <= numS; i ++) {
			for(int j = 0; j <= numT; j ++) {
				ans = mod(ans + dp[i][j]);
			}
		}

		System.out.println(mod(ans));
	}

	static long MOD = (long)Math.pow(10, 9) + 7;
	public static long mod(long i) {
		return i % MOD + ((i % MOD) < 0 ? MOD : 0);
	}
	
	static long powerMod(long x, long y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		} else if (y % 2 == 0) {
			long tmp = powerMod(x, y / 2);
			return mod(tmp * tmp);
		} else {
			long tmp = powerMod(x, y / 2);
			return mod(mod(tmp * tmp) * x);
		}
	}
	
	static long invMod(long x) {
		return powerMod(x, MOD - 2);
	}
	
	static int MAX_FACT = 200_100;
	static long factMod[] = new long[MAX_FACT];
	static void prepareFact() {
		factMod[0] = 1;
		for(int i = 1; i < MAX_FACT; i ++) {
			factMod[i] = mod(factMod[i - 1] * i);
		}
	}
	
	static long combiMod(int n, int r) {
		if(n < 0 || n < r) { return 0; }
		if(r == 0 || r == n) { return 1; }
		return mod(mod(factMod[n] * invMod(factMod[r])) * invMod(factMod[n - r]));
	}
}