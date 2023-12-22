import java.util.*;

public class Main {
    static long MOD = 2494478851L;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        
        int odds = 0;
        int evens = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        
        long evens_ans = 0;
        for (int i = 0; i <= evens; i++) {
            evens_ans += nCkMOD(evens, i, MOD);
        }
        
        long odds_ans = 0;
        if (p == 0) {
            for (int i = 0; i <= odds; i += 2) {
                odds_ans += nCkMOD(odds, i, MOD);
            }
        } else {
            for (int i = 1; i <= odds; i += 2) {
                odds_ans += nCkMOD(odds, i, MOD);
            }
        }
        
        long ans = evens_ans * odds_ans;
        System.out.println(ans);
        
        
        
        // p = 0
        // 偶数を0~evens個選ぶ、奇数を2,4,odds個選ぶ
        // p=1
        // 偶数を0~evens個選ぶ、奇数を1,3,odds個選ぶ
    }
    
    public static long nCkMOD(long n, long k, long mod) {
        if (k > n - k) return nCkMOD(n, n - k, mod);
    
        long res = 1;
        for (int i = 0; i < k; i++) {
            res = (res * (n - i)) % mod;
        }
        for (int i = 1; i <= k; i++) {
            res = (res * inverse(i, mod)) % mod;
        }
    
        return res % mod;
    }
    
    private static long inverse(long a, long mod) {
        // System.out.println(modpow(a, mod - 2, mod));
        return modpow(a, mod - 2, mod);
    }
    
    private static long modpow(long a, long n, long mod) {
        long res = 1;
    
        while (n > 0) {
            if (n % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            n >>= 1;
        }
    
        return res % mod;
    }
}
