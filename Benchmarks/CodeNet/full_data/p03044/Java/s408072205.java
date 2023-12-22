import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final int modnum = 1000000007;

    public static void main(String[] args) {
        ArrayList<Node> node = new ArrayList<Node>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            node.add(new Node(node, i));
        }

        for (int i = 1; i < N; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int length = sc.nextInt();
            node.get(p1 - 1).addEdge(p2, length);
            node.get(p2 - 1).addEdge(p1, length);
        }

        for (int i = 0; i < N; i++) {
            if (node.get(i).isLeaf) {
                node.get(i).setParent(0, 0);
                break;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(node.get(i).isBlack ? 1 : 0);
        }
    }
}

class Node {
    final int number;
    boolean isLeaf = true;
    boolean isBlack = false;
    int parent = 0;

    ArrayList<Node> node;

    ArrayList<Integer> edge = new ArrayList<Integer>();
    ArrayList<Boolean> even = new ArrayList<Boolean>();

    Node(ArrayList<Node> node, int number) {
        this.node = node;
        this.number = number;
    }

    void addEdge(int n, int length) {
        edge.add(n);
        even.add(length % 2 == 0);

        if (edge.size() == 1)
            isLeaf = true;
        else
            isLeaf = false;
    }

    void setParent(int p, int odds) {
        parent = p;
        if (odds % 2 != 0)
            isBlack = true;
        for (int i = 0; i < edge.size(); i++) {
            if (edge.get(i) == p)
                continue;
            int nextodds = even.get(i) ? odds : odds + 1;
            node.get(edge.get(i) - 1).setParent(number, nextodds);
        }
    }

}