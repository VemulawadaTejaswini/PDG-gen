import java.io.*;
import java.io.IOException;
import java.util.*;

class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;
    static public int max = 0;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        long N;
        N = sc.nextLong();
        long[] a = new long[(int)(N-1)];
        long[] b = new long[(int)(N-1)];
        for(int i = 0 ; i < N-1 ; i++){
                a[i] = sc.nextLong();
                b[i] = sc.nextLong();
        }
        solve(N, a, b);
    }

    static void color(Node n, int c){
        int color = 1;
        for (Edge e : n.edges) {
            if(c == color) color++;
            e.color = color;
            color(e.c, color);
            color++;
        }
        if(max < color) max = color;
    }

    static class Edge{
        public Node p;
        public Node c;
        int index;
        public int color;

        Edge(int index) {
            this.index = index;
        }

    }

    static class Node{
        ArrayList<Edge> edges = new ArrayList<>();

        public void addEdge(Edge e){
            edges.add(e);
        }
    }

    static void solve(long N, long[] a, long[] b){

        Node[] nodes = new Node[(int) N];
        Edge[] edges = new Edge[(int) N-1];

        for (int i = 0; i < N; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < N-1; i++) {
            edges[i] = new Edge(i);
        }

        for (int i = 0; i < N-1; i++) {
            int small = Math.min((int)a[i], (int)b[i])-1;
            int big = Math.max((int)a[i], (int)b[i])-1;
            edges[i].p = nodes[small];
            edges[i].c = nodes[big];
            nodes[small].addEdge(edges[i]);
        }
        color(nodes[0], -1);
        Arrays.sort(edges, (Edge e1, Edge e2)->e1.index - e2.index);
        System.out.println(max-1);
        for (Edge e : edges) {
            System.out.println(e.color);
        }
        
                
    }

    static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }
 
        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String next() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }
 
        char nextChar() {
            return nn().charAt(0);
        }
 
        int nextInt() {
            return Integer.parseInt(nn());
        }
 
        long nextLong() {
            return Long.parseLong(nn());
        }
 
        double nextDouble() {
            return Double.parseDouble(nn());
        }
 
        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
 
        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
    }

}
