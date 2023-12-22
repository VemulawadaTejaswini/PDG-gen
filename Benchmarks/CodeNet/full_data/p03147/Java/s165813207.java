import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = in.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++)
      h[i] = in.nextInt();

    boolean term = false;

    int res = 0;

    while (!term) {
      term = true;
      for (int i = 0; i < n; i++) {
        if (h[i] > 0) {
          term = false;
          h[i]--;
          if (i == n - 1 || h[i + 1] == 0)
            res++;
        }
      }
    }

    out.println(res);

    out.close();
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
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

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }

  static void print(int[] arr) {
    Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    System.out.println();
  }

}

