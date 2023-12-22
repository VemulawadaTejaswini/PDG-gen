import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
    MCandies solver = new MCandies();
    solver.solve(1, in, out);
    out.close();
  }

  static class MCandies {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int k = in.nextInt();
      if (k == 0) {
        out.println(1);
        return;
      }

      int[] a = in.nextIntArray(n);
      int mod = Constants.MOD;
      int[][] dp = new int[n + 1][k + 1];
      Arrays.fill(dp[n], 1);
      for (int i = n - 1; i >= 0; i--) {
        dp[i][0] = 1;
        for (int j = 1; j <= k; j++) {
          dp[i][j] = RangeQueriesUtils.get(dp[i + 1], mod, Math.max(0, j - a[i]), j) + dp[i][j - 1];
          if (dp[i][j] >= mod) {
            dp[i][j] -= mod;
          }
        }
      }

      out.println(RangeQueriesUtils.get(dp[0], mod, k, k));
    }
  }

  static class Constants {
    public static final int MOD = (int) 1e9 + 7;
  }

  static final class RangeQueriesUtils {
    private RangeQueriesUtils() {
      throw new RuntimeException("DON'T");
    }

    public static final int get(int[] pre, int mod, int i, int j) {
      if (i > j) {
        return 0;
      }
      if (i == 0) {
        return pre[j];
      }
      int ans = pre[j] - pre[i - 1];
      if (ans < 0) {
        ans += mod;
      }
      return ans;
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

    public final int[] nextIntArray(final int n) {
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = nextInt();
      }
      return arr;
    }
  }
}
