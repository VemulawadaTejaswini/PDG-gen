import java.util.Scanner;

public class Main {

    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n == 2) {
            System.out.println(0);
            return;
        }

        long sum = modPow(2, n, MOD);
        sum -= 1; // どれも選ばない0本のケースは無効なので引いておく
        sum -= combination(n, a);
        sum -= combination(n, b);

        if (sum < 0) {
            System.out.println(sum + MOD);
        } else {
            System.out.println(sum % MOD);
        }
    }

    private static long modPow(long a, long n, long p) {
        if (n == 1) {
            return a % p;
        }
        if (n % 2 == 1) {
            return (a * modPow(a, n - 1, p)) % p;
        }
        long t = modPow(a, n / 2, p);
        return (t * t) % p;
    }

    private static long combination(int n, int k) {
        long x = 1;
        long y = 1;
        for (int i = 0; i < k; i++) {
            x *= n - i;
            x %= MOD;
            y *= k - i;
            y %= MOD;
        }
        return x * modPow(y, MOD - 2, MOD) % MOD;
    }
}
