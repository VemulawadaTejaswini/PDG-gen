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
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskC {

    int[] a;
    int[] b;
    int[] q;
    boolean[] inq;
    int ql;
    int qr;
    int n;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      n = in.nextInt();
      a = new int[n];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
      }
      b = new int[n];
      inq = new boolean[n];
      q = new int[40 * n];
      ql = 0;
      qr = 0;
      for (int i = 0; i < n; ++i) {
        b[i] = in.nextInt();
        if (okish(i)) {
          q[ql++] = i;
          inq[i] = true;
        }
      }
      long res = 0;
      while (ql > qr) {
        int x = q[qr++];
        inq[x] = false;
        if (!okish(x)) {
          continue;
        }
        int val = b[x] - a[x];
        int l = (x + n - 1) % n;
        int r = (x + 1) % n;
        int delta = b[l] + b[r];
        int steps = val / delta;
        b[x] -= steps * delta;
        res += steps;
        if (okish(x) && !inq[x]) {
          inq[x] = true;
          q[ql++] = x;
        }
        if (okish(l) && !inq[l]) {
          inq[l] = true;
          q[ql++] = l;
        }
        if (okish(r) && !inq[r]) {
          inq[r] = true;
          q[ql++] = r;
        }
      }
      for (int i = 0; i < n; ++i) {
        if (a[i] != b[i]) {
          out.printLine(-1);
          return;
        }
      }
      out.printLine(res);
    }

    private boolean okish(int x) {
      if (a[x] >= b[x]) {
        return false;
      }
      int l = (x + n - 1) % n;
      if (b[x] <= b[l]) {
        return false;
      }
      int r = (x + 1) % n;
      if (b[x] <= b[r]) {
        return false;
      }
      if (b[x] - (b[l] + b[r]) < a[x]) {
        return false;
      }
      return true;
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

