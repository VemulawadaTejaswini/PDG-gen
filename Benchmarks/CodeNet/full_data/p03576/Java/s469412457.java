/**
 * Created at 04:40 on 2019-08-30
 */

import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  static final int e5 = (int) 1e5;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      int K = sc.nextInt();

      long[] xs = new long[N];
      long[] ys = new long[N];
      Point[] ps = new Point[N];

      for (int i=0; i<N; i++) {
        ps[i] = new Point(sc.nextInt(), sc.nextInt());
        xs[i] = ps[i].x;
        ys[i] = ps[i].y;
      }

      Arrays.sort(xs);
      Arrays.sort(ys);

      Arrays.sort(ps, (o1, o2) -> Compare.P(o1, o2));

      long[][] cumsum = new long[N+1][N+1];

      for (int i=1; i<=N; i++) {
        for (int j=1; j<=N; j++) {
          cumsum[i][j] += cumsum[i-1][j] + cumsum[i][j-1] - cumsum[i-1][j-1];
          if (Arrays.binarySearch(ps, new Point((int)xs[i-1], (int)ys[j-1]), (o1, o2) -> Compare.P(o1, o2)) >= 0) {
            cumsum[i][j]++;
          }
        }
      }

      long ans = INF;
        for (int y1=0; y1<N; y1++) {
          for (int x1=0; x1<N; x1++) {
            for (int y2=y1+1; y2<=N; y2++) {
              for (int x2=x1+1; x2<=N; x2++) {
              if (cumsum[y2][x2] - cumsum[y1][x2] - cumsum[y2][x1] + cumsum[y1][x1] >= K) {
                ans = Math.min(ans, (ys[y2-1] - ys[y1]) * (xs[x2-1] - xs[x1]));
              }
            }
          }
        }
      }

      out.println(ans);

    }

    public static class Compare {
      public static int L(long l1, long l2) {
        if (l1 == l2) return 0;
        else if (l1 < l2) return -1;
        else return 1;
      }
      public static int P(Point p1, Point p2) {
        if (p1.x == p2.x) return p1.y - p2.y;
        else return p1.x - p2.x;
      }
    }
  }

  public static void main(String[] args) {
    new Solver();
    out.flush();
  }

  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
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

    public boolean hasNext() {
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

    public long nextLong() {
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

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int N, boolean oneBased) {
      if (oneBased) {
        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      } else {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      }
    }

    public long[] nextLongArray(int N, boolean oneBased) {
      if (oneBased) {
        long[] array = new long[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      } else {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      }
    }
  }

  static class Output extends PrintWriter {

    public Output(PrintStream ps) {
      super(ps);
    }

    public void print(int[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(long[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(String[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(ArrayList a, String separator) {
      for (int i = 0; i < a.size(); i++) {
        if (i == 0) print(a.get(i));
        else print(separator + a.get(i));
      }
      println();
    }
  }

}
