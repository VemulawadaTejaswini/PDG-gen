import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    new Main().solve();
  }

  private void solve() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      InputReader read = new InputReader();
      read.readAll(in);

      int n = read.nextInt();
      int m = read.nextInt();
      int r = read.nextInt();

      int[] t = read.mapInt(r);

      final int INF = 1 << 28;
      Graph G = new Graph(n, r, t);

      for (int a[] : G.graph) Arrays.fill(a, INF);
      for (int i = 0; i < m; i++) {
        int v1 = read.nextInt() - 1;
        int v2 = read.nextInt() - 1;
        int c  = read.nextInt();
        G.graph[v1][v2] = c;
        G.graph[v2][v1] = c;
      }

      // warshall-Froyd
      for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            G.graph[i][j] = min(G.graph[i][j], G.graph[i][k] + G.graph[k][j]);
          }
        }
      }

      final int ans = G.compute();
      out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

 class Graph {
    private int enm;
    private int[] pmt;
    private int ret;
    private boolean[] visited;

    public int[][] graph;
    // option
    private int t[];

    public Graph(int n, int enm, int[] t) {
      this.enm = enm;
      this.t = t;
      ret = Integer.MAX_VALUE;
      graph = new int[n][n];
      pmt = new int[enm];
      visited = new boolean[n];
    }

    public int compute() {
      dfs(0);
      return ret;
    }

    private void dfs(int cnt) {
      if(cnt == enm) {
        evalute();
        return;
      }
  
      for (int v: t) {
        if(visited[--v]) continue;

        pmt[cnt] = v;
        visited[v] = true;
        dfs(cnt+1);
        visited[v] = false;
      }
    }
  
    private void evalute() {
      int result = 0;
      for (int i = 1; i < enm; i++) result += graph[pmt[i-1]][pmt[i]];
      ret = min(ret, result);
    }
  }
  static int  atoi(String s) { return Integer.parseInt(s); }
  static long atol(String s) { return Long.parseLong(s); }

  class InputReader {
    private StringTokenizer st;
    private List<String> lns;
    private Iterator<String> p;
    public InputReader() { st = null; lns = new ArrayList<>(); }
    public InputReader(int size) { st = null; lns = new ArrayList<>(size); }
    public void readAll(BufferedReader in) {
      try {
        String ln = in.readLine();
        while(ln != null) { lns.add(ln); ln = in.readLine();}
      } catch (IOException e) { throw new UncheckedIOException(e); }
      p = lns.iterator();
    }
    public String next() {
      if(st == null || !st.hasMoreTokens())
        st = new StringTokenizer(p.next());
      return st.nextToken();
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public long nextLong() { return Long.parseLong(next()); }
    public int[] mapInt(int len) {
      st = new StringTokenizer(p.next());
      int[] ret = new int[len];
      for (int i = 0; i < len; i++) ret[i] = Integer.parseInt(st.nextToken());
      return ret;
    }
    public long[] mapLong(int len) {
      st = new StringTokenizer(p.next());
      long[] ret = new long[len];
      for (int i = 0; i < len; i++) ret[i] = Long.parseLong(st.nextToken());
      return ret;
    }
  }
}