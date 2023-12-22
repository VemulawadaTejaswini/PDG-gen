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

  private static Set<Integer> getMoreThanMin(int min, List<int[]> trains) {
    Set<Integer> index = new HashSet<>();
    if (min <= trains.get(0)[0]) {
      for (int[] train: trains) {
        index.add(train[2]);
      }
    } else if (trains.get(trains.size() - 1)[0] >= min) {
      int left = -1;
      int right = trains.size() - 1;
      while (right - left > 1) {
        int center = left + (right - left) / 2;
        if (trains.get(center)[0] >= min) right = center;
        else left = center;
      }
      for (int i = right; i < trains.size(); i++) {
        index.add(trains.get(i)[2]);
      }
    }
    return index;
  }

  private static Set<Integer> getLessThanMax(int max, List<int[]> trains) {
    Set<Integer> index = new HashSet<>();
    if (trains.get(trains.size() - 1)[1] <= max) {
      for (int[] train: trains) {
        index.add(train[2]);
      }
    } else if (trains.get(0)[1] <= max) {
      int left = 0;
      int right = trains.size();
      while (right - left > 1) {
        int center = left + (right - left) / 2;
        if (trains.get(center)[1] <= max) left = center;
        else right = center;
      }
      for (int i = 0; i <= left; i++) {
        index.add(trains.get(i)[2]);
      }
    }
    return index;
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int q = sc.nextInt();
    int[][] lr = new int[m][3];
    int[][] pq = new int[q][2];
    for (int i = 0; i < m; i++) {
      lr[i][0] = sc.nextInt();
      lr[i][1] = sc.nextInt();
      lr[i][2] = i;
    }
    for (int i = 0; i < q; i++) {
      pq[i] = sc.nextIntArray(2);
    }
    List<int[]> l = new ArrayList<>();
    List<int[]> r = new ArrayList<>();
    for (int[] train : lr) {
      l.add(train);
      r.add(train);
    }
    Collections.sort(l, (int[] a, int[] b) -> a[0] - b[0]);
    Collections.sort(r, (int[] a, int[] b) -> a[1] - b[1]);
    for (int i = 0; i < q; i++) {
      int min = pq[i][0];
      int max = pq[i][1];
      Set<Integer> moreThanMin = getMoreThanMin(min, l);
      Set<Integer> lessThanMax = getLessThanMax(max, r);
      moreThanMin.retainAll(lessThanMax);
      System.out.println(moreThanMin.size());
    }
  }
}