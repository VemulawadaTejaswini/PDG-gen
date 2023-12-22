import java.util.Scanner;

public class Main {
	public static long mod = (long)1e9+7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long ans = pow(2,n);
		long minus = comb(n,a)+comb(n,b)+1;
		while(ans < minus)ans += mod;
		ans -= minus;
		ans %= mod;
		System.out.println(ans);
		sc.close();
	}
	public static long comb(long a, long b) {
		if(a < b) return -1;
		long ans = 1;
		long inv = pow(fact(b), mod-2);
		for (int i = 0; i < b; i++) {
			ans = ans*a%mod;
			a--;
		}
		ans = ans*inv%mod;
		return ans;
	}
	public static long pow(long x, long n) {
	    long sum = 1;
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum = sum * x % mod;
	        }
	        x = x*x%mod;
	        n >>= 1;
	    }
	    return sum;
	}
	private static long fact(long n) {
	    long a = 1;
		while(n != 0) {
			a = a*n%mod;
			n = n-1;
		}
		return a;
	}
}