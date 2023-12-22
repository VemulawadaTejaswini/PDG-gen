import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static long MOD = 1000000007;

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int m = sc.nextInt();

    List<Integer> s = new ArrayList<>();
    List<Integer> t = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      s.add(sc.nextInt());
    }
    for (int i = 0; i < m; i++) {
      t.add(sc.nextInt());
    }
    os.println(search(s, t));
  }

  private static class Pair {
    int sSize;
    int tSize;

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Pair pair = (Pair) o;
      return sSize == pair.sSize &&
          tSize == pair.tSize;
    }

    @Override
    public int hashCode() {
      return Objects.hash(sSize, tSize);
    }
  }

//  private static Map<Pair, Long> memo = new HashMap<>();

  private static Map<Integer, Map<Integer, Long>> memo = new HashMap<>();

  private static long search(List<Integer> s, List<Integer> t) {
//    Pair p = new Pair();
//    p.sSize = s.size();
//    p.tSize = t.size();
//    if (memo.containsKey(p)) return memo.get(p);

    if (memo.containsKey(s.size()) && memo.get(s.size()).containsKey(t.size())) return memo.get(s.size()).get(t.size());

    long res = 0;
    // empty
    res++;
    res = res % MOD;
    for (int i = 0; i < s.size(); i++){
      int toSearchFromT = s.get(i);
      for (int j = 0; j < t.size(); j++) {
        if (t.get(j) == toSearchFromT) {
          res += search(s.subList(i + 1, s.size()), t.subList(j + 1, t.size()));
        }
        res = res % MOD;
      }
    }
    Map<Integer, Long> map = memo.getOrDefault(s.size(), new HashMap<>());
    map.put(t.size(), res);
    memo.put(s.size(), map);
//    memo.put(p, res);
    return res;
  }
}