import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/

public class Main {
  private static class Task {
    ArrayList<Edge>[] tree;
    int[][] max;

    void dfs(int v, int p, int start, int curMax) {
      for (Edge edge : tree[v]) {
        if (edge.to == p) continue;
        int nextMax = Math.max(curMax, edge.weight);
        max[start][edge.to] = nextMax;
        dfs(edge.to, v, start, nextMax);
      }
    }

    void solve(FastScanner in, PrintWriter out) throws Exception {
      int N = in.nextInt();
      int M = in.nextInt();

      PriorityQueue<Edge> queue = new PriorityQueue<>();
      for (int i = 0; i < M; i++) {
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        int c = in.nextInt();

        queue.add(new Edge(a, b, c));
      }

      UnionFind uf = new UnionFind(N);
      tree = new ArrayList[N];
      for (int i = 0; i < N; i++) {
        tree[i] = new ArrayList<>();
      }
      long total = 0;
      while (!queue.isEmpty()) {
        Edge edge = queue.poll();
        if (uf.isSame(edge.from, edge.to)) continue;
        total += edge.weight;
        tree[edge.from].add(edge);
        tree[edge.to].add(new Edge(edge.to, edge.from, edge.weight));
        uf.unite(edge.from, edge.to);
      }

      max = new int[N][N];
      for (int i = 0; i < N; i++) {
        dfs(i, -1, i, 0);
      }

      int Q = in.nextInt();
      for (int i = 0; i < Q; i++) {
        int s = in.nextInt() - 1;
        int t = in.nextInt() - 1;
        out.println(total - max[s][t]);
      }

    }

    class Edge implements Comparable<Edge> {
      int from, to, weight;
      Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
      }
      @Override
      public int compareTo(Edge o) {
        return this.weight - o.weight;
      }
    }

    class UnionFind {
      // par[i]：データiが属する木の親の番号。i == par[i]のとき、データiは木の根ノードである
      private int[] par;
      // sizes[i]：根ノードiの木に含まれるデータの数。iが根ノードでない場合は無意味な値となる
      private int[] sizes;

      // 木の数
      private int size;

      UnionFind(int n) {
        par = new int[n];
        sizes = new int[n];
        size = n;
        Arrays.fill(sizes, 1);
        // 最初は全てのデータiがグループiに存在するものとして初期化
        for (int i = 0; i < n; i++) par[i] = i;
      }

      /**
       * データxが属する木の根を得る
       *
       * @param x
       * @return
       */
      int find(int x) {
        if (x == par[x]) return x;
        return par[x] = find(par[x]);  // 根を張り替えながら再帰的に根ノードを探す
      }

      /**
       * 2つのデータx, yが属する木をマージする。
       * マージが必要なら true を返す
       *
       * @param x
       * @param y
       * @return
       */
      boolean unite(int x, int y) {
        // データの根ノードを得る
        x = find(x);
        y = find(y);

        // 既に同じ木に属しているならマージしない
        if (x == y) return false;

        // xの木がyの木より大きくなるようにする
        if (sizes[x] < sizes[y]) {
          int tx = x;
          x = y;
          y = tx;
        }

        // xがyの親になるように連結する
        par[y] = x;
        sizes[x] += sizes[y];
        sizes[y] = 0;  // sizes[y]は無意味な値となるので0を入れておいてもよい

        size--;
        return true;
      }

      /**
       * 2つのデータx, yが属する木が同じならtrueを返す
       *
       * @param x
       * @param y
       * @return
       */
      boolean isSame(int x, int y) {
        return find(x) == find(y);
      }

      /**
       * データxが含まれる木の大きさを返す
       *
       * @param x
       * @return
       */
      int partialSizeOf(int x) {
        return sizes[find(x)];
      }

      /**
       * 木の数を返す
       *
       * @return
       */
      int size() {
        return size;
      }
    }
  }

  /**
   * ここから下はテンプレートです。
   */
  public static void main(String[] args) throws Exception {
    OutputStream outputStream = System.out;
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(outputStream);
    Task solver = new Task();
    solver.solve(in, out);
    out.close();
  }
  private static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
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

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) array[i] = nextInt();
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) array[i] = nextLong();
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) array[i] = next();
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) array[i] = next().toCharArray();
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}