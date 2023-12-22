/**
 * Created at 00:27 on 2019-07-01
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

  static long[] fact;

  public static class Solver implements Runnable {
    public void run() {

      long N = sc.nextLong();
      long M = sc.nextLong();

      fact = new long[(int)(N*M)+1];

      long K = sc.nextLong();

      long C = comb(M*N-2, K-2);
      long M2 = M * M;
      long N2 = N * N;

      long ans = 0;
      for (long i=0; i<N; i++) {
        for (long j=0; j<N; j++) {
          ans += (Math.abs(i-j) * C * M2) % MOD;
        }
      }
      for (long i=0; i<M; i++) {
        for (long j=0; j<M; j++) {
          ans += (Math.abs(i-j) * C * N2) % MOD;
        }
      }

      ans = (ans / 2) % MOD;

      out.println(ans);

    }
  }

  public static long power(long a, long b) {
    if (b == 0) return 1;

    if (b % 2 == 0) {
      long p = power(a, b/2);
      return (p * p) % MOD;
    } else {
      return (a * power(a, b - 1)) % MOD;
    }
  }

  public static long factorial(long n) {
    if (n == 0) return 1;
    if (fact[(int)n] == 0) {
      return fact[(int)n] = (n * factorial(n - 1)) % MOD;
    } else {
      return fact[(int)n];
    }
  }

  public static long factorialInverse(long n) {
    return power(factorial(n), MOD-2);
  }

  public static long comb(long n, long r) {
    if (r < 0 || r > n) return 0;
    return (((factorial(n) * factorialInverse(r)) % MOD) * factorialInverse(n-r)) % MOD;
  }


  public static void main(String[] args) {
    Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
    new Thread(null, new Solver(), "", 128 * 1024 * 1024).start();
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
