import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
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

    int n;
    int[] p;
    int[] a;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      n = in.nextInt();
      p = new int[n];
      p[0] = -1;
      for (int i = 1; i < n; ++i) {
        p[i] = in.nextInt() - 1;
      }
      a = new int[n];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
      }
      int[] w = new int[n];
      for (int i = n - 1; i >= 0; --i) {
        if (a[i] == 0) {
          ++w[i];
          if (i > 0) {
            w[p[i]] += w[i];
          }
        }
      }

      int[] P = new int[n];
      for (int i = 1; i < n; ++i) {
        if (a[p[i]] == 1) {
          P[i] = p[i];
        } else {
          P[i] = P[p[i]];
        }
      }
      int[] deg = new int[n];
      for (int i = 1; i < n; ++i) {
        if (a[i] == 1) {
          ++deg[P[i]];
        }
      }
      PriorityQueue<ii> q = new PriorityQueue<>();
      for (int i = 0; i < n; ++i) {
        if (i > 0 && a[i] != 1) {
          continue;
        }
        if (deg[i] > 0) {
          continue;
        }
        q.add(new ii(w[i], i));
      }
      ArrayList<Integer> res = new ArrayList<>();
      while (!q.isEmpty()) {
        int x = q.poll().second;
        res.add(x);
        --deg[P[x]];
        if (deg[P[x]] == 0) {
          q.add(new ii(w[P[x]], P[x]));
        }
      }
      Collections.reverse(res);
      long r = 0;
      long no = 0;
      for (int x : res) {
        no += a[x];
        r += no * (long) w[x];
      }
      out.printLine(r);
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
}

