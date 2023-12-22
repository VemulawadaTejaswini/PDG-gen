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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            char[][] res = new char[n][m];

            for (char[] c : res) Arrays.fill(c, '.');
            if (n % 2 == 1 && m % 2 == 1) {
                int aa = a;
                int bb = b;
                for (int i = 0; ; i++) {
                    boolean updated = false;
                    for (int x = i; x < (m - 2 * i) / 2 && a > 0; x++, a--) {
                        if (res[i][2 * x] == '.' && res[i][2 * x + 1] == '.') {
                            res[i][2 * x] = '<';
                            res[i][2 * x + 1] = '>';
                            updated = true;
                        }
                    }
                    for (int y = i; y < (n - 2 * i) / 2 && b > 0; y++, b--) {
                        if (res[2 * y][m - 1 - i] == '.' && res[2 * y + 1][m - 1 - i] == '.') {
                            res[2 * y][m - 1 - i] = '^';
                            res[2 * y + 1][m - 1 - i] = 'v';
                            updated = true;
                        }
                    }
                    for (int x = i; x < (m - 2 * i) / 2 && a > 0; x++, a--) {
                        if (res[n - 1 - i][m - 2 - i - 2 * x] == '.' && res[n - 1 - i][m - 1 - i - 2 * x] == '.') {
                            res[n - 1 - i][m - 2 - i - 2 * x] = '<';
                            res[n - 1 - i][m - 1 - i - 2 * x] = '>';
                            updated = true;
                        }
                    }
                    for (int y = i; y < (n - 2 * i) / 2 && b > 0; y++, b--) {
                        if (res[n - 2 - i - 2 * y][i] == '.' && res[n - 1 - i - 2 * y][i] == '.') {
                            res[n - 2 - i - 2 * y][i] = '^';
                            res[n - 1 - i - 2 * y][i] = 'v';
                            updated = true;
                        }
                    }
                    if (!updated) break;
                }
                if (a <= 0 && b <= 0) {
                    out.println("YES");
                    for (char[] c : res) out.println(new String(c));
                    return;
                }
                a = aa;
                b = bb;
            }
            if (n % 2 == 1) {
                for (int i = 0; i < m / 2 && a > 0; i++, a--) {
                    res[n - 1][2 * i] = '<';
                    res[n - 1][2 * i + 1] = '>';
                }
                n--;
            }
            if (m % 2 == 1) {
                for (int i = 0; i < n / 2 && b > 0; i++, b--) {
                    res[2 * i][m - 1] = '^';
                    res[2 * i + 1][m - 1] = 'v';
                }
                m--;
            }

            for (int y = 0; y < n; y += 2) {
                for (int x = 0; x < m / 2; x++) {
                    if (a > 0) {
                        res[y][2 * x] = '<';
                        res[y][2 * x + 1] = '>';
                        if (a > 1) {
                            res[y + 1][2 * x] = '<';
                            res[y + 1][2 * x + 1] = '>';
                        }
                        a -= 2;
                    } else if (b > 0) {
                        res[y][2 * x] = '^';
                        res[y + 1][2 * x] = 'v';
                        if (b > 1) {
                            res[y][2 * x + 1] = '^';
                            res[y + 1][2 * x + 1] = 'v';
                        }
                        b -= 2;
                    }
                }
            }
            if (a > 0 || b > 0) {
                out.println("NO");
                return;
            }

            out.println("YES");
            for (char[] c : res) out.println(new String(c));
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

