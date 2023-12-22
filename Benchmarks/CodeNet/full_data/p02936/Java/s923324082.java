import java.util.*;

public class Main {
  static int[] nodes;
  static int[] X;
  static boolean[] isVisited;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    nodes = new int[N + 1];
    Map<Integer, Set<Integer>> map = new HashMap<>();
    for (int i = 0; i < N - 1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      map.computeIfAbsent(a, k -> new HashSet<>()).add(b);
      map.computeIfAbsent(b, k -> new HashSet<>()).add(a);
    }
    X = new int[N + 1];
    for (int i = 0; i < Q; i++) {
      int p = sc.nextInt();
      int x = sc.nextInt();
      X[p] += x;
    }
    isVisited = new boolean[N + 1];
    update(map, 1, X[1]);
    System.out.print(nodes[1]);
    for (int i = 2; i <= N; i++) {
      System.out.print(" " + nodes[i]);
    }
  }

  static void update(Map<Integer, Set<Integer>> map, int p, int x) {
    nodes[p] += x;
    isVisited[p] = true;
    Set<Integer> s = map.get(p);
    if (s != null) {
      s.forEach(
          ss -> {
            if (!isVisited[ss]) update(map, ss, nodes[p] + X[ss]);
          });
    }
  }
}