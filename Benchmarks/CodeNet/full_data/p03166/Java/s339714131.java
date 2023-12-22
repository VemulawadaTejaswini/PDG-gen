import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int M = in.nextInt();
   
    List<Integer>[] graph = new ArrayList[N];
    int[] dp = new int[N];
    int ans = 0;
    
    for(int i = 0; i < N; i++) {
        graph[i] = new ArrayList();
    }
    
    for(int i = 0; i < M; i++) {
        int u = in.nextInt()-1;
        int v = in.nextInt()-1;
        graph[u].add(v);
    }
    
    List<Integer> order = topologicalSort(graph, N);
    
    for(int u : order) {
        ans = Math.max(dp[u], ans);
        for(int v : graph[u]) {
            dp[v] = Math.max(dp[v], dp[u]+1);
        }
    }
    
    System.out.println(ans);
    
  }
  
  private static List<Integer> topologicalSort(List<Integer>[] g, int N) {
      int[] indeg = new int[N];
      List<Integer> order = new ArrayList();
      int q = 0;
      
      for(int i = 0; i < N; i++) {
          for(int v : g[i]) {
              indeg[v]++;
          }
      }

      for(int i = 0; i < N; i++) {
          if(indeg[i] == 0) {
              order.add(i);
              q++;
          }
      }
      
      for(int i = 0; i < q; i++) {
          for(int v : g[order.get(i)]) {
              if(--indeg[v] == 0) {
                  order.add(v);
                  q++;
              }
          }
      }
      
      return order;
      
  }
  
}