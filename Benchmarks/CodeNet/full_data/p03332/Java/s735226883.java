import java.util.*;

public class Main {
    static final int MOD = 998244353;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        long k = sc.nextLong();
        Combination comb = new Combination(n + 1);
        long total = 0;
        for (int i = 0; i * a <= k; i++) {
            if ((k - i * a) % b != 0) {
                continue;
            }
            int j = (int)((k - i * a) / b);
            total += (comb.getComb(n, i) * comb.getComb(n, j)) % MOD;
            total %= MOD;
        }
        System.out.println(total);
    }
}

class Combination {
    static final int MOD = 998244353;
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


