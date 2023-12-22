import java.util.*;
public class Main {
    static int mod = 1000_000_007;
    static long[] frac;
    public static void main(String[] args) {
        frac = new long[200_001];
        frac[0] = 1;
        for (int i = 1; i < 200_001; i++) frac[i] = frac[i - 1] * i % mod;
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans += comb(i + b - 1, i) * comb(h + w - b - i - 2, w - b - 1) % mod;
            ans %= mod;
        }
        System.out.println(ans);
    }
    public static long comb(int a, int b) {
        return (frac[a] * modInv(frac[b]) % mod) * modInv(frac[a - b]) % mod;
    }
    public static long modInv(long n) {
        return exp(n, mod - 2) % mod;
    }
    public static long exp(long a, long b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long c = 1;
        if (b % 2 == 1) c = a;
        long d = exp(a, b / 2);
        return (d * d % mod) * c % mod;
    }
}