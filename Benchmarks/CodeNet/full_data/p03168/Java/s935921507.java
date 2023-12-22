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
    Coins solver = new Coins();
    solver.solve(1, in, out);
    out.close();
  }

  static class Coins {
    InputReader in;
    PrintWriter out;
    double[][] dp;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      this.in = in;
      this.out = out;
      solve();
    }

    public double solve(double[] p, int coins, int heads) {
      if (heads == 0) return 1;
      if (coins == 0) return 0;
      if (dp[coins][heads] != -1) return dp[coins][heads];
      return dp[coins][heads] =
          (p[coins] * solve(p, coins - 1, heads - 1) + (1 - p[coins]) * solve(p, coins - 1, heads));
    }

    public void solve() {
      int n = ni();
      dp = new double[n + 1][n + 1];
      for (int i = 0; i <= n; i++) {
        Arrays.fill(dp[i], -1);
      }
      double[] p = new double[n + 1];
      for (int i = 1; i <= n; i++) {
        p[i] = in.nextDouble();
      }
      out.println(solve(p, n, (n + 1) / 2));
    }

    private int ni() {
      return in.nextInt();
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

    public double nextDouble() {
      double ret = 0, div = 1;
      int c = snext();
      while (c <= ' ') {
        c = snext();
      }
      boolean neg = (c == '-');
      if (neg) {
        c = snext();
      }

      do {
        ret = ret * 10 + c - '0';
      }
      while ((c = snext()) >= '0' && c <= '9');

      if (c == '.') {
        while ((c = snext()) >= '0' && c <= '9') {
          ret += (c - '0') / (div *= 10);
        }
      }

      if (neg) {
        return -ret;
      }
      return ret;
    }

    public int nextInt() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = snext();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = snext();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) {
        return filter.isSpaceChar(c);
      }
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public interface SpaceCharFilter {
      public boolean isSpaceChar(int ch);
    }
  }
}

