import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    List<Integer>[] edges = new ArrayList[N];
    for (int i = 0; i < N; i++) {
      edges[i] = new ArrayList<Integer>();
    }
    for (int i = 0; i < M; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int w = sc.nextInt();
      edges[x-1].add(y-1);
      edges[y-1].add(x-1);
    }
    boolean[] visited = new boolean[N];
    int ans = 0;
    for (int i = 0; i < N; i++) {
      if (visited[i]) continue;
      Queue<Integer> queue = new LinkedList<Integer>();
      queue.offer(i);
      visited[i] = true;
      ans++;
      while (queue.size() > 0) {
        int v = queue.poll();
        for (int w : edges[v]) {
          if (visited[w]) continue;
          queue.offer(w);
          visited[w] = true;
        }
      }
    }
    System.out.println(ans);
  }
}