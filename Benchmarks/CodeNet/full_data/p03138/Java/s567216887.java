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
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXXOR solver = new DXXOR();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXXOR {
        public void solve(int testNumber, inclass in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();
            long arr[] = in.nextLongArray(n);
            int[] bin = new int[64];
            int longest = 0;
            for (int i = 0; i < arr.length; i++) {
                int x = (int) (Math.floor(Math.log10(arr[i]) / Math.log10(2)) + 1);
                longest = Math.max(longest, x);
                for (int j = 0; j < x; j++) {
                    bin[j] += (arr[i] & (1 << j)) > 0 ? 1 : 0;
                }
            }
            long ans = 0;
            for (int i = 0; i < longest; i++) {
                int ones = bin[i];
                int zero = n - bin[i];
                if (ones < zero) {
                    ans += Math.pow(2, i);
                }
            }
            if (ans > k) {
                for (int i = 0; i <= longest; i++) {
                    ans = ans & ~(1 << i);
                    if (ans <= k) {
                        break;
                    }
                }
            }
            for (int i = longest; i < 64; i++) {
                long temp = (ans | (1 << i));
                if (temp > k) {
                    break;
                }
                ans = temp;
            }
            long best = 0;
            for (int i = 0; i < arr.length; i++) {
                best += (ans ^ arr[i]);
            }
            out.println(best);
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
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

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; ++i) array[i] = nextLong();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

