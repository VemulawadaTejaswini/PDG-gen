import java.util.*;
public class Main {
  
  private static class Edge {
    int node;
    int weight;
    public Edge(int n, int w) {
      this.node = n;
      this.weight = w;
    }
  }
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer, List<Edge>> graph = new HashMap<>();
      for(int i = 1; i <= n; i++)
        graph.put(i, new ArrayList<>());

      for(int i = 0; i < n - 1; i++) {
        int v = sc.nextInt();
        int u = sc.nextInt();
        int w = sc.nextInt();
        Edge edge1 = new Edge(u, w);
        Edge edge2 = new Edge(v, w);
        graph.get(v).add(edge1);
        graph.get(u).add(edge2);
      }
      int qCnt = sc.nextInt();
      int k = sc.nextInt();
      Map<Integer, Long> distMap = new HashMap<>();
      bfs(k, graph, distMap);
      for(int i = 0; i < qCnt; i++)
        System.out.println(distMap.get(sc.nextInt()) + distMap.get(sc.nextInt()));
  }

  private static void bfs(int k, Map<Integer, List<Edge>> graph, Map<Integer, Long> distMap) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(k);
    Set<Integer> visited = new HashSet<>();
    visited.add(k);

    distMap.put(k, 0L);
    while(!queue.isEmpty()) {
      int node = queue.poll();
      long dist = distMap.get(node);
      for(Edge e : graph.get(node)) {
        if(visited.contains(e.node)) continue;
        distMap.put(e.node, e.weight + dist);
        queue.offer(e.node);
        visited.add(e.node);
      }
    }
  }
}