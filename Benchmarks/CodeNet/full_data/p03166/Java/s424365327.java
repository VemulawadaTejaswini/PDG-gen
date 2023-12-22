import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int m = in.nextInt();
        Vertex[] vs = new Vertex[n + 1];
        for (int i = 1; i <= n; i++) {
            vs[i] = new Vertex(i);
        }
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            vs[x].adj.add(vs[y]);
        }

        Set<Vertex> visited = new HashSet<>();
        Stack<Vertex> st = new Stack<>();
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(vs[i]))
                dfs(vs[i], visited, st);
        }
        List<Vertex> sorted = new ArrayList<>();
        while (!st.isEmpty()) {
            sorted.add(st.pop());
        }
        int ans = 0;
        int[] dp = new int[n + 1];
        for (int i = 0; i < sorted.size(); i++) {
            Vertex v = sorted.get(i);
            for (Vertex ne : v.adj) {
                dp[ne.i] = Math.max(dp[ne.i], dp[v.i] + 1);
                ans = Math.max(ans, dp[ne.i]);
            }
        }
        out.println(ans);
        out.close();
    }

    private static void dfs(Vertex v, Set<Vertex> visited, Stack<Vertex> st) {
        visited.add(v);
        for (Vertex n : v.adj) {
            if (!visited.contains(n))
                dfs(n, visited, st);
        }
        st.add(v);
    }

    static class Vertex {
        int i;

        public Vertex(int i) {
            this.i = i;
        }

        List<Vertex> adj = new ArrayList<>();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
