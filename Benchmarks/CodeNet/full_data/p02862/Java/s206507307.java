import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static final long MOD = 1000000007;

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int x = sc.nextInt();
    int y = sc.nextInt();

    if ((x + y) % 3 != 0) {
      os.println(0);
      return;
    }

    int move = (x + y) / 3;
    int pickX = x - move;
    int pickY = y - move;

    if (pickX < 0 || pickY < 0) {
      os.println(0);
      return;
    }

    os.println(new FermatCombination(move, MOD).combination(move, Math.min(pickX, pickY)));
  }

  private static class FermatCombination {

    private long fact[];
    private long mod;

    public FermatCombination(int size, long mod) {
      this.fact = new long[size + 1];
      this.mod = mod;

      this.fact[0] = 1;

      for (int i = 1; i <= size; i++) {
        fact[i] = (fact[i - 1] * i) % mod;
      }
    }

    private long factorial(int n) {
      return fact[n];
    }

    private long inverse(long n) {
      return pow(n, mod - 2) % mod;
    }

    private long pow(long x, long n) {
      long ans = 1;
      while (n > 0) {
        if ((n & 1) == 1) {
          ans = ans * x % mod;
        }
        x = x * x % mod;
        n >>= 1;
      }
      return ans;
    }

    long combination(int n, int k) {
      long ans = 1;
      ans *= factorial(n);
      ans %= mod;
      ans *= inverse(factorial(n - k));
      ans %= mod;
      ans *= inverse(factorial(k));
      ans %= mod;
      return ans;
    }
  }

  private static class Scanner {

    private final InputStream is;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    Scanner(InputStream is) {
      this.is = is;
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = is.read(buffer);
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
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
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
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
        throw new NumberFormatException();
      }
      return (int) nl;
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}
