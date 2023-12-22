
import java.util.Scanner;

public class Main {
	
	static int mod = 1000000007;

	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		long []b = new long [n];
		int []gcd = new int [1000001];
 		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Modpow(a[i], mod-2);
		}
				
		for(int i = 0 ; i < n ;i++) {
			if(a[i] == 1) continue;
			
			int temp = a[i];
			for(int j = 2 ; j * j <= a[i] ;j++) {
				int cnt = 0;
				if(temp % j == 0) {
					while(temp % j == 0) {
						temp = temp / j;
						cnt++;
					}
					gcd[j] = Math.max(cnt, gcd[j]);
				} 
			}
			if(temp != 1 && prime(temp)) {
				gcd[temp] = Math.max(1, gcd[temp]);
			}
		}
		
		
		long lcm = 1L;
		
		for(int i = 0 ; i <= 1000000 ;i++) { 
			if(gcd[i] > 0) {
				lcm = (Modpow(i, gcd[i]) * lcm) % mod;
			}
		}
				
		long ans = 0 ;
		
	
		for(int i = 0 ;i < n ; i++) {
			long q = (lcm * b[i]);
			ans = (ans + q)% mod;
		}
		
		System.out.println(ans);
		
	}
	
	//a^n mod
		static long Modpow(long a, long n) {
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
		
	static boolean prime(int m) {
		if(m == 1) {
			return false;
		}
		
		for(int i = 2 ; i * i <= m ;i++) {
			if(m % i == 0) {
				return false;
			}
		}
		return true;
	}
}
