import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskB {

    static final int mod = 998244353;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      char[] s = in.nextToken().toCharArray();
      int L = s.length;

      int[] a = new int[L];
      Arrays.fill(a, -1);
      for (int i = 0; i < L; ++i) {
        a[i] = toInd(s[i]);
      }
      // int l = 0, r = L - 1;
      // int[][] prev = new int[L + 1][3];
      // Arrays.fill(prev[0], -1);
      // for (int i = 0; i < L; ++i) {
      //     for (int j = 0; j < 3; ++j)
      //         prev[i + 1][j] = prev[i][j];
      //     prev[i + 1][toInd(s[i])] = i;
      // }
      // int[][] poses = new int[3][L];
      // int[] cnts = new int[3];
      // for (int i = 0; i < L; ++i)
      //     poses[toInd(s[i])][cnts[toInd(s[i])]++] = i;
      // while (l < r) {
      //     while (l < r && a[l] != -1) ++l;
      //     while (l < r && a[r] != -1) --r;
      //     if (l >= r) break;
      //     int need = 3 - toInd(s[l]) - toInd(s[r]);
      //     a[l] = 0;
      //     a[r] = 2;
      //     while (poses[need][cnts[need] - 1] > r || a[poses[need][cnts[need] - 1]] != -1)
      //         --cnts[need];
      //     a[poses[need][cnts[need] - 1]] = 1;
      // }
      long res = 1;
      int[] cnts = new int[1 << 8];
      cnts[0] = n;
      for (int i = 1; i <= L; ++i) {
        int x = a[i - 1];
        boolean done = false;
        for (int nb = 2; nb >= 0 && !done; --nb) {
          for (int j = 0; j < cnts.length; ++j) {
            if (cnts[j] > 0 && (j >> x) % 2 == 0) {
              if (Integer.bitCount(j) == nb) {
                res *= cnts[j];
                res %= mod;
                done = true;
                --cnts[j];
                int nm = j ^ (1 << x);
                if (nm != 7) {
                  ++cnts[nm];
                }
                break;
              }
            }
          }
        }
        if (!done) {
          throw new RuntimeException();
        }
      }
      out.printLine(res);
    }

    private int toInd(char c) {
      if (c == 'R') {
        return 0;
      }
      if (c == 'G') {
        return 1;
      }
      return 2;
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

    public String nextToken() {
      int c = readSkipSpace();
      StringBuilder sb = new StringBuilder();
      while (!isSpace(c)) {
        sb.append((char) c);
        c = read();
      }
      return sb.toString();
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
}

