import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.function.BiFunction;
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
        DEars solver = new DEars();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEars {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            long[] l = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                l[i] = in.nextInt();
            }

            //add odd
            long[] es = new long[n + 1];
            long[] os = new long[n + 1];

            long[] ee = new long[n + 1];
            long[] oe = new long[n + 1];

            long[] prel = in.calculatePrefixSum(l);
            long[] sufl = in.calculateSuffixSum(l);

            for (int i = 1; i <= n; i++) {
                if (l[i] == 0) {
                    es[i] = es[i - 1] + 2;
                } else if (l[i] % 2 == 1) {
                    es[i] = es[i - 1] + 1;
                } else {
                    es[i] = es[i - 1];
                }
                es[i] = Math.min(es[i], prel[i]);
            }


            for (int i = 1; i <= n; i++) {
                if (l[i] % 2 == 0) {
                    os[i] = os[i - 1] + 1;
                } else {
                    os[i] = os[i - 1];
                }
                os[i] = Math.min(os[i], prel[i]);
            }


            for (int i = n - 1; i >= 0; i--) {
                if (l[i + 1] == 0) {
                    ee[i] = ee[i + 1] + 2;
                } else if (l[i + 1] % 2 == 1) {
                    ee[i] = ee[i + 1] + 1;
                } else {
                    ee[i] = ee[i + 1];
                }

                ee[i] = Math.min(sufl[i + 1], ee[i]);
            }

            for (int i = n - 1; i >= 0; i--) {
                if (l[i + 1] % 2 == 0) {
                    oe[i] = oe[i + 1] + 1;
                } else {
                    oe[i] = oe[i + 1];
                }

                oe[i] = Math.min(sufl[i + 1], oe[i]);
            }

            //w e
            long ans = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                ans = Math.min(ans, es[i] + ee[i]);
            }

            for (int i = 1; i <= n; i++) {
                ans = Math.min(ans, os[i] + oe[i]);
            }

            for (int i = 1; i <= n; i++) {
                ans = Math.min(ans, es[i] + oe[i]);
            }

            for (int i = 1; i <= n; i++) {
                ans = Math.min(ans, os[i] + ee[i]);
            }

            long[][] dp = new long[n + 1][2];

            for (int i = n - 1; i >= 0; i--) {
                int o = 0;
                int e = 0;

                if (l[i + 1] % 2 == 0)
                    o++;
                else
                    e++;

                dp[i][0] = dp[i + 1][0] + e;
                dp[i][1] = Math.min(dp[i + 1][1] + o, dp[i + 1][0] + o);
            }

//        for (int i = n - 1; i >= 0; i--) {
//            dp[i] = Math.min(dp[i + 1] + 1 - (l[i + 1] % 2), ee[i]);
//            dp[i] = Math.min(sufl[i + 1], dp[i]);
//        }

            for (int i = 1; i <= n; i++) {
                long ca = es[i];

//            int lo = i;
//            int hi = n - 1;
//
//            while (lo <= hi) {
//                int mid = (lo + hi) / 2;
//
//                long va1 = oe[]
//            }

                ans = Math.min(ans, es[i] + Math.min(dp[i][0], dp[i][1]));
            }

            out.println(ans);
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

        public long[] calculatePrefixSum(long[] a) {
            int n = a.length;

            long[] prefixSum = new long[n];

            prefixSum[0] = a[0];

            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + a[i];
            }

            return prefixSum;
        }

        public long[] calculateSuffixSum(long[] a) {
            return calculateSuffixFunc(a, (x, y) -> x + y);
        }

        public long[] calculateSuffixFunc(long[] a, BiFunction<Long, Long, Long> biFunction) {
            int n = a.length;

            long[] suffixMin = new long[n];

            suffixMin[n - 1] = a[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                suffixMin[i] = biFunction.apply(suffixMin[i + 1], a[i]);
            }

            return suffixMin;
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

