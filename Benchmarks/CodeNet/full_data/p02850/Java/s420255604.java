import java.util.*;

public class Main {
  public static ArrayList[] edge;
  public static HashMap[] c;
  public static int K;
  public static int[] used;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    edge = new ArrayList[n];
    c = new HashMap[n];
    K = 0;
    int[] seen = new int[n];
    used = new int[n];
    int[] a = new int[n - 1];
    int[] b = new int[n - 1];
    for(int i = 0; i < n; i++) {
      edge[i] = new ArrayList<Integer>();
      c[i] = new HashMap<Integer, Integer>();
    }
    for(int i = 0; i < n - 1; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      edge[a[i]].add(b[i]);
      edge[b[i]].add(a[i]);
    }
    for(int i = 0; i < n; i++) {
      K = Math.max(K, edge[i].size());
    }
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(0);
    seen[0] = 1;
    while(!q.isEmpty()) {
      int t = q.poll();
      int p = 1;
      for(int i = 0; i < edge[t].size(); i++) {
        int u = (int)(edge[t].get(i));
        if(seen[u] == 0) {
        seen[u] = 1;
        q.add(u);
        for(int j = p; j <= K; j++) {
          if(j != used[t]) {
            used[u] = j;
            p = j + 1;
            c[t].put(u, j);
            c[u].put(t, j);
            break;
          } 
        }
        }
      } 
    }
    System.out.println(K);
    for(int i = 0; i < n - 1; i++) {
      System.out.println(c[a[i]].get(b[i]));
    }
  }
}