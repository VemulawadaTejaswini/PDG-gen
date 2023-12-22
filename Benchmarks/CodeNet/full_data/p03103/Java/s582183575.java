import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        CEnergyDrinkCollector solver = new CEnergyDrinkCollector();
        solver.solve(1, in, out);
        out.close();
    }

    static class CEnergyDrinkCollector {
        public void solve(int testNumber, InputReader sc, OutputWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            PriorityQueue<CEnergyDrinkCollector.data> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                int b = sc.nextInt();
                CEnergyDrinkCollector.data d = new CEnergyDrinkCollector.data(a, b);
                pq.add(d);
            }
            long ans = 0;
            while (m > 0) {
                CEnergyDrinkCollector.data d = pq.poll();
                long rate = d.a;
                int count = d.b;
                if (count >= m) {
                    ans += m * rate;
                    m = 0;
                } else {
                    ans += count * rate;
                    m -= count;
                }
            }
            out.println(ans);
        }

        static class data implements Comparable<CEnergyDrinkCollector.data> {
            long a;
            int b;

            public data(long a, int b) {
                this.a = a;
                this.b = b;
            }

            public int compareTo(CEnergyDrinkCollector.data d) {
                if (a > d.a)
                    return 1;
                if (a < d.a)
                    return -1;
                if (b > d.b)
                    return 1;
                return -1;
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

        public long nextLong() {
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

