import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
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

  private static class Monster {
    int x;
    int h;
    Monster(int x, int h) {
      this.x = x;
      this.h = h;
    }
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int a = sc.nextInt();
    Monster[] monsters = new Monster[n];
    for (int i = 0; i < n; i++) {
      monsters[i] = new Monster(sc.nextInt(), sc.nextInt());
    }
    Arrays.sort(monsters, (Monster m1, Monster m2) -> m1.x - m2.x);
    long count = 0L;
    for (int i = 0; i < n; i++) {
      if (monsters[i].h <= 0) continue;
      int num = monsters[i].h % a == 0 ? monsters[i].h / a : monsters[i].h / a + 1;
      count += num;
      int attack = a * num;
      for (int j = i; j < n && monsters[j].x <= monsters[i].x + 2 * d; j++) {
        monsters[j].h -= attack;
      }
    }
    System.out.println(count);
  }
}