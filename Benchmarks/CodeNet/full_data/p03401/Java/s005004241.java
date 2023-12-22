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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 2];
            int[] sort = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            long cost = 0;
            int now = 0;
            a[0] = 0;
            a[n + 1] = 0;
            for (int i = 1; i <= n; i++) {
                int tmp = in.nextInt();
                a[i] = tmp;
                cost += Math.abs(tmp - now);
                now = tmp;
            }

            cost += Math.abs(a[n + 1] - now);
            for (int i = 1; i <= n; i++) {
                if ((a[i - 1] < a[i] && a[i] < a[i + 1]) ||
                        (a[i + 1] < a[i] && a[i] < a[i - 1])) {
                    out.println(cost);
                } else {
                    int minus = Math.abs(a[i + 1] - a[i]) + Math.abs(a[i] - a[i - 1]);
                    int plus = Math.abs(a[i + 1] - a[i - 1]);

                    out.println(cost - minus + plus);
                }
            }
        }

    }
}

