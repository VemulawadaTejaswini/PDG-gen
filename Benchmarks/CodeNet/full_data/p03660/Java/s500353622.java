import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static class Node {
        private List<Integer> children;
        private int parent;

        private Node() {
            this.parent = -1;
            this.children = new ArrayList<>();
        }

        private void addChild(int child) {
            this.children.add(child);
        }
    }

    private static void solve() {
        int n = in.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            nodes[a].addChild(b);
            nodes[b].addChild(a);
        }

        // construct tree with node 0 as the root (fill "parent" field)
        treeDfs(nodes, -1, 0);

        // snuke's depth
        int depth = findDepth(nodes, n - 1);
        int raceCounts = depth - 1;
        int snukeRoot = findNDepthIndex(nodes, n - 1, raceCounts / 2);

        int snukeCount = count(nodes, snukeRoot);

        out.println((n - snukeCount) > snukeCount ? "Fennec" : "Snuke");
    }

    // Tree dfs, expected no loop in the graph
    // First call: treeDfs(nodes, -1, root); (root is the root index)
    private static void treeDfs(Node[] nodes, int parent, int current) {
        for (int child : nodes[current].children) {
            if (child != parent) {
                nodes[child].parent = current;
                treeDfs(nodes, current, child);
            }
        }
    }

    private static int findDepth(Node[] nodes, int index) {
        if (nodes[index].parent == -1) {
            return 0;
        }

        return findDepth(nodes, nodes[index].parent) + 1;
    }

    // go up the tree n-times
    private static int findNDepthIndex(Node[] nodes, int index, int n) {
        if (n == 0) {
            return index;
        }

        return findNDepthIndex(nodes, nodes[index].parent, n - 1);
    }

    // finds number of nodes below this index (including the index)
    private static int count(Node[] nodes, int index) {
        int count = 1;
        for (int child : nodes[index].children) {
            if (child == nodes[index].parent) {
                continue;
            }
            count += count(nodes, child);
        }
        return count;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
