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
        EAlmostEverywhereZero solver = new EAlmostEverywhereZero();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAlmostEverywhereZero {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String n = in.nextString();
            int k = in.nextInt();
            long ans = 0;
            int len = n.length();
            if (len < k) {
                out.println(0);
                return;
            }
            long fac[] = new long[len + 2];
            fac[0] = 1;
            for (int i = 1; i < fac.length; i++) {
                long t = (long) i;
                t *= fac[i - 1];
                fac[i] = t;
            }
            for (int i = 1; i < len; i++) {
                if (i < k)
                    continue;
                long f = 9;
                if (k == 2) {
                    f *= (i - 1) * 9;
                }
                if (k == 3) {
                    f *= (i - 1) * (i - 2) * 81;
                    f /= 2;
                }
                ans += f;
            }
            int j = 0;
            char c = n.charAt(0);
            if (len >= k) {
                long f = Long.parseLong(String.valueOf(c));
                long t = f - 1;
                if (k == 2) {
                    t *= (len - 1) * 9;
                }
                if (k == 3) {
                    t *= (len - 1) * (len - 2) * 81;
                    t /= 2;
                }
                ans += t;
                if (len >= 2 && k >= 2) {
                    long ff = Long.parseLong(String.valueOf(n.charAt(1)));
                    long tt = ff - 1;
                    if (k == 3) {
                        tt *= (len - 2) * 9;
                    }
                    ans += tt;
                }
                if (k == 2 && len > 2) {
                    long ttt = (len - 2) * 9;
                    ans += ttt;
                }
                if (k == 3 && len > 3) {
                    long ttt = (len - 2) * 81 * (len - 3);
                    ttt /= 2;
                    ans += ttt;
                    long tttt = (len - 3) * 9;
                    ans += tttt;
                }
                if (k == 3) {
                    long ff = Long.parseLong(String.valueOf(n.charAt(2)));
                    long tt = ff - 1;
                    ans += tt;
                }
            }
            int q = 0;
            for (char cc : n.toCharArray()) {
                if (cc != '0')
                    q++;
            }
            if (q == k)
                ans++;
            if (len > k)
                ans++;
            int u = 0;
            for (int i = 0; i < k; i++) {
                if (n.charAt(i) != '0')
                    u++;
            }
            int uu = 0;
            for (int i = k; i < len; i++) {
                if (n.charAt(i) != '0')
                    uu++;
            }
            if (u == k && uu == 0 && len > k)
                ans -= 1;
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
}

