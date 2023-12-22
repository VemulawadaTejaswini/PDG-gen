import java.util.*;
import java.io.*;
//atcoder
public class Main {
    static ArrayList<Integer>[] graph;
    static final long MOD = 1000000007L;
    static long K;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        K = scanner.nextInt();
        graph = new ArrayList[N];
        for(int i = 0; i < N; i++) graph[i] = new ArrayList<>();
        for(int i = 1; i < N; i++) {
            int a = scanner.nextInt()-1;
            int b = scanner.nextInt()-1;
            graph[a].add(b);
            graph[b].add(a);
        }
        out.println((K*dfs(0, 0))%MOD);
        out.flush();
    }
    
    static long dfs(int v, int p) {
        if (v != 0 && graph[v].size() == 1) return 1L;
        long ret  = 1;
        long cnt = v == 0 ? -1 : 0;
        for(int edge: graph[v]) {
            if (edge == p) continue;
            ret = (ret * (K-2-cnt))% MOD;
            ret = (ret * (dfs(edge,v))) % MOD;
            cnt++;
        }
        return ret;
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
