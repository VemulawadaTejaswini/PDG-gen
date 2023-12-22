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
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSilverFoxVsMonster solver = new FSilverFoxVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSilverFoxVsMonster {
        long[] lazy;
        long[] tree;

        void pushLazy(int n, int nL, int nR) {
            tree[n] += lazy[n] * (nR - nL + 1);
            if (nL != nR) {
                lazy[2 * n + 1] += lazy[n];
                lazy[2 * n + 2] += lazy[n];
            }
            lazy[n] = 0;
        }

        void update(int n, int nL, int nR, int l, int r, long v) {
            pushLazy(n, nL, nR);
            if (nR < l || r < nL)
                return;
            if (l <= nL && nR <= r) {
                lazy[n] += v;
                pushLazy(n, nL, nR);
                return;
            }
            update(2 * n + 1, nL, (nL + nR) / 2, l, r, v);
            update(2 * n + 2, (nL + nR) / 2 + 1, nR, l, r, v);
            tree[n] = tree[2 * n + 1] + tree[2 * n + 2];
        }

        long query(int n, int nL, int nR, int idx) {
            pushLazy(n, nL, nR);
            if (nR < idx || idx < nL)
                return 0;
            if (nL == idx && nR == idx)
                return tree[n];
            long ret = query(2 * n + 1, nL, (nL + nR) / 2, idx) + query(2 * n + 2, (nL + nR) / 2 + 1, nR, idx);
            tree[n] = tree[2 * n + 1] + tree[2 * n + 2];
            return ret;
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), d = s.nextInt(), a = s.nextInt();
            int[] x = new int[n];
            int[] h = new int[n];
            Pair[] pair = new Pair[n];
            for (int i = 0; i < n; i++) {
                x[i] = s.nextInt();
                h[i] = s.nextInt();
                pair[i] = new Pair(x[i], h[i]);
            }
            Arrays.sort(pair, new Comparator<Pair>() {

                public int compare(Pair o1, Pair o2) {
                    if (o1.x < o2.x)
                        return -1;
                    if (o1.x > o2.x)
                        return 1;
                    return 0;
                }
            });
            int sz = (int) Math.pow(2, (int) Math.ceil(Math.log(n) / Math.log(2)) + 1);
            tree = new long[sz];
            lazy = new long[sz];
            for (int i = 0; i < n; i++)
                update(0, 0, n - 1, i, i, pair[i].h);
            long res = 0;
            for (int i = 0; i < n; i++) {
                Pair p = pair[i];
                long val = Math.max(0, query(0, 0, n - 1, i));
                if (val == 0)
                    continue;
                int left = i, right = n - 1;
                int end = i;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (pair[mid].x <= p.x + 2 * d) {
                        end = mid;
                        left = mid + 1;
                    } else
                        right = mid - 1;
                }
                //w.println(i + " " + end);
                long c = (val - 1) / a + 1;
                //w.println(val + ", " + c);
                res += c;
                update(0, 0, n - 1, i, end, -c * a);
            }
            w.println(res);
        }

        class Pair {
            int x;
            int h;

            Pair(int x, int h) {
                this.x = x;
                this.h = h;
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
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

