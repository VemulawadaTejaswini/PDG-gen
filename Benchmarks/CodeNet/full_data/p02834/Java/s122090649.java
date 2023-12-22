
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static class Node {
        int index;
        int father = -1;
        int sonHeight = 0;
        int fromRootHeight = 0;
        Set<Integer> connected = new HashSet<>();
        public Node() {
        }
        public Node(int index) {
            this.index = index;
        }
        public void setFather(int father) {
            this.father = father;
        }
        public void setSonHeight(int sonHeight) {
            this.sonHeight = sonHeight;
        }
        public void setFromRootHeight(int fromRootHeight) {
            this.fromRootHeight = fromRootHeight;
        }
        public void addConnected(int connect) {
            connected.add(connect);
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        Node[] tree = new Node[n + 1];
        for (int i = 1; i <= n; ++i) {
            tree[i] = new Node(i);
        }
        for (int i = 1; i <= n - 1; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree[u].addConnected(v);
            tree[v].addConnected(u);
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[n + 1];
        queue.add(a);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            visited[current] = 1;
            for (int connected : tree[current].connected) {
                if (visited[connected] == 1) {
                    continue;
                }
                tree[connected].setFromRootHeight(tree[current].fromRootHeight + 1);
                tree[connected].setFather(current);
                queue.add(connected);
            }
        }
        calculateMaxSonHeight(tree, a, a);
        int diffHeight = tree[t].fromRootHeight - tree[a].fromRootHeight;
      //  System.out.println("a height: " + tree[a].fromRootHeight);
      //  System.out.println(" t height: "  +tree[t].fromRootHeight);
        if (diffHeight == 1) {
            System.out.println(0);
            return;
        }

        int ans = 0;
        int father = t;
     //   System.out.println("diffHieght: " + diffHeight);
        for (int i = 0; i <= (diffHeight - 1) / 2; ++i) {
         //   System.out.println("father: " + father);
            int currentSum = Math.max(
                    tree[father].fromRootHeight - tree[a].fromRootHeight,
                    tree[t].fromRootHeight - tree[father].fromRootHeight
            ) + (tree[father].sonHeight - 1);
         //   System.out.println("currentSum: " + currentSum);
            ans = Math.max(ans, currentSum);
            father = tree[father].father;
        }
        System.out.println(ans);
    }

    public static int calculateMaxSonHeight(Node[] tree, int current, int a) {
        if (tree[current].connected.size() == 1 && current != a) {
            tree[current].setSonHeight(0);
            return 0;
        }
        int height = 0;
        for (int connected : tree[current].connected) {
            if (connected == tree[current].father) {
                continue;
            }
            int currentHeight = calculateMaxSonHeight(tree, connected, a);
            height = Math.max(height, currentHeight);
        }
        tree[current].setSonHeight(height + 1);
        return height + 1;
    }
}
