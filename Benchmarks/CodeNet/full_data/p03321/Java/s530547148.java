import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        static boolean fail = false;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            boolean[][] g = new boolean[n][n];
            for (int i = 0; i < m; i++) {
                int x = in.readInt() - 1;
                int y = in.readInt() - 1;
                g[x][y] = g[y][x] = true;
            }
            if (m == n * (n - 1) / 2) {
                int cnt1 = n / 2;
                int cnt2 = n - cnt1;
                System.err.println(cnt1 + " " + cnt2);
                out.printLine(cnt1 * (cnt1 - 1) / 2 + cnt2 * (cnt2 - 1) / 2);
                return;
            }
            boolean[] vis = new boolean[n];
            List<List<Integer>> comps = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!vis[i]) {
                    List<Integer> comp = new ArrayList<>();
                    dfs0(i, vis, n, g, comp);
                    comps.add(comp);
                }
            }
            if (comps.size() > 2) {
                out.printLine(-1);
                return;
            }
            int[] color = new int[n];
            List<Integer> c0, c1;
            if (comps.size() == 2) {
                c0 = comps.get(0);
                c1 = comps.get(1);
                if (!isClique(c0, g) || !isClique(c1, g)) {
                    out.printLine(-1);
                    return;
                }
                for (int i : c0) color[i] = 0;
                for (int i : c1) color[i] = 1;
            } else {
                Arrays.fill(color, -1);
                for (int i = 0; i < n; i++) {
                    if (color[i] == -1) {
                        dfs(i, color, n, g, 0);
                    }
                }
                if (fail) {
                    out.printLine(-1);
                    return;
                }
                c0 = new ArrayList<>();
                c1 = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (color[i] == 0) {
                        c0.add(i);
                    } else if (color[i] == 1) {
                        c1.add(i);
                    } else {
                        throw new AssertionError();
                    }
                }
                if (!isClique(c0, g) || !isClique(c1, g)) {
                    out.printLine(-1);
                    return;
                }
            }
            System.err.println("c0 = " + c0);
            System.err.println("c1 = " + c1);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (color[i] != color[j]) {
                        if (g[i][j]) {
                            ans++;
                        }
                    }
                }
            }
            out.printLine(m - ans);
        }

        private boolean isClique(List<Integer> list, boolean[][] g) {
            for (int i : list) {
                for (int j : list) {
                    if (i != j) {
                        if (!g[i][j]) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private void dfs0(int x, boolean[] vis, int n, boolean[][] g, List<Integer> comp) {
            comp.add(x);
            vis[x] = true;
            for (int y = 0; y < n; y++) {
                if (x == y) {
                    continue;
                }
                if (g[x][y]) {
                    if (!vis[y]) {
                        dfs0(y, vis, n, g, comp);
                    }
                }
            }
        }

        private void dfs(int x, int[] color, int n, boolean[][] g, int curColor) {
            color[x] = curColor;
            for (int y = 0; y < n; y++) {
                if (x == y) {
                    continue;
                }
                if (!g[x][y]) {
                    if (color[y] == -1) {
                        dfs(y, color, n, g, 1 - curColor);
                    }
                    if (color[y] == color[x]) {
                        fail = true;
                    }
                }
            }
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

        public void printLine(int i) {
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

        public int readInt() {
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

