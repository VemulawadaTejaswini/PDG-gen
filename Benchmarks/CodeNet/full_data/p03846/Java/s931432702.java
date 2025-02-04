import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author GYSHGX868
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
      int n = in.nextInt();
      int[] a = IOUtils.readIntArray(in, n);
      boolean[] visited = new boolean[n];
      Set<IntIntPair> set = new HashSet<>();
      Set<Integer> same = new HashSet<>();
      for (int i = 0; i < n; i++) {
        int left = (n - a[i] - 1) / 2;
        int right = (n + a[i] - 1) / 2;
        if (left == right && same.contains(left)) {
          out.printLine(0);
          return;
        } else if (left == right) {
          same.add(left);
        }
        if (left != right) {
          set.add(IntIntPair.makePair(left, right));
        }
        visited[left] = visited[right] = true;
      }
      for (int i = 0; i < n; i++) {
        if (!visited[i]) {
          out.printLine(0);
          return;
        }
      }
      out.printLine(IntegerUtils.fastPower(2, set.size(), MiscUtils.MOD7));
    }

  }

  static class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private InputReader.SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
      if (numChars == -1) {
        throw new InputMismatchException();
      }
      if (curChar >= numChars) {
        curChar = 0;
        try {
          numChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (numChars <= 0) {
          return -1;
        }
      }
      return buf[curChar++];
    }

    public int nextInt() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) {
        return filter.isSpaceChar(c);
      }
      return isWhitespace(c);
    }

    public static boolean isWhitespace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public interface SpaceCharFilter {
      boolean isSpaceChar(int ch);

    }

  }

  static class IntegerUtils {
    private IntegerUtils() {
    }

    public static long fastPower(long base, long exponent, long mod) {
      if (exponent == 0) {
        return 1 % mod;
      }
      if (base >= mod) {
        base %= mod;
      }
      long result = 1;
      while (exponent != 0) {
        if ((exponent & 1) == 1) {
          result = result * base % mod;
        }
        base = base * base % mod;
        exponent >>>= 1;
      }
      return result;
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

    public void close() {
      writer.close();
    }

    public void printLine(long i) {
      writer.println(i);
    }

    public void printLine(int i) {
      writer.println(i);
    }

  }

  static class IntIntPair implements Comparable<IntIntPair> {
    public final int first;
    public final int second;

    public IntIntPair(int first, int second) {
      this.first = first;
      this.second = second;
    }

    public static IntIntPair makePair(int first, int second) {
      return new IntIntPair(first, second);
    }

    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      IntIntPair pair = (IntIntPair) o;
      return first == pair.first && second == pair.second;
    }

    public int hashCode() {
      int result = first;
      result = 31 * result + second;
      return result;
    }

    public String toString() {
      return "(" + first + ", " + second + ")";
    }

    public int compareTo(IntIntPair o) {
      int value = Integer.compare(first, o.first);
      if (value != 0) {
        return value;
      }
      return Integer.compare(second, o.second);
    }

  }

  static class MiscUtils {
    public static final int MOD7 = (int) (1e9 + 7);

    private MiscUtils() {
    }

  }

  static class IOUtils {
    private IOUtils() {
    }

    public static int[] readIntArray(InputReader in, int size) {
      int[] array = new int[size];
      for (int i = 0; i < size; i++) {
        array[i] = in.nextInt();
      }
      return array;
    }

  }
}

