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

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  MaxFlow flow = new MaxFlow(N + 2);
  long a[] = new long[N];
  long ans = 0;
  for(int i = 0; i < N; i++) {
    a[i] = sc.nextLong();
    if(a[i] > 0) ans += a[i];
  }

  for(int i = 0; i < N; i++) {
      if(a[i] > 0) flow.add_edge(i, N + 1, (int)a[i]);
      if(a[i] <= 0) flow.add_edge(N, i, (-1) * (int)a[i]);
  }
  for(int i = 0; i < N; i++) {
    for(int j = 1; (i + 1) * j <= N; j++) {
      flow.add_edge(i, (i + 1) * j - 1, Long.MAX_VALUE / 2);
    }
  }

  System.out.println(ans - flow.max_flow(N, N + 1));
  }
}