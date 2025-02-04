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
        DStringEquivalence solver = new DStringEquivalence();
        solver.solve(1, in, out);
        out.close();
    }

    static class DStringEquivalence {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), MX = 1 << n;
            for (int i = 0; i < MX; i++) {
                boolean flag = false;
                for (int j = 0; j < i; j++) if (chk(i, j, n)) flag = true;
                if (flag) continue;
                for (int j = n - 1; j >= 0; j--)
                    w.print((i >> j & 1) == 0 ? 'a' : 'b');
                w.println();
            }
        }

        boolean chk(int u, int v, int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int n1 = (u >> i & 1) ^ (u >> j & 1), n2 = (v >> i & 1) ^ (v >> j & 1);
                    if (n1 != n2) return false;
                }
            }
            return true;
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

