import java.util.*;
public class Main {
	
	static int MOD = 1_000_000_007;
	static int MAX = 1000_000;
	static long[] fac = new long[MAX+1];
	static long[] finv = new long[MAX+1];
	static long[] inv = new long[MAX+1];
	
	static void COMinit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i <= MAX; i++) {
			fac[i] = fac[i-1] * i % MOD;
			inv[i] = MOD - inv[MOD%i] * (MOD/i) % MOD;
			finv[i] = finv[i-1] * inv[i] % MOD;
		}
	}
	
	static long cmb(int n, int k){
		if(n < k || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		COMinit();
		Map<Integer, Integer> fact = new HashMap<>();
		for(int i = 2; i <= Math.sqrt(M); i ++) {
			if(M % i == 0) {
				int n = 0;
				while(M % i == 0) {
					M /= i;
					n++;
				}
				fact.put(i, n);
			}
		}
		if(M > 1)
			fact.put(M, 1);
		long ans = 1;
		for(int i: fact.values())
			ans = ans * cmb(i+N-1, i) % MOD;
		System.out.println(ans);

	}

}