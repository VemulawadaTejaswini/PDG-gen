import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  int n, m;
  List<Integer>[] e;
  Map<Pair, Integer> c;
  int step;

  class Pair implements Comparable<Pair> {
    int a, b;

    Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }

    @Override
    public int compareTo(Pair o) {
      if (this.a != o.a) {
        return this.a - o.a;
      }
      return this.b - o.b;
    }
  }

  boolean dfs(int k, long d, long[] dist) {
    step++;
    if (n * n < step) {
      return false;
    }
    dist[k] = Math.max(dist[k], d);

    for (Integer to : e[k]) {
      long nd = d + c.get(new Pair(k, to));
      if (nd <= dist[to]) {
        continue;
      }
      if (!dfs(to, nd, dist)) {
        return false;
      }
    }
    return true;
  }

  void run() {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();
    e = new LinkedList[n];
    for (int i = 0; i < n; i++) {
      e[i] = new LinkedList<Integer>();
    }
    c = new TreeMap<Pair, Integer>();
    for (int j = 0; j < m; j++) {
      int s = sc.nextInt() - 1;
      int t = sc.nextInt() - 1;
      int u = sc.nextInt();
      e[s].add(t);
      c.put(new Pair(s, t), u);
    }

    long[] dist = new long[n];
    Arrays.fill(dist, Long.MIN_VALUE);
    boolean f = dfs(0, 0, dist);
    System.out.println(f ? dist[n - 1] : "inf");
  }

  public static void main(String[] args) {
    new Main().run();
  }
}
