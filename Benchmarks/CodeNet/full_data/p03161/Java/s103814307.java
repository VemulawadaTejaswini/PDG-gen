import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(in.next());
            }

            int[] dp = new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);

            dp[0] = 0;
            dp[1] = dp[0] + Math.abs(h[1] - h[0]);
            for (int i = 2; i < n; i++) {
                for (int j = 1; j <= k; j++) {
                    if (j <= i) dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
                }
            }

            out.println(dp[n - 1]);

        }

    }
}

