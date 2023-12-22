import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

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

  private static boolean check(long xi) {
    boolean three = false;
    boolean five = false;
    boolean seven = false;
    while (xi > 0L) {
      long d = xi % 10L;
      if (d == 3L) three = true;
      if (d == 5L) five = true;
      if (d == 7L) seven = true;
      xi /= 10L;
    }
    return three && five && seven;
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    long n = sc.nextLong();
    if (n < 357L) {
      System.out.println(0);
      return;
    }
    int c = 0;
    long[] d = new long[] {3L, 5L, 7L};
    Deque<Long> queue = new ArrayDeque<>();
    queue.add(3L);
    queue.add(5L);
    queue.add(7L);
    while (!queue.isEmpty()) {
      long x = queue.poll();
      if (check(x)) c++;
      for (long di : d) {
        if (x * 10L + di > n) break;
        queue.add(x * 10L + di);
      }
    }
    System.out.println(c);
  }
}