import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class Main {

  static class Solver {
    final FastScanner sc;
    final PrintWriter w;

    Solver(FastScanner sc, PrintWriter w) {
      this.sc = sc;
      this.w = w;
    }

    void run() {
      int n = sc.nextInt();
      long a[] = sc.nextLongArray(n);
      long answer = 0;
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          answer = MOD.plus(answer, a[i] ^ a[j]);
        }
      }
      w.println(answer);
    }
  }

  public static void main(String[] args) {
    final FastScanner sc = new FastScanner();
    final PrintWriter w = new PrintWriter(System.out);
    new Solver(sc, w).run();
    w.flush();
    w.close();
  }

  // CRT stuff
  static class MOD {
    private static final int MOD = (int) 1e9 + 7;

    static long plus(long x, long y) {
      x %= MOD;
      y %= MOD;
      return (x + y) % MOD;
    }

    static long sub(long x, long y) {
      x %= MOD;
      y %= MOD;
      return (x - y + MOD) % MOD;
    }

    static long multi(long x, long y) {
      x %= MOD;
      y %= MOD;
      return x * y % MOD;
    }

    static long div(long x, long y) {
      x %= MOD;
      y %= MOD;
      return x * pow(y, MOD - 2) % MOD;
    }

    static long pow(long a, long p) {
      if (p == 0)
        return 1;
      if (p % 2 == 0) {
        long halfP = p / 2;
        long root = pow(a, halfP);
        return root * root % MOD;
      } else
        return a * pow(a, p - 1) % MOD;
    }
  }

  // FastScanner
  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner() {
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
      if (hasNextByte())
        return buffer[ptr++];
      else
        return -1;
    }

    private boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr]))
        ptr++;
      return hasNextByte();
    }

    public String next() {
      if (!hasNext())
        throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext())
        throw new NoSuchElementException();
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

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }
}