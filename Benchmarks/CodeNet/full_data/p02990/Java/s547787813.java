import java.util.*;

class Main {
	static int mod=1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int cnt = N-K+1;
		for (int i=1;i<=K;i++) {
			if (cnt>0) {
				System.out.println(nCr(N-K+1, i) * nCr(K-1, i-1) % mod);
			} else {
				System.out.println(0);
			}
			cnt--;
		}
	}

	public static long factorial(int n) {
		long tmp = 1;
		for (int i=n;i>0;i--) {
			tmp = (tmp*i)%mod;
		}
		return tmp;
	}

static long modinv(long a) {
    long b = mod;
    long u = 1L;
    long v = 0L;
    while (b>0) {
        long t = a / b;
        a -= t * b;
        long tmp_1 = a;
        a = b;
        b = tmp_1;

        u -= t * v;
        long tmp_2 = u;
        u = v;
        v = tmp_2;
    }
    u %= mod;
    if (u < 0) {
    	u += mod;
    }
    return u;
}

public static long nCr(int n, int r) {
	return factorial(n) * modinv(factorial(n-r)) % mod * modinv(factorial(r)) % mod;
}
}