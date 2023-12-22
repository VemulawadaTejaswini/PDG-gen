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
        DRainFlowsIntoDams solver = new DRainFlowsIntoDams();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRainFlowsIntoDams {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), a[] = new int[n];
            long ans[] = new long[n], c = 0;
            a[0] = s.nextInt();
            c = a[0];
            for (int i = 1; i < n - 1; i++) {
                a[i] = s.nextInt();
                if ((i & 1) == 1) {
                    c -= a[i];
                } else {
                    c += a[i];
                }
            }
            a[n - 1] = s.nextInt();
            ans[0] = a[n - 1] + c;
            for (int i = 1; i < n; i++) {
                ans[i] = (a[i - 1] - ans[i - 1] / 2) << 1;
            }
            for (long i : ans) w.print(i + " ");
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

