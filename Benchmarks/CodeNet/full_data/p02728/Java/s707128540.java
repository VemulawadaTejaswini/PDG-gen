import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FDistributingIntegers solver = new FDistributingIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDistributingIntegers {
        final long mod = (long) 1e9 + 7;
        long[] dp;
        long[] ans;
        long[] fac;
        int[] nodes;
        int n;
        ArrayList<Integer>[] a;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            n = s.nextInt();
            a = new ArrayList[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1;
                a[u].add(v);
                a[v].add(u);
            }
            dp = new long[n];
            ans = new long[n];
            nodes = new int[n];
            fac = new long[n];
            fac[0] = 1;
            for (int i = 1; i < n; i++) {
                fac[i] = i * fac[i - 1];
                fac[i] %= mod;
            }
            Arrays.fill(dp, 1);
            Arrays.fill(nodes, 1);
            calc(0, -1);
            dfs1(0, -1);
            ans[0] = dp[0];
            for (int i : a[0]) dfs2(i, 0);
            for (int i = 0; i < n; i++) w.println(ans[i] + " ");
        }

        void dfs2(int cur, int par) {
            long v1 = dp[par], v2 = dp[cur];
            int n1 = nodes[par], n2 = nodes[cur];

            dp[par] *= func.power(fac[n - 1], mod - 2, mod);
            dp[par] %= mod;

            dp[par] *= fac[n - 1 - nodes[cur]];
            dp[par] %= mod;

            dp[par] *= func.power(dp[cur], mod - 2, mod);
            dp[par] %= mod;

            dp[par] *= fac[nodes[cur]];
            dp[par] %= mod;

            dp[cur] *= fac[n - 1];
            dp[cur] %= mod;

            dp[cur] *= func.power(fac[nodes[cur] - 1], mod - 2, mod);
            dp[cur] %= mod;

            nodes[par] -= nodes[cur];
            nodes[cur] = n;

            dp[cur] *= func.power(fac[nodes[par]], mod - 2, mod);
            dp[cur] %= mod;

            dp[cur] *= dp[par];
            dp[cur] %= mod;

            ans[cur] = dp[cur];
            for (int i : a[cur]) if (i != par) dfs2(i, cur);
            dp[par] = v1;
            dp[cur] = v2;
            nodes[par] = n1;
            nodes[cur] = n2;
        }

        void dfs1(int cur, int par) {
            dp[cur] = fac[nodes[cur] - 1];
            for (int i : a[cur])
                if (i != par) {
                    dfs1(i, cur);
                    dp[cur] *= dp[i];
                    dp[cur] %= mod;
                    dp[cur] *= func.power(fac[nodes[i]], mod - 2, mod);
                    dp[cur] %= mod;
                }
        }

        void calc(int cur, int par) {
            for (int i : a[cur])
                if (i != par) {
                    calc(i, cur);
                    nodes[cur] += nodes[i];
                }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class func {
        public static long power(long x, long y, long p) {
            long res = 1;
            x %= p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res *= x;
                    res %= p;
                }
                y >>= 1;
                x *= x;
                x %= p;
            }
            return res;
        }

    }
}

