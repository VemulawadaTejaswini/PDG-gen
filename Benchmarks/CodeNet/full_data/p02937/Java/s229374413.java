/**
 * Created at 03:22 on 2019-08-19
 */

import java.io.*;
import java.util.*;
import java.util.function.Predicate;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {
    public Solver() {

      String s = sc.next();
      String t = sc.next();

      int[][] sCount = new int[s.length()+1][26];
      for (int i=1; i<=s.length(); i++) {
        for (int j=0; j<26; j++) {
          sCount[i][j] = sCount[i-1][j];
        }
        sCount[i][s.charAt(i-1)-'a']++;
      }

      for (int i=0; i<t.length(); i++) {
        if (sCount[s.length()][t.charAt(i)-'a'] == 0) {
          out.println(-1);
          return;
        }
      }

      long ans = 0;
      int i=0;
      while(i<t.length()) {
        int j=0;
        while(j < s.length()) {
          int c = t.charAt(i) - 'a';

          long x = sCount[j][c];
          j = BinarySearch.binarySearch(k -> sCount[k][c] > x, j, s.length()+1, true);
          if (j <= s.length()) {
            i++;
            if (i == t.length()) {
              ans += j;
              out.println(ans);
              return;
            }
          }
        }
        ans += s.length();
      }

    }

    public static class BinarySearch {

      /*
       * [l, r)の区間でchecker.test()を実行する
       * rightOK ... 右側OK左側NGならtrue, 右側NG左側OKならfalse
       */
      public static long binarySearchLong(Predicate<Long> checker, long l, long r, boolean rightOK) {
        long ng, ok;

        if (rightOK) {
          ok = r-1;
          ng = l;
          if (!checker.test(ok)) {
            return r;
          }
          if (checker.test(ng)) {
            return l;
          }
        } else {
          ok = l;
          ng = r-1;
          if (!checker.test(ok)) {
            return l-1;
          }
          if (checker.test(ng)) {
            return r-1;
          }
        }

        /* ok と ng のどちらが大きいかわからないことを考慮 */
        while (Math.abs(ok - ng) > 1) {
          long mid = (ok + ng) / 2;

          if (checker.test(mid)) ok = mid;
          else ng = mid;
        }

        return ok;
      }

      /*
       * [l, r)の区間でchecker.test()を実行する
       */
      public static int binarySearch(Predicate<Integer> checker, int l, int r, boolean rightOK) {

        int ng, ok;

        if (rightOK) {
          ok = r-1;
          ng = l;
          if (!checker.test(ok)) {
            return r;
          }
          if (checker.test(ng)) {
            return l;
          }
        } else {
          ok = l;
          ng = r-1;
          if (!checker.test(ok)) {
            return l-1;
          }
          if (checker.test(ng)) {
            return r-1;
          }
        }

        while (Math.abs(ok - ng) > 1) {
          int mid = (ok + ng) / 2;

          if (checker.test(mid)) ok = mid;
          else ng = mid;
        }

        return ok;
      }

      public static int lowerBound(long[] a, long v) {

        if (a[0] >= v) return 0;

        int l = 0, r = a.length;
        int mid = (r + l) / 2;

        while (r - l > 1) {

          if (a[mid] >= v) r = mid;
          else l = mid;

          mid = (r + l) / 2;
        }

        return r;

      }

      public static int upperBound(long[] a, long v) {

        if (a[0] > v) return 0;

        int l = 0, r = a.length;
        int mid = (r + l) / 2;

        while (r - l > 1) {

          if (a[mid] > v) r = mid;
          else l = mid;

          mid = (r + l) / 2;
        }

        return r;

      }

      public static int count(long[] a, long v) {
        int lower = lowerBound(a, v);
        int upper = upperBound(a, v);
        return upper - lower;
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
