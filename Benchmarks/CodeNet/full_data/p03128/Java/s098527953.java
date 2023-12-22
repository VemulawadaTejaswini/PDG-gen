import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
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
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = sc.nextIntArray(m);
    int[] matches = new int[] {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    Map<Integer, BigInteger> dp = new HashMap<>();
    dp.put(0, BigInteger.valueOf(0L));
    Map<Integer, BigInteger> dpn = new HashMap<>();
    while (!dp.isEmpty()) {
      dpn.clear();
      boolean changed = false;
      for (int used : dp.keySet()) {
        for (int d : a) {
          int newused = used + matches[d];
          if (newused > n) continue;
          BigInteger val = dp.get(used).multiply(BigInteger.valueOf(10L)).add(BigInteger.valueOf(d));
          if (!dpn.containsKey(newused) || dpn.get(newused).compareTo(val) < 0) {
            changed = true;
            dpn.put(newused, val);
          }
        }
      }
      if (!changed) break;
      dp.clear();
      dp.putAll(dpn);
    }
    System.out.println(dp.get(n).toString());
  }
}