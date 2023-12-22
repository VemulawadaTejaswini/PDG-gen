
import java.util.Scanner;

public class Main {

    public static class Combination {

        long [] factorial;
        int maxN;
        long Module;

        public Combination(final int maxN, final long Module) {
            this.maxN = maxN;
            factorial = new long[maxN];
            this.Module = Module;
        }

        public void init () {
            factorial[0] = 1;
            factorial[1] = 1;
            for (int i = 2; i < maxN; ++i) {
                factorial[i] = ((factorial[i - 1] % Module) * (i % Module)) % Module;
            }
        }
        // find x[0] and y[0] such that a * x[0] + b * y[0] = 1, return gcd(a, b)
        long extgcd(long a, long b, long[] x, long[] y) {
            long d = a;
            if (b != 0) {
                d = extgcd(b, a % b, y, x);
                y[0] -= (a / b) * x[0];
            } else {
                x[0] = 1;
                y[0] = 0;
            }
            return d;
        }

        /**
         * to find (1 / a) mod m
         that is, find x, such that a * x = 1 (mod m)
         that is, { a * x - 1 = k * m}
         that is, find x and k, such that a * x + k * m = 1. We can use extgcd algorithm
         */
        long inverseModule(long a, long m) {
            long[] x = new long[1];
            long[] y = new long[1];
            extgcd(a, m, x, y);
            return (m + x[0] % m) % m;
        }

        /**
         *  find fetch m kinds from n kinds, result mod k.
         *  nCm = n! / (m! * (n - m)!)
         *  nCm mod k = (n! (mod k) * (1 / (m!)) mod k * (1 / ((n - m)!)) mod k) mod k
         */
        long nCm(int n, int m, long k) {
            if (n < 0 || m < 0 || n < m) {
                return 0;
            }
            return (factorial[n] % k * inverseModule(factorial[m], k) % k
                    * inverseModule(factorial[n - m], k) % k ) % k;
        }

    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long mod = 1000000007L;
        Combination combination = new Combination(n + 1, mod);
        combination.init();

        for (int i = 1; i <= k; ++i) {
            if (n - k == i - 1) {
                System.out.println(1);
                continue;
            }
            if (n - k < i - 1) {
                System.out.println(0);
                continue;
            }
            long res = combination.nCm(k - 1, i - 1, mod);
            long sum = 0;
            for (int j = 1; j <= i + 1; ++j) {
                long current = (combination.nCm(i + 1, j, mod) % mod *
                        combination.nCm(n - k - i, j - 1, mod) % mod)
                        % mod;
                sum = sum % mod + current % mod;
                sum %= mod;
            }
            res *= sum;
            res %= mod;
            System.out.println(res);

        }

    }

}
