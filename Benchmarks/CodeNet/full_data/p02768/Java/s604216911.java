import java.util.Scanner;
 
public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        long ans = pow(2, n) - comb(n, a) - comb(n, b) - 1;
        if(ans < 0) ans = (Math.abs(ans) / mod + 1) * mod; 
        System.out.println(ans);
    }
    static long pow(long x, long n) {
        long result = 1;
        while(n > 0) {
            if(n % 2 == 1) result = (result * x) % mod;
            x = (x * x) % mod;
            n >>= 1;
        }
 
        return result;
    }
    static long comb(long n, long r) {
        long mol = 1, den = 1;
        r = Math.min(r, n - r);
        for(long i = n - r + 1; i <= n; i++) mol = (mol * i) % mod;
        for(long i = 1; i <= r; i++) den = (den * i) % mod;
        return mol * pow(den, mod - 2) % mod;
    }
}