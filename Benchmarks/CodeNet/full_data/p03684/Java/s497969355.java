import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

  private void solve(FastScanner in, PrintWriter out) {
    int N = in.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = in.nextInt();
      y[i] = in.nextInt();
    }

    ArrayList<int[]> tuples = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      tuples.add(new int[]{i, x[i], y[i]});
    }

    tuples.sort((o1, o2) -> {
      if (o1[1] == o2[1]) {
        return o1[2] - o2[2];
      }
      return o1[1] - o2[1];
    });

    PriorityQueue<long[]> queue = new PriorityQueue<>((o1, o2) -> Long.signum(o1[2] - o2[2]));
    for (int t = 1; t < tuples.size(); t++) {
      int[] tuple = tuples.get(t);
      int[] prev = tuples.get(t - 1);
      long dist = Math.min(Math.abs(tuple[2] - prev[2]), Math.abs(tuple[1] - prev[1]));
      queue.add(new long[]{tuple[0], prev[0], dist});
    }

    tuples.sort((o1, o2) -> {
      if (o1[2] == o2[2]) {
        return o1[1] - o2[1];
      }
      return o1[2] - o2[2];
    });

    for (int t = 1; t < tuples.size(); t++) {
      int[] tuple = tuples.get(t);
      int[] prev = tuples.get(t - 1);
      long dist = Math.min(Math.abs(tuple[2] - prev[2]), Math.abs(tuple[1] - prev[1]));
      queue.add(new long[]{tuple[0], prev[0], dist});
    }

    UnionFind uf = new UnionFind(N);

    long ans = 0;
    while (!queue.isEmpty()) {
      long[] edge = queue.poll();
      int v = (int) edge[0];
      int u = (int) edge[1];
      long dist = edge[2];
      if (uf.isSame(v, u)) {
        continue;
      }
      ans += dist;
      uf.unite(u, v);
    }

    out.println(ans);
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
      for (int i = 0; i < n; i++) {
        par[i] = i;
      }
    }

    /**
     * データxが属する木の根を得る
     */
    int find(int x) {
      if (x == par[x]) {
        return x;
      }
      return par[x] = find(par[x]);  // 根を張り替えながら再帰的に根ノードを探す
    }

    /**
     * 2つのデータx, yが属する木をマージする。
     * マージが必要なら true を返す
     */
    boolean unite(int x, int y) {
      // データの根ノードを得る
      x = find(x);
      y = find(y);

      // 既に同じ木に属しているならマージしない
      if (x == y) {
        return false;
      }

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
     */
    boolean isSame(int x, int y) {
      return find(x) == find(y);
    }

    /**
     * データxが含まれる木の大きさを返す
     */
    int partialSizeOf(int x) {
      return sizes[find(x)];
    }

    /**
     * 木の数を返す
     */
    int size() {
      return size;
    }
  }

  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(new FastScanner(), out);
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
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
    }

    boolean hasNext() {
      skipUnprintable();
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

    long nextLong() {
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
      for (int i = 0; i < n; i++) {
        array[i] = nextInt();
      }
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextLong();
      }
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) {
        array[i] = next();
      }
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) {
        array[i] = next().toCharArray();
      }
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
