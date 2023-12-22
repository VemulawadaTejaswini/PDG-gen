import java.math.BigInteger;
import java.util.*;
public class Main {

	static int MOD = 1000000007;
	
	static long modpow(int N, int K) {
		return BigInteger.valueOf(N).modPow(BigInteger.valueOf(K), BigInteger.valueOf(MOD)).longValue();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans = 0;
		long[] x = new long[K+1];
		for(int i = K; i >= 1; i--) {
			x[i] = modpow(K/i, N);
			for(int j = i * 2; j <= K; j += i)
				x[i] -= x[j];
			ans = (ans + x[i] * i) % MOD;
		}
		while(ans < 0)
			ans += MOD;
		System.out.println(ans);
	}

}
