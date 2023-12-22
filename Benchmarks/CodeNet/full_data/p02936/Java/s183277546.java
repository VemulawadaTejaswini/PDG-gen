import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int q = sc.nextInt();

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            nodes[a].children.add(nodes[b]);
            nodes[b].children.add(nodes[a]);
        }

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt()-1;
            int x = sc.nextInt();
            nodes[p].sum += x;
        }

        Deque<Node> deque = new ArrayDeque<>();
        deque.add(nodes[0]);
        nodes[0].isChecked = true;
        while (!deque.isEmpty()) {
            Node node = deque.poll();
            for (Node child : node.children) {
                if (child.isChecked)
                    continue;
                child.sum += node.sum;
                child.isChecked = true;
                deque.add(child);
            }
        }

        for (Node i : nodes) {
            pw.print(i.sum + " ");
        }
        pw.println();

        pw.flush();
    }

    static class Node {
        int sum = 0;
        boolean isChecked = false;
        List<Node> children = new ArrayList<>();
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}