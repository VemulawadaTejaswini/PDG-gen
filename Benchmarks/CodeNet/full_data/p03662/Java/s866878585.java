import java.util.*;

public class Main {
  static boolean[] memo;
  static int[] choice;
  static ArrayList[] edge;
  static int N;
  static int[] wa;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    edge = new ArrayList[N + 1];
    memo = new boolean[N + 1];
    choice = new int[N + 1];
    wa = new int[N + 1];
    for(int i = 1; i < N + 1; i++) {
      edge[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < N; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      edge[a].add(b);
      edge[b].add(a);
    }
    dfs(1, -1);
    ArrayList<Integer> road = new ArrayList<Integer>();
    road.add(1);
    int ve = 1;
    int oya = 1;
    while(ve != N) {
      ArrayList<Integer> e = edge[ve];
      for(int i = 0; i < e.size(); i++) {
        int ko = e.get(i);
        if(ko != oya) {
          if(memo[ko]) {
            road.add(ko);
            ve = ko;
            oya = ve;
          }
        }
      }
    }
    int sente = (road.size() + 1) / 2;
    int senten = 0;
    for(int i = sente - 1; i >= 0; i--) {
      int u = road.get(i);
      int un = -1;
      if(i > 0) un = road.get(i - 1);
      senten += sum(u, un);
    }
    String ans = "Snuke";
    if(senten > N - senten) ans = "Fennec";
    System.out.println(ans);
  }

  public static boolean dfs(int v, int p) {
    choice[v] = 1;
    if(v == N) return true;
    ArrayList<Integer> e = edge[v];
    boolean ret = false;
    for(int i = 0; i < e.size(); i++) {
      int c = e.get(i);
      if(c != p) {
        boolean flg = false;
        if(choice[c] == 0) {
          flg = dfs(c, v);
        } else {
          flg = memo[c];
        }
        ret = ret || flg;
      }
    }
    return memo[v] = ret;
  }

  public static int sum(int v, int p) {
    ArrayList<Integer> e = edge[v];
    int ret = 0;
    for(int i = 0; i < e.size(); i++) {
      int ko = e.get(i);
      if(ko != p && !memo[ko]) {
        int s = 0;
        if(wa[ko] == 0) {
          s = sum(ko, v);
        } else {
          s = wa[ko];
        }
        ret += s;
      }
    }
    return ret;
  }
}