import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] res;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        graph = new ArrayList[n];
        for(int i =0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i= 0; i < n-1; i++) {
            int a = scanner.nextInt()-1, b = scanner.nextInt()-1;
            graph[a].add(b); graph[b].add(a);
        }
        res = new int[n];
        for(int i = 0; i < q; i++) {
            res[scanner.nextInt()-1]+= scanner.nextInt();
        }
        dfs(0,0);
        for(int i = 0; i < n; i++) {
            if (i > 0) out.print(" ");
            out.print(res[i]);
        }
        out.println();
        out.flush();
    }
    static void dfs(int v, int p) {
        for(int edge: graph[v]) {
            if (edge == p) continue;
            res[edge] += res[v];
            dfs(edge, v);
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
    }
}
