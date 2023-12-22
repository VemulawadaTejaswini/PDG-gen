import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        EGolf solver = new EGolf();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGolf {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int k = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int xx = x + y;
            int yy = x - y;
            x = xx;
            y = yy;

            int sx = x >= 0 ? 1 : -1;
            int sy = y >= 0 ? 1 : -1;
            x = Math.abs(x);
            y = Math.abs(y);

            List<int[]> ans = new ArrayList<>();
            if (k % 2 == 0 && (x % 2 != 0 || y % 2 != 0)) {
                out.println("-1");
                return;
            }

            ans.add(new int[]{x, y});

            if (x < k && y < k) {
                if ((k - x % k) % 2 == k % 2) {
                    x += k - x % k;
                    y -= k;
                } else if ((k - y % k) % 2 == k % 2) {
                    y += k - y % k;
                    y -= k;
                } else {
                    x += k;
                    y += 1;
                    ans.add(new int[]{x, y});
                    x -= k;
                    y += k - y % k;
                }
            } else if (x > y) {
                x -= x % k;
                y -= k;
            } else {
                x -= k;
                y -= y % k;
            }

            ans.add(new int[]{x, y});
            while (x > k || y > k) {
                if (x < 0) x += k;
                else x -= k;
                if (y < 0) y += k;
                else y -= k;
                ans.add(new int[]{x, y});
            }

            ans.add(new int[]{0, 0});

//        for (int[] xs : ans) dump(xs);

            out.println(ans.size() - 1);
            int curX = 0, curY = 0;
            for (int i = ans.size() - 2; i >= 0; i--) {
                int x1 = (sx * ans.get(i)[0] + sy * ans.get(i)[1]) / 2;
                int y1 = (sx * ans.get(i)[0] - sy * ans.get(i)[1]) / 2;
                int x2 = (sx * ans.get(i + 1)[0] + sy * ans.get(i + 1)[1]) / 2;
                int y2 = (sx * ans.get(i + 1)[0] - sy * ans.get(i + 1)[1]) / 2;

                curX += x1 - x2;
                curY += y1 - y2;
                out.println(curX + " " + curY);
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

