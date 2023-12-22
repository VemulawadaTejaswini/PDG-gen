import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
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

  private static int dfs(int k, int[][][] sum, int i1, int j1, int i2, int j2, Map<String, Integer> cache) {
    String hash = String.format("%d %d %d %d", i1, j1, i2, j2);
    if (cache.containsKey(hash)) return cache.get(hash);
    int normal = sum[i2][j2][0] - sum[i2][j1][0] - sum[i1][j2][0] + sum[i1][j1][0];
    int white = sum[i2][j2][1] - sum[i2][j1][1] - sum[i1][j2][1] + sum[i1][j1][1];
    if (normal <= k && white <= k) {
      cache.put(hash, 0);
      return 0;
    }
    int min = Integer.MAX_VALUE;
    for (int i = i1 + 1; i < i2; i++) {
      min = Math.min(
          min,
          1 + dfs(k, sum, i1, j1, i, j2, cache) + dfs(k, sum, i, j1, i2, j2, cache));
    }
    for (int j = j1 + 1; j < j2; j++) {
      min = Math.min(
          min,
          1 + dfs(k, sum, i1, j1, i2, j, cache) + dfs(k, sum, i1, j, i2, j2, cache));
    }
    for (int i = i1 + 1; i < i2; i++) {
      for (int j = j1 + 1; j < j2; j++) {
        min = Math.min(
            min,
            2 + dfs(k, sum, i1, j1, i, j, cache) + dfs(k, sum, i1, j, i, j2, cache) + dfs(k, sum, i, j1, i2, j, cache) + dfs(k, sum, i, j, i1, j2, cache));
      }
    }
    cache.put(hash, min);
    return min;
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    int[][][] sum = new int[h + 1][w + 1][2];
    Map<String, Integer> cache = new HashMap<>();
    for (int i = 1; i <= h; i++) {
      String row = sc.next();
      for (int j = 1; j <= w; j++) {
        sum[i][j][0] = sum[i - 1][j][0] + sum[i][j - 1][0] - sum[i - 1][j - 1][0] + (row.charAt(j - 1) == '0' ? 1 : 0);
        sum[i][j][1] = sum[i - 1][j][1] + sum[i][j - 1][1] - sum[i - 1][j - 1][1] + (row.charAt(j - 1) == '1' ? 1 : 0);
      }
    }
    System.out.println(dfs(k, sum, 0, 0, h, w, cache));
  }
}