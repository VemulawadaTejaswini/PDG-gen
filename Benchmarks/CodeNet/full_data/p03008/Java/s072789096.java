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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DSquirrelMerchant solver = new DSquirrelMerchant();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSquirrelMerchant {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long n = in.readLong();
            long[] a = in.readLongArray(3);
            long[] b = in.readLongArray(3);

            long ans = 0;
            for (long i = 0; i <= n / a[0]; i++) {
                for (long j = 0; j <= (n - i * a[0]) / a[1]; j++) {
                    long k = a[2] - b[2] < 0 ? (n - i * a[0] - j * a[1]) / a[2] : 0;
                    ans = Math.max(ans, n + i * (b[0] - a[0]) + j * (b[1] - a[1]) + k * (b[2] - a[2]));
                }
            }

            for (int i = 0; i < 3; i++) {
                long tmp = a[i];
                a[i] = b[i];
                b[i] = tmp;
            }
            for (long i = 0; i <= ans / a[0]; i++) {
                for (long j = 0; j <= (ans - i * a[0]) / a[1]; j++) {
                    long k = a[2] - b[2] < 0 ? (ans - i * a[0] - j * a[1]) / a[2] : 0;
                    ans = Math.max(ans, ans + i * (b[0] - a[0]) + j * (b[1] - a[1]) + k * (b[2] - a[2]));
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

        public long[] readLongArray(int size) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = readLong();
            }
            return array;
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

