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
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskB {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int k = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
      }
      // HashSet<String> s = new HashSet<>();
      // for (int i = 0; i + k <= n; ++i) {
      //     int[] b = Arrays.copyOf(a, a.length);
      //     Arrays.sort(b, i, i + k);
      //     String val = Arrays.toString(b);
      //     if (!s.contains(val))
      //         s.add(val);
      // }
      // System.err.println(s.size());
      SegmentTreeFastAddMax tree1 = new SegmentTreeFastAddMax(n + 2);
      SegmentTreeFastAddMax tree2 = new SegmentTreeFastAddMax(n + 2);
      for (int i = 0; i < n; ++i) {
        tree1.set(i, a[i]);
        tree2.set(i, -a[i]);
      }

      int[] runLength = new int[n];
      runLength[n - 1] = 1;
      int numSorted = 0;
      for (int i = n - 2; i >= 0; --i) {
        if (a[i] < a[i + 1]) {
          runLength[i] = runLength[i + 1];
        }
        ++runLength[i];
        if (runLength[i] >= k) {
          ++numSorted;
        }
      }

      int res = n - k + 1;
      for (int i = 0; i + k < n; ++i) {
        int M = (int) tree1.max(i, i + k);
        int m = (int) -tree2.max(i, i + k);
        if (m == a[i] && M == a[i + k]) {
          --res;
        } else if (runLength[i] >= k) {
          --res;
        }
      }
      if (runLength[n - k] >= k) {
        --res;
      }
      if (numSorted > 0) {
        ++res;
      }
      out.printLine(res);
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

  static class SegmentTreeFastAddMax {

    final int n;
    final long[] t;

    public SegmentTreeFastAddMax(int n) {
      int h = 1;
      while (h <= n) {
        h *= 2;
      }
      n = h;
      this.n = n;
      t = new long[n + n];
    }

    public void set(int i, long value) {
      add(i, value - t[i + n]);
    }

    public void add(int i, long value) {
      i += n;
      t[i] += value;
      for (; i > 1; i >>= 1) {
        t[i >> 1] = Math.max(t[i], t[i ^ 1]);
      }
    }

    public long max(int a, int b) {
      long res = Long.MIN_VALUE;
      for (a += n, b += n; a <= b; a = (a + 1) >> 1, b = (b - 1) >> 1) {
        res = Math.max(res, t[a]);
        res = Math.max(res, t[b]);
      }
      return res;
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

