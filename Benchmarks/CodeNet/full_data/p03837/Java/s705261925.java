import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        MyGraph g = new MyGraph();
        int ans = g.solve(); 
        out.println(ans);
    }

    static class MyGraph{
        private final int V; // 頂点数
        private final int E; // 辺数
        private ArrayList<int[]>[] T; // 連結関数
        private final static int INF = Integer.MAX_VALUE/2;
        private int[] d;
        private int[] par;
        private HashSet<Integer> hs = new HashSet<>();

        public MyGraph(){
            {int[] a = in.ii(); V = a[0]; E = a[1];}    
            T = new ArrayList[V+1];
            d = new int[V+1];
            par = new int[V+1];
            for(int i = 1; i <= V; i++) {
                T[i] = new ArrayList<>();
            }
            for(int i = 0; i < E; i++){
                int[] tmp = in.ii();
                int v = tmp[0];
                int u = tmp[1];
                int w = tmp[2];
                T[v].add(new int[]{u, w});
                T[u].add(new int[]{v, w});
            }
        }

        public void dikstra(int s){
            Arrays.fill(d, INF);
            d[s] = 0;
            par[s] = 0;
            PriorityQueue<Integer> A = new PriorityQueue<>((x, y) -> d[x]-d[y]);
            A.add(s);
            while(A.size() > 0){
                int v = A.poll();
                for(int[] edge : T[v]){
                    int u = edge[0];
                    int w = edge[1];
                    if(d[u] == INF){
                        d[u] = d[v] + w;
                        par[u] = v;
                        A.add(u);
                    } else if(d[u] > d[v]+w){
                        d[u] = d[v] + w;
                        par[u] = v;
                    }
                }
            }
            for(int i = 1; i <= V; i++){
                int v = i;
                int w;
                while((w = par[v]) != 0){
                    hs.add((Math.min(v, w) << 7)+Math.max(v, w));
                    v = w;
                }
            }
        }

        public int solve(){
            for(int i = 1; i <= V; i++){
                dikstra(i);
            }
            return E-hs.size();
        }
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
