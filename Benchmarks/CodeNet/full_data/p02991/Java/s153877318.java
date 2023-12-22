import java.util.*;
public class Main {
  
  private static long X = 1000000007;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] graph = new int[N+1][N+1];
    for (int i = 0; i < M; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      graph[u][v] = 1;
    }
    int S = sc.nextInt();
    int T = sc.nextInt();
    
    Set<Integer> reachable = new HashSet<>();
    reachable.add(T);
    boolean hasNewNode = true;
    
    boolean reachStart = false;
    int count = 0;
    
    LinkedList<Integer> queue = new LinkedList<>();
    queue.add(T);
    while (hasNewNode && !reachStart) {
      
      check(graph, queue);
      count++;
      
      hasNewNode = false;
      Iterator<Integer> itr = queue.iterator();
      while(itr.hasNext()){
        int node = itr.next();
        if (node == S) {
          reachStart = true;
        }
        hasNewNode |= reachable.add(node);
      }
    }
    
    if (reachStart) {
      System.out.println(count);
    } else {
      System.out.println(-1);
    }
  }
  
  private static void check(int[][] graph, LinkedList<Integer> queue) {

    for (int c = 0; c < 3; c++) {
      int nodeCount = queue.size();
      while (nodeCount-- > 0) {
        Integer node = queue.remove();
        for (int i = 1; i < graph.length; i++) {
          int v = graph[i][node];
          if (v == 1) {
            queue.add(i);
          }
        }
      }
    }
  }
}
