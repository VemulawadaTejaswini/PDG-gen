/**
 * Created at 00:16 on 2019-11-04
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

  static final int e5 = (int) 1e5;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      Range[] range = new Range[N];
      long maxRange = 0;
      for (int i=0; i<N; i++) {
        range[i] =  new Range(sc.nextInt(), sc.nextInt());
        maxRange = Math.max(maxRange, range[i].r - range[i].l + 1);
      }

      Arrays.sort(range, (o1, o2) -> {
        if(o1.l == o2.l) return o2.r - o1.r;
        return o1.l - o2.l;
      });

      int l0 = range[0].l;
      int r0 = range[0].r;
      int l1 = -1, r1 = (int)1e9;
      ArrayList<Range> rangeList = new ArrayList<Range>();

      boolean containsAll = true;
      for (int i=1; i<N; i++) {
        if (range[i].l <= range[0].r) {
          if (range[i].r <= range[0].r) {
            l0 = Math.max(l0, range[i].l);
            r0 = Math.min(r0, range[i].r);
          } else {
            rangeList.add(range[i]);
          }
        } else {
          l1 = Math.max(l1, range[i].l);
          r1 = Math.min(r1, range[i].r);
        }
        if (range[i].r > range[0].r) containsAll = false;
      }

      if (containsAll) {
        int maxL = -1, minR = (int)1e9;
        for (int i=1; i<N; i++) {
          maxL = Math.max(maxL, range[i].l);
          minR = Math.min(minR, range[i].r);
        }
        out.println(range[0].r-range[0].l+1 + Math.max(0, minR - maxL + 1));
        return;
      }

      if (l1 == -1) {
        Arrays.sort(range, (o1, o2) -> o1.r-o2.r);
        l1 = range[N-1].l;
        r1 = range[N-1].r;
        rangeList.remove(range[N-1]);
      }

      CountMap<Integer> ls = new CountMap<Integer>(0);
      CountMap<Integer> rs = new CountMap<Integer>(0);
      ls.add(l0, 1);
      rs.add(r1, 1);

      for (int i=0; i<rangeList.size(); i++) {
        rs.add(rangeList.get(i).r, 1);
      }
      /*
      int maxL = -1, minR = (int)1e9;
      for (int i=0; i<N; i++) {
        if (range[i].r-range[i].l+1 == maxRange) continue;
        maxL = Math.max(maxL, range[i].l);
        minR = Math.min(minR, range[i].r);
      }

      long ans =  maxRange + Math.max(0, minR - maxL + 1);*/
      long ans = maxRange;

      ans = Math.max(ans, (r0-l0+1) + Math.max(0, rs.firstKey()-l1+1));

      for (int i=0; i<rangeList.size(); i++) {
        ls.add(rangeList.get(i).l, 1);
        rs.add(rangeList.get(i).r, -1);
        ans = Math.max(ans, Math.max(0, r0-ls.lastKey()+1) + Math.max(0, rs.firstKey()-l1+1));
      }

      out.println(ans);

    }

    public static class CountMap<K> extends TreeMap<K, Long> {

      long initVal;

      public CountMap(long initVal) {
        super();
        this.initVal = initVal;
      }

      public long g(K key) {
        if (containsKey(key)) {
          return get(key);
        } else {
          return initVal;
        }
      }

      public void add(K key, long value) {
        if (containsKey(key)) {
          put(key, get(key) + value);
        } else {
          put(key, initVal + value);
        }
        if (get(key) == initVal) {
          remove(key);
        }
      }

      public void sub(K key, long value) {
        if (containsKey(key)) {
          put(key, get(key) - value);
        } else {
          put(key, initVal - value);
        }
        if (get(key) == initVal) {
          remove(key);
        }
      }

      public void mul(K key, long value) {
        if (containsKey(key)) {
          put(key, get(key) * value);
        } else {
          put(key, initVal * value);
        }
        if (get(key) == initVal) {
          remove(key);
        }
      }

      public void div(K key, long value) {
        if (containsKey(key)) {
          put(key, get(key) / value);
        } else {
          put(key, initVal / value);
        }
      }

    }

    class Range {
      int l,r;
      Range(int l, int r) {
        this.l = l;
        this.r = r;
      }
    }
  }

  public static void main(String[] args) {
    new Solver();
    out.flush();
  }

  static class FastScanner {
    private InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;


    public void load() {
      try {
        in = new FileInputStream(next());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

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

    private long startTime;

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

    public void start() {
      startTime = System.currentTimeMillis();
    }

    public void time(String s) {
      long time = System.currentTimeMillis() - startTime;
      println(s + "(" + time + ")");
    }

  }

}
