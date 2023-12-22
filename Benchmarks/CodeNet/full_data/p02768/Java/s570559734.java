import java.util.*;

public class Main {
    static int MAX = 500000;
    static int MOD = 1000000007;
    static long[] fac;
    static long[] finv;
    static long[] inv;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        COMinit();
        
        long tmp = modpow(2, n) - 1;
        long tmp2 = 1;
        for (int i = 1; i <= a; i++) {
            tmp2 = (tmp2 * ((n + 1) - i)) % MOD;
            tmp2 = (tmp2 * inv[i]) % MOD;
        }
        long tmp3 = 1;
        for (int i = 1; i <= b; i++) {
            tmp3 = (tmp3 * ((n + 1) - i)) % MOD;
            tmp3 = (tmp3 * inv[i]) % MOD;
        }
        
        
        long ans = tmp -tmp2 -tmp3;
        while (ans < 0) {
            ans += MOD;
        }
        System.out.println(ans);
        
    }
    
    // テーブルを作る前処理
    public static void COMinit() {        
        fac = new long[MAX];
        finv = new long[MAX];
        inv = new long[MAX];
        
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
    // 二項係数計算
    public static long nCkMOD(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
    
    
    public static long modpow(long a, long n) {
        long res = 1;
        while (n > 0) {
            long tmp = n & 1;
            if (tmp > 0) res = res * a % MOD;
            a = a * a % MOD;
            n >>= 1;
        }
        return res;
    }
}
