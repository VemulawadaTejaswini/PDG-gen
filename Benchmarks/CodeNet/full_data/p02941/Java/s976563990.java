/**
 * Created at 20:53 on 2019-08-17
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

    int N;

    public Solver() {

      N = sc.nextInt();

      long[] A = sc.nextLongArray(N, false);
      long[] B = sc.nextLongArray(N, false);
      
/*
      long[] A = new long[N], B = new long[N];
      Arrays.fill(A, 1);
      for (int i=0; i<N; i++) {
        if (i % 2 == 1) B[i] = (long)1e9-1;
        else B[i] = 1;
      }
*/
      PriorityQueue<Data> queue = new PriorityQueue<Data>((o1, o2) -> Compare.L(o2.value, o1.value)); //降順

      for (int i=0; i<N; i++) {
        queue.add(new Data(i, B[i]));
      }

      long t=0;
      long count = 0;

      for (int i=0; i<N; i++) {
        if (A[i] == B[i]) count++;
      }

      while (count != N) {

        Data d = queue.remove();

        long k = (B[d.i] - A[d.i]) / (B[left(d.i)] + B[right(d.i)]);

        if (k == 0) {
          t = -1;
          break;
        }

        B[d.i] -= (B[left(d.i)] + B[right(d.i)]) * k;
        t += k;

        if (B[d.i] == A[d.i]) {
          count++;
        }

        d.value = B[d.i];

        queue.add(d);

      }

      out.println(t);

    }

    int left(int i) {
      return (i-1+N)%N;
    }

    int right(int i) {
      return (i+1)%N;
    }

    class Data {
      int i;
      long value;
      Data(int i, long v) {
        this.i =i;
        value = v;
      }
    }

    public static class Compare {
      public static int L(long l1, long l2) {
        if (l1 == l2) return 0;
        else if (l1 < l2) return -1;
        else return 1;
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
