import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DStaticSushi solver = new DStaticSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DStaticSushi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            long c = in.nextLong();
            long[] x = new long[n];
            long[] v = new long[n];
            long[] f = new long[n];
            long[] fm = new long[n];
            long[] g = new long[n];
            long[] gm = new long[n];

            long max = 0;

            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
                v[i] = in.nextLong();
            }

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    f[i] = v[i] - x[i];
                    fm[i] = f[i];
                } else {
                    f[i] = f[i - 1] + v[i] - x[i] + x[i - 1];
                    fm[i] = Math.max(fm[i - 1], f[i]);
                }
            }

            for (int i = n - 1; i >= 0; i--) {
                if (i == n - 1) {
                    g[i] = v[i] - c + x[i];
                    gm[i] = g[i];
                } else {
                    g[i] = g[i + 1] + v[i] - (x[i + 1] - x[i]);
                    gm[i] = Math.max(gm[i + 1], g[i]);
                }
            }

            max = Math.max(max, gm[0]);
            max = Math.max(max, fm[n - 1]);
            for (int i = 0; i < n - 1; i++) {
                long cmp = f[i] - x[i] + gm[i + 1];
                max = Math.max(max, cmp);
            }

            for (int i = 1; i < n; i++) {
                long cmp = g[i] - (c - x[i]) + fm[i - 1];
                max = Math.max(max, cmp);
            }

            out.println(max);


        }

    }
}

