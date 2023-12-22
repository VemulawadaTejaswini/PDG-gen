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
        ProblemD_DigitSumReplace solver = new ProblemD_DigitSumReplace();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemD_DigitSumReplace {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int m = in.nextInt();
            Pair o = null;
            for (int i = 0; i < m; i++) {
                int d = in.nextInt();
                long c = in.nextLong();
                Pair t = reduce(d, c);
                if (i == 0) {
                    o = t;
                } else {
                    o = combine(o, t);
                }
            }
            out.println(o.ops);
        }

        private Pair combine(Pair a, Pair b) {
            int rem = a.rem + b.rem;
            long ops = 1 + a.ops + b.ops;
            int u = rem / 10;
            int v = rem % 10;
            if (u > 0) {
                ++ops;
                ++v;
            }
            return new Pair(v, ops);
        }

        private Pair reduce(int d, long c) {
            if (c == 0) {
                return new Pair(0, 0);
            }
            if (c == 1) {
                return new Pair(d, 0);
            }
            if (c % 2 != 0) {
                Pair a = reduce(d, c - 1);
                Pair b = new Pair(d, 0);
                return combine(a, b);
            }
            Pair a = reduce(d, c / 2);
            return combine(a, a);
        }

        class Pair {
            int rem;
            long ops;

            Pair(int rem, long ops) {
                this.rem = rem;
                this.ops = ops;
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
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

