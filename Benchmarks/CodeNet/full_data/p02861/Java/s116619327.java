import java.text.DecimalFormat;
import java.util.stream.LongStream;

import java.util.stream.IntStream;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AtCoder problem = new AtCoder(sc);
        problem.solve(out);

        out.flush();
    }

}

class AtCoder {

    /* 変数宣言 */
    final int N;
    final Point[] points;

    AtCoder(FastScanner sc) {
        N = sc.nextInt();
        points = new Point[N];
        for (int i = 0; i < points.length; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Point p = new Point(x, y);
            points[i] = p;
        }
    }

    void solve(PrintWriter out) {
        double[][] dis = new double[N][N];
        double disTotal = 0.0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!points[i].equals(points[j])) {
                    // dis[i][j]= calcDis(points[i], points[j]);
                    disTotal += calcDis(points[i], points[j]);
                }
            }
        }
        /*
         * for (int i = 0; i < N; i++) { for (int j = 0; j < N; j++) {
         * out.print(dis[i][j]); } out.println(); }
         */

        out.println(disTotal / N);

    }

    int calcFanc(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    double calcDis(Point from, Point To) {
        double result;
        double dx = from.getX() - To.getX();
        double dy = from.getY() - To.getY();
        result = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return result;
    }
}

// https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
class FastScanner {

    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}