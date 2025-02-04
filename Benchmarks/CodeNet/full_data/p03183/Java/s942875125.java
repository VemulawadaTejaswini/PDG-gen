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
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        XTower solver = new XTower();
        solver.solve(1, in, out);
        out.close();
    }

    static class XTower {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            box[] boxes = new box[n];

            for (int i = 0; i < n; i++) {
                boxes[i] = new box(in.nextInt(), in.nextInt(), in.nextInt());
            }

            Arrays.sort(boxes, (b1, b2) -> (b1.w + b1.s - b2.w - b2.s));

            long[][] dp = new long[n][10001];

            for (int i = boxes[0].w; i <= 10000; i++) {
                dp[0][i] = boxes[0].v;
            }

            for (int i = 1; i < n; i++) {
                int cw = boxes[i].w;
                int cs = boxes[i].s;
                int cv = boxes[i].v;

                for (int j = 0; j <= 10000; j++) {
                    dp[i][j] = dp[i - 1][j];
                }

                for (int j = 0; j <= Math.min(cs, 10000 - cw); j++) {
                    dp[i][j + cw] = Math.max(dp[i][j + cw], dp[i - 1][j] + cv);
                }

                for (int j = 1; j <= 10000; j++) {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i][j]);
                }
            }

            out.println(dp[n - 1][10000]);
        }

        class box {
            int w;
            int s;
            int v;

            public box(int w, int s, int v) {
                this.w = w;
                this.s = s;
                this.v = v;
            }

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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

