import java.util.*;
public class Main {
    static int mod = 1000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long all = exp(2, n);
        all = xmod(all - 1);
        long nca, ncb;
        nca = frac(n, a) * modInv(frac(a, a)) % mod;
        ncb = frac(n, b) * modInv(frac(b, b)) % mod;
        all = xmod(all - nca);
        all = xmod(all - ncb);
        System.out.println(all);
    }
    public static long exp(long i, long j) {
        if (j == 0) return 1;
        if (j == 1) return i;
        long k = exp(i, j / 2) % mod;
        long r = 1;
        if (j % 2 == 1) r = i;
        return (k * k % mod) * r % mod;
    }
    public static long xmod(long a) {
        return (a % mod + mod) % mod;
    }
    public static long frac(long a, long b) {
        long s = a;
        long ret = 1;
        while (s > a - b) {
            ret = ret * s % mod;
            s--;
        }
        return ret;
    }
    public static long modInv(long n) {
        long s = n, t = mod, u = 1, w = 0;
        while (t > 0) {
            long q = s / t;
            long temp;
            s %= t; temp = s; s = t; t = temp;
            u -= q * w; temp = u; u = w; w = temp;
        }
        return (u % mod + mod) % mod;
    }
}