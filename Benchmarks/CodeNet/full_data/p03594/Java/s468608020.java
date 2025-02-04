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

    static List<int[]> dists;
    public static void main(String[] args) {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);

        int h = in.nextInt();
        int w = in.nextInt();
        int D = in.nextInt();

        dists = new ArrayList<>();
        for (int i = -h ; i <= h ; i++) {
            for (int j = -w ;  j <= w; j++) {
                int di = Math.abs(i) + Math.abs(j);
                if (di == D) {
                    dists.add(new int[]{i, j});
                }
            }
        }

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

        int[] dx = {D, D/2};
        int[] dy = {0, D/2};

        for (int i = 0; i < h ; i++) {
            Arrays.fill(color[i], -1);
        }

        for (int i = -w-h-10 ; i < w+h+10 ; i++) {
            int baseY = i * dy[1];
            int baseX = -1 + i * dx[1];
            int ii = (i < 0) ? (2-Math.abs(i)%2)%2 : i%2;
            int chead = (ii*2)%4;
            // up
            for (int j = 0 ; j <= w+h ; j++) {
                int y = baseY + dy[0] * j;
                int x = baseX + dx[0] * j;
                fillBar(color, y, x, D, (chead+j)%4);
            }
            for (int j = 1 ; j <= w+h ; j++) {
                int y = baseY - dy[0] * j;
                int x = baseX - dx[0] * j;
                fillBar(color, y, x, D, (chead+4-j%4)%4);
            }
        }

        printPaint(color);
    }

    static int fillBar(int[][] a, int y, int x, int bar, int c) {
        int filled = 0;
        if (y <= -bar || y >= a.length+bar) {
            return 0;
        }
        if (x+bar < 0 || x >=  a[0].length) {
            return 0;
        }

        int dy = bar / 2 - 1;
        for (int i = -dy ; i <= dy ; i++) {
            int count = bar - Math.abs(i) * 2;
            int sx = x + Math.abs(i);
            int Y = y + i;
            for (int j = 0 ; j < count  ; j++) {
                int X = sx + j;
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
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                boolean co = true;
//                for (int[] d : dists) {
//                    int ti = i + d[0];
//                    int tj = j + d[1];
//                    if (ti < 0 || tj < 0 || ti >= a.length || tj >= a[0].length) {
//                        continue;
//                    }
//                    co &= a[i][j] != a[ti][tj];
//                }
//                if (!co) {
//                    a[i][j] = -1;
//                }
//            }
//        }


        char[] tbl = "RYGB".toCharArray();
        // char[] tbl = "#@.-".toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == -1) {
                    throw new RuntimeException("unpainted");
                } else {
                    out.print(tbl[a[i][j]]);
                }
            }
            out.println();
        }
        out.flush();

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