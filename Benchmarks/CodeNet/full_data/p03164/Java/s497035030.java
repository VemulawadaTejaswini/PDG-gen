import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        final long INF = (long) 1e18 + 5;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int W = in.nextInt();
            int[] weight = new int[N + 1];
            int[] value = new int[N + 1];
            int maxValue = 0;
            for (int i = 1; i <= N; i++) {
                weight[i] = in.nextInt();
                value[i] = in.nextInt();
                maxValue += value[i];
            }
            long[][] minWeight = new long[2][maxValue + 1];
            int prev = 0;

            Arrays.fill(minWeight[0], INF);
            minWeight[0][0] = 0;
            for (int i = 1; i <= N; i++, prev = 1 - prev) {
                int next = 1 - prev;
                for (int v = 0; v <= maxValue; v++) {
                    minWeight[next][v] = minWeight[prev][v];
                    if (value[i] <= v) {
                        long weightWithItem = weight[i] + minWeight[prev][v - value[i]];
                        minWeight[next][v] = Math.min(minWeight[next][v], weightWithItem);
                    }
                }
            }
            int res = -1;
            for (int v = 0; v <= maxValue; v++) {
                if (minWeight[prev][v] <= W) {
                    res = v;
                }
            }
            out.println(res);
        }

    }
}

