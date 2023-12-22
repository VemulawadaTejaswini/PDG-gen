import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
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

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      // {
      //     Random random = new Random(0xdead);
      //     for (int it = 0; it < 1000; ++it) {
      //         int n = 10;
      //         int[] a = new int[n];
      //         int[] b = new int[n];
      //         for (int i = 0; i < n; ++i) {
      //             a[i] = random.nextInt(1000 * 1000 * 1000);
      //             b[i] = random.nextInt(1000 * 1000 * 1000);
      //         }
      //         doSolve(n, a, b);
      //     }
      // }

      int n = in.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];

      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
        b[i] = in.nextInt();
      }

      long res = doSolve(n, a, b);
      out.printLine(res);
    }

    public long doSolve(int n, int[] a, int[] b) {
      boolean[] exists = new boolean[3 * n + 10];
      PriorityQueue<TaskC.Entry> qa = new PriorityQueue<>(new Comparator<TaskC.Entry>() {

        public int compare(TaskC.Entry e1, TaskC.Entry e2) {
          return Integer.compare(e1.a, e2.a);
        }
      });
      PriorityQueue<TaskC.Entry> qb = new PriorityQueue<>(new Comparator<TaskC.Entry>() {

        public int compare(TaskC.Entry e1, TaskC.Entry e2) {
          return -Integer.compare(e1.b, e2.b);
        }
      });
      for (int i = 0; i < n; ++i) {
        TaskC.Entry e = new TaskC.Entry(a[i], b[i], i);
        qa.add(e);
        qb.add(e);
        exists[i] = true;
      }
      int nid = n;

      int[] next = new int[n];
      Arrays.fill(next, -1);

      long res = 0;
      while (!qa.isEmpty() && !qb.isEmpty()) {
        TaskC.Entry ea = null;
        while (ea == null && !qa.isEmpty()) {
          ea = qa.poll();
          if (!exists[ea.id]) {
            ea = null;
          }
        }
        if (ea == null) {
          continue;
        }
        exists[ea.id] = false;
        TaskC.Entry eb = null;
        while (eb == null && !qb.isEmpty()) {
          eb = qb.poll();
          if (!exists[eb.id]) {
            eb = null;
          }
        }
        if (eb == null) {
          res += Math.min(ea.a, ea.b);
          next[ea.ri] = ea.li;
          break;
        }
        // System.err.println(eb + " " + ea);
        exists[eb.id] = false;
        res += Math.min(eb.b, ea.a);
        next[eb.ri] = ea.li;
        if (ea.id != eb.id) {
          exists[nid] = true;
          TaskC.Entry e = new TaskC.Entry(eb.a, ea.b, nid);
          e.li = eb.li;
          e.ri = ea.ri;
          ++nid;
          qa.add(e);
          qb.add(e);
        }
      }

      if (n >= 3) {
        int nit = 0;
        while (true) {
          boolean ch = false;
          for (int i = 0; i < n; ++i) {
            int x = i, y = next[i], z = next[next[i]], t = next[next[next[i]]];
            long orig = Math.min(b[x], a[y]) + (long) Math.min(b[y], a[z]) + (long) Math
                .min(b[z], a[t]);
            long modified = Math.min(b[x], a[z]) + (long) Math.min(b[z], a[y]) + (long) Math
                .min(b[y], a[t]);
            if (modified < orig) {
              // throw new RuntimeException();
              res += modified - orig;
              next[x] = z;
              next[z] = y;
              next[y] = t;
              ch = true;
            }
          }
          if (!ch) {
            break;
          }
          ++nit;
        }
        // if (nit > 0)
        //     System.err.println("IT: " + nit);
      }

      return res;
    }

    static class Entry {

      int a;
      int b;
      int id;
      int li;
      int ri;

      public Entry(int a, int b, int id) {
        this.a = a;
        this.b = b;
        this.id = id;
        li = id;
        ri = id;
      }


      public String toString() {
        return "Entry{" +
            "a=" + a +
            ", b=" + b +
            ", id=" + id +
            '}';
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

