import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
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
        EMajorityOfBalls solver = new EMajorityOfBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMajorityOfBalls {
        int qt = 0;
        boolean debug = false;
        MyInput in;
        PrintWriter out;
        Random random = new Random(6);
        int n = 99;
        int[] test = new int[n * 2];
        int[] ans;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            n = in.nextInt();
            ans = new int[2 * n];
            Arrays.fill(ans, -1);

            this.in = in;
            this.out = out;

            init();

            int[] ps = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                ps[i] = i;
            }

            shuffle(ps, random);
            int res = query(ps);
            for (int i = 0, s = n / 2; i < 210; i++) {
                shuffle(ps, 0, s * 2);
                shuffle(ps, n, n + s * 2);
                for (int k = 0; k < s; k++) {
                    swap(ps, k, k + n);
                }
                int res2 = query(ps);
                if (res != res2) {
                    dump("find", i, s);
                    res = res2;
                    if (s == 1) {
                        break;
                    }
                    s /= 2;
                } else {
                    for (int k = 0; k < s; k++) {
                        swap(ps, k, k + n);
                    }
                }
            }

            ans[ps[0]] = res;
            for (int i = n; i < ps.length; i++) {
                swap(ps, 0, i);
                ans[ps[0]] = query(ps);
                swap(ps, 0, i);
            }
            for (int i = 0; i < n; i++) {
                swap(ps, i, i + n);
            }
            for (int i = n + 1; i < ps.length; i++) {
                swap(ps, 0, i);
                ans[ps[0]] = query(ps);
                swap(ps, 0, i);
            }

            answer();
        }

        void answer() {
            if (debug) {
                dump("query", qt);
                for (int i = 0; i < test.length; i++) {
                    if (ans[i] != test[i]) {
                        dump(test);
                        dump(ans);
                        dump("NG");
                        return;
                    }
                }
                dump("OK");
                return;
            }


            out.print("! ");
            for (int i = 0; i < 2 * n; i++) {
                out.print("RB".charAt(ans[i]));
            }
            out.println();
            out.flush();
        }

        void shuffle(int[] ps, Random random) {
            for (int i = 1; i < ps.length; i++) {
                int j = random.nextInt(i + 1);
                swap(ps, i, j);
            }
        }

        void shuffle(int[] ps, int l, int r) {
            for (int i = 1; i < r - l; i++) {
                int j = random.nextInt(i + 1);
                swap(ps, i + l, j + l);
            }
        }

        void init() {
            for (int i = 0; i < test.length; i++) {
                test[i] = i < n ? 1 : 0;
            }
            shuffle(test, random);
        }

        int query(int[] q) {
            if (debug) {
                qt++;
                int c = 0;
                for (int i = 0; i < n; i++) {
                    c += test[q[i]];
                }
                return c > n / 2 ? 1 : 0;
            }
            out.print("?");
            for (int i = 0; i < n; i++) {
                out.print(" " + (q[i] + 1));
            }
            out.println();
            out.flush();
            return in.nextChars()[0] == 'B' ? 1 : 0;
        }

        static void dump(Object... o) {
            System.err.println(Arrays.deepToString(o));
        }

        static void swap(int[] xs, int i, int j) {
            int t = xs[i];
            xs[i] = xs[j];
            xs[j] = t;
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

