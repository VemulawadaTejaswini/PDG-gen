import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    static void sortArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPos = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[randomPos];
            a[randomPos] = t;
        }
        Arrays.sort(a);
    }

    static class Edge {
        int u;
        int v;

        public Edge(int u, int v) {
            this.u = Math.min(u, v);
            this.v = Math.max(u, v);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return u == edge.u &&
                    v == edge.v;
        }

        @Override
        public int hashCode() {
            return Objects.hash(u, v);
        }
    }

    private static class Node {
        int parent;
        List<Integer> children = new ArrayList<>();
        int num;

        public Node(int parent, int num) {
            this.parent = parent;
            this.num = num;
        }
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = readArray(n, in);
        int ans = a[0] == 1 ? 0 : 1;
        Node[] nodes = new Node[n + 1];
        nodes[1] = new Node(-1, 1);
        for (int i = 1; i < n; i++) {
            nodes[i + 1] = new Node(a[i], i + 1);
        }
        for (int i = 1; i < n; i++) {
            nodes[a[i]].children.add(i + 1);
        }

        for (Integer rootChild : nodes[1].children) {
            int maxPath = findMaxPath(rootChild, nodes, 1);
            if (maxPath <= k) {
                continue;
            }
            ans += moveEdges(rootChild, maxPath % k + 1, k, nodes);
        }
        out.println(ans);

        out.close();
    }

    private static int moveEdges(int node, int i, int k, Node[] nodes) {
        if (i == 0) {
            i = k;
        }
        int res = i == 1 && nodes[node].parent != 1 ? 1 : 0;
        for (Integer child : nodes[node].children) {
            res += moveEdges(child, i - 1, k, nodes);
        }
        return res;
    }

    private static int findMaxPath(int node, Node[] nodes, int pathLength) {
        int maxPath = pathLength;
        for (Integer child : nodes[node].children) {
            maxPath = Math.max(findMaxPath(child, nodes, pathLength + 1), maxPath);
        }
        return maxPath;
    }

    private static int solve(int v, int currentValue, List<Integer>[] graph, Map<Edge, Integer> edgeToIndex, int[] newIndices, boolean[] visited) {
        visited[v] = true;
        for (int i = 0; i < graph[v].size(); i++) {
            Integer u = graph[v].get(i);
            Edge edge = new Edge(v, u);
            Integer edgeIndex = edgeToIndex.get(edge);

            if (i == 0) {
                currentValue = goUp(u, currentValue, graph, edgeToIndex, newIndices, visited);
                newIndices[edgeIndex] = currentValue;
                currentValue++;
            } else {
                newIndices[edgeIndex] = currentValue;
                currentValue = goDown(u, currentValue + 1, graph, edgeToIndex, newIndices, visited);
            }
        }
        return currentValue;
    }

    private static int goDown(int v, int currentValue, List<Integer>[] graph, Map<Edge, Integer> edgeToIndex, int[] newIndices, boolean[] visited) {
        visited[v] = true;
        for (Integer u : graph[v]) {
            if (!visited[u]) {
                Edge edge = new Edge(v, u);
                Integer edgeIndex = edgeToIndex.get(edge);
                newIndices[edgeIndex] = currentValue;
                currentValue = goDown(u, currentValue + 1, graph, edgeToIndex, newIndices, visited);
            }
        }
        return currentValue;
    }

    private static int goUp(int v, int currentValue, List<Integer>[] graph, Map<Edge, Integer> edgeToIndex, int[] newIndices, boolean[] visited) {
        visited[v] = true;
        for (Integer u : graph[v]) {
            if (!visited[u]) {
                Edge edge = new Edge(v, u);
                Integer edgeIndex = edgeToIndex.get(edge);

                currentValue = goUp(u, currentValue, graph, edgeToIndex, newIndices, visited);
                newIndices[edgeIndex] = currentValue;
                currentValue++;
            }
        }
        return currentValue;
    }

    private static void outputArray(int[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < ans.length; i++) {
            int an = ans[i];
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}