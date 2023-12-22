import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ogiekako
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        MyPrintWriter out = new MyPrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        long[][] comb;
        int MOD = 998244353;
        long[] fact;
        long[][] memo;

        public void solve(int testNumber, MyScanner in, MyPrintWriter out) {
            String A = in.next();
            String B = in.next();
            int n = A.length();
            memo = new long[n + 1][n + 1]; // a, b
            ArrayUtils.fill(memo, -1);
            int a = 0, b = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == '1' && B.charAt(i) == '1') b++;
                else if (A.charAt(i) == '1' && B.charAt(i) == '0') a++;
            }
            fact = MathUtils.factorialMod(n + 1, MOD);
            comb = MathUtils.genCombTableMod(n + 1, n + 1, MOD);
            long res = f(a, b);
            out.println(res);
        }

        private long f(int a, int b) {
            if (a < 0 || b < 0) return 0;
            if (memo[a][b] >= 0) return memo[a][b];
            if (a == 0) {
                return memo[a][b] = fact[b] * fact[b] % MOD;
            }
            long res = 0;
            for (int p = 0; p <= b; p++) {
                res += f(a - 1, b - p)
                        * comb[b][p] % MOD
                        * fact[p] % MOD
                        * a % MOD  // choose order
                        * comb[a + b][p + 1] % MOD;
                if (res >= MOD) res -= MOD;
            }
            return memo[a][b] = res;
        }

    }

    static
    @SuppressWarnings("SuspiciousNameCombination")
    class MathUtils {
        public static long[][] genCombTableMod(int h, int w, int MOD) {
            long[][] C = new long[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w && j <= i; j++) {
                    long value = j == 0 ? 1 : C[i - 1][j - 1] + C[i - 1][j];
                    if (value >= MOD) value -= MOD;
                    C[i][j] = value;
                }
            return C;
        }

        public static long[] factorialMod(int n, int modulus) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) res[i] = (i == 0 ? 1 : res[i - 1] * i) % modulus;
            return res;
        }

    }

    static class MyPrintWriter {
        PrintWriter out;

        public MyPrintWriter(OutputStream outputStream) {
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public MyPrintWriter(Writer writer) {
            out = new PrintWriter(writer);
        }

        public void println(Object... os) {
            if (os.length == 0) {
                out.println();
                return;
            }
            for (int i = 0; i < os.length - 1; i++) {
                out.print(os[i]);
                out.print(' ');
            }
            out.println(os[os.length - 1]);
        }

        public void close() {
            out.close();
        }

    }

    static class ArrayUtils {
        public static void fill(long[][] array, long value) {
            for (long[] a : array) Arrays.fill(a, value);
        }

    }

    static class MyScanner {
        private final InputStream in;
        private static final int BUFSIZE = 65536;
        int bufLen;
        int bufPtr;
        byte[] buf = new byte[BUFSIZE];
        private char[] strBuf = new char[BUFSIZE];

        public MyScanner(InputStream in) {
            this.in = in;
        }

        public int read() {
            if (bufLen == -1)
                throw new InputMismatchException();
            if (bufPtr >= bufLen) {
                bufPtr = 0;
                try {
                    bufLen = in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (bufLen <= 0)
                    return -1;
            }
            return buf[bufPtr++];
        }

        public String next() {
            int strLen = 0;
            int c;
            do {
                c = read();
                if (c == -1) throw new NoSuchElementException();
            } while (Character.isWhitespace(c));
            do {
                if (strLen + 1 >= strBuf.length) {
                    char[] tmp = new char[strBuf.length * 2];
                    System.arraycopy(strBuf, 0, tmp, 0, strBuf.length);
                    strBuf = tmp;
                }
                strBuf[strLen++] = (char) c;
                c = read();
            } while (c != -1 && !Character.isWhitespace(c));
            return new String(strBuf, 0, strLen);
        }

    }
}

