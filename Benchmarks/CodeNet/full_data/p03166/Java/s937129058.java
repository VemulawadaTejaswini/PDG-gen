

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int n = fs.nextInt();
        int e = fs.nextInt();

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            graph.get(fs.nextInt()).add(fs.nextInt());
        }

        boolean[] visited = new boolean[n + 1];
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, dp);
            }
        }

        int sol = 0;
        for (int i : dp) {
            // System.out.println(i);
            sol = Math.max(sol, i);
        }

        System.out.println(sol);


    }

    private static int dfs(ArrayList<ArrayList<Integer>> graph, int i, boolean[] visited, int[] dp) {

        visited[i] = true;

        if (dp[i] != -1) return dp[i];

        int sol = 0;

        for (int neighbor : graph.get(i)) {
            if (!visited[neighbor]) {
                sol = Math.max(sol, 1+dfs(graph, neighbor, visited, dp));
            } else {
                sol = Math.max(sol, 1+dp[neighbor]);
            }
        }

        dp[i] = sol;
        return dp[i];
    }

}