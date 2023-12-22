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
        CVacation solver = new CVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CVacation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[][] = new int[n + 5][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = in.nextInt();
                }
            }

            int dp[][] = new int[n + 5][3];
            dp[0][0] = a[0][0];
            dp[0][1] = a[0][1];
            dp[0][2] = a[0][2];

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    if (j == 0)
                        dp[i][j] = a[i][j] + Math.max(dp[i - 1][1], dp[i - 1][2]);
                    if (j == 1)
                        dp[i][j] = a[i][j] + Math.max(dp[i - 1][0], dp[i - 1][2]);
                    if (j == 2)
                        dp[i][j] = a[i][j] + Math.max(dp[i - 1][1], dp[i - 1][0]);
                }
            }

            out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));

        }

    }
}

