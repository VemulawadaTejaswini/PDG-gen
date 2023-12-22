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
        TaskCadqwdw solver = new TaskCadqwdw();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskCadqwdw {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int arr[] = in.nextIntArray(n);
            long tcost = 0l;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    tcost += (long) (Math.abs(0 - arr[i]));
                } else {
                    tcost += (long) Math.abs(arr[i - 1] - arr[i]);
                }
            }
            tcost += (long) Math.abs(arr[arr.length - 1] - 0);
            for (int i = 0; i < arr.length - 1; i++) {
                if (i == 0) {
                    long cost = (long) (tcost + (Math.abs(0 - arr[i + 1]) - Math.abs(0 - arr[i]) - Math.abs(arr[i] - arr[i + 1])));
                    out.println(cost);
                } else {
                    long cost = (long) (tcost + (Math.abs(arr[i - 1] - arr[i + 1]) - Math.abs(arr[i - 1] - arr[i]) - Math.abs(arr[i] - arr[i + 1])));
                    out.println(cost);
                }
            }
            long cost = (long) (tcost + (Math.abs(arr[n - 2] - 0) - Math.abs(arr[n - 2] - arr[n - 1]) - Math.abs(arr[n - 1] - 0)));
            out.println(cost);
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
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

