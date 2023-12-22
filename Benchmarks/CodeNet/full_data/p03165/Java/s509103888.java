import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.Writer;
import java.io.UnsupportedEncodingException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    FLCS solver = new FLCS();
    solver.solve(1, in, out);
    out.close();
  }

  static class FLCS {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      char[] s = in.nextCharArray();
      char[] t = in.nextCharArray();
      int n = s.length;
      int m = t.length;
      int[][] dp = new int[n + 1][m + 1];
      for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= m; ++j) {
          if (s[i - 1] == t[j - 1]) {
            dp[i][j] = dp[i - 1][j - 1] + 1;
          } else {
            if (dp[i][j - 1] > dp[i - 1][j]) {
              dp[i][j] = dp[i][j - 1];
            } else {
              dp[i][j] = dp[i - 1][j];
            }
          }
        }
      }
      int ans = 0;
      int bestI = 0, bestJ = 0;
      for (int i = 0; i <= n; ++i) {
        for (int j = 0; j <= m; ++j) {
          if (ans < dp[i][j]) {
            ans = dp[i][j];
            bestI = i;
            bestJ = j;
          }
        }
      }
      StringBuilder result = new StringBuilder();
      while (bestI > 0 && bestJ > 0) {
        if (s[bestI - 1] == t[bestJ - 1]) {
          result.append(s[bestI - 1]);
          bestI--;
          bestJ--;
        } else {
          if (dp[bestI][bestJ - 1] > dp[bestI - 1][bestJ]) {
            bestJ--;
          } else {
            bestI--;
          }
        }
      }
      out.println(result.reverse().toString());
    }

  }

  static interface FastIO {

  }

  static class OutputWriter extends PrintWriter {

    public OutputWriter(OutputStream os, boolean autoFlush) {
      super(os, autoFlush);
    }

    public OutputWriter(Writer out) {
      super(out);
    }

    public OutputWriter(Writer out, boolean autoFlush) {
      super(out, autoFlush);
    }

    public OutputWriter(String fileName) throws FileNotFoundException {
      super(fileName);
    }

    public OutputWriter(String fileName, String csn)
        throws FileNotFoundException, UnsupportedEncodingException {
      super(fileName, csn);
    }

    public OutputWriter(File file) throws FileNotFoundException {
      super(file);
    }

    public OutputWriter(File file, String csn)
        throws FileNotFoundException, UnsupportedEncodingException {
      super(file, csn);
    }

    public OutputWriter(OutputStream out) {
      super(out);
    }

    public void flush() {
      super.flush();
    }

    public void close() {
      super.close();
    }

  }

  static class InputReader implements FastIO {

    private InputStream stream;
    private static final int DEFAULT_BUFFER_SIZE = 1 << 16;
    private static final int EOF = -1;
    private byte[] buf = new byte[DEFAULT_BUFFER_SIZE];
    private int curChar;
    private int numChars;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
      if (this.numChars == EOF) {
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
            return EOF;
          }
        }

        return this.buf[this.curChar++];
      }
    }

    public String next() {
      int c;
      while (isSpaceChar(c = this.read())) {
      }

      StringBuilder result = new StringBuilder();
      result.appendCodePoint(c);

      while (!isSpaceChar(c = this.read())) {
        result.appendCodePoint(c);
      }

      return result.toString();
    }

    public static boolean isSpaceChar(int c) {
      return c == 32 || c == 10 || c == 13 || c == 9 || c == EOF;
    }

    public char[] nextCharArray() {
      return next().toCharArray();
    }

  }
}

