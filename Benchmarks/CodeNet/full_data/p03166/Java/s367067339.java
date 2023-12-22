import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void dfs(int[][] graph, int n, int u, boolean[] visited, 
        int[] indegree, int[] dp) {
        visited[u] = true;
        for(int v = 1; v <= n; v++) {
            if(graph[u][v] == 1) {
                dp[v] = Math.max(dp[v], dp[u] + 1);
                indegree[v]--;
                if(indegree[v] == 0) {
                    dfs(graph, n, v, visited, indegree, dp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] graph = new int[n + 1][n + 1];
        int[] indegree = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        int[] dp = new int[n + 1];

        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
            indegree[y]++;
        }

        for(int i = 1; i <= n; i++) {
            if(!visited[i] && indegree[i] == 0) {
                dfs(graph, n, i, visited, indegree, dp);
            }
        }

        int result = 0;
        for(int i = 1; i <= n; i++) {
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
  }
}
