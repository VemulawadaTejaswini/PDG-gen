import java.util.Scanner;

public class Main {
    public static long sa = 0;
    public static long sb = 0;
    public static long su = 0;
    public static long sv = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long[] c = new long[Math.toIntExact(n - 1)];
        c[1] = n;
        long ans = 0L;

        long divide = 1000000007L;

        for (int k = 2; k <= n; k++) {
            long tmp = (n - (k - 1)) * ((c[k - 1]) % divide);
            c[k] = tmp * modInv(k, divide) % divide;

//            System.out.println("k = " + k);
//            System.out.println(c[k]);
            if (k != a && k != b) {
                ans += (c[k] % divide);
            }
        }

        System.out.println(ans);
    }

    private static long modInv(long a, long m) {
        long b = m;
        long u = 1;
        long v = 0;
        while (b > 0) {
            long t = a / b;
            a -= t * b;
            u -= t * v;
            sa = a;
            sb = b;
            a = sb;
            b = sa;
            su = u;
            sv = v;
            u = sv;
            v = su;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }
}