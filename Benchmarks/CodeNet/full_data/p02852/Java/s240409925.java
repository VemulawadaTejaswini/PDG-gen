import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
        FSugoroku solver = new FSugoroku();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSugoroku {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            char[] s = in.nextChars();
            Seg2 seg = new Seg2(n + 100);
            seg.update(n, 0L << 32 | n);
            for (int i = n - 1; i >= 0; i--) {
                if (s[i] == '1') continue;
                long v = seg.get(i + 1, i + m + 1);
                if (v == Long.MAX_VALUE) continue;
                v = (v + (1L << 32)) & ~0xFFFFFFFFL;
                seg.update(i, v | i);
            }
            if (seg.get(0, 1) == Long.MAX_VALUE) {
                out.println(-1);
                return;
            }
            List<Integer> ans = new ArrayList<>();
            for (int i = 0, prev = 0; ; ) {
                long v = seg.get(i + 1, i + m + 1);
                if (i != 0)
                    ans.add(i - prev);
                if (i == n) break;
                prev = i;
                i = (int) v;
            }

            printList(out, ans);
        }

        static void printList(PrintWriter out, List<?> p) {
            for (int i = 0; i < p.size(); i++) {
                out.print(p.get(i) + (i == p.size() - 1 ? "\n" : " "));
            }
        }

        class Seg2 {
            final int n;
            final long[] seg;

            public Seg2(final int n) {
                this.n = Integer.highestOneBit(n) << 1;
                seg = new long[this.n << 1];
                Arrays.fill(seg, Long.MAX_VALUE);
            }

            long get(int l, int r) {
                return get(l, r, 0, 0, n);
            }

            long get(int l, int r, int k, int curL, int curR) {
                if (curR <= l || curL >= r) {
                    return Long.MAX_VALUE;
                }
                if (l <= curL && curR <= r) {
                    return seg[k];
                }
                final int curM = (curL + curR) / 2;
                return Math.min(
                        get(l, r, 2 * k + 1, curL, curM),
                        get(l, r, 2 * k + 2, curM, curR));
            }

            void update(int i, long v) {
                i += n - 1;
                seg[i] = v;
                while (i != 0) {
                    i = (i - 1) / 2;
                    seg[i] = Math.min(seg[2 * i + 1], seg[2 * i + 2]);
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

