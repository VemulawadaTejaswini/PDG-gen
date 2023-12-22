
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
    n = in.ni();
    W = in.ni();
    weight = new int[n];
    value = new long[n];
    for (int i = 0; i < n; i++) {
      weight[i] = in.ni();
      value[i] = in.nl();
    }
    dp = new Long[n][W + 1];
    out.println(recurse(0, 0));
  }
  
  private int n, W;
  private int[] weight;
  private long[] value;
  private Long[][] dp;
  
  private long recurse(int idx, int current) {
    if (idx == n) return 0;
    
    if (dp[idx][current] != null) return dp[idx][current];
    
    long ans = recurse(idx + 1, current);
    if (current + weight[idx] <= W) {
      ans = Math.max(ans, value[idx] + recurse(idx + 1, weight[idx] + current));
    }
    return dp[idx][current] = ans;
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
