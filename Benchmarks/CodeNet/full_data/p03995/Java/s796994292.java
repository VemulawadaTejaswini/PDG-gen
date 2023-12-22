import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
    final long MOD = (long) (1e9 + 7);
    TreeMap<Long, Long> map = new TreeMap<>();
    TreeMap<Long, Long> cDiff = new TreeMap<>();

    //r[i+1]=r[i]+diff
    TreeMap<Long, Long> rDiff = new TreeMap<>();

    int R, C, N;

    void solve(FastScanner in, PrintWriter out) throws Exception {
      R = in.nextInt();
      C = in.nextInt();
      N = in.nextInt();
      int[][] rca = new int[N][3];
      for (int i = 0; i < N; i++) {
        int r = in.nextInt();
        int c = in.nextInt();
        int a = in.nextInt();
        rca[i][0] = r;
        rca[i][1] = c;
        rca[i][2] = a;
        map.put((long) r * MOD + c, (long) a);
      }
      if (solve(rca)) {
        out.println("Yes");
      } else {
        out.println("No");
      }
    }

    boolean processR(long r, long c, long a, boolean up) {
      if (up) {
        Long v = get(r - 1, c);
        if (v == null) return true;
        long diff = a - v;
        Long d = rDiff.get(r - 1);
        if (d == null) {
          rDiff.put(r - 1, diff);
          return true;
        }
        return d == diff;
      } else {
        Long v = get(r + 1, c);
        if (v == null) return true;
        long diff = v - a;
        Long d = rDiff.get(r);
        if (d == null) {
          rDiff.put(r, diff);
          return true;
        }
        return d == diff;
      }
    }

    boolean processC(long r, long c, long a, boolean left) {
      if (left) {
        Long v = get(r, c - 1);
        if (v == null) return true;
        long diff = a - v;
        Long d = cDiff.get(c - 1);
        if (d == null) {
          cDiff.put(c - 1, diff);
          return true;
        }
        return d == diff;
      } else {
        Long v = get(r, c + 1);
        if (v == null) return true;
        long diff = v - a;
        Long d = cDiff.get(c);
        if (d == null) {
          cDiff.put(c, diff);
          return true;
        }
        return d == diff;
      }
    }

    boolean check(long r, long c, long a) {
      Long up = rDiff.get(r - 1);
      Long down = rDiff.get(r);
      Long left = cDiff.get(c - 1);
      Long right = cDiff.get(c);
      if (up != null) {
        if (a - up < 0) return false;
      }
      if (down != null) {
        if (a + down < 0) return false;
      }
      if (left != null) {
        if (a - left < 0) return false;
      }
      if (right != null) {
        if (a + right < 0) return false;
      }

      if (up != null && left != null) {
        long check = a - up - left;
        if (check < 0) return false;

        Long v = get(r - 1, c - 1);
        if (v != null && v != check) return false;
      }
      if (up != null && right != null) {
        long check = a - up + right;
        if (check < 0) return false;

        Long v = get(r - 1, c + 1);
        if (v != null && v != check) return false;
      }
      if (down != null && left != null) {
        long check = a + down - left;
        if (check < 0) return false;

        Long v = get(r + 1, c - 1);
        if (v != null && v != check) return false;
      }
      if (down != null && right != null) {
        long check = a + down + right;
        if (check < 0) return false;

        Long v = get(r + 1, c + 1);
        if (v != null && v != check) return false;
      }

      return true;
    }

    boolean solve(int[][] rca) {
      if (rca.length != 1) return false;
      for (int i = 0; i < N; i++) {
        long r = rca[i][0];
        long c = rca[i][1];
        long a = rca[i][2];

        if (!processR(r, c, a, true)) return false;
        if (!processR(r, c, a, false)) return false;
        if (!processC(r, c, a, true)) return false;
        if (!processC(r, c, a, false)) return false;
      }

      for (int i = 0; i < N; i++) {
        long r = rca[i][0];
        long c = rca[i][1];
        long a = rca[i][2];
        if (!check(r, c, a)) return false;
      }

      return true;
    }

    Long get(long r, long c) {
      return map.get(r * MOD + c);
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