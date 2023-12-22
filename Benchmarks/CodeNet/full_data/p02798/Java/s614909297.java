/**
 * Created at 22:04 on 2020-01-18
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final int INF = (int)1e9;

  static final int e5 = (int) 1e5;

  public static class Solver {

    public class Card {
      int a, b, index;
      public Card(int a, int b, int index) {
        this.a = a;
        this.b = b;
        this.index = index;
      }
      public int value(int i) {
        return Math.abs(i-index) % 2 == 0 ? a : b;
      }
    }

    int ans = INF;

    public void dfs(int N, int index, Card[] cards, int[] numbers, boolean[] used, int[] indexes, int now) {

      if (now >= ans) {
        return;
      }

      if (index == N) {
        ans = Math.min(ans, now);
        return;
      }

      for (int i=0; i<N; i++) {
        int v = cards[i].value(index);
        if ((index == 0 || v >= cards[indexes[index-1]].value(index-1)) && (v <= numbers[N+index]) && !used[i]) {
          indexes[index] = i;
          used[i] = true;
          int count = 0;
          for (int j=i+1; j<N; j++) {
            if (used[j]) count++;
          }
          dfs(N, index+1, cards, numbers, used, indexes, now + Math.abs(cards[i].index+count-index));
          //out.print(list, " ");
          //out.println(index + ", " + res);
          indexes[index] = -1;
          used[i] = false;
        }
      }

    }

    public Solver() {

      int N = sc.nextInt();


      int[] A = sc.nextIntArray(N, false);
      int[] B = sc.nextIntArray(N, false);
      /*
      int[] A = new int[N];
      int[] B = new int[N];
      for (int i=0; i<N; i++) {
        A[i] = (int)Math.floor(Math.random()*50);
        B[i] = (int)Math.floor(Math.random()*50);
      }
      */

      Card[] cards = new Card[N];
      int[] numbers = new int[2*N];
      for (int i=0; i<N; i++) {
        cards[i] = new Card(A[i], B[i], i);
        numbers[2*i] = A[i];
        numbers[2*i+1] = B[i];
      }

      Arrays.sort(numbers);

      int[] indexes = new int[N];
      Arrays.fill(indexes, -1);
      dfs(N, 0, cards, numbers, new boolean[N], indexes, 0);

      out.println(ans == INF ? -1 : ans);

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
