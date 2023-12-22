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
 *
 * @author L_aka_ryuga
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DPatisserieABC solver = new DPatisserieABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPatisserieABC {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            /*The logic is to check for all 8 combinations of values of beauty ,  tasty and sweetness
             * 000
             * 001
             * 010
             * 011
             * 100
             * 101
             * 110
             * 111
             * and for each combination get m max values and print final answers
             *
             * */
            int n = in.ni(), m = in.ni();
            long[][] arr = new long[n][3];
            for (int i = 0; i < n; i++) {
                long ele1 = in.nl(), ele2 = in.nl(), ele3 = in.nl();
                arr[i][0] = ele1;
                arr[i][1] = ele2;
                arr[i][2] = ele3;
            }

            long ans = 0;
            for (int i = 0; i < 8; i++) {
                long[] combi = new long[n];
                for (int j = 0; j < n; j++) {
                    long sum = 0;
                    for (int k = 0; k < 3; k++) {
                        if ((i >> k & 1) == 1) sum += -arr[j][k];
                        else sum += arr[j][k];
                    }
                    combi[j] = sum;
                }
                Arrays.sort(combi);
                long max = 0;
                for (int j = 0; j < m; j++) {
                    max += combi[n - 1 - j];
                }
                ans = Math.max(ans, max);
            }
            out.println(ans);


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

        public int ni() {
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

