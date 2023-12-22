import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FMonochromeCat solver = new FMonochromeCat();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMonochromeCat {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.NextInt();
            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
            }
            for (int i = 0; i < n - 1; i++) {
                int u = in.NextInt() - 1;
                int v = in.NextInt() - 1;
                nodes[u].edges.add(nodes[v]);
                nodes[v].edges.add(nodes[u]);
            }
            char[] colors = in.next().toCharArray();
            for (int i = 0; i < n; i++) {
                nodes[i].isWhite = colors[i] == 'W';
            }
            HashSet<Node> nodes1 = new HashSet<>(Arrays.asList(nodes));
            LinkedList<Node> q = new LinkedList<>();
            for (Node node : nodes) if (!node.isWhite && node.edges.size() <= 1) q.add(node);
            while (!q.isEmpty()) {
                Node node = q.poll();
                nodes1.remove(node);
                for (Node node1 : node.edges) {
                    node1.edges.remove(node);
                    if (!node1.isWhite && node1.edges.size() <= 1) q.add(node1);
                }
            }
            nodes = nodes1.toArray(new Node[0]);
            if (nodes.length == 0) {
                out.println(0);
            } else if (nodes.length == 1) {
                out.println(1);
            } else {
                for (Node node : nodes) {
                    if (node.edges.size() > 1) {
                        int parity = 0;
                        if (node.isWhite) parity = 1;
                        parity += node.edges.size();
                        if (parity % 2 != 0) node.HowMuchYouReduce = 2;
                        else node.HowMuchYouReduce = 1;
                    } else {
                        node.HowMuchYouReduce = 1;
                    }
                }

                Node start = nodes[0].dfs(null);
                Node target = start.dfs(null);
                start.dfs_target(null, target);
                out.println(start.minAction(null));
            }
        }

        class Node {
            Node nextNodeOnSTPath = null;
            HashSet<Node> edges = new HashSet<>();
            boolean isWhite;
            int distance = 0;
            int HowMuchYouReduce = 0;

            Node dfs(Node parent) {
                Node res = this;
                for (Node node : edges) {
                    if (node != parent) {
                        node.distance = distance + HowMuchYouReduce;
                        Node res1 = node.dfs(this);
                        if (res1.distance > res.distance) res = res1;
                    }
                }
                return res;
            }

            boolean dfs_target(Node parent, Node target) {
                if (target == this) return true;
                for (Node node : edges)
                    if (node != parent && node.dfs_target(this, target)) {
                        nextNodeOnSTPath = node;
                        return true;
                    }
                return false;
            }

            long minAction(Node parent) {
                long res = 0;
                for (Node node : edges) {
                    if (node != nextNodeOnSTPath && node != parent) {
                        node.isWhite = !node.isWhite;
                        res += 2 + node.minAction(this);
                        isWhite = !isWhite;
                    }
                }

                if (nextNodeOnSTPath != null) {
                    nextNodeOnSTPath.isWhite = !nextNodeOnSTPath.isWhite;
                    res += 1 + nextNodeOnSTPath.minAction(this);
                }
                if (isWhite) res++;
                return res;
            }

        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

    }
}

