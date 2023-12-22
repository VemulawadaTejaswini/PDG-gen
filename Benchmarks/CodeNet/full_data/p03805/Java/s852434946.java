import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      Map<Integer, List<Integer>> graph = new HashMap<>();
      for(int i = 0; i < m; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        if(!graph.containsKey(u))
          graph.put(u, new ArrayList<>());
        if(!graph.containsKey(v))
          graph.put(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
      }
      Set<Integer> visited = new HashSet<>();
      visited.add(1);
      int res = dfs(graph, visited, 1);
      System.out.println(res);
  }

  private static int dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int curNode) {
    if(visited.size() == graph.size()) {
      return 1;
    }
    int res = 0;
    for(int child : graph.get(curNode)) {
      if(visited.contains(child)) continue;
      visited.add(child);
      res += dfs(graph, visited, child);
      visited.remove(child);
    }
    return res;
  }
}