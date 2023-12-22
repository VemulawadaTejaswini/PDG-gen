// package other2016.codefestival2016.grandfinal;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        double[][] xy = new double[3][2];
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 2 ; j++) {
                xy[i][j] = in.nextInt();
            }
        }

        double[] rad = new double[3];
        for (int i = 0; i < 3 ; i++) {
            double cos = corner(xy[i], xy[(i+1)%3], xy[(i+2)%3]);
            rad[i] = Math.acos(cos);
        }

        double[] len = new double[3];
        for (int i = 0; i < 3 ; i++) {
            double dx = xy[(i+1)%3][0] - xy[i][0];
            double dy = xy[(i+1)%3][1] - xy[i][1];
            len[i] = Math.hypot(dx, dy);
        }

        double max = 1e3;
        double min = 0;
        for (int _d = 0 ; _d < 500 ; _d++) {
            double med = (max + min) / 2;
            if (isOK(rad, len, med)) {
                min = med;
            } else {
                max = med;
            }
        }
        out.println(String.format("%.12f", min));
        out.flush();
    }

    private static boolean isOK(double[] rad, double[] len, double R) {
        double dec = R * (1.0 / Math.tan(rad[0] / 2) + 1.0 / Math.tan(rad[1] / 2));
        double rate = (len[0] - dec) / len[0];
        if (dec >= len[0] || rate <= 0) {
            return false;
        }
        double max = 0;
        for (int i = 0; i < len.length; i++) {
            max = Math.max(max, len[i] * rate);
        }
        return max >= R * 2;
    }

    public static double corner(double[] a, double[] b, double[] c) {
        double dx1 = b[0] - a[0];
        double dy1 = b[1] - a[1];
        double dx2 = c[0] - a[0];
        double dy2 = c[1] - a[1];

        double len = Math.hypot(dx1, dy1) * Math.hypot(dx2, dy2);
        double cross = dx1 * dx2 + dy1 * dy2;
        return cross / len;
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