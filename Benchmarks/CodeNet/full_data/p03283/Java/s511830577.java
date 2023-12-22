import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DAtCoderExpress2 solver = new DAtCoderExpress2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAtCoderExpress2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            int q = in.nextInt();
            int[][] dp = new int[n + 1][n + 1];
            int[][] sum = new int[n + 1][n + 1];
            for (int i = 0; i < m; i++) {
                dp[in.nextInt()][in.nextInt()]++;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + dp[i][j];
                }
            }

            for (int i = 0; i < q; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                out.println(sum[r][r] - sum[l - 1][r] - sum[r][l - 1] + sum[l - 1][l - 1]);
            }


        }

    }
}

