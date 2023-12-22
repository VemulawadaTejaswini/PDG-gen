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
        BFrog2 solver = new BFrog2();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFrog2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();

            int dp[] = new int[n + 5];
            dp[0] = 0;
            dp[1] = Math.abs(a[0] - a[1]);
            if (n > 2) {
                for (int i = 2; i < n; i++) {
                    dp[i] = Integer.MAX_VALUE;
                    for (int j = 1; j <= k && j <= i; j++) {
                        dp[i] = Math.min(dp[i - j] + Math.abs(a[i - j] - a[i]), dp[i]);
                    }
                }
            }

            out.println(dp[n - 1]);
        }

    }
}

