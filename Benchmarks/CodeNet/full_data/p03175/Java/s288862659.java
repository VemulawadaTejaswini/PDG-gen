import java.util.*;
     
public class Main {
  private final static int MOD = 1000000007;
     
  private static long solve(int n, int[][] edges) {
    List<List<Integer>> adj = new ArrayList<>(n + 1);
    for (int i  = 0; i <= n; i++) {
      adj.add(new ArrayList<>());
    }
    
    for (int[] edge : edges) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }

    long[] res = dfs(adj, 1, -1);
    return (res[0] + res[1]) % MOD;
  }
  
  static long[] dfs(List<List<Integer>> adj, int cur, int parent) {
    long[] res = new long[2]; 
    Arrays.fill(res, 1);

    for (int next : adj.get(cur)) {
      if (next != parent) {
        long[] child = dfs(adj, next, cur);
        res[0] = (res[0] * child[1]) % MOD;
        res[1] = (res[1] * ( child[0] + child[1])) % MOD;
      }
    }

    return res;
  }



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] edges = new int[n-1][2];
    for (int i = 0; i < n-1; i++) {
      edges[i] = new int[] { scanner.nextInt() - 1, scanner.nextInt() - 1};
    }

    long result = solve(n, edges);
    System.out.println(result); 
  } 
}