import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;
import java.math.BigInteger;

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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long[] xs = new long[n];
            long[] ys = new long[m];
            for (int i = 0; i < n; i++) {
                xs[i] = in.nextLong();
            }
            for (int i = 0; i < m; i++) {
                ys[i] = in.nextLong();
            }
            long x = 0L;
            for (int k = 1; k <= n; k++) {
                x += (k - 1) * xs[k - 1] - (n - k) * xs[k - 1];
            }
            long y = 0L;
            for (int k = 1; k <= m; k++) {
                y += (k - 1) * ys[k - 1] - (m - k) * ys[k - 1];
            }
            System.out.println(new BigInteger(String.valueOf(x))
                    .multiply(new BigInteger(String.valueOf(y)))
                    .remainder(new BigInteger(String.valueOf("1000000007"))));
        }

    }
}

