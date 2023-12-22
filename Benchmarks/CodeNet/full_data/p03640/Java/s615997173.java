import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            int n = in.nextInt();
            int[] am = new int[n];
            for (int i = 0; i < n; i++) {
                am[i] = in.nextInt();
            }
            int[][] a = new int[height][width];
            int cur = 1;
            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {
                    int nc = c;
                    if (r % 2 == 1) {
                        nc = width - c - 1;
                    }
                    while (am[cur - 1] == 0) {
                        ++cur;
                    }
                    a[r][nc] = cur;
                    --am[cur - 1];
                }
            }
            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {
                    if (c > 0) {
                        out.print(" ");
                    }
                    out.print(a[r][c]);
                }
                out.println();
            }
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

