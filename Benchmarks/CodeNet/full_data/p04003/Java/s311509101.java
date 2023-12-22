import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    int n;
    ArrayList<Edge>[] edges;
    private void solve(){
        n = in.nextInt();
        int m = in.nextInt();

        edges = new ArrayList[n];
        for(int i=0;i<n;i++){
            edges[i] = new ArrayList<>();
        }

        for(int i=0;i<m;i++){
            int u = in.nextInt();
            int v = in.nextInt();
            int c = in.nextInt();
            edges[u-1].add(new Edge(v-1,c));
            edges[v-1].add(new Edge(u-1,c));
        }
        out.print(dijkstra());
    }

    private int dijkstra(){
        boolean[] visit = new boolean[n];
        Arrays.fill(visit,false);

        PriorityQueue<Distance> queue = new PriorityQueue<>(new DistanceComparator());
        queue.add(new Distance(0,0,-1));

        while (!queue.isEmpty()){
            Distance d = queue.poll();
            int u = d.v;
            //out.println(d.d+" "+u);

            if(visit[u]) continue;
            visit[u]= true;

            if(u == n-1) return d.d;
            for(Edge e: edges[u]){
                if(!visit[e.v]){
                    if(e.c == d.p){
                        queue.add(new Distance(d.d,e.v,e.c));
                        continue;
                    }
                    queue.add(new Distance(d.d+1,e.v,e.c));
                }
            }
        }
        return -1;
    }

    private class DistanceComparator implements Comparator<Distance>{

        @Override
        public int compare(Distance o1, Distance o2) {
            return o1.d-o2.d;
        }
    }

    private class Distance{
        int d;
        int v;
        int p;

        Distance(int d, int v,int p) {
            this.d = d;
            this.v = v;
            this.p = p;
        }
    }

    private class Edge{
        int v;
        int c;

        Edge(int v, int c) {
            this.v = v;
            this.c = c;
        }
    }
    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
