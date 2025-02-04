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
        DMixingExperiment solver = new DMixingExperiment();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMixingExperiment {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            final int INF = Integer.MAX_VALUE;
            final int MAX = 400;

            int n = in.nextInt();
            int ratioA = in.nextInt();
            int ratioB = in.nextInt();
            DMixingExperiment.Package[] p = new DMixingExperiment.Package[n];
            for (int i = 0; i < n; i++) {
                p[i] = new DMixingExperiment.Package(in.nextInt(), in.nextInt(), in.nextInt());
            }

            int[][][] dp = new int[n + 1][MAX + 1][MAX + 1];
            for (int last = 0; last <= n; last++) {
                for (int a = 0; a <= MAX; a++) {
                    for (int b = 0; b <= MAX; b++) {
                        dp[last][a][b] = INF;
                    }
                }
            }
            dp[0][0][0] = 0;
            for (int last = 1; last <= n; last++) {
                DMixingExperiment.Package cur = p[last - 1];
                for (int a = 1; a <= MAX; a++) {
                    for (int b = 1; b <= MAX; b++) {
                        dp[last][a][b] = dp[last - 1][a][b];
                        if (a - cur.a >= 0 && b - cur.b >= 0 && dp[last - 1][a - cur.a][b - cur.b] != INF) {
                            dp[last][a][b] = Math.min(dp[last][a][b], cur.cost + dp[last - 1][a - cur.a][b - cur.b]);
                        }
                    }
                }
            }

            int ret = INF;
            for (int a = 1; a <= MAX; a++) {
                for (int b = 1; b <= MAX; b++) {
                    if (dp[n][a][b] != INF) {
                        if (a * ratioB == b * ratioA) {
                            ret = Math.min(ret, dp[n][a][b]);
                        }
                    }
                }
            }

            out.println(ret != INF ? ret : -1);
        }

        private static class Package {
            private int a;
            private int b;
            private int cost;

            private Package(int a, int b, int cost) {
                this.a = a;
                this.b = b;
                this.cost = cost;
            }

            public String toString() {
                return "(" + a + " " + b + " " + cost + ")";
            }

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

