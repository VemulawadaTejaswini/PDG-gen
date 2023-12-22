import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
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
    TaskA solver = new TaskA();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskA {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      HashMap<Integer, Integer> a = new HashMap<>();
      for (int i = 0; i < n; ++i) {
        int x = in.nextInt();
        if (!a.containsKey(x)) {
          a.put(x, 1);
        } else {
          a.put(x, a.get(x) + 1);
        }
      }
      if (a.size() > 3) {
        out.printLine("No");
        return;
      }
      ArrayList<Integer> vals = new ArrayList<>(a.keySet());
      if (vals.size() == 1) {
        out.printLine(vals.get(0) == 0 ? "Yes" : "No");
        return;
      }
      Collections.sort(vals);
      if (vals.size() == 2) {
        if (vals.get(0) != 0) {
          out.printLine("No");
          return;
        }
        int c0 = a.get(vals.get(0));
        int c1 = a.get(vals.get(1));
        out.printLine(c0 * 2 == c1 ? "Yes" : "No");
        return;
      }
      int x1 = vals.get(0), x2 = vals.get(1), x3 = vals.get(2);
      if (x3 != (x1 ^ x2)) {
        out.printLine("No");
        return;
      }
      int c1 = a.get(x1), c2 = a.get(x2), c3 = a.get(x3);
      out.printLine((c1 == c2 && c1 == c3) ? "Yes" : "No");
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

