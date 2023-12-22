import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Random;
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
        int d;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            d = in.nextInt();

            if (d > 30) throw new RuntimeException();

            int[][] cnt = new int[d][d];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt() % d;
                int y = in.nextInt() % d;
                cnt[y][x]++;
            }

            long ans = Long.MAX_VALUE;
//        dump(cnt1);
            if (d <= 30) {
                int low = 0, high = 1_000_000_000;
                LOOP2:
                while (high - low > 1) {
                    int mid = (low + high) >>> 1;
                    for (int cy = 0; cy < d; cy++) {
                        for (int cx = 0; cx < d; cx++) {
                            boolean ok = true;
                            LOOP:
                            for (int dy = 0; dy < d; dy++) {
                                for (int dx = 0; dx < d; dx++) {
                                    int x = (dx - cx + d) % d;
                                    int y = (dy - cy + d) % d;
                                    if (cnt[dy][dx] == 0) {
                                        continue;
                                    }
                                    if (mid < x || mid < y) {
                                        ok = false;
                                        break LOOP;
                                    }
                                    long xx = (mid - x) / d + 1;
                                    long yy = (mid - y) / d + 1;
//                            dump(mid, cx, cy, x, y, xx, yy, d);
                                    if (cnt[dy][dx] > xx * yy) {
                                        ok = false;
                                        break LOOP;
                                    }
                                }
                            }
                            if (ok) {
                                high = mid;
                                continue LOOP2;
                            }
                        }
                    }
                    low = mid;
                }
                ans = high;
            } else {
                long cur = System.currentTimeMillis();
                Random random = new Random();
                boolean[][] used = new boolean[d][d];
                while (System.currentTimeMillis() - cur < 2200) {
                    int cx = random.nextInt(d);
                    int cy = random.nextInt(d);
                    if (used[cy][cx]) continue;
                    used[cy][cx] = true;
                    int low = 0, high = 1_000_000_000;
                    LOOP2:
                    while (high - low > 1) {
                        int mid = (low + high) >>> 1;
                        boolean ok = true;
                        LOOP:
                        for (int dy = 0; dy < d; dy++) {
                            for (int dx = 0; dx < d; dx++) {
                                int x = (dx - cx + d) % d;
                                int y = (dy - cy + d) % d;
                                if (cnt[dy][dx] == 0) {
                                    continue;
                                }
                                if (mid < x || mid < y) {
                                    ok = false;
                                    break LOOP;
                                }
                                long xx = (mid - x) / d + 1;
                                long yy = (mid - y) / d + 1;
//                            dump(mid, cx, cy, x, y, xx, yy, d);
                                if (cnt[dy][dx] > xx * yy) {
                                    ok = false;
                                    break LOOP;
                                }
                            }
                        }
                        if (ok) {
                            high = mid;
                            continue LOOP2;
                        }
                        low = mid;
                    }
                    ans = Math.min(ans, high);
                }
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

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

