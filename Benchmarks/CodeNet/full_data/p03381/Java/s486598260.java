import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.util.Collections;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            ArrayList<int[]> pair = new ArrayList<>();
            for (int i = 0; i < n; ++i) pair.add(new int[]{a[i], i});
            Collections.sort(pair, new Comparator<int[]>() {

                public int compare(int[] o1, int[] o2) {
                    if (o1[0] != o2[0])
                        return o1[0] - o2[0];
                    return o1[1] - o2[1];
                }
            });
            for (int i = 0; i < n; ++i) {
                out.println(bs(pair, a[i], i));
            }
        }

        private int bs(ArrayList<int[]> pair, int key, int ind) {
            int high = pair.size();
            int low = -1;
            while (high - low > 1) {
                int mid = (high + low) >>> 1;
                if (pair.get(mid)[0] > key) {
                    high = mid;
                } else if (pair.get(mid)[0] == key && pair.get(mid)[1] >= ind) {
                    high = mid;
                } else {
                    low = mid;
                }
            }
            int size = pair.size();
            if (high >= (size >> 1)) {
                return pair.get((size >> 1) - 1)[0];
            } else {
                return pair.get((size >> 1))[0];
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

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
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

