import java.util.*;

public class Main {

  class MaxFlow {
        class Edge {
            public final int to, rev;
            public long cap;
 
            public Edge(int to, int rev, long cap) {
                this.to = to;
                this.rev = rev;
                this.cap = cap;
            }
        }
 
        int v;
        List<Edge> G[];
        boolean used[];
 
        public MaxFlow(int v) {
            this.v = v;
            G = new List[v];
            for (int i = 0; i < v; ++i) {
                G[i] = new ArrayList<>();
            }
            used = new boolean[v];
        }
 
        public void add_edge(int from, int to, long cap) {
            G[from].add(new Edge(to, G[to].size(), cap));
            G[to].add(new Edge(from, G[from].size() - 1, 0));
        }
 
        long dfs(int v, int t, long f) {
            if (v == t) return f;
            used[v] = true;
            for (Edge e : G[v]) {
                if (!used[e.to] && e.cap > 0) {
                    long d = dfs(e.to, t, Math.min(f, e.cap));
                    if (d > 0) {
                        e.cap -= d;
                        G[e.to].get(e.rev).cap += d;
                        return d;
                    }
                }
            }
            return 0;
        }
 
        public long max_flow(int s, int t) {
            long flow = 0;
            while (true) {
                Arrays.fill(used, false);
                long f = dfs(s, t, Long.MAX_VALUE);
                if (f == 0) return flow;
                flow += f;
            }
        }
    }

    public static long solve(int n, long[] a) {
      MaxFlow flow = new MaxFlow(n + 2);
      long ans = 0;
      for(int i = 0; i < n; i++) {
        if(a[i] > 0) ans += a[i];
      }

      for(int i = 0; i < n; i++) {
        if(a[i] > 0) flow.add_edge(i, n + 1, (int)a[i]);
        if(a[i] <= 0) flow.add_edge(n, i, (-1) * (int)a[i]);
      }
      for(int i = 0; i < n; i++) {
        for(int j = 1; (i + 1) * j <= n; j++) {
          flow.add_edge(i, (i + 1) * j - 1, Long.MAX_VALUE / 2);
        }
      }
      return ans - flow.max_flow(n, n + 1);
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long a[] = new long[N];

    long ans = solve(N, a);

    System.out.println(ans);
  }
}
