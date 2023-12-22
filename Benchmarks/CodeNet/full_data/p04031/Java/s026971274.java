import java.io.*;
import java.util.StringTokenizer;

public class Main {


  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int sum = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
      sum += arr[i];
    }
    int x = sum / n;
    int ans1 = 0;
    int ans2 = 0;
    for (int i = 0; i < n; i++) {
      int t1 = x - arr[i];
      int t2 = x + 1 - arr[i];
      ans1 += t1 * t1;
      ans2 += t2 * t2;
    }
    out.println(Math.min(ans1, ans2));
  }


  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {

    try (InputReader in = new InputReader(System.in);
         PrintWriter out = new PrintWriter(System.out)) {
      solve(in, out);
    }
  }


  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    InputReader(InputStream stream) {
      //reader = new BufferedReader(new FileReader(stream), 32768);
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    String next() {
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

    @Override
    public void close() {
    }
  }

}
