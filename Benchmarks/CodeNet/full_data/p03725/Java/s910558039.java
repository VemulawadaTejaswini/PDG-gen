import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        agc014c solver = new agc014c();
        solver.solve(1, in, out);
        out.close();
    }

    static class agc014c {
        boolean[][] vis;
        int inf = 100000;
        int r;
        int c;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            r = in.nextInt();
            c = in.nextInt();
            int k = in.nextInt();

            String[] a = new String[c];

            int si = -1;
            int sj = -1;
            for (int i = 0; i < r; i++) {
                a[i] = in.next();
                for (int j = 0; j < c; j++) {
                    if (a[i].charAt(j) == 'S') {
                        si = i;
                        sj = j;
                    }
                }
            }

            vis = new boolean[r][c];

            dfs(si, sj, a, k);

            int ans = inf;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (vis[i][j]) {
                        int mind = inf;

                        mind = Math.min(mind, i);
                        mind = Math.min(mind, j);
                        mind = Math.min(mind, c - 1 - j);
                        mind = Math.min(mind, r - 1 - i);

                        int ca = (mind + k - 1) / k;

                        ans = Math.min(ans, 1 + ca);
                    }
                }
            }

            out.println(ans);
        }

        void dfs(int ri, int ci, String[] a, int cd) {
            if (vis[ri][ci])
                return;

            if (a[ri].charAt(ci) == '#')
                return;

            vis[ri][ci] = true;

            if (cd == 0)
                return;

            if (ri > 0)
                dfs(ri - 1, ci, a, cd - 1);
            if (ci > 0)
                dfs(ri, ci - 1, a, cd - 1);
            if (ci < c - 1)
                dfs(ri, ci + 1, a, cd - 1);
            if (ri < r - 1)
                dfs(ri + 1, ci, a, cd - 1);
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

