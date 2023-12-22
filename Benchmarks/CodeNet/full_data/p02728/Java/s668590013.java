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
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FDistributingIntegers solver = new FDistributingIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDistributingIntegers {
        int time;
        int[] tour;
        int[] left;
        int[] right;
        int[] sub;
        ArrayList<Integer>[] adj;

        void dfs(int x, int p) {
            sub[x] = 1;
            tour[time] = x;
            left[x] = time;
            time++;
            for (int y : adj[x]) {
                if (y != p) {
                    dfs(y, x);
                    sub[x] += sub[y];
                }
            }
            right[x] = time - 1;
        }

        long modExp(long x, long y, long mod) {
            if (y == 0)
                return 1 % mod;
            long ret = modExp(x, y >> 1, mod);
            ret = ret * ret % mod;
            if ((y & 1) == 1)
                ret = ret * (x % mod) % mod;
            return ret;
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1;
                adj[u].add(v);
                adj[v].add(u);
            }
            tour = new int[n];
            left = new int[n];
            right = new int[n];
            sub = new int[n];
            dfs(0, -1);
            long[] pre = new long[n];
            Arrays.fill(pre, 1);
            long mod = (long) 1e9 + 7;
            for (int i = 1; i < n; i++) {
                int x = tour[i];
                pre[left[x]] = pre[left[x]] * modExp(n - sub[x], mod - 2, mod) % mod;
                if (right[x] + 1 < n) {
                    pre[right[x] + 1] = pre[right[x] + 1] * (n - sub[x]) % mod;
                }
                if (left[x] > 0) {
                    pre[0] = pre[0] * modExp(sub[x], mod - 2, mod) % mod;
                    pre[left[x]] = pre[left[x]] * sub[x] % mod;
                }
                if (right[x] + 1 < n) {
                    pre[right[x] + 1] = pre[right[x] + 1] * modExp(sub[x], mod - 2, mod) % mod;
                }
            }
            for (int i = 1; i < n; i++)
                pre[i] = pre[i] * pre[i - 1] % mod;
            long[] fact = new long[n + 1];
            fact[0] = 1;
            for (int i = 1; i <= n; i++)
                fact[i] = fact[i - 1] * i % mod;
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                int x = tour[i];
                res[x] = fact[n - 1] * pre[i] % mod;
            }
            for (int i = 0; i < n; i++)
                w.println(res[i]);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

