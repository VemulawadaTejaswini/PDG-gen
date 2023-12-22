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
import java.math.BigInteger;
import java.util.Comparator;
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
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      ArrayList<TaskD.Pair> a = new ArrayList<>();
      long sumA = 0;
      for (int i = 0; i < n; ++i) {
        int ai = in.nextInt();
        int bi = in.nextInt();
        int delta = Math.max(0, bi - ai);
        a.add(new TaskD.Pair(ai, delta, ai, bi));
        sumA += ai;
      }
      Collections.sort(a, new Comparator<TaskD.Pair>() {

        public int compare(TaskD.Pair e1, TaskD.Pair e2) {
          int s1 = e1.first + e1.second;
          int s2 = e2.first + e2.second;
          return -Integer.compare(s1, s2);
        }
      });
      int pos = 0;
      long sumB = 0;
      while (pos < a.size() && sumB < sumA) {
        TaskD.Pair e = a.get(pos);
        sumB += e.first + e.second;
        ++pos;
      }
      if (sumB < sumA) {
        out.printLine("0 1");
        return;
      }
      // --pos;
      // long prevSumB = sumB - a.get(pos).first - a.get(pos).second;
      // int base = a.size() - pos - 1;
      // sumB -= sumA;
      // prevSumB -= sumA;
      // long den = sumB - prevSumB;
      // long num = sumB;

      long prefSum = 0;
      for (int i = pos; i < a.size(); ++i) {
        prefSum += a.get(i).first;
      }
      long deltaSum = 0;
      long minSum = Long.MAX_VALUE;
      for (int i = 0; i < pos; ++i) {
        deltaSum += a.get(i).second;
        if (a.get(i).b >= a.get(i).a) {
          minSum = Math.min(minSum, a.get(i).first + a.get(i).second);
        }
      }
      Assert.assertTrue(deltaSum >= prefSum);
      BigInteger num = BigInteger.valueOf(deltaSum - prefSum);
      BigInteger den = BigInteger.valueOf(minSum);
      int base = a.size() - pos;
      num = num.add(den.multiply(BigInteger.valueOf(base)));
      den = den.multiply(BigInteger.valueOf(n));
      BigInteger g = num.gcd(den);
      num = num.divide(g);
      den = den.divide(g);
      out.printLine(num + " " + den);
    }

    static class Pair {

      int first;
      int second;
      int a;
      int b;

      public Pair(int first, int second, int a, int b) {
        this.first = first;
        this.second = second;
        this.a = a;
        this.b = b;
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

  static class Assert {

    public static void assertTrue(boolean flag) {
      // if (!flag)
      // while (true);
      if (!flag) {
        throw new AssertionError();
      }
    }

  }
}

