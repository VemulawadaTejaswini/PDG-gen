import java.util.*;

public class Main {

  static int N; 
  static boolean[][] graph;
  static boolean[] visited;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    graph = new boolean[N][N];

    for (int i = 0; i < M; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      graph[a[i]][b[i]] = true;
      graph[b[i]][a[i]] = true;
    }

    sc.close();

    visited = new boolean[N];

    int count = 0;

    for (int i = 0; i < M; i++) {

      // 一旦全ての頂点を未到達にする
      for (int j = 0; j < N; j++) {
        visited[j] = false; 
      }

      // 1本辺を一旦無効にする
      graph[a[i]][b[i]] = false;
      graph[b[i]][a[i]] = false;

      // グラフが連結であるかを調べる
      dfs(0);

      // 1点でもvisited[i]がfalseだったら、無効した辺は橋
      for (int j = 0; j < N; j++) {
        if (visited[j] == false) {
          count++;
          break;
        }
      }

      // 無効にした辺を戻す
      graph[a[i]][b[i]] = true;
      graph[b[i]][a[i]] = true;

    }
    
    System.out.println(count);

  }

  // グラフが連結であるかを調べる
  public static void dfs(int v) {

    // 全て訪問済みなら終わり
    if (visited[v] == true) {
      return;
    }
    
    // 現在の頂点は訪問済み
    visited[v] = true;
 
    for (int i = 0; i < N; i++) {
      
      if (graph[v][i] == false) {
        continue;
      }
      
      dfs(i);
 
    }
  }

}