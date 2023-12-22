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
    LDeque solver = new LDeque();
    solver.solve(1, in, out);
    out.close();
  }

  static class LDeque {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[] a = in.nextIntArrayOneBased(n);
      if (n == 1) {
        out.println(a[1]);
        return;
      }

      long[] pre = new long[n + 1];
      for (int i = 1; i <= n; i++) {
        pre[i] = pre[i - 1] + a[i];
      }

      long[][] dp = new long[n + 1][n + 1];
      for (int i = n; i >= 1; i--) {
        for (int j = i; j <= n; j++) {
          if (j == i) {
            dp[i][j] = a[i];
          } else {
            dp[i][j] = pre[j] - pre[i - 1] - Math.min(dp[i + 1][j], dp[i][j - 1]);
          }
        }
      }
      out.println(dp[1][n] - Math.min(dp[1][n - 1], dp[2][n]));
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

    public final int[] nextIntArrayOneBased(final int n) {
      int[] ret = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        ret[i] = nextInt();
      }
      return ret;
    }
  }
}
