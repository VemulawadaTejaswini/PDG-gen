import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskFF solver = new TaskFF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskFF {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int u = in.nextInt();
            int v = in.nextInt();

            TaskFF.Node[] nodes = new TaskFF.Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new TaskFF.Node();
                nodes[i].id = i;
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                nodes[a].nexts.add(nodes[b]);
                nodes[b].nexts.add(nodes[a]);
            }

            //Root = v
            ArrayDeque<TaskFF.Node> queue = new ArrayDeque<>();
            TaskFF.Node root = nodes[v];
            queue.addLast(root);
            root.isVisited = true;
            root.levelToRoot = 0;

            while (!queue.isEmpty()) {
                TaskFF.Node current = queue.pollFirst();
                for (TaskFF.Node next : current.nexts) {
                    if (!next.isVisited) {
                        next.isVisited = true;
                        next.levelToRoot = current.levelToRoot + 1;
                        next.father = current;
                        current.children.add(next);
                        queue.addLast(next);
                    }
                }
            }

            //Find the top level for u
            int distanceToRoot = nodes[u].levelToRoot;
            int distanceToOpt = Math.max(0, (distanceToRoot + 1) / 2 - 1);
            TaskFF.Node target = nodes[u];
            for (int i = 0; i < distanceToOpt; i++) {
                target = target.father;
            }

            //Find depth of target
            int res = getDepth(target, 0);
            int distanceToLeafForRoot = target.levelToRoot + res;
            int distanceToLeafForU = distanceToOpt + res;
            if (distanceToLeafForU % 2 != distanceToOpt % 2 || distanceToLeafForRoot <= 2)
                distanceToLeafForRoot--;
            out.println(distanceToLeafForRoot);
        }

        private int getDepth(TaskFF.Node node, int maxDepth) {
            if (node.children.isEmpty())
                return maxDepth;

            int tmp = 0;
            for (TaskFF.Node next : node.children) {
                tmp = Math.max(tmp, getDepth(next, maxDepth + 1));
            }
            return tmp;
        }

        public static class Node {
            boolean isVisited;
            ArrayList<TaskFF.Node> nexts = new ArrayList<>();
            ArrayList<TaskFF.Node> children = new ArrayList<>();
            int levelToRoot;
            TaskFF.Node father;
            int id;

        }

    }
}

