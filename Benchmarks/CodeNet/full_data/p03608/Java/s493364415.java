import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
  static StringTokenizer st;
  public static void main(String[] args) {
    new ABC073D2().solve();
  }

  private void solve() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      read(in.readLine());
      int n = atoi(next());
      int m = atoi(next());
      int r = atoi(next());

      int[] t = mapInt(r, read(in.readLine()));

      final int INF = 1 << 28;
      Graph G = new Graph(n, r, t);

      for (int a[] : G.graph) Arrays.fill(a, INF);
      for (int i = 0; i < m; i++) {
        int[] edge = mapInt(3, read(in.readLine()));
        G.graph[edge[0]-1][edge[1]-1] = edge[2];
        G.graph[edge[1]-1][edge[0]-1] = edge[2];
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

  static StringTokenizer read(String ln) { st = new StringTokenizer(ln); return st;}
  static String next() { return st.nextToken(); }
  static int  atoi(String s) { return Integer.parseInt(s); }
  static long atol(String s) { return Long.parseLong(s); }
  static int[] mapInt(int len, StringTokenizer st) {
    int[] ret = new int[len];
    for (int i = 0; i < len; i++) ret[i] = Integer.parseInt(st.nextToken());
    return ret;
  }
  static int[] mapInt(String[] sa) {
    int[] ret = new int[sa.length];
    for (int i = 0; i < sa.length; i++) ret[i] = Integer.parseInt(sa[i]);
    return ret;
  }
  static void mapInt(int[] ret, String[] sa) {
    for (int i = 0; i < sa.length; i++) ret[i] = Integer.parseInt(sa[i]);
  }
  static long[] mapLong(String[] sa) {
    long[] ret = new long[sa.length];
    for (int i = 0; i < sa.length; i++) ret[i] = Long.parseLong(sa[i]);
    return ret;
  }
  static void mapLong(long[] ret, String[] sa) {
    for (int i = 0; i < sa.length; i++) ret[i] = Long.parseLong(sa[i]);
  }
}