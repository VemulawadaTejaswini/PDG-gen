import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            int start = in.readInt() - 1;
            int finish = in.readInt() - 1;
            List<D.Edge>[] g1 = new List[n];
            List<D.Edge>[] g2 = new List[n];
            for (int i = 0; i < n; i++) {
                g1[i] = new ArrayList<>();
                g2[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int x = in.readInt() - 1;
                int y = in.readInt() - 1;
                long a = in.readLong();
                long b = in.readLong();
                g1[x].add(new D.Edge(y, a));
                g1[y].add(new D.Edge(x, a));
                g2[x].add(new D.Edge(y, b));
                g2[y].add(new D.Edge(x, b));
            }
            long[] d1 = f(start, g1);
            long[] d2 = f(finish, g2);
            long[] ans = new long[n];
            for (int i = 0; i < n; i++) {
                ans[i] = d1[i] + d2[i];
            }
            for (int i = n - 2; i >= 0; i--) {
                ans[i] = Math.min(ans[i], ans[i + 1]);
            }
            for (int i = 0; i < n; i++) {
                ans[i] = (long) 1e15 - ans[i];
            }
            for (int i = 0; i < n; i++) {
                out.printLine(ans[i]);
            }
        }

        private long[] f(int start, List<D.Edge>[] g) {
            int n = g.length;
            long[] dist = new long[n];
            PriorityQueue<D.Vertex> pq = new PriorityQueue<>();
            Arrays.fill(dist, (long) 1e18);
            pq.add(new D.Vertex(start, 0));
            dist[start] = 0;
            while (!pq.isEmpty()) {
                D.Vertex now = pq.poll();
                if (now.d != dist[now.v]) {
                    continue;
                }
                int x = now.v;
                for (D.Edge e : g[x]) {
                    int y = e.to;
                    long cost = e.cost;
                    if (dist[y] > dist[x] + cost) {
                        dist[y] = dist[x] + cost;
                        pq.add(new D.Vertex(y, dist[y]));
                    }
                }
            }
            return dist;
        }

        static class Edge {
            int to;
            long cost;

            public Edge(int to, long cost) {
                this.to = to;
                this.cost = cost;
            }

        }

        static class Vertex implements Comparable<D.Vertex> {
            int v;
            long d;

            public Vertex(int v, long d) {
                this.v = v;
                this.d = d;
            }


            public int compareTo(D.Vertex o) {
                return Long.compare(d, o.d);
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

        public void printLine(long i) {
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

