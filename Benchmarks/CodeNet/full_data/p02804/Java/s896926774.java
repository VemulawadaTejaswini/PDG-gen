import java.util.*;
public class Main {
		
	static int MOD = 1_000_000_007;
	static int MAX = 100_000;
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
	
	static long combination(int n, int k){
		if(n < k || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
	}
	
	public static void main(String[] args) {
		COMinit();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.sort(A);
		long ans = 0;
		for(int i = 0; i < N; i++) {
			ans += A[N-1-i]*(combination(N-1-i, K-1)-combination(i, K-1));
			ans %= MOD;
		}
		System.out.println(ans);


	}

}