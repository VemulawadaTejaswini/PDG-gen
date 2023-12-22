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
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CCitySavers solver = new CCitySavers();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCitySavers {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] a = new int[n + 1], b = new int[n];
            long ans = 0;
            for (int i = 0; i <= n; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = s.nextInt();
                if (a[i] <= b[i]) {
                    b[i] -= a[i];
                    ans += a[i];
                    a[i] = 0;
                } else {
                    a[i] -= b[i];
                    ans += b[i];
                    b[i] = 0;
                }
                if (a[i + 1] <= b[i]) {
                    b[i] -= a[i + 1];
                    ans += a[i + 1];
                    a[i] = 0;
                } else {
                    a[i + 1] -= b[i];
                    ans += b[i];
                    b[i] = 0;
                }
            }
            w.println(ans);
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

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

