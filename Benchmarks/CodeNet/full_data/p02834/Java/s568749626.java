import java.util.*;

public class Main {
  static int n;
  static ArrayList[] e;
  static int[] d1;
  static int[] d2;
  static ArrayList<Integer> g = new ArrayList<Integer>();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int u = sc.nextInt() - 1;
    int v = sc.nextInt() - 1;
    d1 = new int[n];
    d2 = new int[n];
    e = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      e[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < n - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      e[a].add(b);
      e[b].add(a);
    }

    dfs1(u, -1);
    dfs2(v, -1);

    int ans = 0;

    for(int i = 0; i < g.size(); i++) {
      int t = g.get(i);
      if(d1[t] <= d2[t]) {
        ans = Math.max(ans, d2[t]);
      }
    }

    int p = 0;
    int p1 = 0;

    for(int i = 0; i < e[u].size(); i++) {
      int t = (int)e[u].get(i);
      if(t == v) {
        p1 = 1;
      } else {
        p = 1;
      }      
    }

    if((p == 0) && (p1 == 1)) ans = 0;
    System.out.println(ans - 1);
  }

  public static void dfs1(int v, int p) {
    int t = 0;
    ArrayList<Integer> list = e[v];
    for(int i = 0; i < list.size(); i++) {
      int s = list.get(i);
      if(s != p) {
        t++;
        d1[s] = d1[v] + 1;
        dfs1(s, v);
      }
    }
    if(t == 0) g.add(p);
  }

  public static void dfs2(int v, int p) {
    ArrayList<Integer> list = e[v];
    for(int i = 0; i < list.size(); i++) {
      int s = list.get(i);
      if(s != p) {
        d2[s] = d2[v] + 1;
        dfs2(s, v);
      }
    }
  }  
}
