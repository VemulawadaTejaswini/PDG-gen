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
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSumOfLargeNumbers solver = new DSumOfLargeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfLargeNumbers {
        long mod = (long) 1e9 + 7;

        private long calc(long n, long k) {
            return ((n - k) * k + 1) % mod;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.readInt() + 1;
            int k = in.readInt();

            long ta = 0;

            for (int i = k; i <= n; i++) {
                ta = (ta + calc(n, i)) % mod;
            }
            out.println(ta);

        }

    }

    static class FastScanner {
        private StringTokenizer st;
        private BufferedReader in;

        public FastScanner(final InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
        }

        public String readToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(readToken());
        }

    }
}

