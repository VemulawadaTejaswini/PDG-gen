import java.util.*;

public class Main {
    static int MAX = 510000;
    static int MOD = 1000000007;
    static long[] fac;
    static long[] finv;
    static long[] inv;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        fac = new long[MAX];
        finv = new long[MAX];
        inv = new long[MAX];
        COMinit();
        
        long ans = 0;
        for (int i = k - 1; i < n; i++) {
            ans = (ans + (nCkMOD(i, k - 1, MOD) * array[i]) % MOD) % MOD;
        }
        
        for (int i = 0; i < n - k + 1; i++) {
            ans = (ans - (nCkMOD(n - 1 - i, k - 1, MOD) * array[i]) % MOD) % MOD;
        }
        
        if (ans < 0) {
            ans += MOD;
        }
        
        System.out.println(ans);
    }
    
    // テーブルを作る前処理
    public static void COMinit() {
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
    public static long nCkMOD(int n, int k, int MOD){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
}
