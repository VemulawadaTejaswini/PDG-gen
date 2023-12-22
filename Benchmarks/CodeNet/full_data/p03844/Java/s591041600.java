import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {

  public static void main(String [] args) {
    InputReader scanner = new InputReader(System.in);
    int A = scanner.nextInt();
    String op = scanner.next();
    int B = scanner.nextInt();
    int res;
    if (op.equals("-")) res = A - B;
    else res = A + B;
    System.out.println(res);
  }

  static class Interval implements Comparable<Interval> {
    int a, b;
    public Interval(int a, int b) {
      this.a = a;
      this.b = b;
    }

    public int compareTo(Interval rhs) {
      if (b < rhs.b) return -1;
      if (b == rhs.b) {
        return a - rhs.a;
      }
      return 1;
    }
  }

  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String nextLine() {
      try {
        return reader.readLine();
      } catch (IOException e) {
        return null;
      }
    }

    public boolean hasNext() {
      if (tokenizer == null) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
        }
      }
      return tokenizer.hasMoreTokens();
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
          if (!tokenizer.hasMoreTokens()) {
            return null;
          }
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}
