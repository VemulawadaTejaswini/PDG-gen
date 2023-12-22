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
 * @author is _beginner
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CFiveTransportations solver = new CFiveTransportations();
        solver.solve(1, in, out);
        out.close();
    }

    static class CFiveTransportations {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long n = in.nl();
            long a = in.nl(), b = in.nl(), c = in.nl(), d = in.nl(), e = in.nl();

            if (b >= a)
                b = a;
            if (c >= b)
                c = b;
            if (d >= c)
                d = c;
            if (e >= d)
                e = d;

            long time = 0, time1 = 0;
            time = (n - a + 1) / a;
            time1 = time;

            n = n - a * (time1 - 1);
            time1 = (n + (b - a) * time1 + b - 1) / b;
            time += time1;

            n = n - b * (time1 - 1);
            time1 = (n + (c - b) * time1 + c - 1) / c;
            time += time1;

            n = n - c * (time1 - 1);
            time1 = (n - (d - c) * time1 + d - 1) / d;
            time += time1;

            n = n - d * (time1 - 1);
            time1 = (n - (e - d) * time1 + e - 1) / e;
            time += time1;

            out.println(time);
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

        public long nl() {
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

