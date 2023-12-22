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
        A_TableTennisTraining solver = new A_TableTennisTraining();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_TableTennisTraining {
        final long infinity = Long.MAX_VALUE / 2;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long n = in.nextLong();
            long a = in.nextLong() - 1;
            long b = in.nextLong() - 1;
            long ans = infinity;
            ans = Math.min(ans, f(a, b, false, false));
            ans = Math.min(ans, a + f(0, b - a, true, false));
            ans = Math.min(ans, (n - 1 - b) + f(a + (n - 1 - b), n - 1, false, true));
            out.println(ans);
        }

        private long f(long a, long b, boolean aCanWait, boolean bCanWait) {
            if (a % 2 == b % 2) {
                return (b - a) / 2;
            }
            if (aCanWait || bCanWait) {
                return 1 + (b - a - 1) / 2;
            }
            return infinity;
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

