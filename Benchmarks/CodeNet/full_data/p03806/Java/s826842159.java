import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author GYSHGX868
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int ma = in.nextInt();
      int mb = in.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int[] c = new int[n];
      IOUtils.readIntArrays(in, a, b, c);
      int[][][] f = new int[n + 1][401][401];
      ArrayUtils.fill(f, Integer.MAX_VALUE);
      for (int i = 0; i < n; i++) {
        f[1][a[i]][b[i]] = Math.min(c[i], f[1][a[i]][b[i]]);
      }
      for (int i = 2; i <= n; i++) {
        for (int j = 0; j <= 400; j++) {
          for (int k = 0; k <= 400; k++) {
            if (j >= a[i - 1] && k >= b[i - 1]) {
//            f[i][j][k] = f[i - 1][j][k];
//          } else if (j < a[i - 1]) {
//            f[i][j][k] = f[i - 1][j][k - b[i - 1]];
//          } else if (k < b[i - 1]) {
//            f[i][j][k] = f[i - 1][j - a[i - 1]][k];
//          } else {
              f[i][j][k] = Math.min(f[i][j][k], f[i - 1][j][k]);
              int last = f[i - 1][j - a[i - 1]][k - b[i - 1]];
              if (last < Integer.MAX_VALUE) {
                f[i][j][k] = Math.min(last + c[i - 1], f[i][j][k]);
              }
            }
          }
        }
      }
      int answer = Integer.MAX_VALUE;
      for (int i = 1; i <= 400; i++) {
        for (int j = 1; j <= 400; j++) {
          if (i * mb == j * ma) {
            answer = Math.min(answer, f[n][i][j]);
          }
        }
      }
      out.printLine(answer == Integer.MAX_VALUE ? -1 : answer);
    }

  }

  static class IOUtils {
    private IOUtils() {
    }

    public static void readIntArrays(InputReader in, int[]... arrays) {
      for (int i = 0; i < arrays[0].length; i++) {
        for (int j = 0; j < arrays.length; j++) {
          arrays[j][i] = in.nextInt();
        }
      }
    }

  }

  static class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    public void close() {
      writer.close();
    }

    public void printLine(int i) {
      writer.println(i);
    }

  }

  static class ArrayUtils {
    public static void fill(int[][] array, int value) {
      for (int[] row : array) {
        Arrays.fill(row, value);
      }
    }

    public static void fill(int[][][] array, int value) {
      for (int[][] subArray : array) {
        fill(subArray, value);
      }
    }

  }

  static class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private InputReader.SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
      if (numChars == -1) {
        throw new InputMismatchException();
      }
      if (curChar >= numChars) {
        curChar = 0;
        try {
          numChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (numChars <= 0) {
          return -1;
        }
      }
      return buf[curChar++];
    }

    public int nextInt() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) {
        return filter.isSpaceChar(c);
      }
      return isWhitespace(c);
    }

    public static boolean isWhitespace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public interface SpaceCharFilter {
      boolean isSpaceChar(int ch);

    }

  }
}

