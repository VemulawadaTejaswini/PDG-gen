import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt();
		long[] NCK = new long[N-K+1];
		NCK[0] = 1;

		long A[] = new long[N];

		long MOD = 1000000007;
		long min = 0;
		long max = 0;

		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
		}
		Arrays.sort(A);
		for(int i = 1;i < N-K+1;i++) {
			NCK[i] = NCK[i-1] * (K+i-1);
			NCK[i] %= MOD;
			NCK[i] *= modinv(i,MOD);
			NCK[i] %= MOD;
		}
		for(int i = 0;i < N-K+1;i++) {
			min += A[i] * NCK[N-K-i];
			min %= MOD;
			max += A[N-1-i] * NCK[N-K-i];
			max %= MOD;
		}
		long ans = max - min;
		ans %=MOD;
		ans += MOD;
		ans %= MOD;
		System.out.println(ans);
	}

	public static long modinv(long a, long mod) {
		long b = mod, u = 1, v = 0;
		long buf = 0;
	    while (b>0) {
	        long t = a / b;
	        a -= t * b;
	        buf = a;
	        a = b;
	        b = buf;
	        u -= t * v;
	        buf = u;
	        u = v;
	        v = buf;
	    }
	    u %= mod;
	    if (u < 0) u += mod;
	    return u;

	}
}
