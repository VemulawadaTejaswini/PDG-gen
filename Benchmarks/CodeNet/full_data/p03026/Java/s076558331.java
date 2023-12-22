import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import java.util.ArrayDeque;
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
        DMaximumSumOfMinimum solver = new DMaximumSumOfMinimum();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMaximumSumOfMinimum {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            List[] g = new List[n];

            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList();
            }

            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt();
                int v = in.nextInt();

                u--;
                v--;

                g[u].add(v);
                g[v].add(u);
            }

            int[] c = in.nextIntArray(n);

            Arrays.sort(c);

            int[] d = new int[n];

            ArrayDeque<Integer> q = new ArrayDeque<>();

            boolean[] vis = new boolean[n];

            int[] ans = new int[n];
            int ri = 0;

            for (int i = 0; i < n; i++) {
                d[i] = g[i].size();

                if (d[i] == 1) {
                    q.addLast(i);
                    vis[i] = true;
                    ans[i] = c[ri++];
                }
            }

            while (!q.isEmpty()) {
                int pe = q.removeFirst();

                for (int i = 0; i < g[pe].size(); i++) {
                    int v = (int) g[pe].get(i);

                    if (!vis[v]) {
                        d[v]--;

                        if (d[v] <= 1) {
                            vis[v] = true;
                            q.addLast(v);
                            ans[v] = c[ri++];
                        }
                    }
                }
            }

            long sum = 0;

            for (int i = 0; i < n - 1; i++) {
                sum += c[i];
            }

            out.println(sum);

            for (int val : ans) {
                out.print(val + " ");
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

