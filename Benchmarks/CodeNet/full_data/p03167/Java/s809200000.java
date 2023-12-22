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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        int mod = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            String[] b = new String[n];
            for (int i = 0; i < n; i++) b[i] = in.next();
            char[][] board = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    board[i][j] = b[i].charAt(j);
                }
            }
            int[][] dp = new int[n][m];
            dp[0][0] = 1;
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            if (row + 1 < n && board[row + 1][col] == '.')
                                dp[row + 1][col] = (dp[row + 1][col] + dp[row][col]) % mod;
                        } else {
                            if (col + 1 < m && board[row][col + 1] == '.')
                                dp[row][col + 1] = (dp[row][col + 1] + dp[row][col]) % mod;
                        }
                    }
                }
            }

            out.println(dp[n - 1][m - 1] % mod);
        }

    }
}

