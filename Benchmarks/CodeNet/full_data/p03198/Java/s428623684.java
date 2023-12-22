import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Random;
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
        ENegativeDoubling solver = new ENegativeDoubling();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENegativeDoubling {
        long inf = Long.MAX_VALUE;

        public void solve(int testNumber, InputReader in, OutputWriter out) {

            long start = System.currentTimeMillis();

            int n = in.nextInt();

            int[] a = in.nextIntArray(n);

            //pos sta
            int lo = 0;
            int hi = n;

            long ans = inf;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;

                long val1 = solve(a, mid, n);

                if (mid < hi) {
                    long val2 = solve(a, mid + 1, n);

                    if (val1 < val2) {
                        ans = Math.min(ans, val1);
                        hi = mid - 1;
                    } else {
                        ans = Math.min(ans, val2);
                        lo = mid + 2;
                    }
                } else {
                    ans = Math.min(ans, val1);
                    break;
                }
            }

            Random ran = new Random();

            while ((System.currentTimeMillis() - start) < 1900) {
                int ind = ran.nextInt(n + 1);

                long val = solve(a, ind, n);

                ans = Math.min(ans, val);
            }

            out.println(ans);
        }

        long solve(int[] a, int st, int n) {

            //long[] pow = new long[300000];

            long ans = 0;
            if (st < n) {
                int ind = 0;
                //pow[0] = a[st];
                for (int i = st + 1; i < n; i++) {
                    if (a[i] == a[i - 1]) {
                    } else if (a[i] > a[i - 1]) {
                        long num = a[i];

                        int exp = 0;

                        while (num >= a[i - 1]) {
                            num /= 2;
                            exp++;
                        }

                        exp--;

                        ind -= exp;

                    } else {
                        long num = a[i];

                        int exp = 0;
                        while (num < a[i - 1]) {
                            num *= 2;
                            exp++;
                        }

                        ind += exp;
                    }

                    if (ind < 0)
                        ind = 0;

                    if (ind % 2 == 1)
                        ind++;

                    ans += ind;
                }
            }

            if (st > 0) {
                ans++;
                int ind = 1;
                for (int i = st - 2; i >= 0; i--) {
                    if (a[i] == a[i + 1]) {
                    } else if (a[i] > a[i + 1]) {
                        long num = a[i];

                        int exp = 0;

                        while (num >= a[i + 1]) {
                            num /= 2;
                            exp++;
                        }

                        exp--;

                        ind -= exp;

                    } else {
                        long num = a[i];

                        int exp = 0;
                        while (num < a[i + 1]) {
                            num *= 2;
                            exp++;
                        }

                        ind += exp;
                    }

                    if (ind < 0)
                        ind = 0;

                    if (ind % 2 == 0)
                        ind++;

                    ans += ind;
                }
            }

            return ans;
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

