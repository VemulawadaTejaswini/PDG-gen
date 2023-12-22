import java.util.*;

class Make {
	Scanner sc;
	int n, a, b;
	static final int MOD = 1_000_000_007;
	
	void calc() {
		sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		long s = (pow2(n)-1+MOD)%MOD;
		long na = nCr(a);
		long nb = nCr(b);
		System.out.println( ((s-na+MOD)%MOD-nb+MOD)%MOD );
	}
	
	long pow2(int n) {
		long ans = 1;
		for (int i = 0; i < 31; i++) {
			ans = ans * ans % MOD;
			if ((n&0x40000000) > 0) ans = ans * 2 % MOD;
			n = n << 1;
		}
		return ans;
	}
	
	long nCr(int a) {
		// a を小さい方で取る
		if (a > n/2) a = n - a;
		long c = 1;
		for (int i = 0; i < a; i++) {
			c = c * (n - i) % MOD;
			c = c * inv(a - i) % MOD;
		}
		return c;
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
		new Make().calc();
	}
}
	
