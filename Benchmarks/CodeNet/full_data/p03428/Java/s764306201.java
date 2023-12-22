import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
      ConvexHull.Point[] a = new ConvexHull.Point[n];
      for (int i = 0; i < n; ++i) {
        a[i] = new ConvexHull.Point(in.nextLong(), in.nextLong());
      }
      double[] res = new double[n];
      ConvexHull.Point[] backup = Arrays.copyOf(a, a.length);
      ConvexHull.Point[] b = ConvexHull.convexHull(a);
      a = backup;
      int[] ind = new int[b.length];
      for (int i = 0; i < b.length; ++i) {
        for (int j = 0; j < a.length; ++j) {
          if (a[j].x == b[i].x && a[j].y == b[i].y) {
            ind[i] = j;
          }
        }
      }
      for (int i = 0; i < b.length; ++i) {
        int j = (i + 1) % b.length;
        int k = (i + 2) % b.length;
        PointInt p1 = new PointInt((int) (b[j].x - b[i].x), (int) (b[j].y - b[i].y));
        PointInt p2 = new PointInt((int) (b[k].x - b[j].x), (int) (b[k].y - b[j].y));
        double alpha = Math.abs(Math.atan2(p1.cross(p2), p1.scalar(p2)));
        res[ind[j]] = alpha * 0.5 / Math.PI;
      }
      for (int i = 0; i < n; ++i) {
        out.printLine(res[i]);
      }
    }

  }

  static class ConvexHull {

    static boolean cw(ConvexHull.Point a, ConvexHull.Point b, ConvexHull.Point c) {
      return (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x) < 0;
    }

    public static ConvexHull.Point[] convexHull(ConvexHull.Point[] p) {
      int n = p.length;
      if (n <= 1) {
        return p;
      }
      Arrays.sort(p);
      ConvexHull.Point[] q = new ConvexHull.Point[n * 2];
      int cnt = 0;
      for (int i = 0; i < n; q[cnt++] = p[i++]) {
        for (; cnt > 1 && !cw(q[cnt - 2], q[cnt - 1], p[i]); --cnt) {
          ;
        }
      }
      for (int i = n - 2, t = cnt; i >= 0; q[cnt++] = p[i--]) {
        for (; cnt > t && !cw(q[cnt - 2], q[cnt - 1], p[i]); --cnt) {
          ;
        }
      }
      ConvexHull.Point[] res = new ConvexHull.Point[cnt - 1 - (q[0].compareTo(q[1]) == 0 ? 1 : 0)];
      System.arraycopy(q, 0, res, 0, res.length);
      return res;
    }

    public static class Point implements Comparable<ConvexHull.Point> {

      public long x;
      public long y;

      public Point(long x, long y) {
        this.x = x;
        this.y = y;
      }

      public int compareTo(ConvexHull.Point o) {
        int sx = Long.signum(x - o.x);
        return sx != 0 ? sx : Long.signum(y - o.y);
      }

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

    public long nextLong() {
      long sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10L + (long) (c - '0');
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

  }

  static class PointInt {

    public int x;
    public int y;

    public PointInt(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public PointInt() {
      x = 0;
      y = 0;
    }

    public long cross(PointInt p) {
      return (long) x * (long) p.y - (long) y * (long) p.x;
    }

    public long scalar(PointInt p) {
      return (long) x * (long) p.x + (long) y * (long) p.y;
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

