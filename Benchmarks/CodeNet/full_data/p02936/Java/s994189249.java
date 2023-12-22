import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 15:51-

            int n = sc.nextInt();
            int q = sc.nextInt();

            ArrayList[] tree = new ArrayList[n];
            for (int i = 0; i < tree.length; i++) tree[i] = new ArrayList();

            for (int i = 0; i < n - 1; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;

                tree[a].add(b);
                tree[b].add(a);
            }

            int[] vs = new int[n];
            for (int i = 0; i < q; i++) vs[sc.nextInt() - 1] += sc.nextInt();

            ArrayDeque<WeightNode> qu = new ArrayDeque<>();
            qu.addLast(new WeightNode(0, 0));
            boolean[] seen = new boolean[n];
            int[] ret = new int[n];

            while (!qu.isEmpty()) {
                WeightNode cur = qu.removeFirst();
                seen[cur.node] = true;

                int myval = cur.weight + vs[cur.node];
                ret[cur.node] = myval;

                ArrayList<Integer> children = tree[cur.node];
                for (Integer child : children) if (!seen[child]) {
                    qu.addFirst(new WeightNode(child, myval));
                }
            }

            for (int v : ret) {
                out.print(v + " ");
            }
            out.println();
        }
    }
    
    private static class WeightNode {
        private final int node;
        private final int weight;

        public WeightNode(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

}
