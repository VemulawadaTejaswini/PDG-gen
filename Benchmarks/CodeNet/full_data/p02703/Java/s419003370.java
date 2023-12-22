import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), m = in.ni(), s = Math.min(in.ni(), 50*(n-1));
        Dijkstra dk = new Dijkstra(n*(50*(n-1)+1));  // Max{A_i} <= 50
        for (int i = 0; i < m; i++) {
            int u = in.ni()-1, v = in.ni()-1, a = in.ni();
            long b = in.nl();
            for (int j = 0; j <= 50*(n-1); j++) {
                if(j-a>=0){
                    dk.addEdge(j*n+u, (j-a)*n+v, b);
                    dk.addEdge(j*n+v, (j-a)*n+u, b);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int c = in.ni(), d = in.ni();
            for (int j = 0; j < 50*(n-1); j++) {
                if(j+c<=50*(n-1)) dk.addEdge(j*n+i, (j+c)*n+i, d);
                else dk.addEdge(j*n+i, 50*(n-1)*n+i, d);
            }
        }
        dk.dijkstra(s*n);
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= n-1; t++) {
            long min = INF;
            for (int i = 0; i <= 50*(n-1); i++) {
                min = Math.min(min, dk.dist[i*n+t]);
            }
            sb.append(min).append("\n");
        }
        out.print(sb);
    }
    public static class Dijkstra {
        int n; long[] dist;
        ArrayList<Pair>[] list;
        final long inf = Long.MAX_VALUE/3;
        public Dijkstra(int n) {
            this.n = n;
            this.dist = new long[n];
            list = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                list[i] = new ArrayList<>();
                dist[i] = inf;
            }
        }
        public void addEdge(int from, int to, long cost) {
            list[from].add(new Pair(to, cost));
        }
        public void dijkstra(int s) {
            PriorityQueue<Pair> Q = new PriorityQueue<>();
            Q.add(new Pair(s, 0));
            boolean[] used = new boolean[n];
            while (!Q.isEmpty()) {
                Pair p = Q.poll();
                if (used[p.to]) continue;
                used[p.to] = true;
                dist[p.to] = p.cost;
                for (Pair edge : list[p.to]) {
                    Q.add(new Pair(edge.to, p.cost + edge.cost));
                }
            }
        }
        class Pair implements Comparable<Pair> {
            int to; long cost;
            Pair(int to, long cost) {
                this.to = to;
                this.cost = cost;
            }
            public int compareTo(Pair p) {
                return Long.compare(cost, p.cost);
            }
        }
    }

    public static void main(String[] args){
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private StringTokenizer st;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        public String ns(){
            if(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public double nd(){
            return Double.parseDouble(ns());
        }
        public char nc(){
            return ns().toCharArray()[0];
        }
        public int[] ni(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }
        public long[] nl(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }
        public double[] nd(int n){
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }
    }
}