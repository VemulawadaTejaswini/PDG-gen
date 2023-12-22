import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EMaxMinSums solver = new EMaxMinSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMaxMinSums {
        long mod = (int) 1e9 + 7;

        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), k = c.readInt();
            int a[] = c.readIntArray(n);
            Sort.mergeSort(a, 0, n);

            long pre[] = new long[n];
            pre[0] = a[0];
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] + a[i];
                pre[i] %= mod;
            }
            long fact[] = new long[(int) 1e6 + 11];
            fact[0] = 1;
            fact[1] = 1;
            for (int i = 2; i < 1e6 + 11; i++) {
                fact[i] = fact[i - 1] * i;
                fact[i] %= mod;
            }

            long ncr[] = new long[n + 10];
            for (int i = k; i < n + 10; i++) {
                ncr[i] = ncr(i - 2, k - 2, fact);
                ncr[i] += ncr[i - 1];
                ncr[i] %= mod;
            }
            long res = 0;
            for (int i = n - 1; i >= 0; i--) {
                res += a[i] * ncr[i + 1];
                res %= mod;
            }
            for (int i = 0; i <= n - k; i++) {
                res = (res - (a[i] * ncr[n - i]) % mod + mod) % mod;
            }

            w.printLine(res);


        }

        long ncr(long n, long r, long[] fac) {
            if (n < 0 || r < 0) {
                return 0;
            }
            long p = mod;
            return (fac[(int) n] * Utils.modInverse(fac[(int) r], p)
                    % p * Utils.modInverse(fac[(int) (n - r)], p)
                    % p) % p;
        }

    }

    static class Sort {
        public static void mergeSort(int[] a, int low, int high) {
            if (high - low < 2) {
                return;
            }
            int mid = (low + high) >>> 1;
            mergeSort(a, low, mid);
            mergeSort(a, mid, high);
            int[] b = Arrays.copyOfRange(a, low, mid);
            for (int i = low, j = mid, k = 0; k < b.length; i++) {
                if (j == high || b[k] <= a[j]) {
                    a[i] = b[k++];
                } else {
                    a[i] = a[j++];
                }
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

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
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

        public int readInt() {
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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
        }

    }

    static class Utils {
        public static long modInverse(long a, long m) {
            return power(a, m - 2, m);
        }

        public static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res = (res * x) % p;
                }
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

    }
}

