import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

  private static long getLcm(long a, long b) {
    long small = Math.min(a, b);
    long big = Math.max(a, b);
    while (big % small > 0) {
      long temp = small;
      small = big % small;
      big = temp;
    }
    return a * b / small;
  }

  private static long getLcm(long[] a) {
    long lcm = a[0];
    for (int i = 1; i < a.length; i++) {
      lcm = getLcm(lcm, a[i]);
    }
    return lcm;
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[] a = sc.nextLongArray(n);
    long[] b = new long[n];
    for (int i = 0; i < n; i++) b[i] = a[i] / 2L;
    long lcmA = getLcm(a);
    long lcmB = getLcm(b);
    if ((long) m / lcmB > 0) {
      System.out.println((long) m / lcmA + 1L);
    } else {
      System.out.println((long) m / lcmA);
    }
  }
}