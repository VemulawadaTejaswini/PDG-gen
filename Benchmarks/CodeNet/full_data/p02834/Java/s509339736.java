import java.util.*;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int u = sc.nextInt();
    int v = sc.nextInt();
    int[] A = new int[N - 1];
    int[] B = new int[N - 1];
    for (int i = 0; i < N - 1; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    sc.close();

    @SuppressWarnings("unchecked")
    List<Integer>[] tree = new List[N + 1];
    for (int i = 0; i < N - 1; i++) {
      if (tree[A[i]] == null) tree[A[i]] = new ArrayList<>();
      tree[A[i]].add(B[i]);
      if (tree[B[i]] == null) tree[B[i]] = new ArrayList<>();
      tree[B[i]].add(A[i]);
    }

    Function<Integer, int[]> dist = s -> {
      int[] d = new int[N + 1];
      Deque<Integer> q = new ArrayDeque<>();
      q.addLast(s);
      while (!q.isEmpty()) {
        int n = q.pollFirst();
        List<Integer> edge = tree[n];
        for (int e : edge) {
          if (d[e] == 0 && e != s) {
            d[e] = d[n] + 1;
            q.addLast(e);
          }
        }
      }
      return d;
    };

    int[] du = dist.apply(u);
    int[] dv = dist.apply(v);
    int ans = 0;
    for (int i = 1; i < N + 1; i++)
      if (du[i] < dv[i]) ans = Integer.max(ans, dv[i]);
    System.out.println(ans - 1);
  }
}