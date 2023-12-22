import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    int m = 0;
    Edge[] graph = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] s = br.readLine().split("\\s+");
      n = Integer.parseInt(s[0]);
      m = Integer.parseInt(s[1]);
      graph = new Edge[m];
      for (int i=0;i<m;i++) {
        s = br.readLine().split("\\s+");
        int a = Integer.parseInt(s[0])-1;
        int b = Integer.parseInt(s[1])-1;
        int c = Integer.parseInt(s[2]);
        graph[i] = new Edge(a,b,c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    Arrays.sort(graph,Comparator.comparingLong(e -> e.cost));
    UnionFind uf = new UnionFind(n);
    int c = 0;
    for (Edge e : graph) {
      if (!uf.same(e.from,e.to)) {
        c++;
        uf.unite(e.from,e.to);
      }
    }
    System.out.println(m-c);
  }
  private class Edge {
    private int from;
    private int to;
    private int cost;
    Edge(int from,int to,int cost) {
      this.from = from;
      this.to = to;
      this.cost = cost;
    }
  }
  private class UnionFind {
    int n;
    int[] par;
    int[] rank;
    int[] size;
    UnionFind(int n) {
      this.n = n;
      par = new int[n];
      rank = new int[n];
      size = new int[n];
      for (int i=0;i<n;i++) {
        par[i] = i;
        size[i] = 1;
      }
    }
    private int find(int i) {
      if (par[i] == i) return i;
      return par[i] = find(par[i]);
    }
    private boolean same(int i,int j) {
      return find(i) == find(j);
    }
    private int size(int i) {
      return size[find(i)];
    }
    private void unite(int i,int j) {
      i = find(i);
      j = find(j);
      if (i == j) return;
      if (rank[i] < rank[j]) {
        par[i] = j;
        size[j] += size[i];
      } else {
        par[j] = i;
        size[i] += size[j];
        if (rank[i] == rank[j]) rank[i]++;
      }
    }
  }
}