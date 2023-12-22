import java.util.*;
import java.io.*;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    char nextChar() throws IOException {
        return (char) (br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
    }
    List<Integer>[] graph;
    boolean[] visited;
    Stack<Integer> stack;
    int time;
    int[] tin;
    int[] lowlink;
    List<List<Integer>> components;
    List<Integer> cutPoints;
    List<String> bridges;

    public List<List<Integer>> biconnectedComponents(List<Integer>[] graph) {
        int n = graph.length;
        this.graph = graph;
        visited = new boolean[n];
        stack = new Stack<>();
        time = 0;
        tin = new int[n];
        lowlink = new int[n];
        components = new ArrayList<>();
        cutPoints = new ArrayList<>();
        bridges = new ArrayList<>();

        for (int u = 0; u < n; u++)
            if (!visited[u])
                dfs(u, -1);

        return components;
    }

    void dfs(int u, int p) {
        visited[u] = true;
        lowlink[u] = tin[u] = time++;
        stack.add(u);
        int children = 0;
        boolean cutPoint = false;
        for (int v : graph[u]) {
            if (v == p)
                continue;
            if (visited[v]) {
                // lowlink[u] = Math.min(lowlink[u], lowlink[v]);
                lowlink[u] = Math.min(lowlink[u], tin[v]);
            } else {
                dfs(v, u);
                lowlink[u] = Math.min(lowlink[u], lowlink[v]);
                cutPoint |= lowlink[v] >= tin[u];
                //if (lowlink[v] == tin[v])
                if (lowlink[v] > tin[u])
                    bridges.add("(" + u + "," + v + ")");
                ++children;
            }
        }
        if (p == -1)
            cutPoint = children >= 2;
        if (cutPoint)
            cutPoints.add(u);
        if (lowlink[u] == tin[u]) {
            List<Integer> component = new ArrayList<>();
            while (true) {
                int x = stack.pop();
                component.add(x);
                if (x == u)
                    break;
            }
            components.add(component);
        }
    }
    void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int x = nextInt() - 1;
            int y = nextInt() - 1;
            graph[x].add(y);
            graph[y].add(x);
        }
        biconnectedComponents(graph);
        out.println(bridges.size());

    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}