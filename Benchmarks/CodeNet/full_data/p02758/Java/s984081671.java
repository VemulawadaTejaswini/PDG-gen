import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.util.Comparator;
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
        FRemovingRobots solver = new FRemovingRobots();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRemovingRobots {
        static final int mod = 998244353;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            TreeMap<Integer, Integer> mp = new TreeMap<>();
            int[][] robots = new int[n][];
            for (int i = 0; i < n; i++) {
                robots[i] = in.nextIntArray(2);
            }
            Arrays.sort(robots, Comparator.comparingInt(r -> r[0]));
            for (int i = 0; i < n; i++) {
                mp.put(robots[i][0], i);
            }
            long[] dp = new long[n + 1];
            dp[n] = 1;
            Seg2 seg = new Seg2(n);
            for (int i = 0; i < n; i++) {
                seg.update(i, i);
            }
            for (int i = n - 1; i >= 0; i--) {
                int j = seg.get(i, mp.lowerEntry(robots[i][0] + robots[i][1]).getValue() + 1);
                seg.update(i, j);
                dp[i] = (dp[i + 1] + dp[j + 1]) % mod;
            }
            out.println(dp[0]);
        }

        class Seg2 {
            final int n;
            final int[] seg;

            public Seg2(final int n) {
                this.n = Integer.highestOneBit(n) << 1;
                seg = new int[this.n << 1];
            }

            int get(int l, int r) {
                return get(l, r, 0, 0, n);
            }

            int get(int l, int r, int k, int curL, int curR) {
                if (curR <= l || curL >= r) {
                    return 0;
                }
                if (l <= curL && curR <= r) {
                    return seg[k];
                }
                final int curM = (curL + curR) / 2;
                return Math.max(
                        get(l, r, 2 * k + 1, curL, curM),
                        get(l, r, 2 * k + 2, curM, curR));
            }

            void update(int i, int v) {
                i += n - 1;
                seg[i] = v;
                while (i != 0) {
                    i = (i - 1) / 2;
                    seg[i] = Math.max(seg[2 * i + 1], seg[2 * i + 2]);
                }
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

