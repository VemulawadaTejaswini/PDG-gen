import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.TreeSet;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/D1";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int H = in.nextInt();
        int W = in.nextInt();
        String[] map = in.nextStringArray(H);
        /*
        TreeSet<Integer>[] rows = new TreeSet[H];
        TreeSet<Integer>[] cols = new TreeSet[W];
        for (int i = 0; i < H; i++) {
            rows[i] = new TreeSet<>();
            rows[i].add(-1);
            rows[i].add(W);
        }

        for (int i = 0; i < W; i++) {
            cols[i] = new TreeSet<>();
            cols[i].add(-1);
            cols[i].add(H);
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i].charAt(j) == '#') {
                    rows[i].add(j);
                    cols[j].add(i);
                }
            }
        }
        int[][] _rows = new int[H][];
        int[][] _cols = new int[W][];
        for (int i = 0; i < H; i++) {
            _rows[i] = new int[rows[i].size()];
            int ptr = 0;
            for (int x : rows[i]) {
                _rows[i][ptr++] = x;
            }
        }
        for (int j = 0; j < W; j++) {
            _cols[j] = new int[cols[j].size()];
            int ptr = 0;
            for (int x : cols[j]) {
                _cols[j][ptr++] = x;
            }
        }

        int res = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i].charAt(j) == '#') continue;

                int h = binSearch(_rows[i], j);
                int w = binSearch(_cols[j], i);
                res = Math.max(res, (_rows[i][h+1] - _rows[i][h] - 1) + (_cols[j][w+1] - _cols[j][w] - 1) - 1);
            }
        }
        */
        int res = 0;
        int[][] left = new int[H][W];
        int[][] right = new int[H][W];
        int[][] up = new int[H][W];
        int[][] down = new int[H][W];

        {
            int[] a = new int[W];
            Arrays.fill(a, -1);
            for (int i = 0; i < H; i++) {
                int cur = -1;
                for (int j = 0; j < W; j++) {
                    if (map[i].charAt(j) == '#') {
                        cur = j;
                        a[j] = i;
                    } else {
                        left[i][j] = cur;
                        up[i][j] = a[j];
                    }
                }
            }
        }
        {
            int[] a = new int[W];
            Arrays.fill(a, W);
            for (int i = H - 1; i >= 0; i--) {
                int cur = W;
                for (int j = W - 1; j >= 0; j--) {
                    if (map[i].charAt(j) == '#') {
                        cur = j;
                        a[j] = i;
                    } else {
                        right[i][j] = cur;
                        down[i][j] = a[j];
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i].charAt(j) == '.')
                    res = Math.max(res, right[i][j] - left[i][j] - 1 + down[i][j] - up[i][j] - 1 - 1);
            }
        }
        System.out.println(res);
    }

    int binSearch(int[] a, int v) {
        int lo = 0, hi = a.length;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (a[mid] < v) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    /* MOD_CALCULATION */
    int MOD = 1_000_000_007;
    long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    long MULT(long a, long b) {
        return (a * b) % MOD;
    }

    long POW(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = MULT(res, a);
            a = MULT(a, a);
        }

        return res;
    }

    long DIV(long a, long b) {
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
