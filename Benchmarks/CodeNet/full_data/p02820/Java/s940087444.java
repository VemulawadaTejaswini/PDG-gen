import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPredictionAndRestriction solver = new DPredictionAndRestriction();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPredictionAndRestriction {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int k = s.nextInt();
            int r = s.nextInt();
            int ss = s.nextInt();
            int p = s.nextInt();
            String str = s.nextString();
            int ans1 = 0;
            for (int i = 0; i < k; i++) {
                int j = i;
                StringBuilder ans = new StringBuilder();
                while (j < n) {
                    ans.append(str.charAt(j));
                    j += k;
                }

                String str1 = ans.toString();
                int m = str1.length();
                int a = 0;
                while (a < m) {
                    int count = 0;
                    int b = a;
                    while (b < m && str1.charAt(b) == str1.charAt(a)) {
                        count++;
                        b++;
                    }
                    int g = (count + 1) / 2;
                    if (str1.charAt(a) == 'r') {
                        g *= p;
                    } else if (str1.charAt(a) == 's') {
                        g *= r;
                    } else {
                        g *= ss;
                    }
                    ans1 += g;
                    a = b;
                }


            }
            out.println(ans1);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

