import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
  private static long M = 1_000_000_007;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Map<Key, Long> memo = new HashMap<>();
    System.out.println(dfs(new Key(N, new char[]{'T', 'T', 'T'}), memo));
  }

  private static long dfs(Key key, Map<Key, Long> memo) {
    if (memo.containsKey(key)) return memo.get(key);
    if (key.d == 0) return 1;
    long res = 0;
    for (char c : new char[]{'A', 'G', 'C', 'T'}) {
      if (c == 'C') {
        if (key.last[1] == 'A' && key.last[2] == 'G') continue;
        if (key.last[1] == 'G' && key.last[2] == 'A') continue;
        if (key.last[0] == 'A' && key.last[1] == 'G') continue;
        if (key.last[0] == 'A' && key.last[2] == 'G') continue;
      }
      if (key.last[1] == 'A' && key.last[2] == 'C' && c == 'G') continue;
      res += dfs(new Key(key.d - 1, new char[]{key.last[1], key.last[2], c}), memo);
      res %= M;
    }
    memo.put(key, res);
    return res;
  }

  private static class Key {
    private final int d;
    private final char[] last;

    private Key(int d, char[] last) {
      this.d = d;
      this.last = last;
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Key key = (Key) o;
      return d == key.d &&
          Arrays.equals(last, key.last);
    }

    @Override public int hashCode() {
      int result = Objects.hash(d);
      result = 31 * result + Arrays.hashCode(last);
      return result;
    }
  }
}