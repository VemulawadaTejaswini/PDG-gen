
import java.util.Scanner;

public class Main{
	
	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		long k = Long.parseLong(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		int []b = new int [n];
		int []c = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = i ; j < n ;j++) {
				if(a[i] > a[j]) {
					b[i]++;
				}
			}
		}
		for(int i = n-1 ; i >= 0 ; i--) {
			for(int j = i ; j >= 0 ; j--) {
				if(a[i] > a[j]) {
					c[i]++;
				}
			}
		}
		
		long p = Modpow(2,mod-2);
		
		long sum1 = (((k *(k+1))%mod)*p)%mod;
		long sum2 = (((k*(k-1))%mod)*p)%mod;
	
		long ans = 0 ;
		for(int i = 0 ; i < n ;i++) {
			ans = (ans + (b[i] * sum1)%mod)%mod;
			ans = (ans + (c[i] * sum2)%mod)%mod;
		}
		
		System.out.println(ans);
	}
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
