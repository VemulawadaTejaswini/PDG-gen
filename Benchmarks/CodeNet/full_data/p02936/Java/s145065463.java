// https://atcoder.jp/contests/abc138/submissions/9369775
import java.util.*;
import java.io.PrintWriter;
 
public class Main {
 
  public static ArrayList[] edge;
  public static long[] point;
  public static boolean[] visit;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    point = new long[n];
    visit = new boolean[n];
    edge = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      edge[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < n - 1; i++) {
      int a = Integer.parseInt(sc.next()) - 1;
      int b = Integer.parseInt(sc.next()) - 1;
      edge[a].add(b);
      edge[b].add(a);
    }
    for(int i = 0; i < q; i++) {
      int p = Integer.parseInt(sc.next()) - 1;
      long x = sc.nextLong();
      point[p] += x;
    }
 
    dfs(0, -1);
    PrintWriter out = new PrintWriter(System.out);
    for(int i = 0; i < n; i++) {
      out.print(point[i] + " ");
    }
    out.flush();
  }
 
  public static void dfs(int v, int p) {
    ArrayList<Integer> list = edge[v];
    long x = point[v];
    for(int i = 0; i < list.size(); i++) {
      int t = list.get(i);
 
      if(!visit[t] && t != p) {
        point[t] += x;
        dfs(t, v);
      }
    }
  }
}