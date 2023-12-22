import java.util.*;

public class Main {
  static long[] dp;
  static ArrayList[] edge;
  static ArrayList[] cost;
  //static HashMap<int[], Long> cost;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    dp = new long[n];
    edge = new ArrayList[n];
    cost = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      edge[i] = new ArrayList<Integer>();
      cost[i] = new ArrayList<Long>();
    }
    for(int i = 0; i < n - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      long c = sc.nextLong();
      cost[a].add(c);
      cost[b].add(c);
      edge[a].add(b);
      edge[b].add(a);
    }
    int Q = sc.nextInt();
    int K = sc.nextInt() - 1;
    dfs(K, -1);
    for(int i = 0; i < Q; i++) {
      int x = sc.nextInt() - 1;
      int y = sc.nextInt() - 1;
      System.out.println(dp[x] + dp[y]);
    }
  }

  public static void dfs(int v, int parent) {
    ArrayList<Integer> e = edge[v];
    ArrayList<Long> c = cost[v];
    if((parent >= 0) && (e.size() == 1)) {
      
    } else {
      for(int i = 0; i < e.size(); i++) {
        int u = e.get(i);
        if(u != parent) {
          long ct = c.get(i);
          dp[u] = dp[v] + ct;
          dfs(u, v);
        }
      }
    }
  }
}

class Edge {
  int u;
  int v;
  Edge(int u, int v) {
    this.u = u;
    this.v = v;
  }
}