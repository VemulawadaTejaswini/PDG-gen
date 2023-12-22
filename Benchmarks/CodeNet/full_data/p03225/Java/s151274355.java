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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        int[][] coin;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            coin = new int[w + h][w + h];
            for (int y = 0; y < h; y++) {
                char[] line = in.nextChars();
                for (int x = 0; x < w; x++) {
                    if (line[x] == '#') {
                        coin[x + y][x - y + h - 1] = 1;
                    }
                }
            }
            int[][] sum = new int[w + h + 3][w + h + 3];
            for (int y = 1; y < sum.length; y++) {
                for (int x = 1; x < sum[y].length; x++) {
                    sum[y][x] += sum[y][x - 1] + (y <= coin.length && x <= coin[0].length ? coin[y - 1][x - 1] : 0);
                }
            }
            for (int x = 0; x < sum[0].length; x++) {
                for (int y = 1; y < sum.length; y++) {
                    sum[y][x] += sum[y - 1][x];
                }
            }
            long ans = 0;
            for (int y = 0; y < coin.length; y++) {
                for (int x = 0; x < coin[y].length; x++)
                    if (coin[y][x] == 1) {
                        for (int d = 1; d <= 600; d++) {
                            if (x + d < coin[y].length && coin[y][x + d] == 1) {
                                ans += sumComb(sum, x, y - d, x + d, y - d);
                                ans += sumComb(sum, x, y + d, x + d, y + d);
                            }
                            if (y + d < coin.length && coin[y + d][x] == 1) {
                                ans += sumComb(sum, x - d, y, x - d, y + d);
                                ans += sumComb(sum, x + d, y, x + d, y + d);
                            }
                            if (x + d < coin[y].length && coin[y][x + d] == 1) {
                                if (y + d < coin.length && coin[y + d][x] == 1) {
                                    ans--;
                                }
                                if (y - d >= 0 && coin[y - d][x] == 1) {
                                    ans--;
                                }
                            }
                            if (x - d >= 0 && coin[y][x - d] == 1) {
                                if (y + d < coin.length && coin[y + d][x] == 1) {
                                    ans--;
                                }
                                if (y - d >= 0 && coin[y - d][x] == 1) {
                                    ans--;
                                }
                            }
                        }
                    }
            }
            out.println(ans);
        }

        long sumComb(int[][] sum, int x1, int y1, int x2, int y2) {
//        int cnt1 = 0;
//        for (int y = y1; y <= y2; y++) {
//            for (int x = x1; x <= x2; x++) {
//                if (x >= 0 && x < coin[0].length && y >= 0 && y < coin.length) {
//                    cnt1 += coin[y][x];
//                }
//            }
//        }
//        return cnt;


            x2++;
            y2++;
            x1 = Math.min(sum[0].length - 1, Math.max(x1, 0));
            x2 = Math.min(sum[0].length - 1, Math.max(x2, 0));
            y1 = Math.min(sum.length - 1, Math.max(y1, 0));
            y2 = Math.min(sum.length - 1, Math.max(y2, 0));
            long cnt = sum[y2][x2] - sum[y1][x2] - sum[y2][x1] + sum[y1][x1];
//        dump(x1, y1, x2, y2, cnt1, cnt);
            return cnt;
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

