/**
 * Created at 06:16 on 2019-07-07
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static PrintStream out = System.out;
  static PrintWriter pw = new PrintWriter(out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      long K = sc.nextLong();

      int maxBit = 41;

      long[] bitK = new long[maxBit];
      for (int i=0; i<maxBit; i++) {
        bitK[i] = (K >> i) & 1;
      }

      long[] A = sc.nextLongArray(N, false);

      long[] bitCount = new long[maxBit];

      for (int i=0; i<N; i++) {
        for (int j=0; j<maxBit; j++) {
          bitCount[j] += A[i]>>j & 1;
        }
      }

      boolean found1 = false;
      long dp[][] = new long[maxBit+1][2];
      for (int i=maxBit-1; i>=0; i--) {
        if (bitK[i] == 0) {
          dp[i][0] = dp[i+1][0] + (bitCount[i] << (i)); //0を選んだ場合
          if (found1) { //すでにK未満が存在するなら
            dp[i][1] = dp[i+1][1] + (Math.max(bitCount[i], N-bitCount[i]) << i); //0,1を選んだ場合
          }
        } else {
          dp[i][0] = dp[i+1][0] + (N - bitCount[i]) * (1L << (i)); //1を選んだ場合
          dp[i][1] = Math.max(dp[i+1][0], dp[i+1][1]) + (bitCount[i] << (i)); //0を選んだ場合
          if (found1) {
            //すでにK未満のときのみ1を選んでもK未満となる
            dp[i][1] = Math.max(dp[i][1], dp[i+1][1] + ((N - bitCount[i+1]) << (i))); //1を選んだ場合
          }
          found1 = true;
        }
      }

      out.println(Math.max(dp[0][1], dp[0][0]));

    }

    public int[] toBinaryDigits(long a, int digit) {
      return toDigits(Long.toString(a, 2), digit);
    }

    public int[] toDigits(String b, int digit) {
      int[] digits = new int[digit];
      for (int i=0; i<b.length(); i++) {
        digits[i] = b.charAt(i) - '0';
      }
      return digits;
    }

    public int flag(boolean b) {
      return b ? 1 : 0;
    }
  }

  public static void main(String[] args) {
    new Solver();
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

}
