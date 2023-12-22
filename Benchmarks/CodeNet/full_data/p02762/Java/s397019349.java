import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashSet;
import java.io.InputStream;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/D4";

    FastScanner in;
    PrintWriter out;

    int n, m, k;
    HashSet<Integer>[] f;
    HashSet<Integer>[] b;

    UnionFindTree uft;
    int[] blockCnt;

    public void solve() {
        n = in.nextInt();
        f = new HashSet[n];
        b = new HashSet[n];
        for (int i = 0; i < n; i++) {
            f[i] = new HashSet<>();
            b[i] = new HashSet<>();
        }
        m = in.nextInt();
        k = in.nextInt();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            f[a].add(b);
            f[b].add(a);
        }
        for (int i = 0; i < k; i++) {
            int c = in.nextInt() - 1;
            int d = in.nextInt() - 1;
            b[c].add(d);
            b[d].add(c);
        }

        uft = new UnionFindTree(n);
        blockCnt = new int[n];

        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, vis);
            }
        }
        for (int u = 0; u < n; u++) {
            for (int vv : b[u]) {
                if (uft.same(u, vv)) {
                    blockCnt[u]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            out.print((uft.getSize(i) - f[i].size() - blockCnt[i] - 1) + " ");
        }
        out.println();
        out.close();
    }

    private void dfs(int u, boolean[] vis) {
        vis[u] = true;
        for (int v : f[u]) {
            if (vis[v]) {
                continue;
            }
            uft.unite(u, v);
            dfs(v, vis);
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

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
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

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
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

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}


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
