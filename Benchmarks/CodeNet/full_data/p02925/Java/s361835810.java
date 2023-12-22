import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int[][] a = new int[n][n - 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    a[i][j] = in.nextInt();
                }
            }

            ELeague.Vertex[][] vs = new ELeague.Vertex[n + 1][n + 1];
            for (int p1 = 1; p1 <= n; p1++) {
                ELeague.Vertex prev = null;
                for (int i = 0; i < n - 1; i++) {
                    int p2 = a[p1 - 1][i];
                    ELeague.Vertex v = new ELeague.Vertex(p1, p2);
                    if (vs[v.p1][v.p2] == null) {
                        vs[v.p1][v.p2] = v;
                    }
                    if (prev != null) {
                        vs[v.p1][v.p2].inDegree++;
                        vs[prev.p1][prev.p2].outgo.add(vs[v.p1][v.p2]);
                    }
                    prev = v;
                }
            }

            LinkedList<ELeague.Vertex> q = new LinkedList<>();
            for (int p1 = 1; p1 <= n; p1++) {
                for (int p2 = 1; p2 <= n; p2++) {
                    if (vs[p1][p2] != null && vs[p1][p2].inDegree == 0) {
                        q.addFirst(vs[p1][p2]);
                    }
                }
            }

            int[][] max = new int[n + 1][n + 1];
            while (!q.isEmpty()) {
                ELeague.Vertex cur = q.pollFirst();
                for (ELeague.Vertex next : cur.outgo) {
                    max[next.p1][next.p2] = Math.max(max[next.p1][next.p2], max[cur.p1][cur.p2] + 1);
                    next.inDegree--;
                    if (next.inDegree == 0) {
                        q.addLast(next);
                    }
                }
            }
            for (int p1 = 1; p1 <= n; p1++) {
                for (int p2 = 1; p2 <= n; p2++) {
                    if (vs[p1][p2] != null && vs[p1][p2].inDegree != 0) {
                        out.println(-1);
                        return;
                    }
                }
            }

            int ret = 0;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    ret = Math.max(ret, max[i][j]);
                }
            }

            out.println(ret + 1);
        }

        private static class Vertex {
            private ArrayList<ELeague.Vertex> outgo = new ArrayList<>();
            private int inDegree;
            private int p1;
            private int p2;

            private Vertex(int p1, int p2) {
                this.p1 = Math.min(p1, p2);
                this.p2 = Math.max(p1, p2);
            }

            public String toString() {
                return "(" + p1 + " : " + p2 + ", inDegree: " + inDegree + ")";
            }

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
}

