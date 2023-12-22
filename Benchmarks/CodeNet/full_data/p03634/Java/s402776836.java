import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int  n = in.ni();
        Dijkstra dk = new Dijkstra(n);
        for (int i = 0; i < n-1; i++) {
            dk.addEdge(in.ni()-1, in.ni()-1, in.nl());
        }
        int q = in.ni(), k = in.ni(), x, y;
        dk.dijkstra(k-1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            x = in.ni()-1;
            y = in.ni()-1;
            sb.append(dk.dist[x]+dk.dist[y]);
            sb.append("\n");
        }
        out.print(sb);
    }
    public static class Dijkstra {
        int n; long[] dist;
        ArrayList<Pair>[] list;
        final long inf = Long.MAX_VALUE/10;
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
            list[to].add(new Pair(from, cost));//一方向なら消す
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