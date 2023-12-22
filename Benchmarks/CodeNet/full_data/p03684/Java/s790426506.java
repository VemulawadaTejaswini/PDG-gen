import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            TaskD.Point[] p = new TaskD.Point[n];
            for (int i = 0; i < n; i++) {
                p[i] = new TaskD.Point(in.nextInt(), in.nextInt(), i);
            }
            TaskD.Edge[] e = new TaskD.Edge[2 * (n - 1)];
            Arrays.sort(p, Comparator.comparingInt(q -> q.x));
            for (int i = 0; i + 1 < n; i++) {
                e[i] = new TaskD.Edge(p[i].idx, p[i + 1].idx, Math.min(Math.abs(p[i + 1].x - p[i].x), Math.abs(p[i + 1].y - p[i].y)));
            }
            Arrays.sort(p, Comparator.comparingInt(q -> q.y));
            for (int i = 0; i + 1 < n; i++) {
                e[i + n - 1] = new TaskD.Edge(p[i].idx, p[i + 1].idx, Math.min(Math.abs(p[i + 1].x - p[i].x), Math.abs(p[i + 1].y - p[i].y)));
            }
            Arrays.sort(e, Comparator.comparingInt(q -> q.cost));
            int[] pp = DisjointSets.createSets(n);
            long ans = 0;
            for (TaskD.Edge ee : e) {
                if (DisjointSets.unite(pp, ee.from, ee.to)) {
                    ans += ee.cost;
                }
            }
            out.println(ans);
        }

        static class Edge {
            public int from;
            public int to;
            public int cost;

            public Edge(int from, int to, int cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }

        }

        static class Point {
            public int x;
            public int y;
            public int idx;

            public Point(int x, int y, int idx) {
                this.x = x;
                this.y = y;
                this.idx = idx;
            }

        }

    }

    static class DisjointSets {
        public static int[] createSets(int size) {
            int[] p = new int[size];
            for (int i = 0; i < size; i++)
                p[i] = i;
            return p;
        }

        public static int root(int[] p, int x) {
            return x == p[x] ? x : (p[x] = root(p, p[x]));
        }

        public static boolean unite(int[] p, int a, int b) {
            a = root(p, a);
            b = root(p, b);
            if (a != b) {
                if (Math.random() < 0.5)
                    p[a] = b;
                else
                    p[b] = a;
                return true;
            }
            return false;
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
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

        public void println(long i) {
            writer.println(i);
        }

    }
}

