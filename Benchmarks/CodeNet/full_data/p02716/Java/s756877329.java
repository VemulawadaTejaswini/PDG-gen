import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) throws Exception{
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    for(int i = 0; i < n; ++i) {
      num[i] = sc.nextInt();
    }
    new Solution(n, num);
  }
}

class Solution {
  public Solution(int n, int[] num) {
    long[][] dp = new long[n + 1][3];
    dp[1][1] = num[0];
    dp[2][1] = Math.max(num[0], num[1]);
    dp[3][1] = Math.max(num[2], dp[2][1]);
    dp[3][2] = num[0] + num[2];
    for(int i = 4; i < n + 1; ++i) {
      if(i % 2 == 0) {
        dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][0] + num[i - 1]);
        dp[i][1] = Math.max(dp[i - 1][2], dp[i - 2][1] + num[i - 1]);
      } else {
        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 2][0] + num[i - 1]);
        dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][1] + num[i - 1]);
        dp[i][2] = dp[i - 2][2] + num[i - 1];
      }
    }
    System.out.println(dp[n][1]);
  }
}

class FastScanner {
  private final InputStream in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;

  public FastScanner(InputStream source) {
    in = source;
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

  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
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
    long nl = nextLong();
    if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
      throw new NumberFormatException();
    return (int) nl;
  }

  public double nextDouble() {
    return Double.parseDouble(next());
  }
}