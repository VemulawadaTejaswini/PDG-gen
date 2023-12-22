import java.util.*;
 
public class Main{
	public static long[] FACT = new long[300001];
	public static long[] IFACT = new long[300001];
	public static long MOD = 998244353;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		long max = Math.min((long)N,K/A);

		FACT[0] = 1;
		IFACT[0] = 1;
		for(int i=1;i<=N;++i){
			FACT[i] = FACT[i-1] * i % MOD;
			IFACT[i] = mod_inverse(FACT[i]);
		}
		long ans = 0;
		for(int as=0;as<=max;++as){
			long bs = (K-A*as)/B;
			if(bs<=N && (A*(long)as + B*bs)==K){
				ans += comb(N,as) * comb(N,(int)bs);
				ans %= MOD;
			}
		}
		System.out.println(ans);
		return;
	}
	
	public static long comb(int n, int r){
		if(n < 0 || r < 0 || r > n) return 0;
		if(r > n / 2) r = n - r;
		return FACT[n]*IFACT[n-r]%MOD*IFACT[r]%MOD;
	}
	
	public static final long mod_inverse(long a){
	    long x0 = 1, x1 = 0;
	    long y0 = 0, y1 = 1;
	    long b = MOD;
	    while (b != 0) {
	        long q = a / b;
	        long r = a % b;
	        long x2 = x0 - q * x1;
	        long y2 = y0 - q * y1;

	        a = b; b = r;
	        x0 = x1; x1 = x2;
	        y0 = y1; y1 = y2;
	    }
	    return (MOD+x0%MOD)%MOD;
	}

}