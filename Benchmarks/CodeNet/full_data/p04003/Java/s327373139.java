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
      long to;
      int weight;
      Edge(long to, int weight) {
        this.to = to;
        this.weight = weight;
      }
    }

    private final int INF = (int) 1e9 + 7;

    void solve(FastScanner in, PrintWriter out) {
      TreeMap<Long, ArrayList<Edge>> graph = new TreeMap<>();
      TreeSet<Long> used = new TreeSet<>();
      int N = in.nextInt();
      int M = in.nextInt();
      for (int i = 0; i < M; i++) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        ArrayList<Edge> a0 = graph.get(getId(a, 0));
        if (a0 == null) graph.put(getId(a, 0), a0 = new ArrayList<>());
        ArrayList<Edge> b0 = graph.get(getId(b, 0));
        if (b0 == null) graph.put(getId(b, 0), b0 = new ArrayList<>());

        ArrayList<Edge> ac = graph.get(getId(a, c));
        if (ac == null) {
          graph.put(getId(a, c), ac = new ArrayList<>());
          a0.add(new Edge(getId(a, c), 1));
          ac.add(new Edge(getId(a, 0), 0));
        }
        ac.add(new Edge(getId(b, c), 0));

        ArrayList<Edge> bc = graph.get(getId(b, c));
        if (bc == null) {
          graph.put(getId(b, c), bc = new ArrayList<>());
          b0.add(new Edge(getId(b, c), 1));
          bc.add(new Edge(getId(b, 0), 0));
        }
        bc.add(new Edge(getId(a, c), 0));
      }

      ArrayDeque<long[]> deque = new ArrayDeque<>();
      deque.add(new long[]{getId(1, 0), 0});
      used.add(getId(1, 0));
      while (!deque.isEmpty()) {
        long[] q = deque.pollFirst();
        long v = q[0];
        long dv = q[1];
        if (v == getId(N, 0)) {
          out.println(dv);
          return;
        }
        ArrayList<Edge> gv = graph.get(v);
        if (gv == null) continue;

        for (Edge edge : gv) {
          if (used.contains(edge.to)) continue;
          if (edge.weight == 0) deque.addFirst(new long[]{edge.to, dv});
          else deque.addLast(new long[]{edge.to, dv + 1});
          used.add(edge.to);
        }
      }
      out.println(-1);
    }

    long getId(int to, int company) {
      return (long) to * INF + company;
    }
  }

  /**
   * ここから下はテンプレートです。
   */
  public static void main(String[] args) {
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