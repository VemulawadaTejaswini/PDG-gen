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
    TaskE solver = new TaskE();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskE {

    static final int mod = 1000 * 1000 * 1000 + 7;
    static final long BUBEN = (long) (1E18);

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[] a = new int[m];
      for (int i = 0; i < m; ++i) {
        a[i] = in.nextInt();
      }
//        // Stupid.
//        int[] d = new int[n + 1];
//        d[0] = 1;
//        for (int i = 1, t = 0; i <= n; ++i) {
//            while (t < m && a[t] < i) ++t;
//            if (t < m && a[t] == i) {
//                d[i] = 0;
//                continue;
//            }
//            for (int j = 0; j < i; ++j) {
//                long s = (((long) (i - j) * (long) (i - j)) % mod);
//                d[i] = (int)((d[i] + s * d[j]) % mod);
//            }
//        }
//        out.printLine(d[n]);
      // Less stupid.
      long sum2 = 0, sum1 = 0, sum0 = 0;
      sum0 += 1;
      sum1 += 1;
      sum2 += 1;
      long di = 1;
      for (int i = 1, t = 0; i <= n; ++i) {
        while (t < m && a[t] < i) {
          ++t;
        }
        if (t < m && a[t] == i) {
          di = 0;
        } else {
          di = sum2;
        }
        sum2 = (sum2 + 2L * sum1 + sum0 + di);
        sum1 = (sum1 + sum0 + di);
        sum0 = (sum0 + di);
        if (sum2 > BUBEN) {
          sum2 %= mod;
        }
        if (sum1 > BUBEN) {
          sum1 %= mod;
        }
        if (sum0 > BUBEN) {
          sum0 %= mod;
        }
      }
      out.printLine(di);
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

