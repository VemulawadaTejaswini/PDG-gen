
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Main implements Closeable {

  private InputReader in = new InputReader(System.in);
  private PrintWriter out = new PrintWriter(System.out);

  public void solve() {
    n = in.ni();
    h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = in.ni();
    }
    dp = new Integer[n];
    out.println(recurse(0));
  }
  
  private int n;
  private int[] h;
  private Integer[] dp;
  
  private int recurse(int idx) {
    if (idx == n - 1) return 0;
    
    if (dp[idx] != null) return dp[idx];
    
    int ans = Integer.MAX_VALUE;
    if (idx + 1 < n) ans = min(ans, abs(h[idx + 1] - h[idx]) + recurse(idx + 1));
    if (idx + 2 < n) ans = min(ans, abs(h[idx + 2] - h[idx]) + recurse(idx + 2));
    
    return dp[idx] = ans;
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
