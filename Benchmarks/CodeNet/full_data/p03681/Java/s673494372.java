import java.util.Scanner;

public class Main {
    static final long MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if (Math.abs(n - m) >= 2) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        for (int i = n; i >= 2; i--) {
            ans = modmul(ans, i, MOD);
        }
        for (int i = m; i >= 2; i--) {
            ans = modmul(ans, i, MOD);
        }

        if (Math.abs(n - m) == 0) {
            System.out.println(modmul(ans, 2, MOD));
        } else if (Math.abs(n - m) == 1) {
            System.out.println(ans);
        }

    }

    static long modadd(long a, long b, long mod) {
        return (a + b) % mod;
    }

    static long modmul(long a, long b, long mod) {
        return (a * b) % mod;
    }
}