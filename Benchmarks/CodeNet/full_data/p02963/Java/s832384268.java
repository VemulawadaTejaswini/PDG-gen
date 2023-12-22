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
        A_Triangle solver = new A_Triangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_Triangle {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            final long M = (long) 1e9;
            long s = in.nextLong();
            long x0 = 0;
            long y0 = 0;
            long x1 = s / M;
            long y1 = s % M;
            long x2 = -1;
            long y2 = M;
            if (x1 == M) {
                x1 = M;
                y1 = 1;
                x2 = 1;
                y2 = M;
            } else {
                ++x0;
                ++x1;
                ++x2;
            }
            out.printf("%d %d %d %d %d %d\n", x0, y0, x1, y1, x2, y2);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

