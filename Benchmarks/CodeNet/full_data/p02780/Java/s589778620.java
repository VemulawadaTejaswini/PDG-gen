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
        DiceinLine solver = new DiceinLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DiceinLine {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] p = new int[n];
            long[] sum = new long[n + 1];
            long max = 0;
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt() + 1;
            }

            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + p[i];
            }

            for (int i = 0; i + k <= n; i++) {
                max = Math.max(max, sum[i + k] - sum[i]);
            }

            out.println((double) max / 2);

        }

    }
}

