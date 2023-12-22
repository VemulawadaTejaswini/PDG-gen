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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] A, B;
            A = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
            B = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};

            int AB = solv(N, A, B);
            int BA = solv(AB, B, A);
            out.println(BA);
        }

        private int solv(int n, int[] x, int[] y) {
            int[][] dp = new int[4][n + 1];
            for (int i = 1; i < 4; i++) {
                int d = x[i - 1];
                int diff = y[i - 1] - x[i - 1];
                for (int j = 1; j < n + 1; j++) {
                    int cnt = j - d;
                    if (cnt < 0) {
                        dp[i][j] = dp[i - 1][j];
                        continue;
                    }
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][cnt] + diff);
                }
            }
            return n + dp[3][n];
        }

    }
}

