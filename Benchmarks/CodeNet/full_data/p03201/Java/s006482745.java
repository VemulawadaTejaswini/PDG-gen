/**
 * Created at 18:55 on 2019-09-21
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

      long[] A = sc.nextLongArray(N, false);
      CountMap<Long> count = new CountMap<Long>(0);
      for (int i=0; i<N; i++) {
        count.add(A[i], 1);
      }

      long ans = 0;
      for (long j=(1L<<31); j>0; j/=2) {
        for (int i=0; i<N; i++) {
          if (A[i] >= j) continue;

          if (A[i]*2 == j) {
            if (count.g(A[i]) >= 2) {
              count.sub(A[i], 2);
              ans++;
            }
          } else if (count.g(A[i]) > 0 && count.g(j-A[i]) > 0) {
            count.sub(j-A[i], 1);
            count.sub(A[i], 1);
            ans++;
          }
        }
      }

      out.println(ans);

    }

    public static void sort(int[] a) {
      shuffle(a);
      Arrays.sort(a);
    }

    public static void sort(long[] a) {
      shuffle(a);
      Arrays.sort(a);
    }

    public static void shuffle(int[] arr){
      int n = arr.length;
      Random rnd = new Random();
      for(int i=0; i<n; ++i){
        int tmp = arr[i];
        int randomPos = i + rnd.nextInt(n-i);
        arr[i] = arr[randomPos];
        arr[randomPos] = tmp;
      }
    }

    public static void shuffle(long[] arr){
      int n = arr.length;
      Random rnd = new Random();
      for(int i=0; i<n; ++i){
        long tmp = arr[i];
        int randomPos = i + rnd.nextInt(n-i);
        arr[i] = arr[randomPos];
        arr[randomPos] = tmp;
      }
    }

    public class CountMap<K> extends HashMap<K, Long> {

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
