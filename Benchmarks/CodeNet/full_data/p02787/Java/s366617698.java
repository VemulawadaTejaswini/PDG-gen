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

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    Map<Integer, Integer> magics = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int j = 0;
      while (a[i] * j <= h) {
        magics.merge(a[i] * j, b[i] * j, Math::min);
        j++;
      }
    }
    Map<Integer, Integer> dp1 = new HashMap<>();
    Map<Integer, Integer> dp2 = new HashMap<>();
    dp1.put(0, 0);
    for (int at : magics.keySet()) {
      dp2.clear();
      for (int hp : dp1.keySet()) {
        dp2.merge(hp, dp1.get(hp), Math::min);
        dp2.merge(Math.min(h, hp + at), dp1.get(hp) + magics.get(at), Math::min);
      }
      dp1.clear();
      dp1.putAll(dp2);
    }
    System.out.println(dp1.get(h));
  }
}