import java.util.*;
import java.io.*;

public class Main {
    static HashSet<Integer> [] adj;
    static HashSet<Integer> [] adj2;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt();
        adj = new HashSet[n + 1]; adj2 = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new HashSet<>();
            adj2[i] = new HashSet<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); int v = sc.nextInt();
            adj[u].add(v);
            adj2[v].add(u);
        }
        Pair best = null;
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> remove = new ArrayList<>(adj[i]);
            for (Integer j: remove) {
                adj[i].remove(j);
                LinkedList<Integer> q = new LinkedList<>();
                int [] dp = new int[n + 1];
                Arrays.fill(dp, (int) 1e9);
                dp[j] = 0;
                boolean [] vis = new boolean[n + 1];
                q.add(j); vis[j] = true;
                while (!q.isEmpty()) {
                    Integer x = q.pollFirst();
                    for (Integer next: adj[x]) {
                        if (!vis[next]) {
                            q.add(next); vis[next] = true;
                            dp[next] = Math.min(dp[next], dp[x] + 1);
                        }
                    }
                }
                if (dp[i] < (int) 1e9) {
                    if (best == null || dp[i] < best.val) {
                        best = new Pair(i, j, dp[i]);
                    }
                }
                adj[i].add(j);
            }
        }
        if (best != null) {
            adj[best.i].remove(best.j);
            LinkedList<Integer> q = new LinkedList<>();
            int[] dp = new int[n + 1];
            Arrays.fill(dp, (int) 1e9);
            dp[best.j] = 0;
            boolean[] vis = new boolean[n + 1];
            q.add(best.j);
            vis[best.j] = true;
            while (!q.isEmpty()) {
                Integer x = q.pollFirst();
                for (Integer next : adj[x]) {
                    if (!vis[next]) {
                        q.add(next);
                        vis[next] = true;
                        dp[next] = Math.min(dp[next], dp[x] + 1);
                    }
                }
            }
            adj2[best.j].remove(best.i);
            ArrayList<Integer> res = new ArrayList<>();
            int cur = best.i;
            while (cur != best.j) {
                res.add(cur);
                for (Integer prev: adj2[cur]) {
                    if (dp[prev] == dp[cur] - 1) {
                        cur = prev; break;
                    }
                }
            }
            res.add(best.j);
            out.println(res.size());
            for (Integer i: res) out.println(i);
        } else {
            out.println(-1);
        }
        out.close();
    }

    static class Pair {
        int i; int j; int val;
        Pair(int i, int j, int val) {
            this. i = i; this. j = j; this.val = val;
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