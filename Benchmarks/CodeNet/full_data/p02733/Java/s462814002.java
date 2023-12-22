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
 * @author Yagnik
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EDividingChocolate solver = new EDividingChocolate();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDividingChocolate {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int h = s.nextInt(), wi = s.nextInt(), k = s.nextInt(), tot = 1 << h - 1;
            char[][] c = new char[h][];
            for (int i = 0; i < h; i++) c[i] = s.next().toCharArray();
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < tot; i++) {
                int[] f;
                int prev, cur = ones(i);
                boolean ok = true;
                for (int j = 0; j < wi; j++) {
                    f = new int[h];
                    prev = 0;
                    for (int m = 0; m < h; m++) {
                        if (c[m][j] == '1') f[prev]++;
                        if ((i >> m & 1) == 1) prev = m + 1;
                    }
                    for (int m = 0; m < h; m++)
                        if (f[m] > k) {
                            ok = false;
                            break;
                        }
                    if (!ok) break;
                }
                if (!ok) continue;
                f = new int[h];
                for (int j = 0; j < wi; j++) {
                    ok = true;
                    prev = 0;
                    for (int m = 0; m < h; m++) {
                        if (c[m][j] == '1') f[prev]++;
                        if ((i >> m & 1) == 1) prev = m + 1;
                    }
                    for (int m = 0; m < h; m++)
                        if (f[m] > k) {
                            ok = false;
                            break;
                        }
                    if (!ok) {
                        prev = 0;
                        f = new int[h];
                        cur++;
                        for (int m = 0; m < h; m++) {
                            if (c[m][j] == '1') f[prev]++;
                            if ((i >> m & 1) == 1) prev = m + 1;
                        }
                    }
                }
                //w.println(i+" "+cur);
                ans = Math.min(ans, cur);
            }
            w.println(ans);
        }

        int ones(int n) {
            int cnt = 0;
            while (n > 0) {
                if ((n & 1) == 1) cnt++;
                n >>= 1;
            }
            return cnt;
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

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
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

