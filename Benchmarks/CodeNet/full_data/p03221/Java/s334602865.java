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

  private static class City {
    int index;
    int pref;
    int year;
    int x;
    City(int index, int pref, int year) {
      this.index = index;
      this.pref = pref;
      this.year = year;
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Map<Integer, List<City>> pref = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      pref.put(i, new ArrayList<>());
    }
    List<City> cities = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      int p = sc.nextInt();
      int y = sc.nextInt();
      City c = new City(i, p, y);
      cities.add(c);
      pref.get(p).add(c);
    }
    for (List<City> cs : pref.values()) {
      Collections.sort(cs, (City c1, City c2) -> c1.year - c2.year);
      for (int i = 0; i < cs.size(); i++) {
        cs.get(i).x = i + 1;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (City c : cities) {
      if (sb.length() > 0) sb.append("\n");
      sb.append(String.format("%06d%06d", c.pref, c.x));
    }
    System.out.println(sb.toString());
  }
}