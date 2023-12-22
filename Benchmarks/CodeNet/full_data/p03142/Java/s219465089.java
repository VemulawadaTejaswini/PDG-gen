import java.util.*;

public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final Map<Integer, Node> nodePool = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            nodePool.put(i, new Node(i));
        }
        final int m = scanner.nextInt();
        final Set<Edge> givenEdges = new HashSet<>();
        for (int i = 0; i < n - 1 + m; i++) {
            Edge e = new Edge(nodePool.get(scanner.nextInt()), nodePool.get(scanner.nextInt()));
            givenEdges.add(e);
        }

        final Set<Node> rootCandidate = new HashSet<>(nodePool.values());
        for (final Edge e : givenEdges) {
            rootCandidate.remove(e.getChild());
        }
        final Node root = rootCandidate.iterator().next(); // must be exist
        root.setLevel(0);

        Set<Node> beforeLevelCandidate = new HashSet<>();
        beforeLevelCandidate.add(root);
        for (int level = 1; level <= n; level++) {
            final Set<Node> levelCandidates = new HashSet<>();
            for (Edge e : givenEdges) {
                if (beforeLevelCandidate.contains(e.getParent())) {
                    levelCandidates.add(e.getChild());
                    e.getChild().setLevel(level);
                }
            }
            beforeLevelCandidate = levelCandidates;
        }

        final Map<Integer, Integer>originalParentMap = new HashMap<>();
        originalParentMap.put(root.getNum(), 0);
        for (Edge e : givenEdges) {
            if (e.getChild().getLevel() -  e.getParent().getLevel() == 1) {
                originalParentMap.put(e.getChild().getNum(), e.getParent().getNum());
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(originalParentMap.get(i));
        }

    }

    static class Edge {
        private final Node parent;
        private final Node child;

        public Edge(Node parent, Node child) {
            this.parent = parent;
            this.child = child;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return Objects.equals(parent, edge.parent) &&
                    Objects.equals(child, edge.child);
        }

        @Override
        public int hashCode() {
            return Objects.hash(parent, child);
        }

        public Node getParent() {
            return parent;
        }

        public Node getChild() {
            return child;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "parent=" + parent +
                    ", child=" + child +
                    '}';
        }
    }

    static class Node {
        private final int num;
        private int level = -1;
        public Node(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "num=" + num +
                    ", level=" + level +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return num == node.num;
        }

        @Override
        public int hashCode() {
            return Objects.hash(num);
        }

        public int getNum() {
            return num;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }

}
