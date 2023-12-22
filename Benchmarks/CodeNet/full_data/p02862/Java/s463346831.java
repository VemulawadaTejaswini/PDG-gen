import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	static Scanner sc = new Scanner(System.in);
	static long[] f = null;
	static long[] fInverse = null;
	
	public static void main(String[] args) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x + y) % 3 != 0) {
			System.out.println(0);
			return;
		}
		
		int sz = (x + y) / 3;
		f = new long[sz + 1];
		fInverse = new long[sz + 1];
		for(int i = 0; i <= sz; ++i) {
			f[i] = (i < 2) ? 1 : f[i - 1] * i % MOD;
			fInverse[i] = calcModInv(f[i]);
		}
		
		long ans = 0;
		for(int a = 0; a <= sz; ++a) {
			int b = sz - a;
			int xx = a + 2 * b;
			int yy = 2 * a + b;
			
			if(xx == x && yy == y) ans = (ans + comb(sz, a)) % MOD;
		}
		
		System.out.println(ans);
	}
	
	static long comb(int n, int r) {
		return f[n] * fInverse[r] % MOD * fInverse[n - r] % MOD;
	}
	
	static long calcModInv(long n) {
		long[] s = new long[2];
		solve(n, MOD, s);
		return (s[0] >= 0) ? s[0] : s[0] + MOD;
	}
	
	static void solve(long a, long b, long[] res) {
		if(a < b) solve(b, a, res);
		
		if(b == 0) {
			res[0] = 1;
			res[1] = 0;
			return;
		}
		
		solve(b, a % b, res);
		long tmp = res[0] % MOD;
		res[0] = res[1] % MOD;
		res[1] = tmp - a / b % MOD * res[1] % MOD;
	}
}