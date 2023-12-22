import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.ArrayDeque;
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

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      DisjointSets dsu = new DisjointSets(n);
      TaskE.State[] states = new TaskE.State[n];
      for (int i = 0; i < n; ++i) {
        states[i] = new TaskE.State();
      }
      for (int i = 0; i < n - 1; ++i) {
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        states[x].outRed.add(y);
        states[y].outRed.add(x);
      }
      for (int i = 0; i < n - 1; ++i) {
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        states[x].outBlack.add(y);
        states[y].outBlack.add(x);
      }
      Queue<Integer> q = new ArrayDeque<>();
      for (int i = 0; i < n; ++i) {
        q.add(i);
      }
      while (!q.isEmpty()) {
        int x = q.poll();
        if (dsu.root(x) != x) {
          continue;
        }
        states[x].normalize(dsu, x);
        ArrayList<Integer> neigh = states[x].evict();
        for (int y : neigh) {
          int r1 = dsu.root(y);
          int r2 = dsu.root(x);
          if (r1 == r2) {
            continue;
          }
          dsu.unite(r1, r2);
          int r = dsu.root(r1);
          if (r == r1) {
            states[r1].merge(states[r2]);
            states[r2] = null;
          } else {
            states[r2].merge(states[r1]);
            states[r1] = null;
          }
        }
        if (!neigh.isEmpty()) {
          q.add(x);
        }
      }
      HashSet<Integer> roots = new HashSet<>();
      for (int i = 0; i < n; ++i) {
        roots.add(dsu.root(i));
      }
      if (roots.size() == 1) {
        out.printLine("YES");
      } else {
        out.printLine("NO");
      }

    }

    static class State {

      HashSet<Integer> outRed = new HashSet<>();
      HashSet<Integer> outBlack = new HashSet<>();

      ArrayList<Integer> evict() {
        ArrayList<Integer> res = new ArrayList<>();
        for (int x : outRed) {
          if (outBlack.contains(x)) {
            res.add(x);
          }
        }
        for (int x : res) {
          outBlack.remove(x);
          outRed.remove(x);
        }
        return res;
      }

      void normalize(DisjointSets dsu, int us) {
        HashSet<Integer> tmp = new HashSet<>();
        for (int x : outBlack) {
          int y = dsu.root(x);
          if (y == us) {
            continue;
          }
          tmp.add(y);
        }
        outBlack = tmp;
        tmp = new HashSet<>();
        for (int x : outRed) {
          int y = dsu.root(x);
          if (y == us) {
            continue;
          }
          tmp.add(y);
        }
        outRed = tmp;
      }

      void merge(TaskE.State other) {
        outRed.addAll(other.outRed);
        outBlack.addAll(other.outBlack);
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

