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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        ArrayList<Integer>[] g;
        int[] dp;

        public void solve(int testNumber, inclass in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            g = new ArrayList[n];
            dp = new int[n];
            Arrays.fill(dp, -1);
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }
            int in_degree[] = new int[n];
            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                a--;
                b--;
                g[b].add(a);
            }
            for (int i = 0; i < n; i++) {
                rec(i);
            }
            int ans = 0;
            for (int i = 0; i < dp.length; i++) {
                ans = Math.max(ans, dp[i]);
            }
            out.println(ans);
        }

        public int rec(int i) {
            if (g[i].size() == 0) {
                return dp[i] = 0;
            }
            if (dp[i] != -1) {
                return dp[i];
            }
            int max = -1;
            for (int adj : g[i]) {
                max = Math.max(max, 1 + rec(adj));
            }
            return dp[i] = max;
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
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

