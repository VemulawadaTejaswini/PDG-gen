import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F4";

    FastScanner in;
    PrintWriter out;

    class Point {
        final long v;
        final char d;

        public Point(long v, char d) {
            this.v = v;
            this.d = d;
        }
    }

    public void solve() {
        int N = in.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] dx = new int[N];
        int[] dy = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            char d = in.next().charAt(0);
            if (d == 'U') {
                dy[i] = 1;
            } else if (d == 'D') {
                dy[i] = -1;
            } else if (d == 'R') {
                dx[i] = 1;
            } else if (d == 'L') {
                dx[i] = -1;
            }
        }
        Set<Long> times = new HashSet<>();
        times.add(0L);
        times.addAll(enumTime(x, dx));
        times.addAll(enumTime(y, dy));
        double res = Double.MAX_VALUE;
        for (long t : times) {
            double tt = t / 2.0;
            double minX = Double.MAX_VALUE, maxX = Double.MIN_NORMAL;
            double minY = Double.MAX_VALUE, maxY = Double.MIN_NORMAL;
            for (int i = 0; i < N; i++) {
                double nx = x[i] + tt * dx[i];
                double ny = y[i] + tt * dy[i];
                minX = Math.min(nx, minX);
                maxX = Math.max(nx, maxX);
                minY = Math.min(ny, minY);
                maxY = Math.max(ny, maxY);
            }
            res = Math.min(res, (maxX - minX) * (maxY - minY));
        }
        System.out.println(res);
    }

    private Set<Long> enumTime(int[] vs, int[] d) {
        int N = vs.length;
        long plusMin = Integer.MAX_VALUE, plusMax = Integer.MIN_VALUE;
        long minusMin = Integer.MAX_VALUE, minusMax = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (d[i] == 1) {
                plusMin = Math.min(plusMin, vs[i]);
                plusMax = Math.max(plusMax, vs[i]);
            } else if (d[i] == -1) {
                minusMin = Math.min(minusMin, vs[i]);
                minusMax = Math.max(minusMax, vs[i]);
            } else {
                min = Math.min(min, vs[i]);
                max = Math.max(max, vs[i]);
            }
        }
        long[] ps = {plusMax, plusMin, minusMax, minusMin, min, max};
        HashSet<Long> result = new HashSet<>();
        for (int i = 0; i < ps.length; i++) {
            for (int j = i + 1; j < ps.length; j++) {
                long dist = Math.abs(ps[i] - ps[j]);
                result.add(dist);
                result.add(dist * 2);
            }
        }
        return result;
    }

    /* MOD_CALCULATION */
    static int MOD = 1_000_000_007;
    static long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    static long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    static long MULT(long a, long b) {
        return ((a % MOD) * (b % MOD)) % MOD;
    }

    static long POW(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = MULT(res, a);
            a = MULT(a, a);
        }

        return res;
    }

    static long DIV(long a, long b) {
        return MULT(a, POW(b, MOD - 2));
    }
    /* end */

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
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

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
