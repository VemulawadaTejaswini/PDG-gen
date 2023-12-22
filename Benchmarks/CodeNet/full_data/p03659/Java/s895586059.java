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
        SplittingPile solver = new SplittingPile();
        solver.solve(1, in, out);
        out.close();
    }

    static class SplittingPile {
        long[] a;
        long result;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            a = new long[n];
            result = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            dfs(0, 0, 0, 0, 0);
            out.println(result);
        }

        public void dfs(long x, long y, int index, int xcount, int ycount) {
            if (index == a.length) {
                if (0 < xcount && 0 < ycount) {
                    result = Math.min(result, Math.abs(x - y));
                }
            } else {
                dfs(x + a[index], y, index + 1, xcount + 1, ycount);
                dfs(x, y + a[index], index + 1, xcount, ycount + 1);
            }
        }

    }
}

