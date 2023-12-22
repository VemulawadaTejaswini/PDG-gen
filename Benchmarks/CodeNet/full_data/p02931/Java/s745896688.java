import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
//    int n, m, t;
    void solve(int TC) throws Exception{
//        n = ni(); m = ni();int z = ni(); t = ni();
//        char[][] gr = new char[n][];
//        for(int i = 0; i< n; i++)gr[i] = n().toCharArray();
//        int[][][] mat = new int[1+t][n][m];
//        while(z-->0){
//            int rr = ni()-1, cc = ni()-1, st = ni(), en = ni(), g = ni();
//            for(int j = st+1; j<= en; j++)
//                mat[j][rr][cc] = Math.max(mat[j][rr][cc], g);
//        }
//        
//        int[][] D = new int[][]{
//            {-1, 0},{0, -1}, {0, 1}, {1, 0}
//        };
//        for(int ti = 0; ti< t; ti++){
//            for(int i = 0; i< n; i++)
//                for(int j = 0; j< m; j++){
//                    if(gr[i][j] == '#')continue;
//                    addEdge(graph, get(ti, i, j, 0), get(ti, i, j, 1), 1, 0);
//                    
//                    addEdge(graph, get(ti, i, j, 1), get(ti+1, i, j, 0), 1, -mat[ti+1][i][j]);
//                    for(int[] d:D){
//                        int ii = i+d[0], jj = j+d[1];
//                        if(ii < 0 || ii >= n || jj < 0 || jj >= m || gr[ii][jj] == '#')continue;
//                        addEdge(graph, get(ti, i, j, 1), get(ti+1, ii, jj, 0),1, 0);
//                    }
//                }
//        }
//        for(int i = 0; i< n; i++)
//            for(int j = 0; j< m; j++){
//                if(gr[i][j] == 'S')addEdge(graph, src, get(0, i, j, 0), 1, 0);
//                if(gr[i][j] != '#'){
//                    addEdge(graph, get(t, i, j, 0), get(t, i, j, 1), 1, 0);
//                    addEdge(graph, get(t, i, j, 1), dest, 1, 0);
//                }
//            }
        
        int n = ni(), h = ni(), w = ni();
        
        List<Edge>[] graph = createGraph(2+n+h+w);
        int src = 0, dest = 1;
        for(int i = 0; i< n; i++){
            int r = ni()-1, c = ni()-1;long cost = nl();
            addEdge(graph, 0, 2+i, 1, -cost);
            
            addEdge(graph, 2+i, 2+n+r, 1, 0);
            addEdge(graph, 2+i, 2+n+h+c, 1, 0);
        }
        for(int i = 0; i< h+w; i++)addEdge(graph, 2+n+i, 1, 1, 0);
        
        int[] res = minCostFlow(graph, src, dest, Integer.MAX_VALUE);
        pn(-res[1]);
        
    }
//    int get(int ti, int r, int c,int ty){
//        return 2+ty+2*(c+m*(r+n*ti));
//    }
    //https://sites.google.com/site/indy256/algo/min_cost_flow_bf
    static class Edge {
    int to, f, cap, rev;
    long cost;
    Edge(int v, int cap, long cost, int rev) {
      this.to = v;
      this.cap = cap;
      this.cost = cost;
      this.rev = rev;
    }
  }

  public static List<Edge>[] createGraph(int n) {
    List<Edge>[] graph = new List[n];
    for (int i = 0; i < n; i++)
      graph[i] = new ArrayList<>();
    return graph;
  }

  public static void addEdge(List<Edge>[] graph, int s, int t, int cap, long cost) {
    graph[s].add(new Edge(t, cap, cost, graph[t].size()));
    graph[t].add(new Edge(s, 0, -cost, graph[s].size() - 1));
  }

  static void bellmanFord(List<Edge>[] graph, int s, long[] dist) {
    int n = graph.length;
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[s] = 0;
    boolean[] inqueue = new boolean[n];
    int[] q = new int[n];
    int qt = 0;
    q[qt++] = s;
    for (int qh = 0; (qh - qt) % n != 0; qh++) {
      int u = q[qh % n];
      inqueue[u] = false;
      for (int i = 0; i < graph[u].size(); i++) {
        Edge e = graph[u].get(i);
        if (e.cap <= e.f)
          continue;
        int v = e.to;
        long ndist = dist[u] + e.cost;
        if (dist[v] > ndist) {
          dist[v] = ndist;
          if (!inqueue[v]) {
            inqueue[v] = true;
            q[qt++ % n] = v;
          }
        }
      }
    }
  }

  public static int[] minCostFlow(List<Edge>[] graph, int s, int t, int maxf) {
    int n = graph.length;
    long[] prio = new long[n];
    int[] curflow = new int[n];
    int[] prevedge = new int[n];
    int[] prevnode = new int[n];
    long[] pot = new long[n];

    // bellmanFord invocation can be skipped if edges costs are non-negative
//    bellmanFord(graph, s, pot);
    int flow = 0;
    int flowCost = 0;
    while (flow < maxf) {
      PriorityQueue<Long> q = new PriorityQueue<>();
      q.add((long) s);
      Arrays.fill(prio, Integer.MAX_VALUE);
      prio[s] = 0;
      boolean[] finished = new boolean[n];
      curflow[s] = Integer.MAX_VALUE;
      while (!finished[t] && !q.isEmpty()) {
        long cur = q.remove();
        int u = (int) (cur & 0xFFFF_FFFFL);
        int priou = (int) (cur >>> 32);
        if (priou != prio[u])
          continue;
        finished[u] = true;
        for (int i = 0; i < graph[u].size(); i++) {
          Edge e = graph[u].get(i);
          if (e.f >= e.cap)
            continue;
          int v = e.to;
          long nprio = prio[u] + e.cost + pot[u] - pot[v];
          if (prio[v] > nprio) {
            prio[v] = nprio;
            q.add(((long) nprio << 32) + v);
            prevnode[v] = u;
            prevedge[v] = i;
            curflow[v] = Math.min(curflow[u], e.cap - e.f);
          }
        }
      }
      if (prio[t] == Integer.MAX_VALUE)
        break;
      for (int i = 0; i < n; i++)
        if (finished[i])
          pot[i] += prio[i] - prio[t];
      int df = Math.min(curflow[t], maxf - flow);
      flow += df;
      for (int v = t; v != s; v = prevnode[v]) {
        Edge e = graph[prevnode[v]].get(prevedge[v]);
        e.f += df;
        graph[v].get(e.rev).f -= df;
        flowCost += df * e.cost;
      }
    }
    return new int[]{flow, flowCost};
  }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    long IINF = (long)1e18, mod = (long)1e9+7;
    final int INF = (int)1e9, MX = (int)2e5+5;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-6;
    static boolean multipleTC = false, memory = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC)?ni():1;
        pre();for(int t = 1; t<= T; t++)solve(t);
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n()throws Exception{return in.next();}
    String nln()throws Exception{return in.nextLine();}
    int ni()throws Exception{return Integer.parseInt(in.next());}
    long nl()throws Exception{return Long.parseLong(in.next());}
    double nd()throws Exception{return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception{
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception{
            String str = "";
            try{   
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }  
            return str;
        }
    }
}