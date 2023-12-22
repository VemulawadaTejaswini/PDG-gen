import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
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
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] l = sc.nextIntArray(n);
    int[][] dp = new int[3][1 << n];
    for (int i = 0; i < 3; i++) {
      Arrays.fill(dp[i], Integer.MAX_VALUE);
    }
    int[] target = new int[] {a, b, c};
    for (int i = 0; i < 3; i++) {
      for (int j = 1; j < (1 << n); j++) {
        int sum = 0;
        int count = 0;
        for (int k = 0; k < n; k++) {
          if (((j >> k) & 1) == 1) {
            sum += l[k];
            count++;
          }
        }
        dp[i][j] = (count - 1) * 10 + Math.abs(sum - target[i]);
      }
    }
    int min = Integer.MAX_VALUE;
    for (int i = 1; i < (1 << n); i++) {
      for (int j = 1; j < (1 << n); j++) {
        for (int k = 1; k < (1 << n); k++) {
          boolean dup = false;
          for (int p = 0; p < n; p++) {
            if (((i >> p) & 1) + ((j >> p) & 1) + ((k >> p) & 1) > 1) {
              dup = true;
              break;
            }
          }
          if (!dup) min = Math.min(min, dp[0][i] + dp[1][j] + dp[2][k]);
        }
      }
    }
    System.out.println(min);
  }
}