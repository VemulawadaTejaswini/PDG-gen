import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        FSilverFoxVsMonster solver = new FSilverFoxVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSilverFoxVsMonster {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), d = s.nextInt(), a = s.nextInt();
            bit b = new bit(n + 1);
            long[][] x = new long[n][2];
            for (int i = 0; i < n; i++) {
                x[i][0] = s.nextInt();
                x[i][1] = s.nextInt();
            }
            func.sortbyColumn(x, 0);
            for (int i = 0; i < n; i++) {
                b.modify(i, x[i][1]);
                b.modify(i + 1, -x[i][1]);
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                if (b.query(i) > 0) {
                    long inc = (b.query(i) - 1) / a + 1;
                    b.modify(i, -a * inc);
                    b.modify(bins(x, i, n - 1, x[i][0] + 2 * d) + 1, a * inc);
                    ans += inc;
                }
            }
            w.println(ans);
        }

        int bins(long[][] a, int l, int r, long val) {
            int mid, ans = r;
            while (l <= r) {
                mid = l + r >> 1;
                if (a[mid][0] == val) {
                    l = mid + 1;
                    ans = mid;
                } else if (a[mid][0] > val) {
                    r = mid - 1;
                    ans = r;
                } else {
                    l = mid + 1;
                }
            }
            return ans;
        }

        public class bit {
            public int n;
            public long[] t;

            public bit(int n) {
                t = new long[n];
                this.n = n;
            }

            public void modify(int ind, long val) {
                for (; ind < n; ind = ind | (++ind)) t[ind] += val;
            }

            public long query(int ind) {
                long sum = 0;
                for (; ind >= 0; ind = (ind & (++ind)) - 1) sum += t[ind];
                return sum;
            }

        }

    }

    static class func {
        public static void sortbyColumn(long[][] arr, final int col) {
            Arrays.sort(arr, new Comparator<long[]>() {

                public int compare(final long[] entry1, final long[] entry2) {
                    if (entry1[col] > entry2[col]) return 1;
                    if (entry1[col] < entry2[col]) return -1;
                    return 0;
                }
            });
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

