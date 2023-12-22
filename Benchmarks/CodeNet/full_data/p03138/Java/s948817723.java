import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DXXOR solver = new DXXOR();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXXOR {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] cnt = new long[40];
            for (long x : in.nextLongArray(n)) {
                for (int i = 0; i < cnt.length; i++) {
                    cnt[i] += x >>> i & 1;
                }
            }

//        out.println(solveDp(n, k, cnt));
            out.println(solveMeetInTheMiddle(n, k, cnt));
//        out.println(solveSearchAll(n, k, cnt));
        }

        public long solveMeetInTheMiddle(int n, long k, long[] cnt) {
            long ans = 0;
            long lowBest = 0, lowLess = 0;
            for (int i = 0; i < 1 << 20; i++) {
                long v = 0;
                for (int j = 0; j < 20; j++) {
                    v += ((i >>> j & 1) == 0 ? cnt[j] : n - cnt[j]) << j;
                }
                lowBest = Math.max(lowBest, v);
                if (i <= (k & 0xFFFFF)) {
                    lowLess = Math.max(lowLess, v);
                }
            }
            for (int i = 0; i < 1 << 20; i++) {
                long v = 0;
                for (int j = 20; j < 40; j++) {
                    v += ((i >>> j & 1) == 0 ? cnt[j] : n - cnt[j]) << j;
                }
                if (i == (k >>> 20 & 0xFFFFF)) {
                    ans = Math.max(v + lowLess, ans);
                } else if (i < (k >>> 20 & 0xFFFFF)) {
                    ans = Math.max(v + lowBest, ans);
                }
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

