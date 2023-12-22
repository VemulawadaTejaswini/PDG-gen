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
        TypicalStairs solver = new TypicalStairs();
        solver.solve(1, in, out);
        out.close();
    }

    static class TypicalStairs {
        public static int MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] stairs = new int[n + 1];
            long[] route = new long[n + 1];

            for (int i = 1; i <= m; i++) {
                int step = in.nextInt();
                stairs[step] = 1;
                if (stairs[step - 1] == 1) {
                    out.print(0);
                    return;
                }
            }

            route[0] = 1;
            if (stairs[1] == 0) {
                route[1] = 1;
            }

            if (n <= 1) {
                out.print(route[1]);
                return;
            }

            if (stairs[2] == 0) {
                route[2] = 1;
            }
            for (int i = 1; i <= n - 1; i++) {
                if (stairs[i] == 1) {
                    continue;
                }
                if ((i + 1) <= n && stairs[i + 1] == 0) {
                    route[i + 1] = (route[i] + route[i + 1]) % MOD;
                }
                if ((i + 2) <= n && stairs[i + 2] == 0) {
                    route[i + 2] = (route[i] + route[i + 2]) % MOD;
                }
            }

            out.print(route[n] % MOD);

        }

    }
}

