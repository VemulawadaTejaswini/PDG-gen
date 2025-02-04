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
        for (int i = 0; i < nodeNum; i++) {
            nodes.add(new Node(i, 0));
        }

        for (int i = 0; i < nodeNum - 1; i++) {
            // 問題文上のインデックスとプログラム上のインデックスがずれているので、ここで調整する。
            int parentIndex = sc.nextInt() - 1;
            int childIndex  = sc.nextInt() - 1;
             Node parent = nodes.get(parentIndex);
             Node child = nodes.get(childIndex);

            // 親Nodeと子Nodeとの関連を作成
            parent.addChild(child);
        }
        for (int i = 0; i < operationCount; i++) {
            int topIndex = sc.nextInt() - 1;
            int count  = sc.nextInt();
            nodes.get(topIndex).counter += count;
        }

        addCount(0, 0);

        for (Node node : nodes) {
            System.out.print(node.counter + " ");
        }
    }

    void addCount (int index, int prevCount) {
        Node node = nodes.get(index);
        node.addCounter(prevCount);
        for (Node child : node.children) {
            addCount(child.index, node.counter);
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