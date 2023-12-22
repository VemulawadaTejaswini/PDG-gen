/**
 * Created at 21:43 on 2020-03-01
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
      String S = sc.next();

      int Q = sc.nextInt();
      SegmentTree[] seg = new SegmentTree[26];

      for (int i=0; i<26; i++) {
        seg[i] = new SegmentTree(new long[N], 0);
      }

      int[] s = new int[N];
      for (int i=0; i<N; i++) {
        s[i] = S.charAt(i) - 'a';
        seg[s[i]].update(i, 1);
      }

      for (int q=0; q<Q; q++) {

        int command = sc.nextInt();
        if (command == 1) {
          int i = sc.nextInt()-1;
          int c = sc.next().charAt(0) - 'a';
          seg[s[i]].update(i, 0);
          seg[c].update(i, 1);
        } else {
          int l = sc.nextInt()-1;
          int r = sc.nextInt()-1;
          int ans = 0;
          for (int i=0; i<26; i++) {
            if (seg[i].query(l, r+1) >= 1) ans++;
          }
          out.println(ans);
        }

      }

    }

    public class SegmentTree {

      static final long INF = Long.MAX_VALUE / 2;

      Node[] tree;
      int N = 1; //元配列の要素数以上で最小に2の冪乗
      int size; //木のサイズ
      long initialVal;

      /*
       * 子ノード二つの値に対し親の値を返す
       * ex. Math.max(a, b), Math.min(a, b), a + b
       * 初期値はこの関数を元に決める必要がある
       * (maxなら-Inf, minならInf, a+bなら0)
       */
      public long f(long a, long b) {
        return a + b;
      }

      public SegmentTree(long[] A, long initialVal) {
        this.initialVal = initialVal;

        //元配列の要素数が2の冪乗でない場合,2の冪乗サイズに拡大して初期値をつめておく
        while (N < A.length) N *= 2;

        size = N*2-1;
        tree = new Node[size];

        for (int i=0; i<size; i++) {
          tree[i] = new Node(initialVal);
        }

        for (int i=0; i<A.length; i++) {
          update(i, A[i]);
        }

      }

      public void update(int k, long x) {
        k += N-1;
        tree[k].val = x;

        while(k != 0) {
          k = parent(k);
          tree[k].val = f(tree[childL(k)].val, tree[childR(k)].val);
        }
      }

      public long query(int a, int b) {
        return query(a, b, 0, 0, N);
      }

      public long query(int a, int b, int k, int l, int r) {
        if (r <= a || b <= l) return initialVal;
        if (a <= l && r <= b) return tree[k].val;

        return f(query(a, b, childL(k), l, (l+r)/2), query(a, b, childR(k), (l+r)/2, r));
      }

      public class Node {
        long val;
        public Node(long val) {
          this.val = val;
        }
      }

      public int parent(int k) {
        return k % 2 == 0 ? (k-2)/2 : (k-1)/2;
      }

      public int childL(int k) {
        return 2*k+1;
      }

      public int childR(int k) {
        return 2*k+2;
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
