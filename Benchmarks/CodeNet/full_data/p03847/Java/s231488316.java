import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    int M = 1_000_000_007;

    int n = 0;
    long t = N;
    while (t > 0) {
      n++;
      t >>= 1;
    }

    System.out.println(rec(n, N, M, new HashMap<>()));
  }

  private static long rec(int i, long j, long mod, HashMap<Pair, Long> memo) {
    if (j < 0) return 0;
    if (i <= 0) return 1;
    if ((1L << (i + 1)) - 2 < j) return rec(i, (1L << (i + 1)) - 2, mod, memo);
    Pair key = new Pair(i, j);
    if (memo.containsKey(key)) return memo.get(key);
    long res = rec(i - 1, j, mod, memo);
    res += rec(i - 1, j - (1L << (i - 1)), mod,memo);
    res %= mod;
    res += rec(i - 1, j - (1L << i), mod, memo);
    res %= mod;
    memo.put(key, res);
    return res;
  }

  private static class Pair {
    public final int i;
    public final long j;

    private Pair(int i, long j) {
      this.i = i;
      this.j = j;
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pair pair = (Pair) o;
      return i == pair.i &&
          j == pair.j;
    }

    @Override public int hashCode() {
      return Objects.hash(i, j);
    }
  }
}
