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
        DKnight solver = new DKnight();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnight {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();

            if ((x + y) % 3 != 0) {
                out.println(0);
                return;
            }
            int t = (x + y) / 3;
            if ((t + x - y) % 2 != 0) {
                out.println(0);
                return;
            }
            int a = (t + x - y) / 2;
            Combination comb = new Combination(t + 100, (int) 1e9 + 7);
            out.println(comb.get(t, a));
        }

        public class Combination {
            final int mod;
            final int MAX;
            final long[] fact;
            final long[] inv;
            final long[] invfact;

            public Combination(int n, int mod) {
                this.mod = mod;
                MAX = n + 1;
                fact = new long[MAX];
                invfact = new long[MAX];
                inv = new long[MAX];

                inv[1] = 1;
                for (int i = 2; i < inv.length; i++) {
                    inv[i] = inv[mod % i] * (mod - mod / i) % mod;
                }

                fact[0] = 1;
                invfact[0] = 1;
                for (int i = 1; i < inv.length; i++) {
                    fact[i] = i * fact[i - 1] % mod;
                    invfact[i] = inv[i] * invfact[i - 1] % mod;
                }
            }

            public long get(int n, int r) {
                return fact[n] * invfact[n - r] % mod * invfact[r] % mod;
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

