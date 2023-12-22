

import java.util.*;


public class Main {
    public static class edge {
        public int w;
        public int a;
        public int b;
        public edge() {
            w = Integer.MAX_VALUE;
            a = b = 0;
        }
        public edge(int a, int b, int w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }
        public int getW() {
            return w;
        }
        public int getA() {
            return a;
        }
        public int getB() {
            return b;
        }
    }

    static int find(int x, int[] parent) {
        if (parent[x] != x) {
            return parent[x] = find(parent[x], parent);
        }
        return x;
    }
    static void unite(int x, int y, int [] parent, int [] rank) {
        x = find(x, parent);
        y = find(y, parent);
        if (x == y) {
            return;
        }
        if (rank[x] < rank[y]) {
            parent[x] = y;
        } else {
            parent[y] = x;
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }

    public static void main(String [] args) {
        final int MAX_NODE = 100005;
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int K = sc.nextInt();
        final int [] parent = new int[2 * MAX_NODE + 1];
        final int [] rank = new int[2 * MAX_NODE + 1];
        for (int i = 1; i < 2 * MAX_NODE + 1; ++i) {
            parent[i] = i;
            rank[i] = 0;
        }
        int [] c = new int [N + 1];
        int unknownColorNum = 0;
        final Set<Integer> hasColor = new HashSet<>();
        for (int i = 1; i <= N; ++i) {
            c[i] = sc.nextInt();
            if (c[i] == 0) {
                unknownColorNum++;
            } else {
                hasColor.add(c[i]);
            }
        }

        final edge [] edges = new edge[M + 1];

        for (int i = 1; i <= M; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int w = sc.nextInt();
            edges[i] = new edge(a, b, w);
        }

        final Object [] sortedEdge = Arrays.stream(edges)
                .filter(edge -> edge != null)
                .sorted(Comparator.comparing(edge::getW))
                .toArray();

        if (unknownColorNum < K - hasColor.size() || M < K - 1) {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < M; ++i) {
            edge e = (edge) sortedEdge[i];
            int nodeA = c[e.getA()];
            int nodeB = c[e.getB()];

            if (nodeA == 0) {
                c[e.getA()] = e.getA() + MAX_NODE;

            }
            if (nodeB == 0) {
                c[e.getB()] = e.getB() + MAX_NODE;

            }

            int setA = find(c[e.getA()], parent);
            int setB = find(c[e.getB()], parent);

            if (setA != setB) {
                unite(c[e.getA()], c[e.getB()], parent, rank);
                sum += e.getW();
                ++count;
                if (count == K - 1) {
                    break;
                }
            }
        }
        if (count < K -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }


    }
}
