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
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int K = sc.nextInt();
        final int [] parent = new int[N + 1];
        final int [] rank = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
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

        //weight, node
        final edge [] weightNode = new edge[K + 1];
        final edge [] edges = new edge[M + 1];
        for (int i = 1; i <= K; ++i) {
            weightNode[i] = new edge(i, i, Integer.MAX_VALUE);
        }
        for (int i = 1; i <= M; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int w = sc.nextInt();
            edges[i] = new edge(a, b, w);
            if (c[a] != 0) {
                weightNode[c[a]].w = Math.min(weightNode[c[a]].w, w);
            }
            if (c[b] != 0) {
                weightNode[c[b]].w = Math.min(weightNode[c[b]].w, w);
            }
        }
        final Object [] sortedWeightNode = Arrays.stream(weightNode)
                .filter(n -> n != null)
                .sorted(Comparator.comparing(edge::getW))
                .toArray();

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

        int j = sortedWeightNode.length - 1;

        for (int i = 0; i < M; ++i) {
            edge e = (edge) sortedEdge[i];
            int nodeA = c[e.getA()];
            int nodeB = c[e.getB()];

            if (nodeA == 0) {
                c[e.getA()] = ((edge)sortedWeightNode[j]).a;
                --j;
            }
            if (nodeB == 0) {
                c[e.getB()] = ((edge)sortedWeightNode[j]).a;
                --j;
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
        System.out.println(sum);


    }
}
