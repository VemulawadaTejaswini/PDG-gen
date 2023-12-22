import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        int n;
        long X;
        int[] x;
        long[] sum;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            n = in.nextInt();
            X = in.nextInt();
            x = in.nextIntArray(n);
//        n = 100000;
//        X = 1000000;
//        x = new int[n];
//        for (int i = 0; i < n; i++) x[i] = i + 1;

            sum = new long[n + 1];
            for (int i = 0; i < n; i++) sum[i + 1] = sum[i] + x[i];

            if (n <= 2000) {
                out.println(solveSub());
                return;
            }
            List<Integer> factor = new ArrayList<>();
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    factor.add(i);
                    if ((long) i * i != n) factor.add(n / i);
                }
            }
            Collections.sort(factor);

            int ll = 0, rr = factor.size();
            while (rr - ll > 2) {
                int llr = (ll * 2 + rr * 1) / 3;
                int lrr = (ll * 1 + rr * 2) / 3;
                if (f(factor.get(llr)) < f(factor.get(lrr))) {
                    rr = lrr;
                } else {
                    ll = llr;
                }
            }
            long ans = Long.MAX_VALUE;
            for (int i = ll; i < rr; i++) {
                long v = f(factor.get(i));
                ans = Math.min(ans, v);
//            dump(i, v);
            }
            out.println(ans);
        }

        long solveSub() {
            long ans = Long.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                long v = f(i);
                ans = Math.min(ans, v);
            }
            return ans;
        }

        long f(int y) {
            long ans = n * X;
            int rem = n % y;
            int div = n / y;
            int prev = 0;
            for (int i = 0; i < y; i++) {
                int cnt = div + (i >= y - rem ? 1 : 0);
                long c = y - i == 1 ? 5 : 2 * (y - i) + 1;
                ans += c * (sum[cnt + prev] - sum[prev]);
//            dump(i, cnt, c, (sum[cnt + prev] - sum[prev]));
                prev += cnt;
                if (i == y - 1) ans += cnt * X;
            }
            return ans;
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

