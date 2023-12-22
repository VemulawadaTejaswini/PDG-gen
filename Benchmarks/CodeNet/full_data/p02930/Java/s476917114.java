import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
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
        DClassified solver = new DClassified();
        solver.solve(1, in, out);
        out.close();
    }

    static class DClassified {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), cur = 0, h = n / 2;
            int[][] ans = new int[n][n], f = new int[n][n];
            TreeSet<Integer>[] t = new TreeSet[n];
            for (int i = 0; i < n; i++) {
                t[i] = new TreeSet<>();
                for (int j = 0; j < n; j++) {
                    t[i].add(j);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int k = 0;
                    for (int m : t[i]) {
                        //w.println(i+" "+j+" "+m+" "+f[i][m]+" "+f[j][m]);
                        if (!(f[i][m] == 1 && f[j][m] == 1)) {
                            k = m;
                            break;
                        }
                    }
                    ans[i][j] = k;
                    f[i][k]++;
                    f[j][k]++;
                    if (f[i][k] == 2) t[i].remove(k);
                    if (f[j][k] == 2) t[j].remove(k);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    w.print(ans[i][j] + 1 + " ");
                }
                w.println();
            }
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

