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
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author ilyakor
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskA solver = new TaskA();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskA {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      char[] s = in.nextToken().toCharArray();
      int n = s.length;
      int[][] d = new int[n + 1][2];
      d[0][0] = 0;
      for (int i = 1; i <= n; ++i) {
        d[i][0] = 1;
        d[i][1] = i == 1 ? 0 : 1;
        for (int l = 0; l < 2; ++l) {
          if (i - l - 1 < 0) {
            continue;
          }
          for (int pl = 0; pl < 2; ++pl) {
            if (pl != l) {
              d[i][l] = Math.max(d[i][l], d[i - l - 1][pl] + 1);
            } else {
              boolean eq = true;
              for (int j = 0; j <= l; ++j) {
                char c1 = i - 1 - j >= 0 ? s[i - 1 - j] : 0;
                char c2 = i - 1 - (l + 1) - j >= 0 ? s[i - 1 - (l + 1) - j] : 0;
                if (c1 != c2) {
                  eq = false;
                }
              }
              if (!eq) {
                d[i][l] = Math.max(d[i][l], d[i - l - 1][pl] + 1);
              }
            }
          }
        }
      }
      out.printLine(Math.max(d[n][0], d[n][1]));
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
}

