/**
 * Created at 05:16 on 2019-08-28
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      int C = sc.nextInt();
      long[][] D = new long[C][C];
      int[][] board = new int[N][N];

      for (int y=0; y<C; y++) {
        for (int x=0; x<C; x++) {
          D[y][x] = sc.nextLong();
        }
      }

      for (int y=0; y<N; y++) {
        for (int x=0; x<N; x++) {
          board[y][x] = sc.nextInt()-1;
        }
      }

      Data[][] data = new Data[3][C];

      for (int i=0; i<C; i++) {

        long[] sum = new long[3];

        for (int y=0; y<N; y++) {
          for (int x=0; x<N; x++) {
            sum[(x+y)%3] += D[board[y][x]][i];
          }
        }

        for (int j=0; j<3; j++) {
          data[j][i] = new Data(i, sum[j]);
        }

      }

      for (int i=0; i<3; i++) {
        Arrays.sort(data[i], (o1, o2) -> Compare.L(o1.sum, o2.sum));
      }

      long ans = INF;
      for (int i=0; i<3; i++) {
        for (int j=0; j<3; j++) {
          if (data[1][j].c == data[0][i].c) continue;
          for (int k=0; k<3; k++) {
            if (data[2][k].c == data[0][i].c || data[2][k].c == data[1][j].c) continue;

            ans = Math.min(ans, data[0][i].sum + data[1][j].sum + data[2][k].sum);

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
    }


    class Data {
      int c;
      long sum;
      Data(int c, long sum) {
        this.c = c;
        this.sum = sum;
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
