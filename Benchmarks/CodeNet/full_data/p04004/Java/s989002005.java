import java.awt.geom.Point2D;
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.*;

 
 
 
public class Main {

	static long inv(long v) {
		return modPow(v, MOD - 2);
	}
	 
		
	static int MOD = 1000000007;
	static int mod = MOD;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int n = N + M + K;
		long ans = 0;
		long hh = 0;
		for(int i = N; i <= N + M + K; i++) {
			long retA = modPow(3,N + M + K - i) % MOD;
			
			long retB = comb(i-1,N-1) % MOD;
			long  retC = 0;
			retC = (retC + modPow(2,i - N)) % MOD;
			hh = hh * 2 % MOD;
			if (i - N > M) hh = (hh + comb(M + i - N - M - 1, i - N - M - 1) % MOD) % MOD;
			if (i - N > K) hh = (hh + comb(K + i - N - K - 1, i - N - K - 1) % MOD) % MOD;
			retC = (retC - hh) % MOD;
			long ansA = ((long)(retA) * (long)(retB)) % MOD;
			
			ansA *= retC % MOD;
			ansA %= MOD;
			ans += ansA;
			ans %= MOD;
		}
		System.out.println(ans);
	}
	public static int modPow(long a, long b) {
		if(b == 0) return 1 % MOD;
		if(b == 1) return (int) (a % MOD);
		
		if(b % 2 == 0) {
			long ret = modPow(a % MOD,b / 2) % MOD;
			return (int)((ret * ret) % MOD);
		}
		else {
			long ret = (a * (long)modPow(a % MOD,b-1)) % MOD;
			return (int)(ret % MOD);
		}
	}
	public static int comb(long n, long k) {
		if(k == 0) return 1;
		long AA = 1;
		for(int i = 0; i < k; i++) {
			AA *= (long)n - i;
			AA %= MOD;
		}
		for(int i = 1; i <= k; i++) {
			AA *= inv(i);
			AA %= MOD;
		}
		return (int)(AA % MOD);
	}


}