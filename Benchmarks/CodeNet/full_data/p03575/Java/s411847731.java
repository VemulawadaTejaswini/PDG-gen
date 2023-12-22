import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] graph = new int[N+1][N+1];
    int[][] edge = new int[M][2];
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      graph[a][b] = 1;
      graph[b][a] = 1;
      edge[i][0] = a;
      edge[i][1] = b;
    }
    
    int bridge = 0;
    for (int i = 0; i < M; i++) {

      int aa = edge[i][0];
      int bb = edge[i][1];

      graph[aa][bb] = 0;
      graph[bb][aa] = 0;

      int[] visited = new int[N+1];
      dfs(graph, 1, visited);
      boolean visiteAll = true;
      for (int j = 1; j <= N; j++) {
        if (visited[j] != 1) {
          visiteAll = false;
          break;
        }
      }
      if (!visiteAll) {
        bridge++;
      }
      
      graph[aa][bb] = 1;
      graph[bb][aa] = 1;
    }

    System.out.println(bridge);
  }
  
  private static void dfs(int[][] graph, int v, int[] visited) {
    visited[v] = 1;
    for (int i = 1; i < graph[v].length; i++) {
      if (graph[v][i] == 1 && visited[i] != 1) {
        dfs(graph, i, visited);
      }
    }
  }
}