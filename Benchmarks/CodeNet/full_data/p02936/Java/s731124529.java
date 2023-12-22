import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    List<Node> nodes = new ArrayList<>();

    // 問題文上のインデックスと、配列orリスト上のインデックスがずれていると、混乱しそうなので、
    // 入力時に、問題文上のインデックスから配列orリスト上のインデックスに変換してしまうというわざもある。
    void solve() {
        Scanner sc = new Scanner(System.in);
        int nodeNum = sc.nextInt(); // N
        int operationCount = sc.nextInt(); // Q

        for (int i = 0; i < nodeNum - 1; i++) {
            int parentIndex = sc.nextInt() - 1;
            int childIndex  = sc.nextInt() - 1;

            // 親のNodeの取得または作成
            Node parent;
            if (nodes.contains(new Node(parentIndex, 0))) {
                parent = nodes.get(parentIndex);
            }
            else {
                parent = new Node(parentIndex, 0);
                nodes.add(parent);
            }

            // 子Nodeの作成。
            Node child = new Node(childIndex, 0);
            nodes.add(child);

            // 親Nodeと子Nodeとの関連を作成
            parent.addChild(child);
        }
        
        int[] topIndexes = new int[operationCount]; // p[i]
        int[] counts = new int[operationCount];   // x[i]
        for (int i = 0; i < operationCount; i++) {
            topIndexes[i] = sc.nextInt() - 1;
            counts[i]  = sc.nextInt();
        }

        // 各ノードにカウントを足す。
        for (int i = 0; i < operationCount; i++) {
            addCount(topIndexes[i], counts[i]);
        }

        for (Node node : nodes) {
            System.out.print(node.counter + " ");
        }

    }
    void addCount (int index, int count) {
        Node node = nodes.get(index);
        node.addCounter(count);
        for (Node child : node.children) {
            addCount(child.index, count);
        }
    }

    class Node {
        int index = 0;
        int counter = 0;
        List<Node> children = new ArrayList<>();

        Node (int index, int counter) {
            this.index = index;
            this.counter = counter;
        }
        void addCounter(int number) {
            counter += number;
        }
        void addChild(Node node) {
            children.add(node);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;

            Node node = (Node) o;

            return index == node.index;
        }

        @Override
        public int hashCode() {
            return index;
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}