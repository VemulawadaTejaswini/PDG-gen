import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> [] adj;
    static int [] dp;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            int x = sc.nextInt();
            adj[x].add(i);
            adj[i].add(x);
        }
        dp = new int[n + 1];
        dfs(1, -1);
        out.println(dp[1]);
        out.close();
    }

    static void dfs(int cur, int par) {
        ArrayList<Integer> children = new ArrayList<>();
        for (Integer next: adj[cur]) {
            if (next != par) {
                dfs(next, cur);
                children.add(next);
            }
        }
        if (children.size() == 0) dp[cur] = 0;
        else if (children.size() == 1) dp[cur] = 1 + dp[children.get(0)];
        else {
            Collections.sort(children, Comparator.comparingInt(i -> -dp[i]));
            dp[cur] = 0;
            for (int i = 0; i < children.size(); i++) {
                dp[cur] = Math.max(dp[cur], i + 1 + dp[children.get(i)]);
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