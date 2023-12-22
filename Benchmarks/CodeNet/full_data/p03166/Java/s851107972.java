import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
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
    }

    private ArrayList<Integer>[] adj;

    private void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public static void main(String[] args) {
        Main main = new Main();
        FastReader scanner = new FastReader();
        int N = scanner.nextInt();

        main.adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            main.adj[i] = new ArrayList<>();
        }

        int M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            main.addEdge(scanner.nextInt() - 1, scanner.nextInt() - 1);
        }

        int max = 0;
        int[] DP = new int[N];

        boolean[] visited = new boolean[N + 1];


        for (int i = 0; i < N; i++) {
            if (!visited[i])
                main.DFS(visited, i, DP);
        }

        for (int i = 0; i < N; i++) {
            max = Math.max(max, DP[i]);
        }
        System.out.println(max);
    }

    private void DFS(boolean[] visited, int n, int[] DP) {
        visited[n] = true;
        for (Integer ix : adj[n]) {
            if (!visited[ix]) {
                DFS(visited, ix, DP);
            }
            DP[n] = Math.max(DP[n], 1 + DP[ix]);
        }
    }

}