import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Random;
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
    TaskF solver = new TaskF();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskF {

    int[] a;
    int[] sum0;
    int[] sum1;
    static final Random random = new Random(0xdead);
    double sampling;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      a = new int[n];
      sampling = Math.min(1.0, 500.0 / n);
      int sum = 0;
      sum0 = new int[n + 1];
      sum1 = new int[n + 1];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
        sum += a[i];
        sum0[i + 1] = sum0[i];
        sum1[i + 1] = sum1[i];
        if (i % 2 == 0) {
          sum0[i + 1] += a[i];
        } else {
          sum1[i + 1] += a[i];
        }
      }
      int res = calc(0, n - 1, 3);
      out.printLine(res + " " + (sum - res));
    }

    private int calc(int l, int r, int depth) {
      int res = Math.max(sum(l, r, l % 2), sum(l, r, r % 2));
      if (depth == 0) {
        return res;
      }
      for (int i = l + 1; i <= r - 1; ++i) {
        if (random.nextDouble() > sampling) {
          continue;
        }
        int cur = Integer.MAX_VALUE;
        {
          int val = sum(i, r, i % 2);
          int osum = sum(l, i - 1, 0) + sum(l, i - 1, 1);
          if ((r - i) % 2 == 1) {
            val += calc(l, i - 1, depth - 1);
          } else {
            val += osum - calc(l, i - 1, depth - 1);
          }
          if (val < cur) {
            cur = val;
          }
        }
        {
          int val = sum(l, i, i % 2);
          int osum = sum(i + 1, r, 0) + sum(i + 1, r, 1);
          if ((i - l) % 2 == 1) {
            val += calc(i + 1, r, depth - 1);
          } else {
            val += osum - calc(i + 1, r, depth - 1);
          }
          if (val < cur) {
            cur = val;
          }
        }
        if (cur > res) {
          res = cur;
        }
      }
      return res;
    }

    private int sum(int l, int r, int odd) {
      if (odd == 0) {
        return sum0[r + 1] - sum0[l];
      } else {
        return sum1[r + 1] - sum1[l];
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

