import java.util.*;

class Node {
    long value = 0;
    List<Node> children = new ArrayList<Node>();
}

class Main {
    static void dfs(Node v, Node parent, long sum) {
        v.value += sum;
        for (Node u: v.children) {
            if (u != parent) {
                dfs(u, v, v.value);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Node V[] = new Node[N + 1];
        for (int i = 1; i <= N; i++) {
            V[i] = new Node();
        }
        for (int i = 1; i <= N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            V[a].children.add(V[b]);
            V[b].children.add(V[a]);
        }
        for (int i = 1; i <= Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            V[p].value += x;
        }
        dfs(V[1], null, 0);
        System.out.print(V[1].value);
        for (int i = 2; i <= N; i++) {
            System.out.print(" " + V[i].value);
        }
        System.out.println();
    }
}
