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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            int[] weights = new int[n];
            int[] values = new int[n];
            int v = 0;
            for (int i = 0; i < n; i++) {
                weights[i] = in.nextInt();
                values[i] = in.nextInt();
                v += values[i];
            }
            long[][] dp = new long[n + 1][v + 1];
            int ans = -1;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= v; j++) {
                    if (i == 0 || j == 0)
                        dp[i][j] = Integer.MAX_VALUE;
                    else if (values[i - 1] <= j) {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - values[i - 1]] + weights[i - 1]);
                    } else
                        dp[i][j] = Math.min(weights[i - 1], dp[i - 1][j]);
                    if (dp[i][j] <= w)
                        ans = Math.max(j + 1, ans);
                }
            }
            out.println(ans);
        }

    }
}

