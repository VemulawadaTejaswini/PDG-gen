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
        XorSum solver = new XorSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class XorSum {
        public static int MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[][] memo = new int[n + 1][n + 1];
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            long result = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (memo[i][j] == 0) {
                        memo[i][j] = (int) ((a[i] ^ a[j]) % MOD);
                    }
                    result += memo[i][j];
                    result %= MOD;
                }
            }
            out.println(result);

        }

    }
}

