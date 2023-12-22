import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    
    // matrix
    // boolean[][] matrix = new boolean[n][n];
    // list
    Map<Integer, List<Integer>> lists = new HashMap<>();
    
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      List<Integer> list = new ArrayList<>();
      
      for (int j = 0; j < n; j++) {
        if (s.charAt(j) == '1') {
          // matrix[i][j] = true;
          list.add(j);
        }
      }
      lists.put(i, list);
    }
    
    // if there's no leaf, impossible.
    List<Integer> leaves = new ArrayList<>();
    for (int i = 0;i < n; i++) {
      if (lists.get(i).size() == 1) {
        leaves.add(i);
      }
    }
    if (leaves.isEmpty()) {
      os.println("-1");
      return;
    }
    
    int max = -1;
    for (int leaf : leaves) {
      max = Math.max(depth(leaf, lists), max);
    }
    os.println(max);
  }
  
  private static int depth(int start, Map<Integer, List<Integer>> lists) {
    Set<Integer> used = new HashSet<>();
    Set<Integer> level = new HashSet<>();
    Set<Integer> lastLevel = new HashSet<>();
    level.add(start);

    int count = 0;
    while (used.size() < lists.size()) {
      count++;
      Set<Integer> newLevel = new HashSet<>();
      for (int node : level) {
        List<Integer> nexts = lists.get(node);
        for (int next : nexts) {
          if (lastLevel.contains(next)) {
            // visited last time
            continue;
          }
          if (used.contains(next)) {
            // visiting again
            return -1;
          }
          newLevel.add(next);
        }
        used.addAll(level);
      }
      lastLevel = level;
      level = newLevel;
    }
    return count;
  }
}