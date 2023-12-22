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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        int H;
        int W;
        int A;
        int B;
        int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            H = in.nextInt();
            W = in.nextInt();
            A = in.nextInt();
            B = in.nextInt();

            int[][] dp = new int[H][W];
            dp[0][0] = 1;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (i + A >= H && j < B) {
                        continue;
                    }
                    if (i > 0 && j > 0) {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    } else if (i > 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else if (j > 0) {
                        dp[i][j] = dp[i][j - 1];
                    }
                    dp[i][j] %= MOD;
                }
            }
            out.println(dp[H - 1][W - 1]);
        }

    }
}

