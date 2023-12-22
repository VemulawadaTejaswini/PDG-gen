import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      Map<Integer, List<Integer>> graph = new HashMap<>();
      for(int i = 1; i <= n; i++) graph.put(i, new ArrayList<>());
      for(int i = 1; i < n; i++) {
        graph.get(i).add(i+1);
        graph.get(i+1).add(i);
      }
      graph.get(x).add(y);
      graph.get(y).add(x);

      Map<Integer, Integer> cntMap = new HashMap<>();
      for(int i = 1; i <= n; i++)
          bfs(cntMap, graph, i);
      
      for(int k = 1; k <= n - 1; k++)
        System.out.println(cntMap.getOrDefault(k, 0));
  }

  private static void bfs(Map<Integer, Integer> cntMap, Map<Integer, List<Integer>> graph, int start) {
      Set<Integer> visited = new HashSet<>();
      visited.add(start);
      Queue<Integer> queue = new LinkedList<>();
      queue.offer(start);
      int t = 0;
      while(!queue.isEmpty()) {
        int size = queue.size();
        for(int i = 0; i < size; i++) {
          int node = queue.poll();
          List<Integer> children = graph.get(node);
          for(int child : children) {
            if(visited.contains(child)) continue;
            visited.add(child);
            queue.offer(child);
            if(start < child)
                cntMap.put(t+1, cntMap.getOrDefault(t+1, 0) + 1);
          }
        }
        t++;
      }
  }
}