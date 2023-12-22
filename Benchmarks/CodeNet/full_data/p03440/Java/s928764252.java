import java.io.*;
import java.util.*;

public class Main {
    
    class Answer {
        int N, M;
        int[] arr;
        int[] parent;
        int[] rank;
        
        public int findSet(int n) {
            while ( n != parent[n] ) {
                parent[n] = parent[ parent[n] ];
                n = parent[n];
            }
            return n;
        }
        
        public void union(int pu, int pv) {
            if (arr[pu] <= arr[pv]) {
                parent[pv] = parent[pu];
                rank[pu] = rank[pv] + 1;
            } else {
                parent[pu] = parent[pv];
                rank[pv] = rank[pu] + 1;
            }
        }
        
        public int solve() {
            for (int i = 0; i < N; i++) {
                int j = findSet(i);
                if (i != j) {
                    union(i, j);
                }
            }
            
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                set.add(parent[i]);
            }
            
            int total = 0;
            for (Integer i : set) {
                total += arr[i];
            }
            return total;
        }
        
        public void init() {
            parent = new int[N];
            rank = new int[N];
            
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }
        
        public void main(FastScanner in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();
            if (M > 0) {
                arr = new int[N];
                for (int i = 0; i < N; i++) arr[i] = in.nextInt();

                init();

                for (int i = 0; i < M; i++) {
                    int u = in.nextInt();
                    int v = in.nextInt();
                    int pu = parent[u];
                    int pv = parent[v];
                    if (pu != pv) {
                        union(pu, pv);
                    }
                }
                out.println( solve() );
                
            } else {
                if (N == 1) out.println(0);
                else out.println("Impossible");
            }
        }
        
        public void p(Object o) { System.out.print(o); }
        public void pl(Object o) { System.out.println(o); }
        public void arp(int[] o) { pl( Arrays.toString(o) ); }
        public void arpp(int[][] o) { 
            for (int i = 0; i < o.length; i++) {
                for (int j = 0; j < o[0].length; j++) { p(o[i][j] + " "); }
                pl("");
            }
        }
        public void ck(Object o1, Object o2) { pl(o1 + " " + o2); }
        public void ckk(Object o1, Object o2, Object o3) { pl(o1 + " " + o2 + " " + o3); }
        public void ckkk(Object o1, Object o2, Object o3, Object o4) { 
            pl(o1 + " " + o2 + " " + o3 + " " + o4);
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        
        Main problem = new Main();
        Answer ans = problem.new Answer();
        ans.main(in, out);
        
        out.close();
        in.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream in) { br = new BufferedReader(new InputStreamReader(in)); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); } 
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        public String nextLine() {
            String str = "";
            try { str = br.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
        public void close() throws IOException { br.close(); }
    }
}