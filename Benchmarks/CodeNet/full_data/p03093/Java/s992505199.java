import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.HashSet;
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
    TaskE solver = new TaskE();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskE {

    int[] a;
    int m;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      m = in.nextInt();
      a = new int[2 * n];
      for (int i = 0; i < a.length; ++i) {
        a[i] = in.nextInt();
      }
      Arrays.sort(a);
      int l = -1, r = m;
      while (r - l > 1) {
        int t = (l + r) / 2;
        if (hasMatching(t)) {
          r = t;
        } else {
          l = t;
        }
      }
      out.printLine(r);
    }

    private boolean hasMatching(int T) {
      HashSet<Integer> shifts = new HashSet<>();
      shifts.add(0);
      shifts.add(T);
      shifts.add((m - T) % m);
      shifts.add(a[0]);
      shifts.add(a[a.length - 1]);
      shifts.add((m - a[a.length - 1]) % m);
      shifts.add((m - a[0]) % m);
      for (int shift : shifts) {
        if (hasMatching(T, shift)) {
          return true;
        }
      }
      return false;
    }

    private boolean hasMatching(int T, int shift) {
      TreeSet<ii> entries = new TreeSet<>();
      for (int i = 0; i < a.length; ++i) {
        entries.add(new ii(a[i], i));
      }
      while (!entries.isEmpty()) {
        ii e = entries.ceiling(new ii(shift, -2));
        if (e == null) {
          e = entries.first();
        }
        entries.remove(e);
        int x = e.first;
        int r = ((m - x + T) % m + m) % m;
        ii ee = entries.floor(new ii(r, Integer.MAX_VALUE));
        if (ee == null) {
          ee = entries.floor(new ii(m, Integer.MAX_VALUE));
        }
        if (ee == null) {
          return false;
        }
        if ((x + ee.first) % m > T) {
          return false;
        }
        entries.remove(ee);
      }
      return true;
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

  static class ii implements Comparable<ii> {

    public int first;
    public int second;

    public ii() {
    }

    public ii(int first, int second) {
      this.first = first;
      this.second = second;
    }

    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      ii ii = (ii) o;

      if (first != ii.first) {
        return false;
      }
      if (second != ii.second) {
        return false;
      }

      return true;
    }

    public int hashCode() {
      int result = first;
      result = 31 * result + second;
      return result;
    }

    public int compareTo(ii o) {
      if (first != o.first) {
        return first < o.first ? -1 : 1;
      }
      if (second != o.second) {
        return second < o.second ? -1 : 1;
      }
      return 0;
    }

    public String toString() {
      return "{" +
          "first=" + first +
          ", second=" + second +
          '}';
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

