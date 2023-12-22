import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Combination cmb = new Combination(n + 1);
		long pSum = 0;
		long mSum = 0;
		for (int i = 0; i <= n - k; i++) {
		    long count = cmb.getComb(n - i - 1, k - 1);
		    mSum += (arr[i] + MOD) % MOD * count % MOD;
		    mSum %= MOD;
		    pSum += (arr[n - i - 1] + MOD) % MOD * count % MOD;
		    pSum %= MOD;
		}
		System.out.println((pSum - mSum + MOD) % MOD);
   }

}

class Combination {
    static final int MOD = 1000000007;
    long[] fac;
    long[] finv;
    long[] inv;
    
    public Combination (int size) {
        fac = new long [size];
        finv = new long [size];
        inv = new long [size];
        fac[0] = 1;
        fac[1] = 1;
        finv[0] = 1;
        finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < size; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
    
    
    public long getComb(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
    
}

