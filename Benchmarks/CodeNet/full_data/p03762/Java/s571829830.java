import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long[] x = new long[n];
            long[] y = new long[m];
            ModInt xx = new ModInt(0);
            ModInt yy = new ModInt(0);
            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
            }
            for (int i = 0; i < m; i++) {
                y[i] = in.nextLong();
            }
            Arrays.sort(x);
            Arrays.sort(y);
            for (int i = 0; i < n; i++) {
                xx = xx.add(x[i] * (-n + 1 + i * 2));
            }
            for (int i = 0; i < m; i++) {
                yy = yy.add(y[i] * (-m + 1 + i * 2));
            }
            out.println(xx.mul(yy).getVal());

        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (int) ((i + MOD) % MOD);
        }

        public ModInt add(long l) {
            return new ModInt(this.val + l);
        }

        public ModInt mul(ModInt m) {
            return new ModInt(this.val * m.getVal());
        }

        public long getVal() {
            return val;
        }

    }
}

