import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.TreeMap;

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
    TreeMap<Integer, Integer> map = new TreeMap<>();
    boolean solve(int[] a) {
      int N = a.length;

      int d = 0;
      for (int i = 0; i < N; i++) {
        d = Math.max(d, a[i]);
      }
      for (int i = 0; i < N; i++) {
        mapAdd(a[i], 1);
      }

      if (d % 2 == 0) {
        int half = map.firstKey();
        if (!mapAdd(half, -1)) return false;
        for (int i = half + 1; i <= d; i++) {
          if (!mapAdd(i, -2)) return false;
        }

        while (!map.isEmpty()) {
          int min = map.firstKey();
          if (min <= half) return false;
          for (int i = min; i <= d; i++) {
            if (!mapAdd(i, -1)) return false;
          }
        }
      } else {
        int half = map.firstKey() - 1;
        for (int i = half + 1; i <= d; i++) {
          if (!mapAdd(i, -2)) return false;
        }
        while (map.isEmpty()) {
          int min = map.firstKey();
          if (min <= half + 1) return false;
          for (int i = min; i <= d; i++) {
            if (!mapAdd(i, -1)) return false;
          }
        }
      }
      return true;
    }

    boolean mapAdd(int key, int add) {
      if (!map.containsKey(key)) map.put(key, 0);
      int n = map.get(key);
      n += add;
      if (n < 0) return false;
      if (n == 0) map.remove(key);
      else map.put(key, n);
      return true;
    }

    void solve(FastScanner in, PrintWriter out) throws Exception {
      int N = in.nextInt();
      int[] a = in.nextIntArray(N);
      if (solve(a)) {
        out.println("Possible");
      } else {
        out.println("Impossible");
      }
    }

    public static boolean nextPermutation(int[] a) {
      for (int i = a.length - 1; i > 0; --i) {
        if (a[i - 1] < a[i]) {
          int swapIndex = find(a[i - 1], a, i, a.length - 1);
          int temp = a[swapIndex];
          a[swapIndex] = a[i - 1];
          a[i - 1] = temp;
          Arrays.sort(a, i, a.length);
          return true;
        }
      }
      return false;
    }
    private static int find(int dest, int[] a, int s, int e) {
      if (s == e) {
        return s;
      }
      int m = (s + e + 1) / 2;
      return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
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