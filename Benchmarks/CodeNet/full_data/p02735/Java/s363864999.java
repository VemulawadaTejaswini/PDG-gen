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
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ARangeFlipFindRoute solver = new ARangeFlipFindRoute();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARangeFlipFindRoute {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int h = s.nextInt(), wi = s.nextInt();
            char[][] c = new char[h][];
            int[][] dp = new int[h][wi];
            for (int i = 0; i < h; i++) Arrays.fill(dp[i], (int) 1e9);
            for (int i = 0; i < h; i++)
                c[i] = s.next().toCharArray();
            dp[0][0] = c[0][0] == '.' ? 0 : 1;
            for (int i = 1; i < wi; i++) {
                if (c[0][i] != c[0][i - 1] && c[0][i - 1] == '.') dp[0][i] = dp[0][i - 1] + 1;
                else dp[0][i] = dp[0][i - 1];
            }
            for (int i = 1; i < h; i++) {
                if (c[i][0] != c[i - 1][0] && c[i - 1][0] == '.') dp[i][0] = dp[i - 1][0] + 1;
                else dp[i][0] = dp[i - 1][0];
            }
            for (int i = 1; i < h; i++)
                for (int j = 1; j < wi; j++) {
                    if (c[i][j] != c[i - 1][j] && c[i - 1][j] == '.') dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                    else dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                    if (c[i][j] != c[i][j - 1] && c[i][j - 1] == '.') dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                    else dp[i][j] = Math.min(dp[i][j], dp[i][j - 1]);

                }
        /*for(int i=0;i<h;i++) {
            for(int j=0;j<wi;j++) w.print(dp[i][j]+" ");
            w.println();
        }*/
            w.println(dp[h - 1][wi - 1]);
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

