import java.util.*;

public class Main {
  static int[] par;
  static int[] rank;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    par = new int[n];
    rank = new int[n];

    int M = sc.nextInt();
    init(n);
    int[] p = new int[n];
    for(int i = 0; i < n; i++) {
      p[i] = sc.nextInt() - 1;
    }
    for(int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      unite(a, b);
    }
    ArrayList[] L = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      L[i] = new ArrayList<Integer>();
    }
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < n; i++) {
      int t = find(i);
      L[t].add(i);
      set.add(t);
    }
    int ans = 0;
    for(Iterator<Integer> itr = set.iterator(); itr.hasNext();) {
      int c = itr.next();
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i = 0; i < L[c].size(); i++) {
        int d = (int)L[c].get(i);
        list.add(d);
        list.add(p[d]);
      }
      Collections.sort(list);
      for(int i = 0; i < list.size() - 1; i++) {
        if(list.get(i) == list.get(i + 1)) ans++;
      }
    }
    System.out.println(ans);
  }
  static void init(int m) {
      for(int i = 0; i < m; i++) {
        par[i] = i;
        rank[i] = 1;
      }
    }
  static int find(int x) {
      if(par[x] == x) {
        return x;
      } else {
        return par[x] = find(par[x]);
      }
    }
  static void unite(int x, int y) {
      x = find(x);
      y = find(y);
      if(x != y) {
        if(rank[x] < rank[y]) {
          par[x] = y;
          rank[y] += rank[x];
        } else {
          if(rank[x] == rank[y]) {
            if(x > y) {
              par[x] = y;
              rank[y] += rank[x];
            } else {
              par[y] = x;
              rank[x] += rank[y];
            }
          } else {
            par[y] = x;
            rank[x] += rank[y];
          }
        }
      }
    }
  static boolean same(int x, int y) {
      return find(x) == find(y);
  }
}