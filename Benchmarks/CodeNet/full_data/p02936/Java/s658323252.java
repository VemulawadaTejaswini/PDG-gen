import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    public static class Node {
        private int num;
        private Node parent;
        private int counter;
        private List<Node> children;

        public Node(Node parent, int num) {
            this.num = num;
            this.parent = parent;
            this.children = new ArrayList<>();
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public void addChild(Node child) {
            this.children.add(child);
        }

    }

    private static void solve() {
        int n = in.nextInt();
        int q = in.nextInt();

        List<Node> nodes = new ArrayList<>();
        for (int i=1; i <= n; i++)
            nodes.add(new Node(null, i));

        for (int i=0; i < n-1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            nodes.get(a - 1).addChild(nodes.get(b - 1));
            nodes.get(b - 1).addChild(nodes.get(a - 1));
        }

        for (int i=0; i < q; i++) {
            int p = in.nextInt();
            int x = in.nextInt();
            nodes.get(p - 1).counter += x;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Node> toVisit = new ArrayDeque<>();
        toVisit.add(nodes.get(0));
        visited.add(1);
        while (!toVisit.isEmpty()) {
            Node p = toVisit.poll();
            List<Node> toAdd = p.children;
            for (Node a : toAdd) {
                if (!visited.contains(a.num)) {
                    visited.add(p.num);
                    toVisit.add(a);
                    a.counter += p.counter;
                }
            }
        }

        out.println(
                nodes.stream().map(p -> String.valueOf(p.counter)).collect(Collectors.joining(" "))
        );
    }

}
