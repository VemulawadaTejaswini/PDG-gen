import java.util.*;

public class Main {
  public static int C;
  public static ArrayList[] edge;
  public static HashMap[] map;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    edge = new ArrayList[n];
    map = new HashMap[n];
    for(int i = 0; i < n; i++) {
      edge[i] = new ArrayList<Integer>();
      map[i] = new HashMap<Integer, Integer>();
    }
    int[] a = new int[n - 1];
    int[] b = new int[n - 1];
    for(int i = 0; i < n - 1; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      edge[a[i]].add(b[i]);
      edge[b[i]].add(a[i]);
    }
    for(int i = 0; i < n; i++) {
      C = Math.max(C, edge[i].size());
    }
    Queue queue = new PriorityQueue<Integer>();
    queue.add(0);
    int[] seen = new int[n];
    seen[0] = 1;
    int[] co = new int[n];
    while(queue.size() > 0) {
      int v = queue.poll();
      seen[v] = 1;
      ArrayList<Integer> e = edge[v];
      int pp = 1;
      for(int i = 0; i < e.size(); i++) {
        int u = e.get(i);
        if(seen[u] == 0) {
          if(pp == co[v]) pp++;
          map[v].put(u, pp);
          co[u] = pp;
          pp++;
          queue.add(u);
        }
      }
    }
    System.out.println(C);
    for(int i = 0; i < n - 1; i++) {
      System.out.println(map[a[i]].get(b[i]));
    }
  }
}