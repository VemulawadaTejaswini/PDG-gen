/**
 * Created at 18:21 on 2019-09-03
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long INF = Long.MAX_VALUE / 2;

  static final int e5 = (int) 1e5;

  public static class Solver {

    long[][] comb = new long[51][51];

    public Solver() {

      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();

      long[] V = sc.nextLongArray(N, false);

      Array.sort(V);
      V = Array.reverse(V);

      boolean allSame = true;
      long sum = 0;
      for (int i=0; i<A; i++) {
        sum += V[i];
        if (V[i] != V[0]) allSame = false;
      }

      double average = sum / (double)A;

      long sameCountInA = 0;
      long sameCount = 0;
      for (int i=0; i<N; i++) {
        if (V[i] == V[A-1]) {
          sameCount++;
          if (i < A) sameCountInA++;
        }
      }

      long ans = comb(sameCount, sameCountInA);

      if (allSame) {
        for (int i=1; i<=B-A; i++) {
          ans += comb(sameCount, sameCountInA+i);
        }
      }

      out.println(average);
      out.println(ans);

    }

    public long comb(long n, long r) {
      return comb((int)n, (int)r);
    }

    public long comb(int n, int r) {
      if (comb[n][r] != 0) return comb[n][r];
      if (n <= 0 || r < 0 || r > n) return 0;
      if (r == 1) return n;
      return comb[n][r] = comb(n-1, r-1) + comb(n-1, r);
    }

    public static class Array {

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

      public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i=0; i<a.length; i++) {
          b[a.length-1-i] = a[i];
        }
        return b;
      }

      public static long[] reverse(long[] a) {
        long[] b = new long[a.length];
        for (int i=0; i<a.length; i++) {
          b[a.length-1-i] = a[i];
        }
        return b;
      }

      public static long[] toLong(int[] a) {
        long[] b = new long[a.length];
        for (int i=0; i<a.length; i++) {
          b[i] = a[i];
        }
        return b;
      }

      public static int[] toInt(long[] a) {
        int[] b = new int[a.length];
        for (int i=0; i<a.length; i++) {
          b[i] = (int)a[i];
        }
        return b;
      }

      public static long[] cumulativeSum(int[] a, long mod) {
        long[] b = new long[a.length+1];
        for(int i=1; i<=a.length; i++) {
          b[i] += (b[i-1] + a[i-1]) % mod;
        }
        return b;
      }

      public static long[] cumulativeSum(long[] a, long mod) {
        long[] b = new long[a.length+1];
        for(int i=1; i<=a.length; i++) {
          b[i] += (b[i-1] + a[i-1]) % mod;
        }
        return b;
      }

      public static long[] cumulativeSum(int[] a) {
        long[] b = new long[a.length+1];
        for(int i=1; i<=a.length; i++) {
          b[i] += b[i-1] + a[i-1];
        }
        return b;
      }

      public static long[] cumulativeSum(long[] a) {
        long[] b = new long[a.length+1];
        for(int i=1; i<=a.length; i++) {
          b[i] += b[i-1] + a[i-1];
        }
        return b;
      }

      /*
       * int配列の和を返す
       */
      public static long sum(int[] a) {
        long sum = 0;
        for (int i=0; i<a.length; i++) {
          sum += a[i];
        }
        return sum;
      }

      /*
       * long配列の和を返す
       */
      public static long sum(long[] a) {
        long sum = 0;
        for (int i=0; i<a.length; i++) {
          sum += a[i];
        }
        return sum;
      }

      public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }

      public static void swap(long[] a, int i, int j) {
        long temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }

      public static int max(int... a) {
        int M = a[0];
        for (int i = 1; i < a.length; i++) {
          M = Math.max(M, a[i]);
        }
        return M;
      }

      public static int min(int... a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
          m = Math.min(m, a[i]);
        }
        return m;
      }

      public static long max(long... a) {
        long M = a[0];
        for (int i = 1; i < a.length; i++) {
          M = Math.max(M, a[i]);
        }
        return M;
      }

      public static long min(long... a) {
        long m = a[0];
        for (int i = 1; i < a.length; i++) {
          m = Math.min(m, a[i]);
        }
        return m;
      }

      public static int[] iota(int n) {
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
          a[i] = i;
        }
        return a;
      }

      public static long[] iotaL(int n) {
        long[] a = new long[n];
        for (int i=0; i<n; i++) {
          a[i] = i;
        }
        return a;
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
