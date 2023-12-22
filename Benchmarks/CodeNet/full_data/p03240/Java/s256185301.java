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
    int n = sc.nextInt();
    int[][] xyh = new int[n][3];
    for (int i = 0; i < n; i++) {
      xyh[i] = sc.nextIntArray(3);
    }
    for (int cx = 0; cx <= 100; cx++) {
      for (int cy = 0; cy <= 100; cy++) {
        int maxh = Integer.MAX_VALUE;
        Integer h = null;
        boolean isok = true;
        for (int i = 0; i < n; i++) {
          int xi = xyh[i][0];
          int yi = xyh[i][1];
          int hi = xyh[i][2];
          int term1 = Math.max(xi - cx, cx - xi);
          int term2 = Math.max(yi - cy, cy - yi);
          if (hi == 0) {
            maxh = Math.min(maxh, term1 + term2);
          } else if (h == null) {
            h = hi + term1 + term2;
          } else if (h != hi + term1 + term2) {
            isok = false;
            break;
          }
        }
        if (!isok) continue;
        if (h > maxh) continue;
        if (h == null) continue;
        System.out.println(cy + " " + cy + " " + h);
        return;
      }
    }
  }
}