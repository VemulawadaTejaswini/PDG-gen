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
        ARangeFlipFindRoute solver = new ARangeFlipFindRoute();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARangeFlipFindRoute {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            // 左上から順に更新していけばいい
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] c = new char[h][w];
            long[][] dp = new long[h][w];
            for (int i = 0; i < h; i++) {
                c[i] = in.next().toCharArray();
            }

            dp[0][0] = c[0][0] == '#' ? 1 : 0;
            for (int i = 1; i < w; i++) {
                if (c[0][i] == '#') {
                    dp[0][i] = dp[0][i - 1] + 1;
                } else {
                    dp[0][i] = dp[0][i - 1];
                }
            }

            for (int i = 1; i < h; i++) {
                if (c[i][0] == '#') {
                    dp[i][0] = dp[i - 1][0] + 1;
                } else {
                    dp[i][0] = dp[i - 1][0];
                }
            }

            for (int i = 1; i < h; i++) {
                for (int j = 1; j < w; j++) {
                    if (c[i][j] == '#') {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }

            out.println(dp[h - 1][w - 1]);

        }

    }
}

