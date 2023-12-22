import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskC {

    int s;
    OutputWriter out;
    DisjointSets dsu;
    ArrayList<ii> edges;
    ArrayList<Integer>[] g;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      this.out = out;
      int n = in.nextInt();
      s = n;
      if (n == 1 || (n & (n - 1)) == 0) {
        out.printLine("No");
        return;
      }
      out.printLine("Yes");
      dsu = new DisjointSets(2 * n + 1);
      edges = new ArrayList<>();
      g = new ArrayList[2 * n + 1];
      for (int i = 0; i < g.length; ++i) {
        g[i] = new ArrayList<>();
      }

      calc(n - (n + 1) % 2, 1, 0);
      if (n % 2 == 0) {
        for (int i = n - 1; i > 1; i -= 2) {
          if ((n ^ i) < n && (n ^ i) != i - 1) {
            output(n, i + s);
            output(n + s, (n ^ i) - 1);
            break;
          }
        }
      }

      // Assert.assertTrue(edges.size() == 2 * n - 1);
      // for (int i = 1; i <= n; ++i)
      //     if (dfs(i, i + n, new boolean[2 * n + 1]) != i)
      //         throw new RuntimeException();
    }

    void output(int x, int y) {
      out.printLine(x + " " + y);
      if (dsu.root(x) == dsu.root(y)) {
        throw new RuntimeException();
      }
      dsu.unite(x, y);
      edges.add(new ii(x, y));
      g[x].add(y);
      g[y].add(x);
    }

    void calc(int n, int mult, int shift) {
      if (n % 2 == 1) {
        if (n == 1) {
          throw new RuntimeException();
        }
        for (int i = 2; i <= n; i += 2) {
          output((shift + 1 * mult), (shift + i * mult));
          output((shift + i * mult), (shift + (i + 1) * mult));
          output((shift + 1 * mult), (shift + s + (i + 1) * mult));
          output((shift + s + (i + 1) * mult), (shift + s + i * mult));
        }
        output((shift + 3 * mult), (shift + s + 1 * mult));
        return;
      }
      calc(n / 2, mult * 2, shift);
      calc(n / 2, mult * 2, shift - mult);
      output((shift + 1 * mult), (shift + 2 * mult));
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

  static class DisjointSets {

    int[] p;
    int[] rank;

    public DisjointSets(int size) {
      p = new int[size];
      for (int i = 0; i < size; i++) {
        p[i] = i;
      }
      rank = new int[size];
    }

    public DisjointSets(int[] p, int[] rank) {
      this.p = p;
      this.rank = rank;
    }

    public int root(int x) {
      while (x != p[x]) {
        x = p[x];
      }
      return x;
    }

    public void unite(int a, int b) {
      a = root(a);
      b = root(b);
      if (a == b) {
        return;
      }
      if (rank[a] < rank[b]) {
        p[a] = b;
      } else {
        p[b] = a;
        if (rank[a] == rank[b]) {
          ++rank[a];
        }
      }
    }

  }
}

