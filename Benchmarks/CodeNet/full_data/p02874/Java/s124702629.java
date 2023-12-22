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
        BTwoContests solver = new BTwoContests();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTwoContests {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int[][] x = in.nextIntArray2D(n, 2);
            Arrays.sort(x, (a, b) -> {
                if (a[1] != b[1]) return a[1] - b[1];
                return (a[0] - b[0]);
            });

            long ans = 0;
            int maxL = Integer.MIN_VALUE, minR = Integer.MAX_VALUE;
            for (int[] y : x) {
                maxL = Math.max(maxL, y[0]);
                minR = Math.min(minR, y[1]);
                ans = Math.max(ans, y[1] - y[0] + 1);
            }
            ans += Math.max(0, minR - maxL + 1);

            for (int[] y : x) {
                int l = y[0];
                y[0] = Math.max(0, y[1] - maxL + 1);
                y[1] = Math.max(0, minR - l + 1);
            }
            Arrays.sort(x, (a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0];
                return -(a[1] - b[1]);
            });

            long[] s = new long[n + 2];
            long[] t = new long[n + 2];
            s[n + 1] = Integer.MAX_VALUE;
            t[0] = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                s[n - i] = Math.min(s[n - i + 1], x[n - 1 - i][0]);
                t[i + 1] = Math.min(t[i], x[i][1]);
            }
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, t[i] + s[i + 1]);
            }
            out.println(ans);
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

        public int[][] nextIntArray2D(final int n, final int k) {
            final int[][] res = new int[n][];
            for (int i = 0; i < n; i++) {
                res[i] = nextIntArray(k);
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

