
import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      long N = sc.nextInt();
      long K = sc.nextInt();
      
      for(long i=1;i<K+1;i++) {
       	  cnt = (long) (( nCr(N-K+1,i) * nCr(K-1,i-1) ) % (1e9+7));
    	  System.out.println(cnt);
      }
  }
  
  
	public static long factorial(long n) {
		long tmp = 1;
		for (long i=n;i>0;i--) {
			tmp = (tmp*i)%mod;
		}
		return tmp;
	}
 
	public static long pow(long a,long n) {
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
 
	public static long nCr(long n, long r) {
		return factorial(n) * modinv(factorial(n-r)) % mod * modinv(factorial(r)) % mod;
	}
}
