/**
 * Created at 11:06 on 2019-06-16
 */

/*
  D - Squirrel Merchant
 */

import java.io.*;
import java.util.*;
import java.math.BigInteger;



public class Main {

  static FastScanner sc = new FastScanner();

  public static void main(String[] args) {

    int N = sc.nextInt();
    int[] g = new int[2];
    int[] s = new int[2];
    int[] b = new int[2];
    g[0] = sc.nextInt();
    s[0] = sc.nextInt();
    b[0] = sc.nextInt();
    g[1] = sc.nextInt();
    s[1] = sc.nextInt();
    b[1] = sc.nextInt();

    int[] dp = new int[N+1];
    dp[0] = 0;
    for (int i=0; i<=N; i++) {
      dp[i] = max(new int[]{
              i,
              (i-g[0] >= 0) ? dp[i-g[0]]+g[1] : 0,
              (i-s[0] >= 0) ? dp[i-s[0]]+s[1] : 0,
              (i-b[0] >= 0) ? dp[i-b[0]]+b[1] : 0});
    }
    N = dp[N];

    int t = g[0];
    g[0] = g[1];
    g[1] = t;
    t = s[0];
    s[0] = s[1];
    s[1] = t;
    t = b[0];
    b[0] = b[1];
    b[1] = t;

    dp = new int[N+1];
    dp[0] = 0;
    for (int i=0; i<=N; i++) {
      dp[i] = max(new int[]{
              i,
              (i-g[0] >= 0) ? dp[i-g[0]]+g[1] : 0,
              (i-s[0] >= 0) ? dp[i-s[0]]+s[1] : 0,
              (i-b[0] >= 0) ? dp[i-b[0]]+b[1] : 0});
    }
    N = dp[N];

    System.out.println(N);

  }

  public static int max(int[] a) {
    int M = a[0];
    for (int i=1; i<a.length; i++) {
      M = Math.max(M, a[i]);
    }
    return M;
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
  }

}
