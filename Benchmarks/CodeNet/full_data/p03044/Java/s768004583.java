import java.util.*;

public class Main {
  static int n;
  static long[] d;
  static ArrayList[] e;
  static HashMap[] elen;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    d = new long[n];
    e = new ArrayList[n];
    elen = new HashMap[n];
    for(int i = 0; i < n; i++) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      e[i] = list;
      HashMap<Integer, Long> map = new HashMap<Integer, Long>();
      elen[i] = map;
    }
    for(int i = 0; i < n - 1; i++) {
      int u = sc.nextInt() - 1;
      int v = sc.nextInt() - 1;
      long w = sc.nextLong();
      
      ArrayList<Integer> list = e[u];
      ArrayList<Integer> list2 = e[v];
      HashMap<Integer, Long> map = elen[u];
      HashMap<Integer, Long> map2 = elen[v];
      
      list.add(v);
      list2.add(u);
      map.put(v, w);
      map2.put(u, w);
 
      e[u] = list;
      e[v] = list2;
      elen[u] = map;
      elen[v] = map2;
    }
    dfs(0, -1);
    for(int i = 0; i < n; i++) {
      if((d[i] % 2) == 0) {
        System.out.println(0);
      } else {
        System.out.println(1);
      }
    }
  }

  public static void dfs(int v, int p) {
    ArrayList<Integer> list = e[v];
    HashMap<Integer, Long> map = elen[v];
    for(int i = 0; i < list.size(); i++) {
      int u = list.get(i);
      if(u != p) {
        long dd = map.get(u);
        d[u] = d[v] + dd;
        dfs(u, v);
      }
    }
  }
}