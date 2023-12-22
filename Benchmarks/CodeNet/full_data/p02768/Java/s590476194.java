import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    private static int[] fact;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(N, a, b));
    }

    private static long solve(int N, int a, int b) {
        long sum = power(2, N, MOD) - 1;

        sum = mod(sum - combination(N, a, MOD), MOD);
        sum = mod(sum - combination(N, b, MOD), MOD);

        return mod(sum, MOD);
    }

    public static long power(long base, long t, long p) {
        long ans = 1;

        while (t > 0) {
            if (t % 2 == 1) {
                ans = ans * base % p;
            }

            t /= 2;
            base = base * base % p;
        }

        return ans;
    }

    public static long combination(int n, int r, int p) {
        if (n == 0 && r == 0) return 1;
        if (n < r || n < 0)   return 0;

        long sum = 1;
        for (int i=1; i<=r; i++) {
            sum = mod(sum * (n-i+1), p);
            sum *= modInv(i, p);
            sum = mod(sum, p);

        }

        return sum%MOD;
    }

    public static int modInv(long a, int p) {
        long b = p;
        long u = 1;
        long v = 0;
        while (b > 0) {
            long t = a/b;
            a -= t*b;
            u -= t*v;

            long tmp;
            tmp = a;
            a = b;
            b = tmp;

            tmp = u;
            u = v;
            v = tmp;
        }

        u %= p;
        if (u < 0) u+= p;

        return (int)u;
    }

    public static long mod(long a, long p) {
        return (a%p + p) % p;
    }
}