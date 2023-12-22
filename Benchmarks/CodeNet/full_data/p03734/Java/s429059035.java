import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        DSimpleKnapsack solver = new DSimpleKnapsack();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSimpleKnapsack {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            long W = in.readLong();
            long[] w = new long[n];
            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.readLong();
                v[i] = in.readLong();
            }

            List<List<Long>> list = Stream.generate(ArrayList<Long>::new)
                    .limit(4)
                    .collect(Collectors.toList());
            for (int i = 0; i < n; i++) {
                list.get((int) (w[i] - w[0])).add(v[i]);
            }
            list.forEach(l -> l.sort(Comparator.reverseOrder()));

            long ans = 0;
            for (int i = 0; i <= list.get(0).size(); i++) {
                for (int j = 0; j <= list.get(1).size(); j++) {
                    for (int k = 0; k <= list.get(2).size(); k++) {
                        for (int l = 0; l <= list.get(3).size(); l++) {
                            long weight = i * w[0]
                                    + j * (w[0] + 1)
                                    + k * (w[0] + 2)
                                    + l * (w[0] + 3);
                            if (weight > W) continue;
                            long value = 0;
                            for (int m = 0; m < i; m++) {
                                value += list.get(0).get(m);
                            }
                            for (int m = 0; m < j; m++) {
                                value += list.get(1).get(m);
                            }
                            for (int m = 0; m < k; m++) {
                                value += list.get(2).get(m);
                            }
                            for (int m = 0; m < l; m++) {
                                value += list.get(3).get(m);
                            }
                            ans = Math.max(ans, value);
                        }
                    }
                }
            }
            out.printLine(ans);
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
}

