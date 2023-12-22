import java.util.*;

public class Main {
  static long[] dp;
  static ArrayList[] edge;
  static HashMap<Edge, Long> cost;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    dp = new long[n];
    edge = new ArrayList[n];
    cost = new HashMap<Edge, Long>();
    for(int i = 0; i < n; i++) {
      edge[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < n - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      Edge e1 = new Edge(a, b);
      Edge e2 = new Edge(b, a);
      long c = sc.nextLong() - 1;
      cost.put(e1, c);
      cost.put(e2, c);
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
    if((parent >= 0) && (e.size() == 1)) {
      
    } else {
      for(int i = 0; i < e.size(); i++) {
        int u = e.get(i);
        if(u != parent) {
          Edge eg = new Edge(u, v);
          long c = cost.get(eg);
          dp[u] = dp[v] + c;
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