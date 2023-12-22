import java.util.*;

public class Main {
    private static final long INF = 1145143643641919810L;
    private static final long INIT = 1000000000000000L;

    static Queue<City> queue = new PriorityQueue<>((o1, o2) -> Long.compare(o1.cost, o2.cost));

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

        int u, v, a, b;
        for (int i = 0; i < m; i++) {
            u = sc.nextInt() - 1;
            v = sc.nextInt() - 1;
            a = sc.nextInt();
            b = sc.nextInt();
            city[u].roads.add(new Road(u, v, a));
            city[v].roads.add(new Road(v, u, a));
            scity[u].roads.add(new Road(u, v, b));
            scity[v].roads.add(new Road(v, u, b));
        }

        dij(s - 1, n, city);
        dij(t - 1, n, scity);

        int bi = 2;
        while (bi < n) {
            bi *= 2;
        }
        long ans[] = new long[bi * 2 - 1];
        Arrays.fill(ans, INIT + 1);
        for (int i = 0; i < n; i++) {
            set(i, city[i].cost + scity[i].cost, bi, ans);
        }

        for (int y = 0; y < n; y++) {
            System.out.println(INIT - search(y, n, 0, 0, bi, bi, ans));
        }
    }

    private void set(int i, long v, int n, long data[]) {
        int p = i + n - 1;
        data[p] = v;
        while (p > 0) {
            p = (p - 1) / 2;
            data[p] = Math.min(data[p * 2 + 1], data[p * 2 + 2]);
        }
    }

    private long search(int s, int d, int p, int l, int r, int n, long data[]) {
        if (r <= s || d <= l) {
            return INF;
        }
        if (s <= l && r <= d) {
            return data[p];
        }

        return Math.min(search(s, d, p * 2 + 1, l, (l + r) / 2, n, data),
            search(s, d, p * 2 + 2, (l + r) / 2, r, n, data));
    }

    private void dij(int start, int n, City city[]) {
        queue.clear();
        city[start].cost = 0;
        queue.add(city[start]);
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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
