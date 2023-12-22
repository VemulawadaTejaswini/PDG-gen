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

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] h = sc.nextIntArray(n);
    Deque<List<Integer>> queue = new ArrayDeque<>();
    queue.add(new ArrayList<Integer>() {
      {
        for (int hi : h) {
          add(hi);
        }
      }
    });
    int count = 0;
    while (!queue.isEmpty()) {
      List<Integer> list = queue.poll();
      int min = Integer.MAX_VALUE;
      for (int hi : list) {
        min = Math.min(min, hi);
      }
      count += min;
      List<Integer> next = new ArrayList<>();
      for (int hi : list) {
        if (hi - min > 0) {
          next.add(hi - min);
        } else {
          if (next.size() > 0) queue.add(next);
          next = new ArrayList<>();
        }
      }
      if (next.size() > 0) queue.add(next);
    }
    System.out.println(count);
  }
}