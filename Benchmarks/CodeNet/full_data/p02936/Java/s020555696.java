import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int q = sc.nextInt();

        Node[] list = new Node[n];
        for (int i = 0; i < n; i++) {
            list[i] = new Node(i);
        }

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            list[b].setPrev(list[a]);
        }

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt() - 1;
            int x = sc.nextInt();
            list[p].addCounter(x);
        }

        for (Node i : list) {
            pw.print(i.getCounter() + " ");
        }
        pw.println();

        pw.flush();
    }

    static class Node {
        int key;
        long counter;
        List<Node> prev;  // 前のノードリスト
        List<Node> child;  // 全ての子ノード

        Node(int x) {
            key = x;
            counter = 0;
            prev = new ArrayList<>();
            child = new ArrayList<>();
        }

        void setPrev(Node a) {
            this.prev.add(a);
            for (Node i : prev) {
                i.setChild(this);
            }
        }

        void setChild(Node a) {
            if (child.indexOf(a) < 0) {
                this.child.add(a);
                for (Node i : prev) {
                    i.setChild(a);
                }
            }
        }

        void addCounter(int cnt) {
            counter += cnt;
            for (Node i : child) {
                i.counter += cnt;
            }
        }
        long getCounter() {
            return counter;
        }
    }
}