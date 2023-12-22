import java.io.*;
import java.util.*;
 
public class Main {
    static long mod = (long)1e9+7;
    static long max = Long.MAX_VALUE/5;
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Graph g = new Graph(n);
		for(int i = 1; i < n; i++){
		    g.add(i,i-1,0L);
		}
		for(int i = 0; i < m; i++){
		    int l = sc.nextInt()-1;
		    int r = sc.nextInt()-1;
		    long c = sc.nextLong();
		    g.add(l,r,c);
		}
		long[] ans = g.dijkstra(0);
		pw.println(ans[n-1] != max ? ans[n-1] : -1);
		pw.flush();
	}
}

class Graph {
    private static int v;
    private static ArrayList<ArrayList<Edge>> table;
    private static long[] d;
    private static int[] pre;
    private static ArrayList<Edge> edges;
    
    public Graph(int v){
        this.v = v;
        this.table = new ArrayList<>();
        for(int i = 0; i < v; i++){
            table.add(new ArrayList<>());
        }
        this.edges = new ArrayList<>();
        this.pre = new int[v];
        Arrays.fill(pre,-1);
        this.d = new long[v];
        Arrays.fill(d,Long.MAX_VALUE/5);
    }
    
    public void add(int from, int to, long cost){
        Edge e = new Edge(from,to,cost);
        table.get(from).add(e);
        edges.add(e);
    }
    
    // O(v + e)
    // http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=GRL_4_B
    public ArrayList<Integer> sort(){
        Stack<Integer> st = new Stack<>();
        int[] children = new int[v];
        for(Edge e : edges){
            children[e.to]++;
        }
        for(int i = 0; i < v; i++){
            if(children[i] == 0){
                st.push(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(st.size() > 0){
            int i = st.pop();
            ans.add(i);
            for(Edge e : table.get(i)){
                int to = e.to;
                children[to]--;
                if(children[to] == 0){
                    st.push(to);
                }
            }
        }
        return ans;
    }
    
    public static long[] dijkstra(int s){
	    PriorityQueue<Vertex> q = new PriorityQueue<>();
	    d[s] = 0;
	    q.add(new Vertex(s,0L));
	    while (q.size() > 0) {
	        Vertex v = q.poll();
	        int index = v.ind;
	        if(d[index] < v.dist) continue;
	        for(Edge e : table.get(index)){
	            if(d[e.to] > (d[index] + e.cost)){
	                d[e.to] = d[index] + e.cost;
	                pre[e.to] = index;
	                q.add(new Vertex(e.to,d[e.to]));
	            }
	        }
        }
        return d;
	}
	
	public ArrayList<Integer> getPath(int t){
	    ArrayList<Integer> ret = new ArrayList<Integer>();
	    while(t != -1){
	        ret.add(t);
	        t = pre[t];
	    }
	    Collections.reverse(ret);
	    return ret;
	}
	
	public boolean bipartite(){
	    int[] ids = new int[v];
	    Arrays.fill(ids,-1);
	    return dfs(0,0,ids);
	}
	
	public boolean dfs(int s, int id, int[] ids){
	    if(ids[s] == -1){
	        ids[s] = id;
	    }else{
	        return ids[s] != id;
	    }
	    for(Edge e : table.get(s)){
	        if(dfs(e.to, 1-id, ids)){
	            return true;
	        }
	    }
	    return false;
	}
}
 

class Vertex implements Comparable<Vertex>{
    int ind;
    long dist;
    public Vertex(int i, long d){
        this.ind = i;
        this.dist = d;
    }
    
    public int compareTo(Vertex v){
        if(this.dist < v.dist){
            return -1;
        }else if(this.dist > v.dist){
            return 1;
        }else{
            if(this.ind < v.ind){
                return -1;
            }else if(this.ind > v.ind){
                return 1;
            }else{
                return 0;
            }
        }
    }
}

class Edge{
    int from, to;
    long cost;
    
    public Edge(int from, int to, long cost){
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}


class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}

