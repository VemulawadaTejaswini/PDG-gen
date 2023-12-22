import java.util.*;

public class Main {
	static int mod = 1_000_000_007;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(powMod(2, n) - comb(n, a) - comb(n, b) - 1);
    }
    
    static long comb(int n, int k) {
        long numerator = factorial(n);
        long denominator = factorial(n-k) * factorial(k) % mod;
        long inversed = inversed(denominator, mod);
        return numerator * inversed % mod;
    }

    static long factorial(int n) {
    	long res = 1;
    	for(int i = 2; i <= n; i++)
    		res = (res % mod) * (i % mod) % mod;
    		
        return res;
    }

    static long inversed(long a, int mod) {
		return powMod(a, mod - 2);
    }

    static long powMod(long a, int b) {
    	if(b == 0)
    			return 1;
        if(b == 1)
    			return a % mod;
    		long res = powMod(a, b/2) % mod;
        if(b % 2 == 1)
    			return (res * res) % mod * a % mod;
        return (res * res) % mod;
    }
}
