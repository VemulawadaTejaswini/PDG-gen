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

  private static class Work {
    int lastIndex;
    List<Integer> history = new ArrayList<>();
    void workAt(int index) {
      this.lastIndex = index;
      this.history.add(index);
    }
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int c = sc.nextInt();
    String s = sc.next();
    long[] count = new long[n];
    long countCombinations = 0L;
    Deque<Work> queue = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) != 'o') continue;
      Work w = new Work();
      w.workAt(i);
      queue.add(w);
    }
    while (!queue.isEmpty()) {
      Work w = queue.poll();
      if (w.history.size() == k) {
        countCombinations++;
        for (int index : w.history) {
          count[index]++;
        }
        continue;
      }
      for (int i = w.lastIndex + c + 1; i < n; i++) {
        if (s.charAt(i) != 'o') continue;
        Work newW = new Work();
        newW.history.addAll(w.history);
        newW.workAt(i);
        queue.add(newW);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (count[i] != countCombinations) continue;
      if (sb.length() > 0) sb.append("\n");
      sb.append(i + 1);
    }
    System.out.println(sb.toString());
  }
}