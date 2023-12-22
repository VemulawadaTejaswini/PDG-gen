import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {


  class State implements Comparable<State> {

    final int i, j;
    int breaking;
    int magic;

    State(int i, int j, int breaking, int magic) {
      this.i = i;
      this.j = j;
      this.breaking = breaking;
      this.magic = magic;
    }

    @Override
    public int compareTo(State o) {
      return this.magic - o.magic;
    }
  }

  private final int[] Di = new int[]{-1, 1, 0, 0};
  private final int[] Dj = new int[]{0, 0, -1, 1};
  private final int INF = 1000000;

  private int[][] firstBfs(int si, int sj, char[][] maze) {
    int H = maze.length;
    int W = maze[0].length;
    int[][] dist = new int[H][W];
    for (int[] d : dist) {
      Arrays.fill(d, INF);
    }

    dist[si][sj] = 0;
    ArrayDeque<int[]> deque = new ArrayDeque<>();
    deque.add(new int[]{si, sj});
    while (!deque.isEmpty()) {
      int[] q = deque.poll();
      int i = q[0];
      int j = q[1];
      for (int d = 0; d < 4; d++) {
        int ni = i + Di[d];
        int nj = j + Dj[d];
        if (maze[ni][nj] != '#' && dist[ni][nj] > dist[i][j] + 1) {
          dist[ni][nj] = dist[i][j] + 1;
        }
      }
    }
    return dist;
  }

  private void solve(FastScanner in, PrintWriter out) {
    int H = in.nextInt();
    int W = in.nextInt();
    int K = in.nextInt();
    char[][] maze = new char[H][];
    for (int i = 0; i < H; i++) {
      maze[i] = in.next().toCharArray();
    }

    int si = -1, sj = -1;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (maze[i][j] == 'S') {
          si = i;
          sj = j;
        }
      }
    }

    if (si == 0 || si == H - 1 || sj == 0 || sj == W - 1) {
      out.println(0);
      return;
    }

    int[][] dist = new int[H][W];
    for (int[] d : dist) {
      Arrays.fill(d, INF);
    }

    int[][] first = firstBfs(si, sj, maze);

    // [i, j, dist]
    PriorityQueue<State> queue = new PriorityQueue<>();
    for (int h = 0; h < H; h++) {
      for (int w = 0; w < W; w++) {
        if (first[h][w] <= K) {
          if (h == 0 || h == H - 1 || w == 0 || w == W - 1) {
            out.println(1);
            return;
          }

          dist[h][w] = 1;
          queue.add(new State(h, w, K, 2));
        }
      }
    }

    while (!queue.isEmpty()) {
      State state = queue.poll();
      int breakable = state.breaking;

      if (state.i == 0 || state.i == H - 1 || state.j == 0 || state.j == W - 1) {
        out.println(state.magic);
        return;
      }

      if (breakable == 0) {
        state.magic++;
        state.breaking += K;
        continue;
      }

      for (int d = 0; d < 4; d++) {
        int ni = state.i + Di[d];
        int nj = state.j + Dj[d];

        if (dist[ni][nj] > state.magic) {
          dist[ni][nj] = state.magic;
          queue.add(new State(ni, nj, breakable - 1, state.magic));
        }
      }
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
