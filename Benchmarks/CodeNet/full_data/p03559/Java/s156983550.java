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
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; ++i) a[i] = in.nextInt();
            for (int i = 0; i < n; ++i) b[i] = in.nextInt();
            for (int i = 0; i < n; ++i) c[i] = in.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);

            long[] dp1 = new long[n];
            Arrays.fill(dp1, 0);
            int u = 0;
            for (int d = 0; d < n; ++d) {
                while (u < n && a[u] < b[d]) ++u;
                if (d == 0) {
                    dp1[d] = u;
                } else {
                    dp1[d] = dp1[d - 1] + u;
                }
            }

            u = 0;
            long res = 0;
            for (int d = 0; d < n; ++d) {
                while (u < n && b[u] < c[d]) ++u;
                if (u > 0) {
                    res += dp1[u - 1];
                }
            }

            out.println(res);
        }

    }
}

