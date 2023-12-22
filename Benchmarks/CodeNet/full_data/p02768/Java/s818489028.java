import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Bouquet solver = new Bouquet();
        solver.solve(1, in, out);
        out.close();
    }

    static class Bouquet {
        public static long MOD = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            long result = modPow(2, n, MOD) - 1;
            result = modSub(result, com(n, a), MOD);
            result = modSub(result, com(n, b), MOD);
            out.println(result % MOD);
        }

        static long modSub(long x, long n, long mod) {
            long v = x - n;
            if (v < 0) {
                v += mod;
            }
            return v % mod;
        }

        static long modPow(long x, long n, long mod) {
            if (n == 0) {
                return 1;
            }
            long result = modPow(x, n / 2, mod);

            if (n % 2 == 0) {
                return (result * result) % mod;
            }
            return (((result * result) % mod) * x) % mod;
        }

        static long modInv(long a, long mod) {
            return modPow(a, mod - 2, mod);
        }

        static long com(long n, long k) {

            long result = 1;
            for (int i = 0; i < k; i++) {
                result = (result * (n - i)) % MOD;
                result = (result * modInv(i + 1, MOD)) % MOD;
            }
            return result;
        }

    }
}

