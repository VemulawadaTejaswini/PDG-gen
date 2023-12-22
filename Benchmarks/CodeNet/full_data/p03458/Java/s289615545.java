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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            char[] c = new char[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                c[i] = in.next().toCharArray()[0];
            }

            long[][] bdp = new long[k][k];
            long[][] wdp = new long[k][k];

            for (int i = 0; i < n; i++) {
                int cx = x[i], cy = y[i];
                boolean isBlack = (c[i] == 'B');
                if (cx < 0) {
                    cx = cx + k * (Math.abs(cx) / k + 1);
                }
                if (cy < 0) {
                    cy = cy + k * (Math.abs(cy) / k + 1);
                }

                boolean changeColor = ((cx / k) + (cy / k)) % 2 == 1;

                int ccx = cx % k, ccy = cy % k;
                if (!changeColor) {
                    if (isBlack) bdp[ccx][ccy]++;
                    else wdp[ccx][ccy]++;
                } else {
                    if (isBlack) wdp[ccx][ccy]++;
                    else bdp[ccx][ccy]++;
                }
            }

            for (int i = 1; i < k; i++) {
                wdp[i][0] += wdp[i - 1][0];
                bdp[i][0] += bdp[i - 1][0];
            }
            for (int i = 1; i < k; i++) {
                wdp[0][i] += wdp[0][i - 1];
                bdp[0][i] += bdp[0][i - 1];
            }

            for (int i = 1; i < k; ++i) {
                for (int j = 1; j < k; ++j) {
                    bdp[i][j] += bdp[i - 1][j] + bdp[i][j - 1] - bdp[i - 1][j - 1];
                    wdp[i][j] += wdp[i - 1][j] + wdp[i][j - 1] - wdp[i - 1][j - 1];
                }
            }

            long res = 0;

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    long blacks = bdp[k - 1][k - 1] - (bdp[k - 1][j] + bdp[i][k - 1] - bdp[i][j]) + bdp[i][j];
                    long whites = wdp[k - 1][j] + wdp[i][k - 1] - 2 * wdp[i][j];
                    res = Math.max(res, blacks + whites);
                }
            }

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    long whites = wdp[k - 1][k - 1] - (wdp[k - 1][j] + wdp[i][k - 1] - wdp[i][j]) + wdp[i][j];
                    long blacks = bdp[k - 1][j] + bdp[i][k - 1] - 2 * bdp[i][j];
                    res = Math.max(res, blacks + whites);
                }
            }

            out.println(res);
        }

    }
}

