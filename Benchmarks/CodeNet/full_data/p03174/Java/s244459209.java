import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author NMouad21
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    OMatching solver = new OMatching();
    solver.solve(1, in, out);
    out.close();
  }

  static class OMatching {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[][] m = in.nextIntMatrix(n, n);

      ModArithmetic mod = new ModArithmetic();
      int[][] dp = new int[n][1 << n];
      for (int i = 0; i < 1 << n; i++) {
        for (int j = 0; j < n; j++) {
          if (m[0][j] == 1 && (i >> j & 1) == 0) {
            dp[0][i] = 1;
          }
        }
      }
      for (int i = 1; i < n; i++) {
        for (int j = 0; j < 1 << n; j++) {
          if (Integer.bitCount(j) != n - i - 1) {
            // Useless cases, ignore...
            continue;
          }

          int ways = 0;
          for (int k = 0; k < n; k++) {
            if (m[i][k] == 1 && (j >> k & 1) == 0) {
              ways = mod.add(ways, dp[i - 1][j ^ 1 << k]);
            }
          }
          dp[i][j] = ways;
        }
      }
      out.println(dp[n - 1][0]);
    }
  }

  static final class ModArithmetic {
    public static final int DEFAULT_MOD = 1_000_000_007;
    public final int m;
    public final boolean isPrime;

    public ModArithmetic() {
      this(DEFAULT_MOD, true);
    }

    public ModArithmetic(int mod) {
      this(mod, false);
    }

    public ModArithmetic(int mod, boolean isPrime) {
      if (mod <= 0) {
        throw new IllegalArgumentException("Modulo must be > 0");
      }
      this.m = mod;
      this.isPrime = isPrime;
    }

    public final int add(int a, int b) {
      a += b;
      if (a >= m) {
        a -= m;
      }
      return a;
    }

    public String toString() {
      return "ModArithmetic{" + "m=" + m + ", isPrime=" + isPrime + '}';
    }
  }

  static final class InputReader {
    private final InputStream stream;
    private final byte[] buf = new byte[1 << 16];
    private int curChar;
    private int numChars;

    public InputReader() {
      this.stream = System.in;
    }

    public InputReader(final InputStream stream) {
      this.stream = stream;
    }

    private final int read() {
      if (this.numChars == -1) {
        throw new UnknownError();
      } else {
        if (this.curChar >= this.numChars) {
          this.curChar = 0;

          try {
            this.numChars = this.stream.read(this.buf);
          } catch (IOException ex) {
            throw new InputMismatchException();
          }

          if (this.numChars <= 0) {
            return -1;
          }
        }

        return this.buf[this.curChar++];
      }
    }

    public final int nextInt() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {}

      byte sgn = 1;
      if (c == 45) { // 45 == '-'
        sgn = -1;
        c = this.read();
      }

      int res = 0;

      while (c >= 48 && c <= 57) { // 48 == '0', 57 == '9'
        res *= 10;
        res += c - 48; // 48 == '0'
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }

      throw new InputMismatchException();
    }

    private static final boolean isSpaceChar(final int c) {
      return c == 32 || c == 10 || c == 13 || c == 9
          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'
    }

    public final int[][] nextIntMatrix(final int n, final int m) {
      int[][] arr = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          arr[i][j] = nextInt();
        }
      }
      return arr;
    }
  }
}
