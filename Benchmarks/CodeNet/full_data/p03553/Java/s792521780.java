import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    long s = 0L;
    FordFulkerson ff = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      n = Integer.parseInt(br.readLine());
      long[] a = Arrays.stream(br.readLine().split("\\s+"))
        .mapToLong(Long::parseLong).toArray();
      ff = new FordFulkerson(n+2);
      for (int i=1;i<n+1;i++) {
        if (a[i-1] > 0) {
          s += a[i-1];
          ff.addEdge(i,n+1,a[i-1]);
        } else {
          ff.addEdge(0,i,-a[i-1]);
        }
        for (int j=2*i;j<n+1;j+=i) {
          ff.addEdge(i,j,1000000000000000L);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(s-ff.execute(0,n+1));
  }
  private class FordFulkerson {
    private List<Edge>[] graph;
    private boolean[] used;
    FordFulkerson(int n) {
      graph = new List[n];
      for (int i=0;i<n;i++) graph[i] = new ArrayList<>();
      used = new boolean[n];
    }
    private void addEdge(int fm,int to,long cp) {
      graph[fm].add(new Edge(to,cp,graph[to].size()));
      graph[to].add(new Edge(fm,0,graph[fm].size()-1));
    }
    private long execute(int s,int t) {
      for (long flow=0;;) {
        Arrays.fill(used,false);
        long f = dfs(s,t,100000000000000L);
        if (f == 0) return flow;
        flow += f;
      }
    }
    private long dfs(int v,int t,long f) {
      if (v == t) return f;
      used[v] = true;
      for (int i=0;i<graph[v].size();i++) {
        Edge e = graph[v].get(i);
        if(used[e.to] || e.cp <= 0) continue;
        long d = dfs(e.to,t,Math.min(f,e.cp));
        if (d > 0) {
          e.cp -= d;
          graph[e.to].get(e.rv).cp += d;
          return d;
        }
      }
      return 0;
    }
  }
  private class Edge {
    private int to;
    private long cp;
    private int rv;
    Edge(int to,long cp,int rv) {
      this.to = to;
      this.cp = cp;
      this.rv = rv;
    }
  }
}