import java.util.*;

public class Main {
  private static final long INF = 1_000_000_000_000_000_000L;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<List<Dst>> from = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      from.add(new ArrayList<>());
    }
    for (int i = 0; i < N-1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      a--;
      b--;
      int c = sc.nextInt();
      from.get(a).add(new Dst(b,c));
      from.get(b).add(new Dst(a,c));
    }

    int Q = sc.nextInt();
    int K = sc.nextInt();
    K--;
    
    PriorityQueue<Dst> pq = new PriorityQueue<>((a,b)->{
      if (a.cost == b.cost) {
        return 0;
      }
      return a.cost > b.cost ? 1 : -1;
    });
    long[] cost = new long[N];
    Arrays.fill(cost, INF);
    
    pq.offer(new Dst(K,0));
    while (!pq.isEmpty()) {
      Dst now = pq.poll();
      if (cost[now.to] <= 0) continue;
      cost[now.to] = -now.cost;
      
      for (Dst p : from.get(now.to)) {
        long newCost = now.cost+p.cost;
        if (cost[p.to] > 0 && newCost < cost[p.to]) {
          cost[p.to] = newCost;
          pq.offer(new Dst(p.to,newCost));
        }
      }
    }
      
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < Q; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      x--;
      y--;
      ans.append(-(cost[x]+cost[y])).append('\n');
    }
    System.out.print(ans.toString());
  }
  private static class Dst {
    private final int to;
    private final long cost;
    Dst(int to, long cost) {
      this.to = to;
      this.cost = cost;
    }
  }
}