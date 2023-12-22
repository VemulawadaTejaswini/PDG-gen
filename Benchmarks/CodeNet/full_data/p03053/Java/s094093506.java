import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Stream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.OptionalInt;
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
        ADarkerAndDarker solver = new ADarkerAndDarker();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADarkerAndDarker {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] cs = new char[h][];
            for (int y = 0; y < h; y++) {
                cs[y] = in.nextChars();
            }

            int s = 0, t = 0;
            int[][] dist = new int[h][w];
            int[] que = new int[w * h];
            for (int y = 0; y < h; y++) {
                Arrays.fill(dist[y], 1 << 29);
                for (int x = 0; x < w; x++) {
                    if (cs[y][x] == '#') {
                        que[t++] = y * w + x;
                        dist[y][x] = 0;
                    }
                }
            }
            int[] d = new int[]{1, 0, -1, 0, 1};
            while (s != t) {
                int v = que[s++];
                int x0 = v % w, y0 = v / w;
                for (int i = 0; i < 4; i++) {
                    int x = x0 + d[i], y = y0 + d[i + 1];
                    if (x < 0 || y < 0 || x >= w || y >= h) continue;
                    int dd = dist[y0][x0] + 1;
                    if (dist[y][x] <= dd) continue;
                    dist[y][x] = dd;
                    que[t++] = y * w + x;
                }
            }
            out.println(Arrays.stream(dist).mapToInt(x -> Arrays.stream(x).max().getAsInt()).max().getAsInt());
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

