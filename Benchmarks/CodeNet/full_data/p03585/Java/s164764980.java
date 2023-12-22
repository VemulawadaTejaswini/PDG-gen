// package other2017.tenka2017;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long[][] lines = new long[n][3];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 3 ; j++) {
                lines[i][j] = in.nextInt();
            }
        }
        ys = new double[n][2];
        yidx = new int[n];


        double[][] xlines = new double[n][3];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 3 ; j++) {
                xlines[i][j] = lines[i][j];
            }
        }
        double x = solve(xlines);

        double[][] ylines = new double[n][3];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 2 ; j++) {
                ylines[i][1-j] = lines[i][j];
            }
            ylines[i][2] = lines[i][2];
        }
        double y = solve(ylines);

        out.println(String.format("%.11f %.11f", x, y));
        out.flush();
    }

    static double solve(double[][] lines) {
        int n = lines.length;

        Arrays.sort(lines, (a, b) -> -Double.compare(-a[0] / a[1], -b[0] / b[1]));

        int pair = n * (n - 1) / 2;
        int want = (pair + 1) / 2;

        double minX = -1e12;
        double maxX = 1e12;
        for (int cur = 0; cur < 100; cur++) {
            double med = (minX + maxX) / 2;
            if (doitX(lines, med) < want) {
                minX = med;
            } else {
                maxX = med;
            }
        }
        return maxX;
    }

    static double[][] ys;
    static int[] yidx;
    static FenwickTree fen = new FenwickTree(100000);

    private static int doitX(double[][] lines, double med) {
        int n = lines.length;
        for (int i = 0; i < n ; i++) {
            ys[i][0] = i;
            ys[i][1] = (lines[i][2] - lines[i][0] * med) / (1.0d * lines[i][1]);
        }

        Arrays.sort(ys, (a, b) -> Double.compare(a[1], b[1]));

        int yn = 1;
        for (int i = 0 ; i < n ; ) {
            int j = i;
            while (j < n && Double.compare(ys[i][1], ys[j][1]) == 0) {
                yidx[(int)ys[j][0]] = yn;
                j++;
            }
            yn++;
            i = j;
        }

        Arrays.fill(fen.data, 0);

        int sum = 0;
        for (int i = 0; i < n ; i++) {
            int myY = yidx[i];
            sum += fen.range(myY, 99999);
            fen.add(myY, 1);
        }
        return sum;
    }

    public static class FenwickTree {
        int N;
        int[] data;

        public FenwickTree(int n) {
            N = n;
            data = new int[n + 1];
        }

        public int sum(int i) {
            int s = 0;
            while (i > 0) {
                s += data[i];
                i -= i & (-i);
            }
            return s;
        }

        public int range(int i, int j) {
            return sum(j) - sum(i - 1);
        }

        public void add(int i, int x) {
            while (i <= N) {
                data[i] += x;
                i += i & (-i);
            }
        }
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