import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BRGBColoring solver = new BRGBColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRGBColoring {
        static final int MOD = 998244353;
        int n;
        long[] ac;
        long[] bc;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            long a = in.nextInt(), b = in.nextInt();
            long k = in.nextLong();
            cache();
            long count = 0;
            int y = n;
            for (int x = 0; x <= n; x++) {
                long val;
                while ((val = (a * x) + (b * y)) > k) {
                    y--;
                }
                if (y < 0) {
                    break;
                }
                if (val != k) {
                    continue;
                }
                count += (nCk(x) * nCk(y) % MOD);
            }
            out.println(count % MOD);
        }

        long modPow(long x, long y) {
            if (y == 0) {
                return 1;
            } else if (y == 1) {
                return x;
            } else if (y % 2 == 0) {
                long z = modPow(x, y / 2);
                return z * z % MOD;
            } else {
                return (modPow(x, y - 1) * x) % MOD;
            }
        }

        long nCk(int k) {
            return (ac[k] * modPow(bc[k], MOD - 2) % MOD) % MOD;
        }

        void cache() {
            ac = new long[n];
            ac[0] = 1;
            for (int i = 0; i < n - 1; i++) {
                ac[i + 1] = ac[i] * (n - i);
                ac[i + 1] %= MOD;
            }
            bc = new long[n + 1];
            bc[0] = 1;
            bc[1] = 1;
            for (int i = 2; i <= n; i++) {
                bc[i] = bc[i - 1] * i;
                bc[i] %= MOD;
            }
        }

    }
}

