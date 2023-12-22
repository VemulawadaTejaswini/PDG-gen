import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    int[] C = new int[K];
    int[] D = new int[K];
    for (int i = 0; i < K; i++) {
      C[i] = sc.nextInt();
      D[i] = sc.nextInt();
    }
    sc.close();

    Map<Integer, Set<Integer>> f = new HashMap<>();
    for (int i = 0; i < M; i++) {
      Integer a = Integer.valueOf(A[i]);
      Integer b = Integer.valueOf(B[i]);
      if (!f.containsKey(a)) f.put(a, new HashSet<>());
      if (!f.containsKey(b)) f.put(b, new HashSet<>());
      f.get(a).add(b);
      f.get(b).add(a);
    }

    int[] gn = new int[N + 1];
    int[] gc = new int[N + 1];
    for (int i = 1; i < N + 1; i++) {
      Deque<Integer> q = new ArrayDeque<>();
      q.addLast(i);
      while (!q.isEmpty()) {
        int n = q.pollLast();
        if (gn[n] != 0) continue;
        gn[n] = i;
        gc[i]++;
        q.addAll(f.getOrDefault(n, Collections.emptySet()));
      }
    }

    int[] bc = new int[N + 1];
    for (int i = 0; i < K; i++) {
      int c = C[i];
      int d = D[i];
      if (gn[c] == gn[d]) {
        bc[c]++;
        bc[d]++;
      }
    }

    int[] ans = new int[N + 1];
    for (int i = 1; i < N + 1; i++)
      ans[i] = gc[gn[i]] - 1
          - f.getOrDefault(i, Collections.emptySet()).size()
          - bc[i];

    for (int i = 1; i < N + 1; i++)
      System.out.print(ans[i] + " ");
    System.out.println();
  }
}