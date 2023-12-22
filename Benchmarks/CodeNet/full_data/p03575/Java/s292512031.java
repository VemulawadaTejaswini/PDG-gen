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

        public void unify(int p, int q) {
            if (connected(p, q)) return;

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

        public int find(int p) {
            int root = p;
            while (root != id[root]) root = id[root];
            while (p != root) {
                int next = id[p];
                id[p] = root;
                p = next;
            }
            return root;
        }

        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }
    }

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < e; ++i) {
            edges.add(new Edge(sc.nextInt() - 1, sc.nextInt() - 1));
        }

        int res = 0;
        for (int i = 0; i < e; ++i) {
            UnionFind uf = new UnionFind(v);
            Edge edge = edges.get(i);
            for (int j = 0; j < e; ++j) {
                if (i == j) continue;
                Edge tmp = edges.get(j);
                uf.unify(tmp.from, tmp.to);
            }
            if (!uf.connected(edge.from, edge.to)) ++res;
        }

        System.out.println(res);
    }
}