import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();

    Map<Integer, List<Integer>> graph = new HashMap<>();
    for (int i = 1; i <= N; i++)
      graph.put(i, new LinkedList<Integer>());

    for (int i = 0; i < M; i++)
      graph.get(scan.nextInt()).add(scan.nextInt());

    scan.close();

    System.out.println(longestPath(graph, N));
  }

  private static int longestPath(Map<Integer, List<Integer>> graph, int n) {
    if (n == 0) return 0;

    int[] cache = new int[n + 1];
    Arrays.fill(cache, -1);
    int max = 0;
    for (int i = 1; i <= n; i++)
      max = Math.max(max, dfs(graph, i, cache));
    return max;
  }

  private static int dfs(Map<Integer, List<Integer>> graph, int idx, int[] cache) {
    if (cache[idx] >= 0) return cache[idx];

    int maxPath = 0;
    for (int con : graph.get(idx))
      maxPath = Math.max(maxPath, dfs(graph, con, cache) + 1);

    return cache[idx] = maxPath;
  }

}