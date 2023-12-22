import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    BContests solver = new BContests();
    solver.solve(1, in, out);
    out.close();
  }

  static class BContests {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int a = in.nextInt();
      int b = in.nextInt();
      Set<Integer> set = new TreeSet<>();
      for (int i = 0; i < n; i++) {
        set.add(in.nextInt());
      }
      int countA = 0;
      int countB = 0;
      int countC = 0;
      for (Integer integer : set) {
        if (integer <= a) {
          countA++;
        } else if (integer <= b) {
          countB++;
        } else {
          countC++;
        }
      }
      out.println(Math.min(countA, Math.min(countB, countC)));
    }

  }

  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      //reader = new BufferedReader(new FileReader(stream), 32768);
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public void close() {
    }

  }
}

