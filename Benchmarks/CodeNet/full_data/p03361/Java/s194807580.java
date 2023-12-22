import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskC {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      char[][] g = new char[n][m];
      for (int i = 0; i < n; i++) {
        g[i] = in.next().toCharArray();
      }
      int[][] cc = new int[n][m];
      int[] count = new int[10000];
      int pt = 1;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (g[i][j] == '#' && cc[i][j] == 0) {
            ArrayDeque<int[]> q = new ArrayDeque<>();
            q.add(new int[]{i, j});
            cc[i][j] = pt;
            while (!q.isEmpty()) {
              int[] cur = q.poll();
              for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                  if (Math.abs(x - y) != 1) {
                    continue;
                  }
                  int xx = x + cur[0];
                  int yy = y + cur[1];
                  if (xx < 0 || yy < 0 || xx >= n || yy >= m || g[xx][yy] == '.'
                      || cc[xx][yy] != 0) {
                    continue;
                  }
                  cc[xx][yy] = pt;
                  q.add(new int[]{xx, yy});
                }
              }
            }
            ++pt;
          }
        }
      }
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (g[i][j] == '#') {
            count[cc[i][j]]++;
          }
        }
      }
      for (int i = 1; i < pt; i++) {
        if (count[i] < 2) {
          out.println("No");
          return;
        }
      }
      out.println("Yes");
    }

  }

  static class InputReader {

    private InputStream stream;
    private byte[] buf = new byte[1 << 13];
    private int curChar;
    private int numChars;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
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

    public int nextInt() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {
      }

      byte sgn = 1;
      if (c == 45) {
        sgn = -1;
        c = this.read();
      }

      int res = 0;

      while (c >= 48 && c <= 57) {
        res *= 10;
        res += c - 48;
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }

      throw new InputMismatchException();
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
      return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
    }

  }
}

