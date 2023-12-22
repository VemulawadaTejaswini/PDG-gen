import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int u = sc.nextInt();
    int v = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 1; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    sc.close();

    List<Integer>[] tree = new List[N + 1];
    for (int i = 1; i < tree.length; i++) tree[i] = new ArrayList<>();
    for (int i = 1; i < N; i++) {
      tree[A[i]].add(B[i]);
      tree[B[i]].add(A[i]);
    }
/*
    IntFunction<int[]> dist = r -> {
      int[] ds = new int[N + 1];
      Deque<Integer> stack = new ArrayDeque<>();
      stack.push(r);
      while (0 < stack.size()) {
        int i = stack.pop();
        for (int t : tree[i])
          if (ds[t] == 0 && t != r) {
            ds[t] = ds[i] + 1;
            stack.push(t);
          }
      }
      return ds;
    };
    int[] dist_u = dist.apply(u);
    int[] dist_v = dist.apply(v);
*/
    int[] dist_u = new int[N + 1];
    Arrays.fill(dist_u, -1);
    dist_u[u] = 0;
    dist(dist_u, u, tree);
    
    int[] dist_v = new int[N + 1];
    Arrays.fill(dist_v, -1);
    dist_v[v] = 0;
    dist(dist_v, v, tree);

    int d = 0;
    for (int i = 1; i < N + 1; i++)
      if (dist_u[i] < dist_v[i] && dist_v[d] < dist_v[i]) d = i;

    long ans = dist_v[d] - 1;
    System.out.println(ans);
    System.out.println(Arrays.toString(dist_u));
    System.out.println(Arrays.toString(dist_v));
  }

  private static void dist(int[] ds, int r, List<Integer>[] tree) {
    for (Integer tr : tree[r]) {
      int t = tr.intValue();
      if (ds[t] < 0) {
        ds[t] = ds[r] + 1;
        dist(ds, t, tree);
      }
    }
  }
}