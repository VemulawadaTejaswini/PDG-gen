// package other2017.codefestival2017.quala;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    static InputReader in;
    static PrintWriter out;
    public static void main(String[] args) {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);

        int h = in.nextInt();
        int w = in.nextInt();
        int D = in.nextInt();

        int[][] color = new int[h][w];
        if (D % 2 == 1) {
            for (int i = 0; i < h ; i++) {
                for (int j = 0; j < w ; j++) {
                    color[i][j] = (i+j)%2;
                }
            }
            printPaint(color);
            return;
        }

        if (D == 2) {
            for (int i = 0; i < h; i++) {
                int chead = ((i/2)*2)%4;
                for (int j = 0; j < w ; j++) {
                    color[i][j] = (chead+j)%4;
                }
            }
            printPaint(color);
            return;
        }

        int[] dx = {D-1, D-2};
        int[] dy = {-1, 2};

        for (int i = 0; i < h ; i++) {
            Arrays.fill(color[i], -1);
        }


        for (int i = 0; i < h ; i++) {
            int baseY = i * dy[1];
            int baseX = -1 + i * dx[1];
            int chead = ((i%2)*2)%4;
            // up
            for (int j = 0 ; ; j++) {
                int y = baseY + dy[0] * j;
                int x = baseX + dx[0] * j;
                int ct = fillBar(color, y, x, D, (chead+j)%4);
                if (ct == 0) {
                    break;
                }
            }
            for (int j = 1 ;; j++) {
                int y = baseY - dy[0] * j;
                int x = baseX - dx[0] * j;
                int ct = fillBar(color, y, x, D, (chead+4-j%4)%4);
                if (ct == 0) {
                    break;
                }
            }
        }

        printPaint(color);
    }

    static int fillBar(int[][] a, int y, int x, int bar, int c) {
        int filled = 0;
        for (int i = -1 ; i <= 1; i++) {
            for (int j = 0; j < bar ; j++) {
                if (Math.abs(i) == 1 && (j == 0 || j == bar-1)) {
                    continue;
                }
                int Y = y + i;
                int X = x + j;
                if (Y < 0 || X < 0 || Y >= a.length || X >= a[0].length) {
                    continue;
                }
                if (a[Y][X] != -1) {
                    printPaint(a);
                    throw new RuntimeException("mispaint!!");
                }
                a[Y][X] = c;
                filled++;
            }
        }
        return filled;
    }

    static void printPaint(int[][] a) {
        char[] tbl = "RYGB".toCharArray();
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length ; j++) {
                out.print(tbl[a[i][j]]);
            }
            out.println();
        }
        out.flush();
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}