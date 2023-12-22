import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      long[][] graph = new long[n][n];
      ArrayUtils.fill(graph, Long.MAX_VALUE);
      for (int i = 0; i < m; i++) {
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        int c = in.nextInt();
        graph[a][b] = graph[b][a] = Math.min(graph[a][b], c);
      }
      Pair<long[][], int[][]> d = ShortestDistance.floydAlgorithm(graph);
      int[][] path = d.second;
      Set<IntIntPair> edges = new HashSet<>();
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          int s = i;
          while (s != j) {
            edges.add(IntIntPair.makePair(Math.min(s, path[s][j]), Math.max(s, path[s][j])));
            s = path[s][j];
          }
        }
      }
      out.printLine(m - edges.size());
    }

  }

  static class ShortestDistance {
    public static Pair<long[][], int[][]> floydAlgorithm(long[][] graph) {
      int vertexCount = graph.length;
      long[][] weights = graph.clone();
      int[][] path = new int[vertexCount][vertexCount];
      for (int i = 0; i < vertexCount; i++) {
        for (int j = 0; j < vertexCount; j++) {
          path[i][j] = j;
        }
      }
      for (int k = 0; k < vertexCount; k++) {
        for (int i = 0; i < vertexCount; i++) {
          for (int j = 0; j < vertexCount; j++) {
            if (weights[i][k] != Long.MAX_VALUE && weights[k][j] != Long.MAX_VALUE) {
              long length = weights[i][k] + weights[k][j];
              if (length < weights[i][j]) {
                weights[i][j] = length;
                path[i][j] = path[i][k];
              } /*else if (length == weights[i][j]) {
              path[i][j] = Math.min(path[i][j], path[i][k]);
            }*/
            }
          }
        }
      }
      return Pair.makePair(weights, path);
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

    public void printLine(int i) {
      writer.println(i);
    }

  }

  static class Pair<U, V> implements Comparable<Pair<U, V>> {
    public final U first;
    public final V second;

    public static <U, V> Pair<U, V> makePair(U first, V second) {
      return new Pair<U, V>(first, second);
    }

    private Pair(U first, V second) {
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
      Pair pair = (Pair) o;
      return !(first != null ? !first.equals(pair.first) : pair.first != null)
          && !(second != null ? !second.equals(pair.second) : pair.second != null);
    }

    public int hashCode() {
      int result = first != null ? first.hashCode() : 0;
      result = 31 * result + (second != null ? second.hashCode() : 0);
      return result;
    }

    public String toString() {
      return "(" + first + "," + second + ")";
    }

    public int compareTo(Pair<U, V> o) {
      int value = ((Comparable<U>) first).compareTo(o.first);
      if (value != 0) {
        return value;
      }
      return ((Comparable<V>) second).compareTo(o.second);
    }

  }

  static class ArrayUtils {
    public static void fill(long[][] array, long value) {
      for (long[] row : array) {
        Arrays.fill(row, value);
      }
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
}

