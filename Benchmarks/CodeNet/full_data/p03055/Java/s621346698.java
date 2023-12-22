import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Eda> edas = new HashSet<>();
        Map<Integer, Node> nodesMap = new HashMap<>();

        for (int i = 0; i < N - 1; i++) {
            edas.add(new Eda(sc.nextInt(), sc.nextInt()));
        }

        Eda next1 = edas.iterator().next();
        Node nodeA = new Node(next1.a);
        Node nodeB = new Node(next1.b);
        nodeA.children.add(nodeB);
        nodesMap.put(next1.a, nodeA);
        nodesMap.put(next1.b, nodeB);
        edas.remove(next1);

        int edaCount = 0;

        while (!edas.isEmpty()) {
            Iterator<Eda> iterator = edas.iterator();
            Set<Integer> keys = nodesMap.keySet();
            Eda nextEda = null;

            while(iterator.hasNext()) {
                nextEda = iterator.next();
                if (!keys.contains(nextEda.a) && !keys.contains(nextEda.b)) {
                    continue;
                } else {
                    break;
                }
            }

            boolean containsA = keys.contains(nextEda.a);
            int parentIndex = containsA ? nextEda.a : nextEda.b;
            int childIndex = containsA ? nextEda.b : nextEda.a;

            Node neoNode = new Node(childIndex);
            Node parentNode = nodesMap.get(parentIndex);

            if (!parentNode.children.isEmpty()) {
                edaCount++;
            }

            parentNode.children.add(neoNode);
            nodesMap.put(childIndex, neoNode);
            edas.remove(nextEda);
        }


        if ((N - 2 - edaCount) % 3 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }

    }

    public static class Eda {
        public int a;
        public int b;

        public Eda(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class Node {
        public int i;
        public List<Node> children;

        public Node(int i) {
            this.i = i;
            children = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Node{" +
                    "i=" + i +
                    ", children=" + children +
                    '}';
        }
    }
}
