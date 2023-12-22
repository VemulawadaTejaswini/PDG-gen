
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main implements Closeable {

  private InputReader in = new InputReader(System.in);
  private PrintWriter out = new PrintWriter(System.out);
  
  public void solve() {
    int n = in.ni(), W = in.ni();
    int[] weight = new int[n];
    long[] value = new long[n];
    for (int i = 0; i < n; i++) {
      weight[i] = in.ni();
      value[i] = in.nl();
    }
    out.println(dp(n, W, weight, value));
  }
  
  private long dp(int n, int W, int[] weight, long[] value) {
    long[] last = new long[W + 1];
    for (int current = 0; current <= W; current++) {
      if (current + weight[n - 1] <= W) {
        last[current] = value[n - 1];
      }
    }
    for (int idx = n - 2; idx >= 0; idx--) {
      long[] dp = new long[W + 1];
      for (int current = 0; current <= W; current++) {
        dp[current] = last[current];
        if (current + weight[idx] <= W) {
          dp[current] = Math.max(dp[current], value[idx] + last[current + weight[idx]]);
        }
      }
      last = dp;
    }
    return last[0];
  }

  @Override
  public void close() throws IOException {
    in.close();
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

    public int ni() {
      return Integer.parseInt(next());
    }

    public long nl() {
      return Long.parseLong(next());
    }

    public void close() throws IOException {
      reader.close();
    }
  }

  public static void main(String[] args) throws IOException {
    try (Main instance = new Main()) {
      instance.solve();
    }
  }
}
