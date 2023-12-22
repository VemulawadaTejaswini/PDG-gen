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
    int x = sc.nextInt() - 1;
    int y = sc.nextInt() - 1;
    List<List<Integer>> nodes = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      List<Integer> node = new ArrayList<>();
      if (i + 1 < n) node.add(i + 1);
      if (i - 1 >= 0) node.add(i - 1);
      nodes.add(node);
    }
    nodes.get(x).add(y);
    nodes.get(y).add(x);
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      int[] mins = new int[n];
      Arrays.fill(mins, n);
      mins[i] = 0;
      Deque<Integer> queue = new ArrayDeque<>();
      queue.add(i);
      while (!queue.isEmpty()) {
        int id = queue.poll();
        for (int j : nodes.get(id)) {
          if (mins[j] > mins[id] + 1) {
            mins[j] = mins[id] + 1;
            queue.add(j);
          }
        }
      }
      for (int j = i + 1; j < n; j++) {
        result[mins[j]]++;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int k = 1; k < n; k++) {
      if (sb.length() > 0) sb.append("\n");
      sb.append(result[k]);
    }
    System.out.println(sb.toString());
  }
}