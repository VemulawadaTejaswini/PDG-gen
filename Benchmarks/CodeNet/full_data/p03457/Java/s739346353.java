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
        boolean canDo(int t1, int t2, int x1, int y1, int x2, int y2) {
            int dist = Math.abs(x1 - x2) + Math.abs(y1 - y2);
            int t = Math.abs(t2 - t1);
            if (dist > t) return false;
            if (dist == t) return true;
            return (t - dist) % 2 == 0;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = new int[n + 1];
            int[] y = new int[n + 1];
            int[] t = new int[n + 1];
            x[0] = y[0] = t[0] = 0;
            for (int i = 1; i <= n; i++) {
                t[i] = in.nextInt();
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (!canDo(t[i], t[i + 1], x[i], y[i], x[i + 1], y[i + 1])) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
        }

    }
}

