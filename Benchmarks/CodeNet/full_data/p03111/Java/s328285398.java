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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSyntheticKadomatsu solver = new CSyntheticKadomatsu();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSyntheticKadomatsu {
        int ans = (int) 1e7;
        int n;
        int a;
        int b;
        int c;
        int[] l;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.ni();
            a = in.ni();
            b = in.ni();
            c = in.ni();
            l = in.nia(n);
            dp(0, 0, 0, 0, 0, 0, 0);
            out.println(ans);
        }

        private void dp(int depth, int la, int lb, int lc, int ca, int cb, int cc) {
            if (depth == n) {
                if (ca != 0 && cb != 0 && cc != 0) {
                    ca--;
                    cb--;
                    cc--;
                    ans = Math.min(ans, Math.abs(a - la) + Math.abs(b - lb) + Math.abs(c - lc) + ca * 10 + cb * 10 + cc * 10);
                }
                return;
            }
            // include a
            dp(depth + 1, la + l[depth], lb, lc, ca + 1, cb, cc);
            // include b
            dp(depth + 1, la, lb + l[depth], lc, ca, cb + 1, cc);
            // include c
            dp(depth + 1, la, lb, lc + l[depth], ca, cb, cc + 1);
            // not include
            dp(depth + 1, la, lb, lc, ca, cb, cc);
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

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int ni() {
            return nextInt();
        }

        public int[] nia(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

