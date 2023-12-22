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
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ETwoCurrencies solver = new ETwoCurrencies();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETwoCurrencies {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int MAX = 2510;
            final long INF = (long) 1e15;
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int[] u = new int[m];
            int[] v = new int[m];
            int[] a = new int[m];
            int[] b = new int[m];
            int[] c = new int[n];
            int[] d = new int[n];
            for (int i = 0; i < m; i++) {
                u[i] = in.nextInt() - 1;
                v[i] = in.nextInt() - 1;
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
                d[i] = in.nextInt();
            }

            long[][] dp = new long[n][MAX + 1];
        /*
         dp[i][j] = k
         街 i に　銀貨を j 枚所持した状態で訪れる最短の時間が k 分である
         */

            for (int i = 0; i < n; i++) Arrays.fill(dp[i], INF);
            dp[0][Math.min(s, MAX)] = 0;
            for (int j = 0; j <= MAX; j++) {
                int coin = Math.min(MAX, j + c[0]);
                dp[0][coin] = Math.min(dp[0][coin], dp[0][j] + d[0]);
            }

            boolean updated = true;
            while (updated) {
                updated = false;
                for (int i = 0; i < m; i++) {
                    for (int j = a[i]; j <= MAX; j++) {
                        if (dp[v[i]][j] + b[i] < dp[u[i]][j - a[i]]) {
                            updated = true;
                            dp[u[i]][j - a[i]] = dp[v[i]][j] + b[i];
                        }
                        if (dp[u[i]][j] + b[i] < dp[v[i]][j - a[i]]) {
                            updated = true;
                            dp[v[i]][j - a[i]] = dp[u[i]][j] + b[i];
                        }
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= MAX; j++) {
                        int coin = Math.min(MAX, j + c[i]);
                        if (dp[i][j] + d[i] < dp[i][coin]) {
                            // 速い
                            updated = true;
                            dp[i][coin] = dp[i][j] + d[i];
                        }
                    }
                }
            }

            for (int i = 1; i < n; i++) {
                long res = INF;
                for (int j = 0; j <= MAX; j++) {
                    res = Math.min(res, dp[i][j]);
                }
                out.println(res);
            }

        }

    }
}

