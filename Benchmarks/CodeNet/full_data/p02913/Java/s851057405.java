import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        EWhoSaysAPun solver = new EWhoSaysAPun();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWhoSaysAPun {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n = in.readInt();
            String s = in.readString();

            int ans = 0;
            for (int i = 0; i < n; ++i) {

                int[] z = StringUtils.zAlgorithm(s);

                for (int j = 0; j < z.length; ++j) {
                    if (j >= z[j])
                        ans = Math.max(ans, z[j]);
                }


                s = s.substring(1);
            }

            out.printLine(ans);
        }

    }

    static class StringUtils {
        public static int[] zAlgorithm(CharSequence s) {
            int length = s.length();
            int[] z = new int[length];
            int left = 0, right = 0;
            for (int i = 1; i < length; i++) {
                if (i > right) {
                    int j;
                    //noinspection StatementWithEmptyBody
                    for (j = 0; i + j < length && s.charAt(i + j) == s.charAt(j); j++) {
                        ;
                    }
                    z[i] = j;
                    left = i;
                    right = i + j - 1;
                } else if (z[i - left] < right - i + 1) {
                    z[i] = z[i - left];
                } else {
                    int j;
                    //noinspection StatementWithEmptyBody
                    for (j = 1; right + j < length && s.charAt(right + j) == s.charAt(right - i + j); j++) {
                        ;
                    }
                    z[i] = right - i + j;
                    left = i;
                    right = right + j - 1;
                }
            }
            return z;
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

        public String readString() {
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

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

