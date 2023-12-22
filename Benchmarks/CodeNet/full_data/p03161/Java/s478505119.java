import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        EDP_B solver = new EDP_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDP_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] h = new int[n + 1];
            int[] cost = new int[100010];
            Arrays.fill(cost, Integer.MAX_VALUE);
            cost[0] = 0;
            cost[1] = 0;
            for (int i = 1; i <= n; i++) {
                h[i] = in.nextInt();

            }


            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= k; j++) {
                    if (i + j <= n) {
                        cost[i + j] = Math.min(cost[i + j], cost[i] + Math.abs(h[i + j] - h[i]));
                    }
                }
            }

            out.print(cost[n]);
        }

    }
}

