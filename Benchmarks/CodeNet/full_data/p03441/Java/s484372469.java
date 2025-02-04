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
    TaskE solver = new TaskE();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskE {

    ArrayList<Integer>[] g;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      g = new ArrayList[n];
      for (int i = 0; i < n; ++i) {
        g[i] = new ArrayList<>();
      }
      for (int i = 0; i < n - 1; ++i) {
        int x = in.nextInt();
        int y = in.nextInt();
        g[x].add(y);
        g[y].add(x);
      }
      int res = Integer.MAX_VALUE;
      for (int i = 0; i < n; ++i) {
        if (g[i].size() > 2) {
          res = dfs(i, -1);
          break;
        }
      }
      if (res == Integer.MAX_VALUE) {
        ArrayList<Integer> inds = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
          inds.add(i);
        }
        Collections.shuffle(inds);
        for (int i : inds) {
          if (g[i].size() > 1) {
            res = dfs(i, -1);
            break;
          }
        }
      }
      if (res == Integer.MAX_VALUE) {
        res = 1;//dfs(0, -1);
      }
      Assert.assertTrue(res > 0);
      out.printLine(res);
    }

    private int dfs(int x, int p) {
      int sum = 0, nz = 0, deg = 0;
      for (int y : g[x]) {
        if (y == p) {
          continue;
        }
        int val = dfs(y, x);
        sum += val;
        if (val == 0) {
          ++nz;
        }
        ++deg;
      }
      if (nz > 0) {
        sum += nz - 1;
      }
      if (p == -1 && deg == 1) {
        ++sum;
      }
      return sum;
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

  static class Assert {

    public static void assertTrue(boolean flag) {
//        if (!flag)
//        while (true);
      if (!flag) {
        throw new AssertionError();
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
}

