import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Map;
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
        EWhoSaysAPun solver = new EWhoSaysAPun();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWhoSaysAPun {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            char[] cs = in.nextChars();
            RollingHash rh1 = new RollingHash(cs, 31);
            RollingHash rh2 = new RollingHash(cs, 65537);

            int low = 0, high = cs.length;
            while (high - low > 1) {
                int mid = (low + high) / 2;
                final Map<Long, Integer> mp = new HashMap<>();
                boolean find = false;
                for (int i = 0; i + mid <= cs.length; i++) {
                    long h = rh1.get(i, i + mid) << 32 | rh2.get(i, i + mid);
                    find |= mp.getOrDefault(h, i) <= i - mid;
                    if (!mp.containsKey(h)) {
                        mp.put(h, i);
                    }
                }
//            dump(mid, mp);
                if (find) low = mid;
                else high = mid;
            }
            out.println(low);
        }

        class RollingHash {
            final int mod = (int) 1e9 + 7;
            long[] hash;
            long[] pow;

            RollingHash(char[] s, int radix) {
                hash = new long[s.length + 1];
                pow = new long[s.length + 1];

                pow[0] = 1;

                for (int i = 0; i < s.length; i++) {
                    pow[i + 1] = pow[i] * radix % mod;
                    hash[i + 1] = (hash[i] * radix + s[i]) % mod;
                }
            }

            long get(int l, int r) {
                return ((hash[r] - hash[l] * pow[r - l]) % mod + mod) % mod;
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

