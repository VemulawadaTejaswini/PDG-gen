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
        CSnukeTheWizard solver = new CSnukeTheWizard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSnukeTheWizard {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            char[] cs = in.nextChars();
            int[] t = new int[q];
            int[] d = new int[q];
            for (int i = 0; i < q; i++) {
                t[i] = in.nextChars()[0];
                d[i] = in.nextChars()[0] == 'L' ? -1 : 1;
            }

            int low = -1, high = n;
            LOOP:
            while (high - low > 1) {
                int mid = (low + high) / 2;
                int cur = mid;
                for (int i = 0; i < q; i++) {
                    if (cur >= n || cs[cur] != t[i]) continue;
                    cur += d[i];
                    if (cur < 0) {
                        low = mid;
                        continue LOOP;
                    }
                }
                high = mid;
            }
            int ans = 0;
            ans += high;

            low = -1;
            high = n;
            LOOP:
            while (high - low > 1) {
                int mid = (low + high) / 2;
                int cur = n - 1 - mid;
                for (int i = 0; i < q; i++) {
                    if (cur < 0 || cs[cur] != t[i]) continue;
                    cur += d[i];
                    if (cur >= n) {
                        low = mid;
                        continue LOOP;
                    }
                }
                high = mid;
            }
            ans += high;
            out.println(Math.max(n - ans, 0));
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

        public char[] nextChars() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

