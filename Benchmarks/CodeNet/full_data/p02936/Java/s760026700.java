import java.util.*;

public class Main {

  public static ArrayList[] edge;
  public static long[] point;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    point = new long[n];
    edge = new ArrayList[n];
    ArrayList<Integer> l = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      edge[i] = l;
    }
    for(int i = 0; i < n - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      edge[a].add(b);
      edge[b].add(a);
    }
    for(int i = 0; i < q; i++) {
      int p = sc.nextInt() - 1;
      long x = sc.nextLong();
      point[p] += x;
    }
 //   dfs(0, -1);
    for(int i = 0; i < n; i++) {
      System.out.println(point[i]);
    }
  }

  public static void dfs(int v, int p) {
    ArrayList<Integer> list = edge[v];
    for(int i = 0; i < list.size(); i++) {
      int t = list.get(i);
      if(t != p) {
        point[t] += point[v];
        dfs(t, v);
      }
    }
  }
}