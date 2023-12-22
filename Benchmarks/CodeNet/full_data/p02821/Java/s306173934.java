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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EHandshake solver = new EHandshake();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHandshake {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            long m = s.nextLong();
            int[] a = s.nextIntArray(n);
            EHandshake.arrays.sort(a);

            int ok = 0;
            int ng = 1000000;
            while (ng - ok > 1) {
                int k = (ok + ng) / 2;

                int ptr = n - 1;
                long cnt = 0;
                for (int i = 0; i < n; i++) {
                    while (ptr >= 0 && a[i] + a[ptr] >= k) {
                        ptr--;
                    }
                    cnt += n - ptr - 1;
                }
                if (cnt >= m) {
                    ok = k;
                } else {
                    ng = k;
                }
            }


            int ptr = n - 1;
            long ret = 0;
            long sum = 0;
            long total = 0;
            for (int i = 0; i < n; i++) {
                while (ptr >= 0 && a[i] + a[ptr] >= ok) {
                    sum += a[ptr];
                    ptr--;
                }
                int cnt = n - ptr - 1;
                total += cnt;
                ret += (long) cnt * a[i] + sum;
            }

            ret -= (long) (total - m) * ok;

            out.println(ret);


        }

        private static class arrays {
            static void merge(int arr[], int l, int m, int r) {
                int n1 = m - l + 1;
                int n2 = r - m;
                int L[] = new int[n1];
                int R[] = new int[n2];
                for (int i = 0; i < n1; ++i)
                    L[i] = arr[l + i];
                for (int j = 0; j < n2; ++j)
                    R[j] = arr[m + 1 + j];
                int i = 0, j = 0;
                int k = l;
                while (i < n1 && j < n2) {
                    if (L[i] <= R[j]) {
                        arr[k] = L[i];
                        i++;
                    } else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }

                while (i < n1) {
                    arr[k] = L[i];
                    i++;
                    k++;
                }

                while (j < n2) {
                    arr[k] = R[j];
                    j++;
                    k++;
                }
            }

            static void sort(int arr[], int l, int r) {
                if (l < r) {
                    int m = (l + r) / 2;
                    sort(arr, l, m);
                    sort(arr, m + 1, r);
                    merge(arr, l, m, r);
                }
            }

            static void sort(int[] arr) {
                sort(arr, 0, arr.length - 1);
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

