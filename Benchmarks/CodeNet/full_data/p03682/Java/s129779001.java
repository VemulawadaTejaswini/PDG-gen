/**
 * Created at 01:06 on 2019-09-03
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

    int N;
    Town[] tx, ty;
    PriorityQueue<Road> queue;
    int[] toTxI, toTyI;

    public Solver() {

      N = sc.nextInt();
      tx = new Town[N];
      ty = new Town[N];
      for (int i=0; i<N; i++) {
        long x = sc.nextInt();
        long y = sc.nextInt();
        Town t = new Town(i, x, y);
        tx[i] = t;
        ty[i] = t;
      }

      Arrays.sort(tx, (o1, o2) -> Compare.L(o1.x, o2.x));
      Arrays.sort(ty, (o1, o2) -> Compare.L(o1.y, o2.y));

      toTxI = new int[N];
      toTyI = new int[N];

      for (int i=0; i<N; i++) {
        toTxI[tx[i].id] = i;
        toTyI[ty[i].id] = i;
      }

      queue = new PriorityQueue<Road>((o1, o2) -> Compare.L(o1.cost, o2.cost));

      boolean[] done = new boolean[N];

      add(tx[0]);
      done[tx[0].id] = true;

      int count = 1;
      long ans = 0;
      while (count < N) {

        Road r = queue.remove();

        if (done[r.t1.id]) continue;
        count++;
        done[r.t1.id] = true;
        ans += r.cost;

        add(r.t1);

      }

      out.println(ans);

    }

    void add(Town t) {
      int txI = toTxI[t.id];
      int tyI = toTyI[t.id];
      if (txI > 0) {
        queue.add(new Road(t, tx[txI-1]));
      }
      if (txI < N-1) {
        queue.add(new Road(t, tx[txI+1]));
      }
      if (tyI > 0) {
        queue.add(new Road(t, ty[tyI-1]));
      }
      if (tyI < N-1) {
        queue.add(new Road(t, ty[tyI+1]));
      }
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

    class Road {
      Town t0, t1;
      long cost;
      Road(Town T0, Town T1) {
        t0 = T0;
        t1 = T1;
        cost = Math.min(Math.abs(t0.x-t1.x), Math.abs(t0.y-t1.y));
      }
    }

    class Town {
      long x, y;
      int id;
      Town(int i, long X, long Y) {
        id = i;
        x = X;
        y = Y;
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
