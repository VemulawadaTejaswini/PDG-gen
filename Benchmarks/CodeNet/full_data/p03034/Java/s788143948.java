import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FFrogJump solver = new FFrogJump();
        solver.solve(1, in, out);
        out.close();
    }

    static class FFrogJump {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextLong();
            //long res = solveSimple(n, arr);
            long res = solveMe2(n, arr);
            out.println(res);
        }

        private long solveMe2(int n, long[] s) {
            long max = 0;
            long[] dp = new long[n + 1];
            for (int d = 1; d < n; d++) {
                int maxn = n - d;
                if ((n - 1) % d == 0) maxn = n / 2;
                for (int k = 1; k * d < maxn; k++) {
                    dp[k] = dp[k - 1] + s[k * d] + s[n - 1 - k * d];
                    max = Math.max(max, dp[k]);
                }
            }
            return max;
        }

    }
}

