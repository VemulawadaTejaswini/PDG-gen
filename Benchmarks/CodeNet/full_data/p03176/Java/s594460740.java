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
        Q_Flowers solver = new Q_Flowers();
        solver.solve(1, in, out);
        out.close();
    }

    static class Q_Flowers {
        private void setMax(long[] tree, int i, long value) {
            i += tree.length / 2;
            tree[i] = value;
            for (; i > 1; i >>= 1)
                tree[i >> 1] = Math.max(tree[i], tree[i ^ 1]);
        }

        private long getMax(long[] tree, int l, int r) {
            long res = Long.MIN_VALUE;
            for (l += tree.length / 2, r += tree.length / 2; l <= r; l = (l + 1) >> 1, r = (r - 1) >> 1) {
                res = Math.max(res, tree[l]);
                res = Math.max(res, tree[r]);
            }
            return res;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();
            int[] h = in.na(n);
            int[] a = in.na(n);
            long[] tree = new long[2 * n + 2];
            for (int i = 0; i < n; i++) {
                long best = getMax(tree, 0, h[i] - 1);
                setMax(tree, h[i], a[i] + best);
            }
            out.println(getMax(tree, 0, n));
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
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

        public int ni() {
            return Integer.parseInt(ns());
        }

        public int[] na(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = ni();
            return a;
        }

    }
}

