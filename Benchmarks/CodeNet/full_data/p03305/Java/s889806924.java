import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt() - 1;
        int t = sc.nextInt() - 1;

        List<Grid>[] yen = new List[n];
        List<Grid>[] snu = new List[n];
        for (int i = 0; i < n; i++) {
            yen[i] = new ArrayList<>();
            snu[i] = new ArrayList<>();
        }

        //隣接リストの作成
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            long a = sc.nextLong();
            long b = sc.nextLong();
            yen[u].add(new Grid(v, a));
            yen[v].add(new Grid(u, a));
            snu[u].add(new Grid(v, b));
            snu[v].add(new Grid(u, b));
        }
        long[] sCost = Dijkstra.execute(yen, s);
        long[] tCost = Dijkstra.execute(snu, t);
        long[] ans = new long[sCost.length];
        ans[ans.length - 1] = sCost[sCost.length - 1] + tCost[tCost.length - 1];
        for (int i = ans.length - 2; 0 <= i; i--) {
            ans[i] = Math.min(ans[i + 1], sCost[i] + tCost[i]);
        }

        for (long a : ans) {
            System.out.println((long) 1e15 - a);
        }

    }
}

class Dijkstra {

    public static long[] execute(List<Grid>[] list, int start) {
        long[] cost = new long[list.length];
        Arrays.fill(cost, Long.MAX_VALUE / 2);
        cost[start] = 0;

        Queue<Grid> que = new PriorityQueue<>(Comparator.comparing(Grid::getCost));
        que.add(new Grid(start, 0));
        while (que.size() > 0) {
            Grid p = que.poll();
            if (cost[p.to] < p.cost) {
                continue;
            }
            for (Grid g : list[p.to]) {
                if (cost[p.to] + g.cost < cost[g.to]) {
                    cost[g.to] = cost[p.to] + g.cost;
                    que.add(new Grid(g.to, cost[g.to]));
                }
            }
        }
        return cost;
    }
}

class Grid {
    int to;
    long cost;

    public Grid(int to, long cost) {
        this.to = to;
        this.cost = cost;
    }

    public long getCost() {
        return this.cost;
    }
}