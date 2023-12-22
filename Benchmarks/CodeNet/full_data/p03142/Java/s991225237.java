import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        final int n;
        final int m;
        final Map<Integer, Node> nodePool;
        final Set<Edge> givenEdges;
        final Graph givenGraph;

        n = nextInt();
        nodePool = new HashMap<>(n);
        for (int i = 1; i <= n; i++) {
            nodePool.put(i, new Node(i));
        }
        m = nextInt();
        givenEdges = new HashSet<>(n - 1 + m);
        givenGraph = new Graph(n);
        for (int i = 0; i < n - 1 + m; i++) {
            Edge e = new Edge(nodePool.get(nextInt()), nodePool.get(nextInt()));
            givenEdges.add(e);
            givenGraph.addEdge(e);
        }

        Node rootCandidate = null;
        for (int i = 1; i <= n; i++) {
            Set<Node> parents = givenGraph.getParentsOf(nodePool.get(i));
            if (parents.isEmpty()) {
                rootCandidate = nodePool.get(i);
                break;
            }
        }
        final Node root = rootCandidate;
        assert root != null;

        final Queue<Node> nonInputNode = new ArrayDeque<>();
        nonInputNode.add(root);

        final List<Node> sorted = new ArrayList<>();
        final Graph sortingGraph = givenGraph.clone();

        int level = 0;
        while (!nonInputNode.isEmpty()) {
            final Node node = nonInputNode.remove();
            if (node.getLevel() == -1) {
                node.setLevel(level);
                for (Node currentNode : nonInputNode) {
                    currentNode.setLevel(level);
                }
                level++;
            }
            sorted.add(node);
            for (final Node child : givenGraph.getChildsOf(node)) {
                sortingGraph.removeEdge(new Edge(node, child));
                if (sortingGraph.getParentsOf(child).isEmpty()) {
                    nonInputNode.add(child);
                }
            }
        }

        int[] results = new int[n];
        for (final Edge edge : givenEdges) {
            if (edge.getChild().getLevel() - edge.getParent().getLevel() == 1) {
                results[edge.getChild().getNum() - 1] = edge.getParent().getNum();
            }
        }
        try (PrintStream out = new PrintStream(new BufferedOutputStream(System.out))) {
            for (int i = 0; i < n; i++) {
                out.println(results[i]);
            }
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

    static class Graph implements Cloneable {
        private Map<Node, Set<Node>> parentMap;
        private Map<Node, Set<Node>> childMap;
        public Graph(final int initialNodeCapacity) {
            this.parentMap = new HashMap<>(initialNodeCapacity);
            this.childMap = new HashMap<>(initialNodeCapacity);
        }
        public Set<Node> getParentsOf(final Node node) {
            final Set<Node> parents = this.parentMap.get(node);
            return parents == null ? Collections.emptySet() : parents;
        }
        public Set<Node> getChildsOf(final Node node) {
            final Set<Node> childs = this.childMap.get(node);
            return childs == null ? Collections.emptySet() : childs;
        }
        public boolean addEdge(final Edge edge) {
            this.parentMap.compute(edge.getChild(), (key, existingValue) -> existingValue == null //
                    ? new HashSet<>() //
                    : existingValue).add(edge.getParent());
            return this.childMap.compute(edge.getParent(), (key, existingValue) -> existingValue == null //
                    ? new HashSet<>() //
                    : existingValue).add(edge.getChild());
        }
        public Edge removeEdge(final Edge edge) {
            this.getParentsOf(edge.getChild()).remove(edge.getParent());
            final boolean isExists = this.getChildsOf(edge.getParent()).remove(edge.getChild());
            return isExists ? edge : null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Graph graph = (Graph) o;
            return parentMap.equals(graph.parentMap) &&
                    childMap.equals(graph.childMap);
        }

        @Override
        public int hashCode() {
            return Objects.hash(parentMap, childMap);
        }

        @Override
        public String toString() {
            return "Graph{" +
                    "parentMap=" + parentMap +
                    ", childMap=" + childMap +
                    '}';
        }
        @Override
        public Graph clone() {
            try {
                final Graph cloned = (Graph) super.clone();
                cloned.parentMap = new HashMap<>(this.parentMap.size());
                cloned.parentMap.putAll(this.parentMap.entrySet().stream() //
                        .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), new HashSet<>(entry.getValue()))) //
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
                cloned.childMap = new HashMap<>(this.childMap.size());
                cloned.childMap.putAll(this.childMap.entrySet().stream() //
                        .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), new HashSet<>(entry.getValue()))) //
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
                return cloned;
            } catch (CloneNotSupportedException e) {
                throw new InternalError("Cloneable implemented.", e);
            }
        }
    }

    private static ByteBuffer inputbuffer = ByteBuffer.allocate(1024);
    private static ReadableByteChannel inputChannel = Channels.newChannel(System.in);

    private static byte readByte() {
        while (inputbuffer.position() == inputbuffer.limit()) {
            if (Thread.interrupted()) {
                Thread.currentThread().interrupt();
                return -1;
            }
            inputbuffer.clear();
            try {
                inputChannel.read(inputbuffer);
            } catch (final IOException e) {
                throw new UncheckedIOException("IOError", e);
            }
            inputbuffer.flip();
        }
        return inputbuffer.get();
    }
    private static int nextInt() {
        int c;
        while ((c = readByte()) != -1 && ((c < '0'  || '9' < c) && c != '-')) {
            // do nothing
        }

        final boolean isMinus = (c == '-');
        if (isMinus) {
            c = readByte();
        }

        int num = 0;
        while (true) {
            if ('0' <= c && c <= '9') {
                num = num * 10 + (c - '0');
            } else {
                return isMinus ? - num : num;
            }
            c = readByte();
        }

    }

}
