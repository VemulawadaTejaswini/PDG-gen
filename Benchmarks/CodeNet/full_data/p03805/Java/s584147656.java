import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] v = new int[N+1][N+1];
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      v[a][b] = 1;
      v[b][a] = 1;
    }
    
    boolean[] visited = new boolean[N+1];
    visited[1] = true;
    int ans = dfs(v, 1, visited);

    System.out.println(ans);
  }
  
  private static int dfs(int[][] v, int n, boolean[] visited) {
    
    boolean allVisited = true;
    for (int i = 1; i < visited.length; i++) {
      if (!visited[i]) {
        allVisited = false;
        break;
      }
    }
    if (allVisited) {
      return 1;
    }

    int ret = 0;
    for (int i = 1; i < v[n].length; i++) {
      if (v[n][i] == 1 && !visited[i]) {
        visited[i] = true;
        ret += dfs(v, i, visited);
        visited[i] = false;
      }
    }
    return ret;
  }
}