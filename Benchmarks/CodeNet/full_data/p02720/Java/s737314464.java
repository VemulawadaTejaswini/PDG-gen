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
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DLunlunNumber solver = new DLunlunNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLunlunNumber {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt();
            if (n <= 9) {
                w.printLine(n);
                return;
            }
            n -= 9;
            long first = 10;
            for (int i = 1; i < n; i++) {
                first++;
                while (cc(first)) {
                    first = nxtFirst(first);
                }
//            w.printLine(i,first);
            }
            while (cc(first)) {
                first = nxtFirst(first);
            }
            w.printLine(first);
        }

        private long nxtFirst(long x) {
            char[] ss = Long.toString(x).toCharArray();
            for (int i = 1; i < ss.length; i++) {
                if (Math.abs(ss[i] - ss[i - 1]) > 1) {
                    if (ss[i] < ss[i - 1]) {
                        for (int j = i; j < ss.length; j++) {
                            ss[j] = (char) ((ss[j - 1] - 1) >= '0' ? (ss[j - 1] - 1) : '0');
                        }
                        break;
                    }
                    ss[i - 1]++;
                    for (int j = i; j < ss.length; j++) {
                        ss[j] = (char) ((ss[j - 1] - 1) >= '0' ? (ss[j - 1] - 1) : '0');
                    }
                    break;
                }
            }
            return Long.parseLong(new String(ss));
        }

        private boolean cc(long x) {
            String ss = Long.toString(x);
            for (int i = 1; i < ss.length(); i++) {
                if (Math.abs(ss.charAt(i) - ss.charAt(i - 1)) > 1) {
                    return true;
                }
            }
            return false;
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

        public void printLine(int i) {
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
}

