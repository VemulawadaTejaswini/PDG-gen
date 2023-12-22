import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
 
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
    class Edge {
      int to;
      long w;
      Edge(int to, long w) {
        this.to = to;
        this.w = w;
      }
    }

    void solve(FastScanner in, PrintWriter out) throws Exception {
      int R = in.nextInt();
      int C = in.nextInt();
      int N = in.nextInt();

      PriorityQueue<int[]>[] rows = new PriorityQueue[R];
      for (int i = 0; i < R; i++) {
        rows[i] = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[0], o2[0]));
      }
      PriorityQueue<int[]>[] columns = new PriorityQueue[C];
      for (int i = 0; i < C; i++) {
        columns[i] = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[0], o2[0]));
      }

      int[][] rca = new int[N][3];
      long[] minR = new long[R];
      Arrays.fill(minR, Integer.MAX_VALUE);
      long[] minC = new long[C];
      Arrays.fill(minC, Integer.MAX_VALUE);
      for (int i = 0; i < N; i++) {
        int r = in.nextInt() - 1;
        int c = in.nextInt() - 1;
        int a = in.nextInt();
        rca[i][0] = r;
        rca[i][1] = c;
        rca[i][2] = a;

        rows[r].add(new int[]{c, a});
        columns[c].add(new int[]{r, a});

        minR[r] = Math.min(minR[r], a);
        minC[r] = Math.min(minC[c], a);
      }

      int startR = -1, startC = -1;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < N; i++) {
        if (min > rca[i][2]) {
          min = rca[i][2];
          startR = rca[i][0];
          startC = rca[i][1];
        }
      }

      if (!check(columns, R, minR) || !check(rows, C, minC)) {
        out.println("No");
      } else {
        out.println("Yes");
      }
    }

    boolean check(PriorityQueue<int[]>[] columns, int R, long[] minR) {
      ArrayList<Edge>[] graph = new ArrayList[R];
      for (int r = 0; r < R; r++) {
        graph[r] = new ArrayList<>();
      }
      for (PriorityQueue<int[]> q : columns) {
        if (q.size() < 2) continue;
        int prevR = q.peek()[0];
        int prevA = q.peek()[1];
        q.poll();
        while (!q.isEmpty()) {
          int r = q.peek()[0];
          int a = q.peek()[1];
          q.poll();
          graph[prevR].add(new Edge(r, a - prevA));
          graph[r].add(new Edge(prevR, prevA - a));
        }
      }

      long[] dist = new long[R];
      Arrays.fill(dist, Long.MAX_VALUE);
      ArrayDeque<Integer> deque = new ArrayDeque<>();
      for (int start = 0; start < R; start++) {
        if (dist[start] != Long.MAX_VALUE) continue;
        deque.add(start);
        dist[start] = minR[start];
        while (!deque.isEmpty()) {
          int v = deque.poll();
          for (Edge edge : graph[v]) {
            if (dist[edge.to] == Long.MAX_VALUE) {
              dist[edge.to] = dist[v] + edge.w;
              deque.add(edge.to);
            }
            if (dist[edge.to] != dist[v] + edge.w) return false;
            if (dist[edge.to] < 0) return false;
          }
        }
      }
      return true;
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