
import java.io.*;
import java.util.StringTokenizer;

public class Main {


  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int c = n;
    int sum = 0;
    while (c > 0){
      sum += c % 10;
      c /= 10;
    }
    out.println(n % sum == 0 ? "Yes" : "No");

  }



  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try (
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out)) {
      solve(in, out);
    }
  }


  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

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

    @Override
    public void close() {

    }
  }

}