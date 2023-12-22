import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/D4";

    FastScanner in;
    PrintWriter out;

    class Pair {
        final long v;
        final int p;

        public Pair(long v, int p) {
            this.v = v;
            this.p = p;
        }
    }

    public void solve() {
        int N = in.nextInt();
        long D = in.nextInt();
        long[] A = in.nextLongArray(N);

        Pair[] fromLeft = new Pair[N];
        Pair[] fromRight = new Pair[N];
        for (int i = 0; i < N; i++) {
            fromLeft[i] = new Pair(A[i] + D * i, i);
            fromRight[i] = new Pair(A[i] + D * (N - i - 1), i);
        }
        Arrays.sort(fromLeft, Comparator.comparingLong(p -> p.v));
        Arrays.sort(fromRight, Comparator.comparingLong(p -> p.v));

        int[] r = new int[N];
        for (int i = 0, ptr = 0; i < N - 1; i++) {
            while (fromLeft[ptr].p <= i) ptr++;
            r[i] = fromLeft[ptr].p;
        }
        int[] l = new int[N];
        for (int i = N - 1, ptr = 0; i > 0; i--) {
            while (fromRight[ptr].p >= i) ptr++;
            l[i] = fromRight[ptr].p;
        }

        final PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingLong(e -> e.c));
        /*
        for (int i = 0; i < N; i++) {
            if (i != 0) {
                pq.add(new Edge(i, l[i], A[i] + A[l[i]] + D * Math.abs(i - l[i])));
            }
            if (i != N - 1) {
                pq.add(new Edge(i, r[i], A[i] + A[r[i]] + D * Math.abs(i - r[i])));
            }
        }
*/
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                pq.add(new Edge(i, j, A[i] + A[j] + D * Math.abs(i - j)));
            }
        }
        long res = 0;
        final UnionFindTree uft = new UnionFindTree(N);
        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            if (uft.same(e.u, e.v)) {
                continue;
            }
            res += e.c;
            uft.unite(e.u, e.v);
        }
        for (int i = 0; i < N; i++) {
            if (!uft.same(0, i)) {
                throw new RuntimeException();
            }
        }
        System.out.println(res);
    }

    class Edge {
        final int u;
        final int v;
        final long c;

        public Edge(int u, int v, long c) {
            this.u = u;
            this.v = v;
            this.c = c;
        }
    }

    class UnionFindTree {
        int[] parent;

        public UnionFindTree(int n) {
            parent = new int[n];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
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
        }
    }

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
