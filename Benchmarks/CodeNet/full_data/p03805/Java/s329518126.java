import java.util.*;

public class Main {

  static int N; 
  static boolean[][] graph;
  static boolean[] visited;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    N = sc.nextInt();
    int M = sc.nextInt();
    graph = new boolean[N][N];

    for (int i = 0; i < M; i++) {
      int a_ = sc.nextInt();
      int b_ = sc.nextInt();
      graph[a_-1][b_-1] = true;
      graph[b_-1][a_-1] = true;
    } 

    visited = new boolean[N];

    visited[0] = true;

    sc.close();

    int count = dfs(0);

    System.out.println(count);
    
  }

  static int dfs(int v){

    boolean allVisited = true;

    for (int i = 0; i < N; i++) {

      if (visited[i] == false) {
        allVisited = false;
        break;
      }
      
    }

    if (allVisited) {
      return 1;
    }

    int count = 0;

    for (int i = 0; i < N; i++) {

      if (graph[v][i] == false) {
        continue;
      }
      
      if (visited[i]) {
        continue;
      }
      
      visited[i] = true;
      
      count += dfs(i);

      visited[i] = false;

    }

    return count;
  }

}