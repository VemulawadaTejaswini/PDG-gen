import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Collections;
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
    DNearestCardGame solver = new DNearestCardGame();
    solver.solve(1, in, out);
    out.close();
  }

  static class DNearestCardGame {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int q = in.nextInt();
      Integer[] arr = new Integer[n];
      for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
      }
      Arrays.sort(arr);
      for (int i = 0; i < q; i++) {
        int val = in.nextInt();
        long res = 0;
        List<Integer> list = new LinkedList<>(Arrays.asList(arr));
        while (list.size() != 0) {
          res += list.get(list.size() - 1);
          list.remove(list.size() - 1);
          if (list.size() == 0) break;
          int index = Collections.binarySearch(list, val);
          if (index < 0) {
            int v1 = list.get(Math.min(Math.max(-index - 2, 0), list.size() - 1));
            int v2 = list.get(Math.min(Math.max(-index - 1, 0), list.size() - 1));
            if (Math.abs(val - v1) <= Math.abs(val - v2)) {
              index = Math.max(-index - 2, 0);
            } else {
              index = Math.max(-index - 1, 0);
            }
          }
          list.remove(index);
        }
        out.println(res);
      }

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

