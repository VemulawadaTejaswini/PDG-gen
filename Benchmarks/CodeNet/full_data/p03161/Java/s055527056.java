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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            int[] dp = new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            dp[0] = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j <= k; j++) {
                    if (i - j >= 0) {
                        dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(a[i] - a[i - j]));
                    }
                }

            }

            out.println(dp[n - 1]);
        }

    }
}

