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
        SimpleKnapsack solver = new SimpleKnapsack();
        solver.solve(1, in, out);
        out.close();
    }

    static class SimpleKnapsack {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long w = in.nextLong();

            long[] weights = new long[n];
            long[] values = new long[n];

            // i番目 | 選んだ個数 | weightの和
            long[][][] dp = new long[n + 1][n + 1][3 * n + 1];
            for (int i = 0; i < n; i++) {
                weights[i] = Long.parseLong(in.next());
                values[i] = Long.parseLong(in.next());
            }

            long sum = 0;
            for (int i = 0; i < n; i++) {
                int diff = (int) (weights[i] - weights[0]);
                for (int j = 0; j <= i; j++) {
                    for (int k = 0; k <= 3 * n; k++) {
                        dp[i + 1][j][k] = Math.max(dp[i + 1][j][k], dp[i][j][k]);
                        if (diff <= k) {
                            dp[i + 1][j + 1][k] = Math.max(dp[i][j + 1][k], dp[i][j][k - diff] + values[i]);
                        }
                    }
                }
                sum += diff;
            }
            long result = 0;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= 3 * n; j++) {
                    if (i * weights[0] + j <= w) {
                        result = Math.max(result, dp[n][i][j]);
                    }
                }
            }

            out.println(result);

//        long[] weights = new long[n];
//        long[] values = new long[n];
//
//        //  選んだ個数 | weightの和
//        long[][] dp = new long[n + 1][3 * n + 1];
//        for (int i = 0; i < n; i++) {
//            weights[i] = Long.parseLong(in.next());
//            values[i] = Long.parseLong(in.next());
//        }
//
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            int diff = (int) (weights[i] - weights[0]);
//            for (int j = i; 0 <= j; j--) {
//                for (int k = sum; 0 <= k; k--) {
//                    dp[j + 1][k + diff] = Math.max(dp[j + 1][k + diff], dp[j][k] + values[i]);
//                }
//            }
//            sum += diff;
//        }
//        long result = 0;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= sum; j++) {
//                if (w < i * weights[0] + j) {
//                    continue;
//                }
//                result = Math.max(result, dp[i][j]);
//            }
//        }
//
//        out.println(result);

        }

    }
}

