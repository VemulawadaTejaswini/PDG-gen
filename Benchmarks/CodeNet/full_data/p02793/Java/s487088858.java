import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        long modExp(long x, long y, long mod) {
            if (y == 0)
                return 1;
            if (y == 1)
                return x % mod;
            long ret = modExp(x, y / 2, mod);
            ret = ret * ret % mod;
            if (y % 2 == 1)
                ret = ret * (x % mod) % mod;
            return ret;
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int[] sieve = new int[(int) 1e6 + 1];
            Arrays.fill(sieve, 1);
            ArrayList<Integer>[] fact = new ArrayList[(int) 1e6 + 1];
            for (int i = 1; i <= (int) 1e6; i++)
                fact[i] = new ArrayList<>();
            for (int i = 2; i <= (int) 1e6; i++) {
                if (sieve[i] == 0)
                    continue;
                fact[i].add(i);
                for (int j = 2; (long) i * j <= (int) 1e6; j++) {
                    sieve[i * j] = 0;
                    fact[i * j].add(i);
                }
            }
            int n = s.nextInt();
            int[] a = new int[n];
            int[] f = new int[(int) 1e6 + 1];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                int x = a[i];
                for (int j : fact[a[i]]) {
                    int c = 0;
                    while (x % j == 0) {
                        x /= j;
                        c++;
                    }
                    f[j] = Math.max(c, f[j]);
                }
            }
            long mod = (long) 1e9 + 7;
            long lcm = 1;
            for (int i = 2; i <= (int) 1e6; i++) {
                if (f[i] == 0)
                    continue;
                lcm = lcm * modExp(i, f[i], mod) % mod;
            }
            long res = 0;
            for (int i = 0; i < n; i++) {
                res = (res + lcm * modExp(a[i], mod - 2, mod) % mod) % mod;
            }
            w.println(res);
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

