import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  static class FastScanner {
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

  private static int gcd(int a, int b) {
    int large = Math.max(a, b);
    int small = Math.min(a, b);
    while (large % small > 0) {
      int temp = small;
      small = large % small;
      large = small;
    }
    return large;
  }


  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] a = sc.nextIntArray(n);
    if (n == 2) {
      System.out.println(Math.max(a[0], a[1]));
      return;
    }
    int[] gcdLeft = new int[n];
    gcdLeft[0] = a[0];
    int[] gcdRight = new int[n];
    gcdRight[n - 1] = a[n - 1];
    for (int i = 1; i < n; i++) {
      gcdLeft[i] = gcd(gcdLeft[i - 1], a[i]);
    }
    for (int i = n - 2; i >= 0; i--) {
      gcdRight[i] = gcd(gcdRight[i + 1], a[i]);
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        max = Math.max(max, gcdRight[i + 1]);
      } else if (i == n - 1) {
        max = Math.max(max, gcdLeft[i - 1]);
      } else {
        max = Math.max(gcd(gcdLeft[i - 1], gcdRight[i + 1]), max);
      }
    }
    System.out.println(max);
  }
}