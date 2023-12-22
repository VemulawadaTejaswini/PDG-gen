import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            boolean cond = true;
            for (int i = 0; i + 1 < n; ++i) {
                cond &= (a[i] <= a[i + 1]);
            }
            if (cond) {
                out.println(0);
                return;
            }
            ArrayList<int[]> addPairs = new ArrayList<>();
            boolean negAll = true;
            for (int aa : a) negAll &= aa <= 0;
            if (negAll) {
                int min = Integer.MAX_VALUE;
                for (int aa : a) min = Math.min(min, aa);
                int ind = -1;
                for (int i = 0; i < n; ++i) if (ind == -1 && a[i] == min) ind = i;
                for (int i = 0; i + 1 < n; ++i) {
                    if (a[i] > a[i + 1]) {
                        while (a[i] > a[i + 1]) {
                            addPairs.add(new int[]{ind + 1, i + 1});
                            a[i] += min;
                        }
                    }
                }
            } else {
                int max = Integer.MIN_VALUE;
                for (int aa : a) max = Math.max(max, aa);
                int ind = -1;
                for (int i = 0; i < n; ++i) if (ind == -1 && a[i] == max) ind = i;
                for (int i = 0; i + 1 < n; ++i) {
                    if (a[i] > a[i + 1]) {
                        while (a[i] > a[i + 1]) {
                            addPairs.add(new int[]{ind + 1, i + 1});
                            a[i + 1] += max;
                        }
                    }
                }
            }
            out.println(addPairs.size());
            for (int[] aa : addPairs) out.println(aa[0] + " " + aa[1]);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        private boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        private static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

