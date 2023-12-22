import java.util.*;

public class Main {

    static class UnionFind {
        int[] size;
        int[] id;

        public UnionFind(int n) {
            size = new int[n];
            id = new int[n];

            for (int i = 0; i < n; ++i) {
                size[i] = 1;
                id[i] = i;
            }
        }

        void unify(int p, int q) {
            int root1 = find(p);
            int root2 = find(q);

            if (size[root1] > size[root2]) {
                size[root1] += size[root2];
                id[root2] = root1;
            } else {
                size[root2] += size[root1];
                id[root1] = root2;
            }
        }

        int find(int p) {
            int root = p;
            while (root != id[root]) root = id[root];
            while (p != root) {
                int next = id[p];
                id[p] = root;
                p = next;
            }
            return root;
        }

        boolean connected(int p, int q) {
            return find(p) == find(q);
        }
    }

    static class Edge implements Comparable<Edge> {
        int from, to, cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return cost - o.cost;
        }
    }

    static class Pair implements Comparable<Pair> {
        int id, pos;

        public Pair(int id, int pos) {
            this.id = id;
            this.pos = pos;
        }

        @Override
        public int compareTo(Pair o) {
            return pos - o.pos;
        }
    }

    static long kruskal() {
        long mstCost = 0;
        UnionFind uf = new UnionFind(N);
        PriorityQueue<Edge> pq = new PriorityQueue<>(edges);

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            if (uf.connected(edge.from, edge.to)) continue;

            uf.unify(edge.from, edge.to);
            mstCost += edge.cost;

            if (uf.size[uf.find(0)] == N) break;
        }
        return mstCost;
    }

    static int N;
    static List<Edge> edges;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        edges = new ArrayList<>();
        List<Pair> X = new ArrayList<>();
        List<Pair> Y = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            X.add(new Pair(i, sc.nextInt()));
            Y.add(new Pair(i, sc.nextInt()));
        }

        Collections.sort(X);
        for (int i = 0; i+1 < X.size(); ++i) {
            int from = X.get(i).id;
            int to = X.get(i+1).id;
            edges.add(new Edge(from, to, X.get(i+1).pos - X.get(i).pos));
        }

        Collections.sort(Y);
        for (int i = 0; i+1 < Y.size(); ++i) {
            int from = Y.get(i).id;
            int to = Y.get(i+1).id;
            edges.add(new Edge(from, to, Y.get(i+1).pos - Y.get(i).pos));
        }

        System.out.println(kruskal());
    }
}