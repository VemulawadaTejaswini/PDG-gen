import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ETwoCurrencies solver = new ETwoCurrencies();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETwoCurrencies {
        int mx = 50 * 50 + 10;
        PriorityQueue<NN> pq = new PriorityQueue<>();
        long[][] dp;

        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), m = c.readInt(), s = c.readInt();
            dp = new long[n][mx];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], Long.MAX_VALUE);
            }
            ArrayList<Edge>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int u = c.readInt() - 1, v = c.readInt() - 1, a = c.readInt(), b = c.readInt();
                adj[u].add(new Edge(v, a, b));
                adj[v].add(new Edge(u, a, b));
            }

            int cc[] = new int[n], dd[] = new int[n];
            for (int i = 0; i < n; i++) {
                cc[i] = c.readInt();
                dd[i] = c.readInt();
            }

            push(0, s, 0);
            while (!pq.isEmpty()) {
                NN xx = pq.poll();
                int v = xx.v;
                long tt = xx.t;
                s = xx.s;
                push(v, s + cc[v], tt + dd[v]);
                for (Edge e : adj[v]) {
                    push(e.v, s - e.a, tt + e.b);
                }
            }

            for (int i = 1; i < n; i++) {
                w.printLine(Utils.min(dp[i]));
            }

        }

        private void push(int x, int s, long t) {
            if (s < 0) {
                return;
            }
            s = Math.min(s, mx - 1);
            if (dp[x][s] <= t) {
                return;
            }
            dp[x][s] = t;
            pq.add(new NN(x, s, t));
        }

    }

    static class NN implements Comparable<NN> {
        int v;
        int s;
        long t;

        public NN(int v, int s, long t) {
            this.v = v;
            this.s = s;
            this.t = t;
        }

        public int compareTo(NN o) {
            return Long.compare(t, o.t);
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

    static class Utils {
        public static long min(long... a) {
            long min = a[0];
            for (int i = 1; i < a.length; i++) {
                min = Math.min(min, a[i]);
            }
            return min;
        }

    }

    static class Edge {
        int v;
        int a;
        int b;

        public Edge(int v, int a, int b) {
            this.v = v;
            this.a = a;
            this.b = b;
        }

    }
}

