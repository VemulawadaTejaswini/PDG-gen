import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
	static final int MOD = 1000000007;
	static long[] f = null;
	static long[] fInverse = null;

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        f = new long[b + 1];
        fInverse = new long[b + 1];
        for(int i = 1; i <= b; ++i) {
            f[i] = (i == 1) ? 1 : f[i - 1] * i % MOD;
            fInverse[i] = calcModInv(f[i]);
        }

        long ans = pow(2, n) - 1L - comb(n, a) - comb(n, b);
        while(ans < 0L) {
            ans += MOD;
        }
        System.out.println(ans);
    }

    static long comb(int n, int r) {
        long perm = 1L;
        for(int i = n; i > n - r; --i) {
            perm = perm * i % MOD;
        }
        return perm * fInverse[r] % MOD;
    }
	
	static long calcModInv(long n) {
		long[] s = new long[2];
		solveEquation(n, MOD, s);
		return (s[0] >= 0) ? s[0] : s[0] + MOD;
	}
	
	static void solveEquation(long a, long b, long[] res) {
		if(a < b) solveEquation(b, a, res);		
		if(b == 0) {
			res[0] = 1;
			res[1] = 0;
			return;
		}		
		solveEquation(b, a % b, res);
		long tmp = res[0] % MOD;
		res[0] = res[1] % MOD;
		res[1] = tmp - a / b % MOD * res[1] % MOD;
    }
    
    static long pow(long a, long x) {
        if(x == 0L) {
            return 1L;
        }

        long t = pow(a, x / 2L);
        if(x % 2L == 0) {
            return t * t % MOD;
        } else {
            return t * t % MOD * a % MOD;
        }
    }

    static boolean isPrime(long n) {
        for(long t = 2L; t * t <= n; t += (t == 2L) ? 1L : 2L) {
            if(n % t == 0L) {
                return false;
            }
        }
        return true;
    }
}