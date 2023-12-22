import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        PrintWriter out = new PrintWriter(outputStream);
        DLazyFaith solver = new DLazyFaith();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLazyFaith {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.ni(), b = in.ni(), q = in.ni();
            long s[] = in.nla(a), t[] = in.nla(b);
            while (q-- > 0) {
                long x = in.nl();
                int ids = Arrays.binarySearch(s, x);
                int idt = Arrays.binarySearch(t, x);
                if (ids < 0) {
                    ids = -ids - 1;
                }
                if (idt < 0) {
                    idt = -idt - 1;
                }
                long minsr = (long) 1e11, mintr = (long) 1e11;
                long minsl = (long) 1e11, mintl = (long) 1e11;
                if (ids < a) {
                    minsr = Math.abs(x - s[ids]);
                }
                if (ids > 0) {
                    minsl = Math.abs(x - s[ids - 1]);
                }

                if (idt < b) {
                    mintr = Math.abs(x - t[idt]);
                }
                if (idt > 0) {
                    mintl = Math.abs(x - t[idt - 1]);
                }
                long ans = Math.min(Math.max(minsr, mintr), Math.max(minsl, mintl));
                ans = Math.min(ans, Math.min(2 * Math.min(minsl, mintr) + Math.max(minsl, mintr), 2 * Math.min(minsr, mintl) + Math.max(minsr, mintl)));
                out.println(ans);
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

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int ni() {
            return nextInt();
        }

        public long nl() {
            return nextLong();
        }

        public long[] nla(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

