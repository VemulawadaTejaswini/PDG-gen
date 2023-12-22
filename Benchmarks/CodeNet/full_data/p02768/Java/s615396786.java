import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    static long[] fac = new long[1000003];
    static long[] finv = new long[1000003];
    static long[] inv = new long[1000003];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long ans = modpow(n);
        sc.close();        
        ans -= 1 + nCk(n, a, MOD) + nCk(n, b, MOD);
        while(ans < 0){
            ans += MOD;
        }
        System.out.println(ans);
    }
    static long modpow(final long n) {
        long ans = 1;
        long a = 2;
        long m = n;
        while (m > 0) {
            if ((m & 1) == 1)
                ans = ans * a % MOD;
            a = a * a % MOD;
            m >>= 1;
        }
        return ans;
    }
    public static int nCk(int n, int k, int M) {
		long ret = 1;
		int min = Math.min(k, n - k);
		for (int i = 1; i <= min; i++) {
			ret = (ret * pow(i, M - 2, M)) % M;
		}
		for (int i = n - min + 1; i <= n; i++) {
			ret = (ret * i) % M;
		}
		return (int) ret;
    }

    public static long pow(long a, long b, int M) {
		long ret = 1;
		long tmp = a;
		while (b > 0) {
			if ((b & 1) == 1)
				ret = (ret * tmp) % M;
			tmp = (tmp * tmp) % M;
			b = b >> 1;
        }
        
		return ret;
	}
    
}