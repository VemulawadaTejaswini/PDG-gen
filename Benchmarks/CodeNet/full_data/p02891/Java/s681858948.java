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
        AConnectionAndDisconnection solver = new AConnectionAndDisconnection();
        solver.solve(1, in, out);
        out.close();
    }

    static class AConnectionAndDisconnection {
        private int calcNumOfChanges(int left, int right, String s) {
            int ret = 0;
            boolean prevChanged = false;
            for (int i = left + 1; i <= right; i++) {
                if (s.charAt(i) == s.charAt(i - 1) && !prevChanged) {
                    prevChanged = true;
                    ret++;
                } else {
                    prevChanged = false;
                }
            }
            return ret;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.nextString();
            long k = in.nextInt();

            int n = s.length();

            if (k == 1) {
                out.println(calcNumOfChanges(0, n - 1, s));
                return;
            }

            int left = 1;
            for (; left < n; left++) {
                if (s.charAt(left) != s.charAt(left - 1)) {
                    break;
                }
            }
            left--;
            int right = n - 2;
            for (; right >= 0; right--) {
                if (s.charAt(right) != s.charAt(right + 1)) {
                    break;
                }
            }
            right++;

            if (left > right) {
                out.println((n * k) / 2);
                return;
            }

            int commonChanges = s.charAt(left) == s.charAt(right) ? (left + 1 + n - right) / 2 : 0;
            int midChanges = calcNumOfChanges(left + 1, right - 1, s);
            int leftChanges = calcNumOfChanges(0, right - 1, s);
            int rightChanges = calcNumOfChanges(left + 1, n - 1, s);
            long ret = leftChanges + commonChanges * (k - 1) + midChanges * (k - 2) + rightChanges;

            out.println(ret);
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

