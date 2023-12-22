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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int W = in.nextInt();
            int[] wt = new int[n];
            long[] val = new long[n];
            for (int i = 0; i < n; i++) {
                wt[i] = in.nextInt();
                val[i] = in.nextInt();
            }
            int i, w;
            long K[][] = new long[n + 1][W + 1];

            for (i = 0; i <= n; i++) {
                for (w = 0; w <= W; w++) {
                    if (i == 0 || w == 0)
                        K[i][w] = 0;
                    else if (wt[i - 1] <= w)
                        K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                    else
                        K[i][w] = K[i - 1][w];
                }
            }

            out.println(K[n][W]);


        }

    }
}

