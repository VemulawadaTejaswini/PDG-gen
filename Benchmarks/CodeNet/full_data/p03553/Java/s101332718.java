import java.util.*;

public class Main {
  static ArrayList<Edge>[] G;
  static int[] level;
  static int[] iter;
  static int N;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    long a[] = new long[N];
    long ans = 0;
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextLong();
      if(a[i] > 0) ans += a[i];
    }
    G = new ArrayList[N + 2];
    for(int i = 0; i < N + 2; i++) {
      G[i] = new ArrayList<Edge>();
    }
    level = new int[N + 2];
    iter = new int[N + 2];
    for(int i = 0; i < N; i++) {
      if(a[i] > 0) add_edge(i, N + 1, (int)a[i]);
      if(a[i] <= 0) add_edge(i, N, (-1) * (int)a[i]);
    }
    for(int i = 0; i < N; i++) {
      for(int j = 1; (i + 1) * j <= N; j++) {
        add_edge(i, (i + 1) * j - 1, (int)Math.pow(10, 13));
      }
    }
    System.out.println(ans - max_flow(N, N + 1));
  }

  public static void add_edge(int from, int to, int cap) {
    G[from].add(new Edge(to, cap, G[to].size()));
    G[to].add(new Edge(from, 0, G[from].size() - 1));
  }

  public static void bfs(int s) {
    for(int i = 0; i < level.length; i++) {
      level[i] = -1;
    }
    LinkedList<Integer> queue = new LinkedList<Integer>();
    level[N] = 0;
    queue.add(N);
    while(queue.size() > 0) {
      int v = queue.poll();
      for(int i = 0; i < G[v].size(); i++) {
        Edge e = G[v].get(i);
        if(e.cap > 0 && level[e.to] < 0) {
          level[e.to] = level[v] + 1;
          queue.add(e.to);
        }
      }
    }
  }

  public static int dfs(int v, int t, int f) {
    if(v == t) return f;
    for(int i = iter[v]; i < G[v].size(); i++) {
      Edge e = G[v].get(i);
      if(e.cap > 0 && level[v] < level[e.to]) {
        int d = dfs(e.to, t, Math.min(f, e.cap));
        if(d > 0) {
          e.cap -= d;
          G[e.to].get(e.rev).cap += d;
          return d;
        }
      }
    }
    return 0;
  }

  public static int max_flow(int s, int t) {
    int flow = 0;
    for(; ; ) {
      bfs(N);
      if(level[N + 1] < 0) return flow;
      for(int i = 0; i < iter.length; i++) {
        iter[i] = 0;
      }
      int f;
      while((f = dfs(N, N + 1, (int)Math.pow(10, 13))) > 0) {
        flow += f;
      }
    }
  }
}

class Edge {
  int to;
  int cap;
  int rev;

  public Edge(int to, int cap, int rev) {
    this.to = to;
    this.cap = cap;
    this.rev = rev;
  }
}