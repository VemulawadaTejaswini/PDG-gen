import java.util.*;

class Main {
    // ABC152E
    static final long MOD = 1_000_000_007;
    //10^9+7
    static final int MAX = 2_147_483_646;
    //intの最大値
    static final int INF = 1_000_000_000;
    //10^9
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ary = new long[n];
        long minlcm = 1;
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
            minlcm = lcm(minlcm,ary[i]);
        }
        long ans = 0;
        for(int i = 0;i < n;i++){
            ans += minlcm/ary[i];
            ans %= MOD;
        }
        System.out.println(ans);
    }
    
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
