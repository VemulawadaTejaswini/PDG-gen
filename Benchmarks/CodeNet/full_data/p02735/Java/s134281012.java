import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
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
  private static class Agent {
    int i;
    int j;
    Agent(int i, int j) {
      this.i = i;
      this.j = j;
    }
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int[][] cells;
    int h = sc.nextInt();
    int w = sc.nextInt();
    cells = new int[h][w];
    for (int i = 0; i < h; i++) {
      String row = sc.next();
      for (int j = 0; j < w; j++) {
        cells[i][j] = row.charAt(j) == '.' ? 1 : 0;
      }
    }
    int[][] mins = new int[h][w];
    for (int i = 0; i < h; i++) {
      Arrays.fill(mins[i], Integer.MAX_VALUE);
    }
    Deque<Agent> queue = new ArrayDeque<>();
    mins[0][0] = cells[0][0] == 1 ? 0 : 1;
    queue.add(new Agent(0, 0));
    while (!queue.isEmpty()) {
      Agent a = queue.poll();
      if (a.i + 1 < h) {
        int cost = mins[a.i][a.j];
        if (cells[a.i][a.j] == 1 && cells[a.i + 1][a.j] == 0) {
          cost += 1;
        }
        if (mins[a.i + 1][a.j] > cost) {
          mins[a.i + 1][a.j] = cost;
          queue.add(new Agent(a.i + 1, a.j));
        }
      }
      if (a.j + 1 < w) {
        int cost = mins[a.i][a.j];
        if (cells[a.i][a.j] == 1 && cells[a.i][a.j + 1] == 0) {
          cost += 1;
        }
        if (mins[a.i][a.j + 1] > cost) {
          mins[a.i][a.j + 1] = cost;
          queue.add(new Agent(a.i, a.j + 1));
        }
      }
    }
    System.out.println(mins[h - 1][w - 1]);
  }
}