import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  static HashMap<Integer, List<Integer>> graph = new HashMap<>();
  static int[] count;
  static boolean[] v;
  static int n;
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    count = new int[n + 1];
    v = new boolean[n + 1];
    for(int i = 1; i < n; ++i) {
      dfs(i, 0, x, y, false);
    }
    for(int i = 1; i <= n; ++i) {
      System.out.println(count[i]);
    }
  }
  private static void dfs(int i, int step, int x, int y, boolean v) {
    if(i == n || (v && i == y)) {
      return;
    }
    List<Integer> cur = graph.get(i);
    for(int j = i + 1; j <= (v ? y - 1 : n); ++j) {
      dfs(j, step + 1, x, y, v);
      if(j == x) {
        dfs(y, step + 1, x, y, true);
      }
    }
    count[step]++;
  }
}
