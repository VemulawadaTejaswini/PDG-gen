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
  private static int modpow(int a, int n) {
    if (n == 0) return 1;
    if (n % 2 == 1) return (a * modpow(a, n - 1)) % 2019;
    int half = modpow(a, n / 2);
    return (half * half) % 2019;
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    String s = sc.next();
    int[] count = new int[2019];
    int result = 0;
    int num = 0;
    for (int i = 0; i < s.length(); i++) {
      num += Character.getNumericValue(s.charAt(s.length() - 1 - i)) * modpow(10, i);
      num %= 2019;
      result += count[num];
      count[num]++;
    }
    System.out.println(result);
  }
}