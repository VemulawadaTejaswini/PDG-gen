import java.util.*;

public class Main {
    private static final long INF = 1145141919810893L;
    private static final long INIT = 1000000000000000L;

    private class City {
        long cost = INF;
        boolean fix = false;
        List<Road> roads = new ArrayList<>();
    }

    private class Road {
        int src, dst, cost;

        public Road(int src, int dst, int cost) {
            this.src = src;
            this.dst = dst;
            this.cost = cost;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        City city[] = new City[n];
        City scity[] = new City[n];
        for (int i = 0; i < n; i++) {
            city[i] = new City();
            scity[i] = new City();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            city[u].roads.add(new Road(u, v, a));
            city[v].roads.add(new Road(v, u, a));
            scity[u].roads.add(new Road(u, v, b));
            scity[v].roads.add(new Road(v, u, b));
        }

        long cost[][] = dij(s, t, n, city);
        long scost[][] = dij(s, t, n, scity);
        for (int y = 0; y < n; y++) {
            long min = Long.MAX_VALUE;
            for (int i = y; i < n; i++) {
                min = Math.min(min, cost[s - 1][i] + scost[i][t - 1]);
            }
            System.out.println(INIT - min);
        }
    }

    private long[][] dij(int start, int goal, int n, City city[]) {
        Queue<City> queue = new PriorityQueue<>((o1, o2) -> Long.compare(o1.cost, o2.cost));
        long res[][] = new long[n][n];

        for (int id = 0; id < n; id++) {
            for (int i = 0; i < n; i++) {
                city[i].fix = false;
                city[i].cost = INF;
            }
            queue.clear();

            city[id].cost = 0;
            queue.add(city[id]);
            while (!queue.isEmpty()) {
                City c = queue.poll();
                c.fix = true;
                for (Road r : c.roads) {
                    if (city[r.dst].fix) {
                        continue;
                    }

                    city[r.dst].cost = Math.min(c.cost + r.cost, city[r.dst].cost);
                    queue.add(city[r.dst]);
                }
            }

            for (int i = 0; i < n; i++) {
                res[id][i] = city[i].cost;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
