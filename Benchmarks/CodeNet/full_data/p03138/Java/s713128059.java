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
        XXOR solver = new XXOR();
        solver.solve(1, in, out);
        out.close();
    }

    static class XXOR {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            // 桁数 | 未満フラグ
            long[][] dp = new long[100][2];

            int dnum = 0;
            for (int i = 0; i <= 50; i++) {
                dp[i][0] = -1;
                dp[i][1] = -1;
                if ((k >> i) > 0) {
                    dnum++;
                }
            }
            if (k == 0) {
                long result = 0;
                for (long l : a) {
                    result ^= l;
                }
                out.println(result);
                return;
            }
            dp[0][0] = 0;
            for (int i = 0; i < dnum; i++) {
                int shift = dnum - i - 1;
                long mask = 1L << shift;
                int one = 0;
                for (long l : a) {
                    if ((l & mask) > 0) {
                        one++;
                    }
                }
                long cost0 = one * mask;
                long cost1 = (n - one) * mask;

                if (dp[i][1] >= 0) {
                    // 未満フラグ立っている
                    dp[i + 1][1] = Math.max(dp[i + 1][1], dp[i][1] + Math.max(cost1, cost0));
                }
                // 未満フラグ立ってない
                if (dp[i][0] >= 0) {
                    // ぴったり->未満
                    if ((k & mask) > 0) {
                        // kのbitが立っていたときに未満にできる
                        dp[i + 1][1] = Math.max(dp[i + 1][1], dp[i][0] + cost0);
                    }

                    // ぴったり->ぴったり
                    if ((k & mask) > 0) {
                        dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][0] + cost1);
                    } else {
                        dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][0] + cost0);
                    }

                }
            }
            out.print(Math.max(dp[dnum][0], dp[dnum][1]));
        }

    }
}

