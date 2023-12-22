import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE-10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(); int m = in.ni();
        BellmanFord bf = new BellmanFord(n, m, true);
        for (int i = 0; i < m; i++) {
            bf.addEdge(in.ni()-1, in.ni()-1, -in.nl());
        }
        if(bf.bellmanford(0)){
            out.println("inf");
        }else {
            out.println(-bf.dist[n - 1]);
        }
    }
    public static class BellmanFord{
        private ArrayList<Edge> edge;
        long[] dist; int v, e;/*v:頂点数,e:辺数*/
        boolean directed;
        public BellmanFord(int v, int e, boolean directed){
            this.directed = directed;
            this.v = v;
            this.e = this.directed?e:2*e;
            edge = new ArrayList<>(this.e);
            dist = new long[v];
            Arrays.fill(dist,INF);
        }
        public boolean bellmanford(int s){//if a negative cycle exists, return true
            dist[s] = 0;
            boolean update;
            for (int j = 0; j < 100000; j++) {
                update = false;
                for (int i = 0; i < edge.size(); i++) {
                    Edge e = edge.get(i);
                    if(dist[e.from]!=INF && dist[e.to]>dist[e.from]+e.cost){
                        dist[e.to] = dist[e.from]+e.cost;
                        update = true;
                        if(j == 100000-1){
                            return true;
                        }
                    }
                }
                if(!update) break;
            }
            return false;
        }
        public void addEdge(int from, int to, long cost){
            Edge e = new Edge(from, to, cost);
            edge.add(e);
            if(!this.directed){
                Edge e_rev = new Edge(to, from, cost);
                edge.add(e_rev);
            }
        }
        class Edge{
            int from, to; long cost;
            Edge(int from, int to, long cost){
                this.from = from;
                this.to = to;
                this.cost = cost;
            }
        }
    }

    public static void main(String[] args) throws Exception{
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
        public long nl(){
            return Long.parseLong(ns());
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public Double nd(){
            return Double.parseDouble(ns());
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