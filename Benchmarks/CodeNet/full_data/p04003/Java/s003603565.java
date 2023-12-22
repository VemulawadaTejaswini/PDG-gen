import java.util.*;

public class Main {
    private static final int INF = 1145141919;

    class City {
        int kind = 0;
        int minCost = INF;
        boolean visit = false;
        List<Road> child = new ArrayList<>();
    }

    class Road {
        int src, dst, kind;

        public Road(int src, int dst, int kind) {
            this.src = src;
            this.dst = dst;
            this.kind = kind;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        City c[] = new City[n];
        for (int i = 0; i < n; i++) {
            c[i] = new City();
        }
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            int kind = sc.nextInt();
            c[p].child.add(new Road(p, q, kind));
            c[q].child.add(new Road(q, p, kind));
        }

        c[0].minCost = 0;
        Queue<City> queue = new PriorityQueue<>((o1, o2) -> o1.minCost - o2.minCost);
        queue.add(c[0]);
        while (!queue.isEmpty()) {
            City city = queue.poll();
            if (city.visit) {
                continue;
            }

            city.visit = true;
            for (Road r : city.child) {
                c[r.dst].minCost =
                    Math.min(c[r.dst].minCost, city.minCost + (city.kind == r.kind ? 0 : 1));
                queue.add(c[r.dst]);
            }
        }

        int ans = c[n - 1].minCost;
        System.out.println(ans == INF ? -1 : ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
