import java.util.*;

class Main {
	Scanner sc;
	int N;
	long K;
	long[] A, F;
	
	Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		A = new long[N];
		F = new long[N];
		K = sc.nextLong();
		for (int i = 0; i < N; i++) A[i] = sc.nextLong();
		for (int i = 0; i < N; i++) F[i] = sc.nextLong();
		Arrays.sort(A);
		Arrays.sort(F);
		for (int i = 0; i < N/2; i++) {
			F[i] ^= F[N-1-i];
			F[N-1-i] ^= F[i];
			F[i] ^= F[N-1-i];
		}
		
		long ans = 0x7fffffffffffffffL;
		for (long bit = 1L<<62; bit > 0L; bit >>>= 1) {
			if (requiredK(ans & ~bit) > K) continue;
			ans &= ~bit;
		}
		System.out.println(ans);
	}
	
	private long requiredK(long minVal) {
		long s = 0L;
		for (int i = 0; i < N; i++) {
			long x = minVal/F[i];
			if (A[i] > x) s += (A[i]-x);
		}
		return s;
	}
	
	public static void main(String[] args) throws Exception {
		new Main().calc();
	}
}
