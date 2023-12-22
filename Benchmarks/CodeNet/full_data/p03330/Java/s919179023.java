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
        GoodGrid solver = new GoodGrid();
        solver.solve(1, in, out);
        out.close();
    }

    static class GoodGrid {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int c = in.nextInt();
            int[][] d = new int[c + 1][c + 1];
            for (int i = 1; i <= c; i++) {
                for (int j = 1; j <= c; j++) {
                    d[i][j] = in.nextInt();
                }
            }

            int[][] cc = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    cc[i][j] = in.nextInt();
                }
            }
            int[][] cost = new int[3][c + 1];
            for (int to = 1; to <= c; to++) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        int cfrom = cc[i][j];
                        int ccost = d[cfrom][to];
                        cost[(i + j) % 3][to] += ccost;
                    }
                }
            }
            int res = Integer.MAX_VALUE;
            for (int i = 1; i <= c; i++) {
                for (int j = 1; j <= c; j++) {
                    if (i == j) {
                        continue;
                    }
                    for (int k = 1; k <= c; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        int tmp = cost[0][i];
                        tmp += cost[1][j];
                        tmp += cost[2][k];
                        res = Math.min(res, tmp);
                    }
                }
            }
            out.println(res);
        }

    }
}

