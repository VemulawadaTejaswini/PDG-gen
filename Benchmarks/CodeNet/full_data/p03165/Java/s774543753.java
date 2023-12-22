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
 * @author Jatin Yadav
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    LCS solver = new LCS();
    solver.solve(1, in, out);
    out.close();
  }

  static class LCS {
    InputReader in;
    PrintWriter out;
    static int MAX = 3000;
    int[][] dp;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      this.in = in;
      this.out = out;
      solve();
    }

    public void solve() {
      String s = in.next();
      String t = in.next();
      dp = new int[MAX + 1][MAX + 1];
      for (int i = 0; i <= MAX; i++) Arrays.fill(dp[i], -1);
      out.println(solve(s, t));
    }

    private String solve(String s, String t) {
      return getLCS(s, t, getLen(s, t, 0, 0));
    }

    private String getLCS(String s, String t, int len) {
      int i = 0, j = 0;
      StringBuilder sb = new StringBuilder();

      while (len > 0) {
        if (s.charAt(i) == t.charAt(j)) {
          sb.append(s.charAt(i));
          i++;
          j++;
          len--;
        } else {
          if (dp[i + 1][j] > dp[i][j + 1]) {
            i++;
          } else {
            j++;
          }
        }
      }
      return sb.toString();
    }

    private int getLen(String s, String t, int i, int j) {
      if (i >= s.length() || j >= t.length()) return 0;
      if (dp[i][j] != -1) return dp[i][j];
      if (s.charAt(i) == t.charAt(j)) {
        return dp[i][j] = 1 + getLen(s, t, i + 1, j + 1);
      } else {
        return dp[i][j] = (Math.max(getLen(s, t, i + 1, j), getLen(s, t, i, j + 1)));
      }
    }
  }

  static class InputReader {
    private final InputStream stream;
    private final byte[] buf = new byte[8192];
    private int curChar;
    private int snumChars;
    private InputReader.SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int snext() {
      if (snumChars == -1) {
        throw new InputMismatchException();
      }
      if (curChar >= snumChars) {
        curChar = 0;
        try {
          snumChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (snumChars <= 0) {
          return -1;
        }
      }
      return buf[curChar++];
    }

    public String next() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = snext();
      } while (!isEndOfLine(c));
      return res.toString();
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) {
        return filter.isSpaceChar(c);
      }
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private boolean isEndOfLine(int c) {
      return c == '\n' || c == '\r' || c == -1;
    }

    public interface SpaceCharFilter {
      public boolean isSpaceChar(int ch);
    }
  }
}

