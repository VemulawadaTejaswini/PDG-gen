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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
//        if (true) { test(1000000, 3); }
            int q = in.nextInt();
            while (q-- > 0) {
                long a = in.nextInt();
                long b = in.nextInt();
                long ans = a + b - 2;
                if (a < b) {
                    long t = a;
                    a = b;
                    b = t;
                }

                long j, r;
//            for (j = b + 1, r = a; ; j++) {
//                long cur = (a * b + j - 1) / j;
//                if (cur == r) break;
////                ans -= r - cur - (i > b + 1 ? 1 : 0);
//                r = cur;
//            }
                long low = b, high = Long.MAX_VALUE / 2;
                while (high - low > 1) {
                    long mid = (low + high) / 2;
                    long cur = (a * b + mid - 1) / mid;
                    long next = (a * b + mid + 1) / (mid + 2);
                    if (next - cur <= 2) high = mid;
                    else low = mid;
                }
//            dump(low, high, j);
                j = Math.max(high - 2, b) + 1;
                r = (a * b + j - 1) / j;
                ans -= a - r;
                ans += b - j + 1;
//            dump(j, r, a - r, b - j + 1);
                for (j++; ; j++) {
                    long cur = (a * b + j - 1) / j;
                    if (cur == r) break;
//                dump("cur=", cur);
                    ans -= r - cur - (j > b + 1 ? 1 : 0);
                    r = cur;
                }
//            {
//                long cur = (a * b + high - 1) / high;
//                ans -= a - cur;
//                ans += high - b - 1;
//            }
                out.println(ans);
            }
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

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

