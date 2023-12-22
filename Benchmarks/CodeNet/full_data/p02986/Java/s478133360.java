import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Edge>[] graph;
    static int[][] bl;
    static int blsz;
    static int[] depth;
    static long[] sumDist;
    static long[] cnt;
    static ArrayList<Query>[] q;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        graph = new ArrayList[N];
        q = new ArrayList[N];
        for(int i = 0; i < N; i++) graph[i] = new ArrayList<>();
        for(int i = 0; i < N; i++) q[i] = new ArrayList<>();
        for(int i = 0; i < N-1; i++) {
            int a = scanner.nextInt()-1;
            int b = scanner.nextInt()-1;
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            graph[a].add(new Edge(b, c, d));
            graph[b].add(new Edge(a, c, d));
        }
        blsz = Integer.numberOfTrailingZeros(Integer.highestOneBit(N));
        bl =new int[N][blsz + 1];
        depth = new int[N];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Arrays.fill(depth, -1);
        depth[0] = 0;
        sumDist = new long[N];
        cnt = new long[N];
        queue.offer(0);
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(Edge edge: graph[cur]) {
                if (depth[edge.to] >= 0) continue;
                bl[edge.to][0] = cur;
                depth[edge.to] = depth[cur] + 1;
                queue.offer(edge.to);
            }
        }
        for(int k = 1; k <= blsz; k++) for(int i = 0; i < N; i++) bl[i][k] = bl[bl[i][k-1]][k-1];
        Query[] qs = new Query[Q];
        for(int i = 0; i < Q; i++){
            //objects of interest are u, v, lca, and color being changed
            int col = scanner.nextInt();
            int ndist = scanner.nextInt();
            int u = scanner.nextInt()-1;
            int v = scanner.nextInt()-1;
            int lca = lca(u, v);
            Query query = new Query(u, v, col, ndist, lca);
            q[lca].add(query);
            q[u].add(query);
            q[v].add(query);
            qs[i] = query;
        }
        dfs(0,0, 0);
        for(int i = 0; i < Q; i++) out.println(qs[i].ans);
        out.flush();
    }
    
    static class Query {
        int u, v, col, lca;
        long ans= 0;
        long ndist;
        public Query(int uu, int vv, int cc, int nn, int ll) {
            u = uu; v = vv; ndist = nn; col = cc; lca = ll;
        }
    }
    
    static void dfs(int v, int p, long curdist) {
        for(Query query: q[v]) {
            if (v == query.lca) {
                query.ans -= 2L*(curdist + (cnt[query.col] * query.ndist - sumDist[query.col]));
            } else {
                query.ans += (curdist + (cnt[query.col] * query.ndist - sumDist[query.col]));
            }
        }
        for(Edge edge: graph[v]) {
            if (edge.to == p) continue;
            cnt[edge.col]++;
            sumDist[edge.col] += edge.dist;
            dfs(edge.to,  v, curdist + edge.dist);
            cnt[edge.col]--;
            sumDist[edge.col]-= edge.dist;
        }
    }
    
    static int walk(int u, int d) {
        for(int k = blsz; k >= 0; k--) if ((d & (1 << k)) > 0) u = bl[u][k];
        return u;
    }
    
    static int lca(int u, int v) {
        if (depth[v] > depth[u]) v = walk(v, depth[v] - depth[u]);
        if (depth[u] > depth[v]) u = walk(u, depth[u] - depth[v]);
        if (u == v) return v;
        for(int d = blsz; d >= 0; d--)  if (bl[u][d] != bl[v][d]) {
            u = bl[u][d];
            v = bl[v][d];
        }
        return bl[u][0];
    }
    
    static class Edge {
        int to, col;
        long dist;
        public Edge(int tt, int cc, int dd) {
            to = tt; col = cc; dist = dd;
        }
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
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
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
