import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.LinkedList;
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
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        List<Integer>[] G;
        boolean[] seen;
        int[] dist;

        void bfs(int node) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(node);
            seen[node] = true;
            while (!queue.isEmpty()) {
                int cur = queue.poll();

                for (int e : G[cur]) {
                    if (!seen[e]) {
                        dist[e] = dist[cur] + 1;
                        queue.add(e);
                        seen[e] = true;
                    }
                }
            }
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n = in.readInt(), x = in.readInt() - 1, y = in.readInt() - 1;
            G = new List[n];

            for (int i = 0; i < n; ++i) G[i] = new ArrayList<>();

            G[x].add(y);
            G[y].add(x);

            for (int i = 0; i + 1 < n; ++i) {
                G[i].add(i + 1);
                G[i + 1].add(i);
            }
            int[] ans = new int[n];

            for (int v = 0; v < n; ++v) {
                seen = new boolean[n];
                dist = new int[n];
                bfs(v);

                for (int i = v + 1; i < n; ++i) {
                    ans[dist[i]]++;
                }
            }
            for (int i = 1; i < n; ++i) {
                out.printLine(ans[i]);
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

