import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Set;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F3";

    FastScanner in;
    PrintWriter out;

    class UnionFindTree {
        int[] parent;
        int[] size;

        public UnionFindTree(int n) {
            parent = new int[n];
            size = new int[n];
            init();
        }

        public void init() {
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x) {
            if (parent[x] == x) return x;
            return parent[x] = find(parent[x]);
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

        public void unite(int x, int y) {
            int xx = find(x), yy = find(y);
            if (xx == yy) return;
            parent[xx] = yy;
            size[yy] += size[xx];
        }

        public int getSize(int x) {
            return size[find(x)];
        }

        public int getSize(int x, int y) {
            int xx = find(x), yy = find(y);
            if (xx == yy)
                return size[xx];
            else
                return size[xx] + size[yy];
        }

        public String toString() {
            String res = "";
            res += Arrays.toString(parent) + "\n";
            res += Arrays.toString(size);
            return res;
        }
    }

    class Point {
        final int id;
        final int x;
        final int y;

        public Point(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }

    public void solve() {
        int n = in.nextInt();
        Point[] ps = new Point[n];
        Point[] psx = new Point[n];
        Point[] psy = new Point[n];
        for (int i = 0; i < n; i++) {
            final Point p = new Point(i, in.nextInt(), in.nextInt());
            ps[i] = p;
            psx[i] = p;
            psy[i] = p;
        }
        Arrays.sort(psx, Comparator.comparingInt(p -> p.x));
        Arrays.sort(psy, Comparator.comparingInt(p -> p.y));

        UnionFindTree uft = new UnionFindTree(n);
        for (int i = 0; i < n - 1; i++) {
            if (psx[i].x == psx[i+1].x) {
                uft.unite(psx[i].id, psx[i+1].id);
            }
            if (psy[i].y == psy[i+1].y) {
                uft.unite(psy[i].id, psy[i+1].id);
            }
        }

        Map<Integer, Set<Integer>> xs = new HashMap<>();
        Map<Integer, Set<Integer>> ys = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int r = uft.find(i);
            xs.computeIfAbsent(r, k -> new HashSet<>()).add(ps[i].x);
            ys.computeIfAbsent(r, k -> new HashSet<>()).add(ps[i].y);
        }
        long res = 0;
        for (int k : xs.keySet()) {
            if (!ys.containsKey(k)) {
                throw new RuntimeException();
            }
            res += (long) xs.get(k).size() * ys.get(k).size();
        }
        System.out.println(res - n);
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /* MOD_CALCULATION */
    static long MOD = 1000000007L;
    static long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    static long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    static long MULT(long a, long b) {
        return (a * b) % MOD;
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
