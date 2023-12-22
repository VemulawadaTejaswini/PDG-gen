import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    long mod = 1_000_000_007L;
    if (w == 1) {
      System.out.println(1);
      return;
    }
    long[][] dp = new long[h + 1][w];
    dp[0][0] = 1L;
    List<Integer> horizontalLine = new ArrayList<>();
    for (int i = 0; i < (1 << (w - 1)); i++) {
      int val = i;
      boolean pass = true;
      while (val > 0) {
        if ((val & 3) == 3) {
          pass = false;
          break;
        }
        val = val >> 1;
      }
      if (pass) horizontalLine.add(i);
    }
    for (int i = 1; i <= h; i++) {
      for (int j = 0; j < w; j++) {
        for (int hl : horizontalLine) {
          if (j < w - 1 && ((hl >> j) & 1) == 1) {
            dp[i][j] += dp[i - 1][j + 1];
          } else if (j - 1 >= 0 && ((hl >> (j - 1)) & 1) == 1) {
            dp[i][j] += dp[i - 1][j - 1];
          } else {
            dp[i][j] += dp[i - 1][j];
          }
          dp[i][j] %= mod;
        }
      }
    }
    System.out.println(dp[h][k - 1]);
  }
}