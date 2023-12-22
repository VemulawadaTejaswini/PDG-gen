import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
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
    FLCS solver = new FLCS();
    solver.solve(1, in, out);
    out.close();
  }

  static class FLCS {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      char[] s = in.nextCharArray();
      char[] t = in.nextCharArray();
      int[][] dp = new int[s.length + 1][t.length + 1];
      for (int i = 0; i <= s.length; i++) {
        for (int j = 0; j <= t.length; j++) {
          if (i == 0 || j == 0) {
            continue;
          }
          if (s[i - 1] == t[j - 1]) {
            dp[i][j] = dp[i - 1][j - 1] + 1;
          } else {
            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
          }
        }
      }
      int i = s.length, j = t.length;
      StringBuilder sb = new StringBuilder();
      while (i > 0 && j > 0) {
        if (s[i - 1] == t[j - 1]) {
          sb.append(s[i - 1]);
          --i;
          --j;
        } else {
          if (dp[i][j] == dp[i - 1][j]) {
            --i;
          } else {
            --j;
          }
        }
      }
      out.println(sb.reverse().toString());
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

    public final String next() {
      int c;
      while (isSpaceChar(c = this.read())) {}

      StringBuilder result = new StringBuilder();
      result.appendCodePoint(c);

      while (!isSpaceChar(c = this.read())) {
        result.appendCodePoint(c);
      }

      return result.toString();
    }

    private static final boolean isSpaceChar(final int c) {
      return c == 32 || c == 10 || c == 13 || c == 9
          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'
    }

    public final char[] nextCharArray() {
      return next().toCharArray();
    }
  }
}
