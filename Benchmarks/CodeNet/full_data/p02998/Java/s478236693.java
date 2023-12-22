import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> [] adj;
    static boolean [] vis;
    static int left; static int right;
    static int edges;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        adj = new ArrayList[200001];
        for (int i = 1; i <= 200000; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); int y = sc.nextInt();
            adj[x].add(y + (int) 1e5);
            adj[y + (int) 1e5].add(x);
        }
        vis = new boolean[200001];
        long res = 0;
        for (int i = 1; i <= 200000; i++) {
            if (!vis[i]) {
                left = 0; right = 0; edges = 0;
                dfs(i, -1);
                res = res + ((long) right * left - edges);
            }
        }
        out.println(res);
        out.close();
    }

    static void dfs(int cur, int par) {
        if (cur <= 100000) left++; else right++;
        vis[cur] = true;
        for (Integer next: adj[cur]) {
            if (next == par) continue;
            else if (vis[next]) edges++;
            else {
                edges++;
                dfs(next, cur);
            }
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
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

}