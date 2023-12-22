import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            long[] a = in.nextLongArray(n);
            long[] sum = new long[n + 1];
            long[] altSum = new long[n + 2];
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + a[i];
                altSum[i] += a[i];
                if (i + 2 < altSum.length) altSum[i + 2] = altSum[i];
            }
            while (q-- > 0) {
                int x = in.nextInt();
                long low = -1, high = 1L << 40;
                while (high - low > 1) {
                    long mid = (low + high) / 2;
                    long h = x + mid / 2, l = x - (mid + 1) / 2;
                    int s = cnt(a, l, h + 1);
                    int t = cnt(a, h + 1, Long.MAX_VALUE);
                    if (s <= t) {
                        low = mid;
                    } else {
                        high = mid;
                    }
                }

                if (low < 0) {
                    out.println(altSum[n - 1]);
                    continue;
                }

                long h = x + low / 2, l = Math.max(0, x - (low + 1) / 2);

                int s = cnt(a, l, h + 1);
                int t = cnt(a, h + 1, Long.MAX_VALUE);

                int idx1 = Arrays.binarySearch(a, (int) h);
                int idx2 = Arrays.binarySearch(a, (int) l);
//            dump(a, low, high, l, h, idx1);
                if (idx1 < 0) idx1 = -idx1 - 1;
                else idx1++;
                if (idx2 < 0) idx2 = -idx2 - 2;
                else idx2--;

                if (s != t) {
                    idx2--;
                }

//            dump(idx1, idx2, l, h, sum[n] - sum[idx1], (idx2 < 0 ? 0 : altSum[idx2]));
                long ans = sum[n] - sum[idx1] + (idx2 < 0 ? 0 : altSum[idx2]);
                out.println(ans);
            }
        }

        int cnt(long[] ary, long l, long h) {
            int i = Arrays.binarySearch(ary, l);
            int j = Arrays.binarySearch(ary, h);
            if (i < 0) i = -i - 1;
            if (j < 0) j = -j - 1;
            return j - i + 1;
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

        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0;
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

        public long[] nextLongArray(final int n) {
            final long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

