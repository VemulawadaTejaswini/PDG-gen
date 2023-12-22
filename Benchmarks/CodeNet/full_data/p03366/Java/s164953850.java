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
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int s = in.nextInt();
      ArrayList<ii> left = new ArrayList<>();
      ArrayList<ii> right = new ArrayList<>();
      for (int i = 0; i < n; ++i) {
        int x = in.nextInt() - s;
        int y = in.nextInt();
        if (x < 0) {
          left.add(new ii(x, y));
        }
        if (x > 0) {
          right.add(new ii(x, y));
        }
      }
      Collections.reverse(left);
      int[] sleft = calc(left, right, 1);
      int[] sright = calc(right, left, 0);

      long res = 0;
      int cur = 0;
      int uleft = 0, uright = 0;
      for (int pleft = 0, pright = 0; pleft < left.size() || pright < right.size(); ) {
        if (pleft == left.size()) {
          res += right.get(pright).first - cur;
          cur = right.get(pright).first;
          ++pright;
          continue;
        }
        if (pright == right.size()) {
          res += cur - left.get(pleft).first;
          cur = left.get(pleft).first;
          ++pleft;
          continue;
        }
        while (uleft < left.size() && sleft[uleft] <= pright) {
          ++uleft;
        }
        while (uright < right.size() && sright[uright] <= pleft) {
          ++uright;
        }
        int leftLeft = Math.max(0, uleft - pleft);
        int rightRight = Math.max(0, uright - pright);
        int totalLeft = leftLeft + (right.size() - pright - rightRight);
        int totalRight = rightRight + (left.size() - pleft - leftLeft);
        if (totalLeft >= totalRight) {
          res += cur - left.get(pleft).first;
          cur = left.get(pleft).first;
          ++pleft;
        } else {
          res += right.get(pright).first - cur;
          cur = right.get(pright).first;
          ++pright;
        }
      }
      out.printLine(res);
    }

    private int[] calc(ArrayList<ii> left, ArrayList<ii> right, int tie) {
      long sum = 0;
      int pos = right.size() - 1;
      int[] res = new int[left.size()];
      for (int i = left.size() - 1; i >= 0; --i) {
        while (pos >= 0 && sum + right.get(pos).second < left.get(i).second + tie) {
          sum += right.get(pos).second;
          --pos;
        }
        res[i] = pos + 1;
        sum += left.get(i).second;
      }
      return res;
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

