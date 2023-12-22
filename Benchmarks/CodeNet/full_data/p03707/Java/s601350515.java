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
 *
 * @author ilyakor
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

    char[][] a;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int q = in.nextInt();
      a = new char[n][];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextToken().toCharArray();
      }
      int[][] s1 = new int[n + 1][m + 1];
      int[][] s2 = new int[n + 1][m + 1];
      int[][] s3 = new int[n + 1][m + 1];
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
          if (a[i][j] == '0') {
            continue;
          }
          s1[i + 1][j + 1] = 1;
          if (i + 1 < n && a[i + 1][j] == '1') {
            ++s2[i + 1][j + 1];
          }
          if (j + 1 < m && a[i][j + 1] == '1') {
            ++s3[i + 1][j + 1];
          }
        }
      }
      for (int i = 0; i < n; ++i) {
        for (int j = 1; j < m; ++j) {
          s1[i + 1][j + 1] += s1[i + 1][j];
          s2[i + 1][j + 1] += s2[i + 1][j];
          s3[i + 1][j + 1] += s3[i + 1][j];
        }
      }
      for (int i = 1; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
          s1[i + 1][j + 1] += s1[i][j + 1];
          s2[i + 1][j + 1] += s2[i][j + 1];
          s3[i + 1][j + 1] += s3[i][j + 1];
        }
      }

      for (int it = 0; it < q; ++it) {
        int x1 = in.nextInt() - 1;
        int y1 = in.nextInt() - 1;
        int x2 = in.nextInt() - 1;
        int y2 = in.nextInt() - 1;
        int V = s1[x2 + 1][y2 + 1] - s1[x1][y2 + 1] - s1[x2 + 1][y1] + s1[x1][y1];
        int E1 = s2[x2][y2 + 1] - s2[x1][y2 + 1] - s2[x2][y1] + s2[x1][y1];
        int E2 = s3[x2 + 1][y2] - s3[x1][y2] - s3[x2 + 1][y1] + s3[x1][y1];
        int res = V - E1 - E2;
        out.printLine(res);
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

    public void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(objects[i]);
      }
    }

    public void printLine(Object... objects) {
      print(objects);
      writer.println();
    }

    public void close() {
      writer.close();
    }

  }

  static class InputReader {

    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public static boolean isSpace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
      if (count == -1) {
        throw new InputMismatchException();
      }
      try {
        if (cur >= count) {
          cur = 0;
          count = stream.read(buffer);
          if (count <= 0) {
            return -1;
          }
        }
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      return buffer[cur++];
    }

    public int readSkipSpace() {
      int c;
      do {
        c = read();
      } while (isSpace(c));
      return c;
    }

    public String nextToken() {
      int c = readSkipSpace();
      StringBuilder sb = new StringBuilder();
      while (!isSpace(c)) {
        sb.append((char) c);
        c = read();
      }
      return sb.toString();
    }

    public int nextInt() {
      int sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10 + c - '0';
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

  }
}

