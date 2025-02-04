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
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FEngines solver = new FEngines();
        solver.solve(1, in, out);
        out.close();
    }

    static class FEngines {
        private double getDist(FEngines.Point p) {
            return Math.sqrt(p.x * p.x + p.y * p.y);
        }

        private long getManhattan(FEngines.Point p) {
            return Math.abs(p.x) + Math.abs(p.y);
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            FEngines.Point[] a = new FEngines.Point[n];
            for (int i = 0; i < n; i++) {
                a[i] = new FEngines.Point(in.nextInt(), in.nextInt());
            }

            FEngines.Point[] dp = new FEngines.Point[n];
            dp[0] = a[0];
            double[] dist = new double[n];
            long[] manhattan = new long[n];
            dist[0] = getDist(a[0]);
            manhattan[0] = getManhattan(a[0]);
            for (int i = 1; i < n; i++) {
                FEngines.Point cur = a[i];
                dist[i] = getDist(cur);
                manhattan[i] = getManhattan(cur);
                dp[i] = cur;
                for (int j = 0; j < i; j++) {
                    FEngines.Point prev = dp[j];
                    FEngines.Point p = cur.add(prev);
                    double d = getDist(p);
                    long m = getManhattan(p);
                    if (m > manhattan[i]) {
                        dist[i] = d;
                        manhattan[i] = m;
                        dp[i] = p;
                    }
                }
            }

            long best = manhattan[0];
            FEngines.Point ret = dp[0];
            for (int i = 0; i < n; i++) {
                if (manhattan[i] > best) {
                    best = manhattan[i];
                    ret = dp[i];
                }
            }

            out.println(getDist(ret));
        }

        private static class Point {
            private long x;
            private long y;

            private Point(long x, long y) {
                this.x = x;
                this.y = y;
            }

            private FEngines.Point add(FEngines.Point p) {
                return new FEngines.Point(x + p.x, y + p.y);
            }

            public String toString() {
                return "(" + x + ", " + y + ")";
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

