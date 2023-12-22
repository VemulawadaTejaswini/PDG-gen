import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] p = new int[n+1];
      for(int i = 1; i <= n; i++)
        p[i] = sc.nextInt();

      int[] root = new int[n + 1];
      for(int i = 1; i <= n; i++)
        root[i] = i;

      int[] size = new int[n+1];

      while(m-- > 0) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        union(root, size, u, v);
      }
      // path compression one more time
      for(int i = 1; i <= n; i++)
        find(root, i);
        
      int cnt = 0;
      for(int i = 1; i <= n; i++) {
        if(p[i] == i || root[p[i]] == root[i]) {
          cnt++;
        }
      }

      System.out.println(cnt);
  }
 
  private static void union(int[] root, int[] size, int u, int v) {
    int rootU = find(root, u);
    int rootV = find(root, v);
    if(rootU == rootV) return;
    if(size[rootU] > size[rootV]) {
      root[rootV] = rootU;
      size[rootU] += size[rootV];
    } else {
      root[rootU] = rootV;
      size[rootV] += size[rootU];
    }
  }

  private static int find(int[] root, int node) {
    if(root[node] != node) {
      root[node] = find(root, root[node]);
    }
    return root[node];
  }
}