import java.util.*;

public class Main {
    private static final int INF = Integer.MAX_VALUE;

    private class Node {
        private class MinCost {
            int cost, id;

            public MinCost(int cost, int id) {
                this.cost = cost;
                this.id = id;
            }
        }

        int root, cost;
        MinCost minCost;

        public Node(int cost, int id) {
            this.minCost = new MinCost(cost, id);
            this.cost = cost;
            this.root = id;
        }

        public Node(int root, int cost, MinCost mCost) {
            this.root = root;
            this.cost = cost;
            this.minCost = mCost;
        }

        @Override
        public String toString() {
            return root + ":" + cost + ":(" + minCost.id + "," + minCost.cost + ")";
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(sc.nextInt(), i);
        }
        for (int i = 0; i < m; i++) {
            link(sc.nextInt(), sc.nextInt(), nodes);
        }
        sc.close();

        if (n - 1 == m) {
            System.out.println(0);
            return;
        } else if (n < 2 * (n - m - 1)) {
            System.out.println("Impossible");
            return;
        }

        Map<Integer, Main.Node.MinCost> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Node node = root(i, nodes);
            int root = node.root;
            if (!map.containsKey(root) || (map.get(root).cost > node.minCost.cost)) {
                map.put(root, node.minCost);
            }
        }

        long ans = 0;
        for (Map.Entry<Integer, Main.Node.MinCost> entry : map.entrySet()) {
            Main.Node.MinCost minCost = entry.getValue();
            ans += minCost.cost;
            nodes[minCost.id].cost = INF;
        }

        int cnt = 2 * (n - m - 1) - map.size();
        Arrays.sort(nodes, (o1, o2) -> o1.cost - o2.cost);
        for (int i = 0; i < cnt; i++) {
            ans += nodes[i].cost;
        }

        System.out.println(ans);
    }

    private void link(int src, int dst, Node node[]) {
        Node srcRoot = root(src, node);
        Node dstRoot = root(dst, node);

        Main.Node.MinCost minCost = null;
        if (node[src].minCost.cost <= dstRoot.minCost.cost) {
            minCost = node[src].minCost;
        } else {
            minCost = dstRoot.minCost;
        }

        srcRoot.minCost = minCost;
        node[dstRoot.root] = new Node(srcRoot.root, dstRoot.cost, minCost);
    }

    private Node root(int n, Node node[]) {
        if (node[n].root == n) {
            return node[n];
        }

        Node rNode = root(node[n].root, node);

        Main.Node.MinCost minCost = null;
        if (node[n].minCost.cost <= rNode.minCost.cost) {
            minCost = node[n].minCost;
        } else {
            minCost = rNode.minCost;
        }

        rNode.minCost = minCost;
        node[n] = new Node(rNode.root, node[n].cost, minCost);

        return node[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
