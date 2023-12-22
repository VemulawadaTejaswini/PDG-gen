import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnapsack1 solver = new DKnapsack1();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsack1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int W = in.nextInt();
            int[] w = new int[N + 1];
            int[] v = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }

            long[][] best = new long[N + 1][W + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= W; j++) {
                    best[i][j] = best[i - 1][j];
                    if (j - w[i] >= 0) {
                        best[i][j] = Math.max(best[i][j], v[i] + best[i - 1][j - w[i]]);
                    }
                }
            }
            out.println(best[N][W]);
        }

    }
}

