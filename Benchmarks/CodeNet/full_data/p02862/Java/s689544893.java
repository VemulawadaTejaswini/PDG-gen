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
        Knight solver = new Knight();
        solver.solve(1, in, out);
        out.close();
    }

    static class Knight {
        public static int MOD = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            if ((x + y) % 3 != 0) {
                out.println(0);
                return;
            }

            long n = (2 * y - x) / 3;
            long m = (2 * x - y) / 3;

            out.println(combination(n + m, n, MOD));

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

        static long modDiv(long a, long b, long mod) {
            return a * modInv(b, mod) % mod;
        }

        static long combination(long n, long k, long mod) {

            long a = 1, b = 1;
            for (int i = 0; i < k; i++) {
                a = a * (n - i) % mod;
                b = b * (i + 1) % mod;
            }
            return modDiv(a, b, mod);
        }

    }
}

