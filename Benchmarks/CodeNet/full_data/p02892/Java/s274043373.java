import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[][] edges = new int[N][N];
        for (int i = 0; i < N; i++) {
            String X = scan.next();
            char[] d = X.toCharArray();
            for (int j = 0; j < N; j++) {
                edges[i][j] = d[j] - '0';
            }
        }
        HashMap<Integer, Node> graph = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());
        for (int i = 0; i < N; i++) {
            Node node = new Node();
            node.id = i;
            for (int j = 0; j < N; j++) {
                if (edges[i][j] == 0) {
                    continue;
                }
                node.add_neibor(j);
            }
            graph.put(i, node);
            queue.add(node);
        }
        Node node = queue.peek();
        int target = node.degree();
        int ans = -1;
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            if (n.degree() != target) {
                break;
            }
            ans = Math.max(ans, check(edges, graph, n));
        }
        System.out.println(-1);
    }
    private int check(int[][] edges, HashMap<Integer, Node> graph, Node root) {
        for(Node x : graph.values()) {
            x.visited = false;
            x.distance = Integer.MAX_VALUE;
        }
        visit(graph, root);
        HashMap<Integer, List<Integer>> t = new HashMap<>();
        for (int x : graph.keySet()) {
            Node n = graph.get(x);
            if (!t.containsKey(n.distance)) {
                t.put(n.distance, new ArrayList());
            }
            t.get(n.distance).add(x);
        }
        for(int x : t.keySet()) {
            List<Integer> list = t.get(x);
            for (int i = 0; i < list.size(); i++) {
                int x_i = list.get(i);
                for (int j = 0; j < list.size(); j++) {
                    int x_j = list.get(j);
                    if (edges[x_i][x_j] != 0) {
                        return Integer.MAX_VALUE;
                    }
                }
            }
        }
        return t.size();
    }
    private void visit(HashMap<Integer, Node> graph, Node root) {
        Deque<Node> queue = new ArrayDeque<>();
        root.distance = 0;
        queue.add(root);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.visited) {
                continue;
            }
            current.visited = true;
            for(int x : current.neibors) {
                Node n = graph.get(x);
                n.distance = current.distance + 1;
                queue.add(n);
            }
        }
    }
    class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            int o1_d = o1.degree();
            int o2_d = o2.degree();
            if (o1_d != o2_d) {
                return Integer.compare(o1_d, o2_d);
            }
            return Integer.compare(o1.id, o2.id);
        }
    }
    class Node {
        boolean visited = false;
        int id = -1;
        int distance = Integer.MAX_VALUE;
        List<Integer> neibors = new ArrayList<>();
        void add_neibor(int x) {
            neibors.add(x);
        }
        int degree() {
            return neibors.size();
        }
    }
}
