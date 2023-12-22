
import java.util.Scanner;

public class Main {

	static int mod = 1000000007;
	static long[]fac;
	static long []finv;
	static int n,k;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		k = Integer.parseInt(sc.next());
		fac = new long [n+1];
		finv = new long [n+1];
		
		long ans = 0;
		COMinit();
		
		if(k == 1) {
			ans = COM(n-1,1) * n % mod;
			System.out.println(ans);
			return;
		}
		
		for(int i = 0 ; i <= Math.min(n-1, k) ;i++) {
			long temp = COM(n-1,i)*COM(n,i)%mod;
		//	System.out.println(temp);
			ans = (ans + temp)% mod;
		}
		System.out.println(ans);

	}

	public static void COMinit() {
	    fac[0] = fac[1] = 1;
	    finv[0] = finv[1] = 1;
	    for (int i = 2; i <= n; i++){
	        fac[i] = fac[i - 1] * i % mod;
	        finv[i] = finv[i - 1] * Modpow(i,mod-2) % mod;
	    }
	}
 
	// 二項係数計算
	public static long COM(int n ,int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
	}
 
	//a^n mod
	public static long Modpow(long a, long n) {
		long res = 1;
		while(n > 0) {
			if((n & 1) == 1) {
				res = res * a % mod;
			}
			a = a * a % mod;
			n >>= 1;
		}
		return res;
	}
	


}
