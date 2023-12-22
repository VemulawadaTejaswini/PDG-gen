import java.util.*;

class Main {
	Scanner sc;
	int n, k;
	static final int MOD = 1_000_000_007;
	
	void calc() {
		sc = new Scanner(System.in);
		n = sc.nextInt();
		k = Math.min(n, sc.nextInt());
		
		long s = 1;
		long f = 1;
		long nCi = 1;
		for (int i = 1; i <= k; i++) {
			f = f * (n-i) % MOD * inv(i) % MOD;
			nCi = nCi * (n-i+1) % MOD * inv(i) % MOD;
			s = (s + nCi * f % MOD) % MOD;
		}
		System.out.println(s);
	}
	
	static final long inv(long a) {
		long b = MOD;
		long aa = a, bb = b;
		long x0 = 1, x1 = 0;
		long y0 = 0, y1 = 1;
	
		while (b != 0) {
			long q = a / b;
			long r = a % b;
			long x2 = x0 - q * x1;
			long y2 = y0 - q * y1;
	
			a = b; b = r;
			x0 = x1; x1 = x2;
			y0 = y1; y1 = y2;
		}
		if (bb > 0 && x0 < 0) {
			long n = -x0/bb;
			if (-x0%bb != 0) n++;
			x0 += n*bb; y0 -= n*aa;
		}
	    return x0;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
	
