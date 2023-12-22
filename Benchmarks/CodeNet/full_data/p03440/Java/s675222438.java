import java.util.*;

public class Main {
    private static final int INF = Integer.MAX_VALUE;

    private class Node {
        int cost, root;

        public Node(int cost, int root) {
            this.cost = cost;
            this.root = root;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        Node node[] = new Node[n];
        for (int i = 0; i < n; i++) {
            node[i] = new Node(sc.nextInt(), i);
        }
        for (int i = 0; i < m; i++) {
            link(sc.nextInt(), sc.nextInt(), node);
        }
        sc.close();

        if (n - 1 == m) {
            System.out.println(0);
            return;
        } else if (n < 2 * (n - m - 1)) {
            System.out.println("Impossible");
            return;
        }

        for (int i = 0; i < n; i++) {
            root(i, node);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = root(i, node);
            map.put(root, Math.min(map.getOrDefault(root, INF), node[i].cost));
        }

        long ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans += entry.getValue();
            node[entry.getKey()].cost = INF;
        }

        int cnt = 2 * (n - m - 1) - map.size();
        Arrays.sort(node, (o1, o2) -> o1.cost - o2.cost);
        for (int i = 0; i < cnt; i++) {
            ans += node[i].cost;
        }

        System.out.println(ans);
    }

    private void link(int src, int dst, Node node[]) {
        int srcRoot = root(src, node);
        int dstRoot = root(dst, node);

        if (node[srcRoot].cost > node[dstRoot].cost) {
            node[srcRoot].root = dstRoot;
        } else {
            node[dstRoot].root = srcRoot;
        }
    }

    private int root(int n, Node node[]) {
        if (node[n].root == n) {
            return n;
        }

        int nRoot = root(node[n].root, node);
        if (node[n].cost > node[nRoot].cost) {
            node[n].root = nRoot;
            return nRoot;
        } else {
            node[nRoot].root = n;
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
