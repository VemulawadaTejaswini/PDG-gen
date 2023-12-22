import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnapsack1 solver = new DKnapsack1();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsack1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            long weights[] = new long[n + 1];
            long values[] = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                weights[i] = in.nextInt();
                values[i] = in.nextInt();
            }

            long dp[][] = new long[n + 1][w + 1];
            for (int i = 0; i <= w; i++)
                dp[0][i] = 0;
            for (int i = 0; i <= n; i++)
                dp[i][0] = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= w; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j - weights[i] >= 0) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][(int) (j - weights[i])] + values[i]);
                    }
                }
            }

            out.println(dp[n][w]);

        }

    }
}

