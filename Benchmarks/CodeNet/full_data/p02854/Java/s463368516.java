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
        BIronBarCutting solver = new BIronBarCutting();
        solver.solve(1, in, out);
        out.close();
    }

    static class BIronBarCutting {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // それぞれの切れ目でかかる金額を考えてやればいい。
            // |sum(left) - sum(right)|かかるのは自明
            // 累積和でしてやればいい
            int n = in.nextInt();
            long[] l = new long[n];
            long[] acc = new long[n + 1];
            long min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                l[i] = in.nextLong();
                acc[i + 1] = acc[i] + l[i];
            }

            for (int i = 1; i < n; i++) {
                min = Math.min(min, Math.abs(acc[n] - acc[i] * 2));
            }
            out.println(min);

        }

    }
}

