import java.util.*;
 
public class Main {
public static final long MOD = 1000000007;

    public static long gcd(long a, long b){
        if(b > a) return gcd(b, a);
        if(b == 0) return a;

        return gcd(b, a % b);
    }

    public static long lcm(long a, long b){
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long[] a = new long[(int)N];
        for(int i = 0; i < N; i++){
            a[i] = Long.parseLong(sc.next());
        }
        sc.close();

        Long commonLcm = 1L, ans = 0L;
        for(int i = 0; i < N; i++){
            commonLcm = lcm(commonLcm, a[i]);
        }

        for(long c : a){
            ans += (commonLcm / c) % MOD;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}