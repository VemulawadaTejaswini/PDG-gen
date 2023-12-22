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
        FDivisionOrSubstraction solver = new FDivisionOrSubstraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDivisionOrSubstraction {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            long n = s.nextLong(), prev = n - 1;
            int sq = (int) Math.sqrt(n - 1), ans = 1;
            for (int i = 2; i <= sq; i++)
                if (prev % i == 0) {
                    int cnt = 0;
                    while (prev % i == 0) {
                        prev /= i;
                        cnt++;
                    }
                    ans *= (cnt + 1);
                }
            if (prev != 1) ans <<= 1;
            sq = (int) Math.sqrt(n);
            for (int i = 2; i <= sq; i++) {
                if (n % i == 0) {
                    if (n / i == i) {
                        long t = n;
                        while (t % i == 0) t /= i;
                        if (t % i == 1) ans++;
                    } else {
                        long t = n;
                        while (t % i == 0) t /= i;
                        if (t % i == 1) ans++;

                        t = n;
                        long div = n / i;
                        while (t % div == 0) t /= div;
                        if (t % div == 1) ans++;
                    }
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

