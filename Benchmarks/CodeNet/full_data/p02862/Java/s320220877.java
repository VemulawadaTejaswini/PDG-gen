import java.util.*;

public class Main {
	static int mod = 1_000_000_007;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((x + y) % 3 != 0) {
        	System.out.println(0);
        	return;
        }
        int n = (2 * y - x) / 3;
        int m = y - 2 * n;
        if(n <= 0 || m <= 0) {
        	System.out.println(0);
            return;
        }
        System.out.println(comb(n+m, m) % mod);
    }

    private static long comb(int a, int b) {
    	long fA = factorial(a, a-b+1);
    	long fB = factorial(b, 1);
    	long invert = modPow(fB, mod - 2);
    	return fA * invert % mod;
    }

    private static long modPow(long a, long b) {
    	if(b == 1)
    		return a;
    	if(b == 0)
    		return 1;
    	long res = modPow(a, b / 2) % mod;
    	if(b % 2 == 1)
    		return (res * res % mod) * a % mod;
    	return (res * res % mod);
    }

    private static long factorial(int n, int start) {
    	long res = 1L;
    	for(long i = start; i <= n; i++)
    		res = res * i % mod;
    	return res % mod;
    }
}
