import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int a = in.nextInt();
      int[] x = IOUtils.readIntArray(in, n);
      long[][][] f = new long[n + 1][n + 1][a * n + 1];
      f[0][0][0] = 1;
      for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= i; j++) {
          for (int k = a * n; k >= 0; k--) {
            f[i][j][k] += f[i - 1][j][k];
            if (k >= x[i - 1] && j > 0) {
              f[i][j][k] += f[i - 1][j - 1][k - x[i - 1]];
            }
          }
        }
      }
      long answer = 0;
      for (int i = 1; i <= n; i++) {
        answer += f[n][i][i * a];
      }
      out.printLine(answer);
//    int[] validSum = new int[n];
//    validSum[0] = x[0];
//    for (int i = 1; i < n; i++) {
//      validSum[i] = validSum[i - 1] + x[i];
//    }
//    long[][] f = new long[n + 1][a * (n + 4)];
//    ArrayUtils.fill(f, 0);
//    f[0][0] = 1;
//    for (int i = 0; i < n; i++) {
//      for (int j = i; j >= 0; j--) {
//        for (int k = validSum[i]; k >= 0; k--) {
//          f[j + 1][k + x[i]] += f[j][k];
//        }
//      }
//    }
//    long answer = 0;
//    for (int i = 1; i <= n; i++) {
//      answer += f[i][i * a];
//    }
//    out.printLine(answer);
    }

  }

  static class IOUtils {
    private IOUtils() {
    }

    public static int[] readIntArray(InputReader in, int size) {
      int[] array = new int[size];
      for (int i = 0; i < size; i++) {
        array[i] = in.nextInt();
      }
      return array;
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

    public void printLine(long i) {
      writer.println(i);
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

