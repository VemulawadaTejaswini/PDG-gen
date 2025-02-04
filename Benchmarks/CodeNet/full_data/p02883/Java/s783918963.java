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
        EGluttony solver = new EGluttony();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGluttony {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            long k = s.nextLong();
            int[] arr = s.nextIntArray(n);
            int[] brr = s.nextIntArray(n);
            EGluttony.arrays.sort(brr);
            EGluttony.arrays.sort(arr);
            long max = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[n - i - 1] * brr[i]);
            }

            long low = 0L;
            long high = max;
            long fin = -1L;
            while (low <= high) {
                long mid = (low + high) / 2;
                int ans = check(mid, arr, brr, k);
                if (ans == -1) {
                    low = mid + 1;
                } else {
                    fin = mid;
                    high = mid - 1;
                }
            }
            out.println(fin);


        }

        private int check(long mid, int[] arr, int[] brr, long k) {
            int n = arr.length;
            for (int i = 0; i < arr.length; i++) {
                if ((long) brr[n - i - 1] * (long) arr[i] <= mid) {
                    continue;
                } else {
                    long div = mid / brr[n - i - 1];
                    if (arr[i] - div <= k) {
                        k = k - (arr[i] - div);
                    } else {
                        return -1;
                    }
                }
            }
            return 0;
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

