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
        DCardEater solver = new DCardEater();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCardEater {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int MAX = (int) 1e5;

            int n = in.nextInt();
            int[] count = new int[MAX + 1];
            for (int i = 0; i < n; i++) {
                count[in.nextInt()]++;
            }

            int size = 0;
            for (int cnt : count) {
                if (cnt > 0) {
                    size++;
                }
            }
            int[] distinct = new int[size];
            size = 0;
            for (int num = 1; num <= MAX; num++) {
                if (count[num] > 0) {
                    distinct[size++] = num;
                }
            }

            for (int i = 0; i < size; i++) {
                if (count[distinct[i]] <= 1) {
                    continue;
                }
                for (int j = i + 1; j < size; j++) {
                    if (count[distinct[j]] <= 1) {
                        continue;
                    }
                    int del = Math.min(count[distinct[i]], count[distinct[j]]) - 1;
                    count[distinct[i]] -= del;
                    count[distinct[j]] -= del;
                    if (count[distinct[i]] == 1) {
                        i = j - 1;
                        break;
                    }
                }
            }

            int total = 0;
            for (int i = 1; i <= MAX; i++) {
                total += count[i];
                if (count[i] > 1) {
                    total -= (count[i] - 1) * 2;
                }
            }

            out.println(total);
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
}

