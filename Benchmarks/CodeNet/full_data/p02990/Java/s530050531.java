import java.util.*;

class Main {
	static int mod=1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		for (int i=1;i<=K;i++) {
			System.out.println(nCr(N-K+1, i) * nCr(K-1, i-1) % mod);
		}
	}

	public static long factorial(int n) {
		long tmp = 1;
		for (int i=n;i>0;i--) {
			tmp = (tmp*i)%mod;
		}
		return tmp;
	}

	public static long pow(long a,int n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a)%mod;
	        }
	        a=(a*a)%mod;
	        n>>=1;
	    }
	    return res;
	}

	public static long modinv(long n) {
		return pow(n, mod-2);
	}

	public static long nCr(int n, int r) {
		return factorial(n) * modinv(factorial(n-r)) % mod * modinv(factorial(r)) % mod;
	}
}