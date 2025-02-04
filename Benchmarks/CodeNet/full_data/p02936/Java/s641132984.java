import java.util.*;
 
public class Main {
 
  public static ArrayList[] edge;
  public static long[] point;
  public static boolean[] visit;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    point = new long[n];
    edge = new ArrayList[n];
    int[] c = new int[n];
    for(int i = 0; i < n - 1; i++) {
      int a = Integer.parseInt(sc.next()) - 1;
      int b = Integer.parseInt(sc.next()) - 1;
      if(c[a] == 0) {
        c[a] = 1;
        edge[a] = new ArrayList<Integer>();
      }
      if(c[b] == 0) {
        c[b] = 1;
        edge[b] = new ArrayList<Integer>();
      }      
      edge[a].add(b);
      edge[b].add(a);
    }
    
    for(int i = 0; i < q; i++) {
      int p = Integer.parseInt(sc.next()) - 1;
      long x = Long.parseLong(sc.next()) - 1;
      point[p] += x;
    } 
 
    dfs(0, -1);
    for(int i = 0; i < n; i++) {
      System.out.print(point[i] + " ");
    }
  }
 
  public static void dfs(int v, int p) {
    ArrayList<Integer> list = edge[v];
    long x = point[v];
    for(int i = 0; i < list.size(); i++) {
      int t = list.get(i);
 
      if(t != p) {
        point[t] += x;
        dfs(t, v);
      }
    }
  }
}