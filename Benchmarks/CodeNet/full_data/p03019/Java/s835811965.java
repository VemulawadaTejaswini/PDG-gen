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
        CTests solver = new CTests();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTests {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), X = in.nextInt();
            int[] L = new int[n];
            int[] R = new int[n];
            int[] b = new int[n];
            long[] val = new long[n];
            long fixvalue = 0;
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                L[i] = in.nextInt();
                R[i] = in.nextInt();
                val[i] = new Long((R[i] - L[i]) * 1L * b[i] - R[i] * 1L * X);
                fixvalue += L[i] * 1L * b[i];
            }
            // sort
            Arrays.sort(val);
            long lo = 0, hi = X * 1L * n;
            while (lo < hi) {
                long x = (lo + hi) / 2;
                long k = x % X == 0 ? X : (x % X);
                int t = (int) ((x - k) / X);
                long value = -fixvalue;
                for (int i = 0; i < t; i++) value -= val[i];
                long maxVal = -Long.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    long valueNow = value + L[i] * 1L * b[i];
                    valueNow += Long.max(L[i] * 1L * (k - b[i]), R[i] * 1L * (k - b[i]));
                    if (t > 0 && (R[i] - L[i]) * 1L * b[i] - R[i] * 1L * X <= val[t - 1]) {
                        valueNow += (R[i] - L[i]) * 1L * b[i] - R[i] * 1L * X;
                        valueNow -= val[t];
                    }
                    maxVal = Long.max(maxVal, valueNow);
                }
//            System.out.println(x + " " + maxVal);
                if (maxVal >= 0) {
                    hi = x;
                } else lo = x + 1;
            }
            out.println(lo);
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
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            boolean isSpaceChar(int ch);

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

        public void println(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
            writer.print('\n');
        }

        public void close() {
            writer.close();
        }

    }
}

