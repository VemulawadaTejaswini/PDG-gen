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
    
    /*
    public long getLongestPath(){
        boolean[] seen = new boolean[v];
        boolean[] calc = new boolean[v];
        d = new long[v];
        
        auto dfs = [&](auto &&f, ll now) -> ll {
            if (seen[now]) {
                if (!calc[now]) return -1;
                return d[now];
            }
            seen[now] = true;
            d[now] = 1;
            for (const auto &t: table[now]) {
                ll res = f(f, t.to);
                if (res == -1) return -1;
                d[now] = max(res + t.cost, d[now]);
            }
            calc[now] = true;
            return d[now];
        };
 
        ll ans = 0;
        rep(i, v) {
            ll tmp = dfs(dfs, i);
            if (tmp == -1) {
                return -1;
            }
            ans = max(tmp, ans);
        }
        return ans;
    }

    public static long dfs(){

    }
    */
    
    // 負の重みがあっても動く
    // O(v * e)
    /*
    vl bellman_ford(ll s) {
        d[s] = 0;
        rep(_, v - 1) {
            for (const auto &e1 : edges) {
                if (d[e1.from] != ll_inf && d[e1.to] > d[e1.from] + e1.cost) {
                    d[e1.to] = d[e1.from] + e1.cost;
                }
            }
        }
        return d;
    }

 
    // 各頂点までに到達する経路中に負の閉路が存在するか
    // bellman_fortで最短経路を出した後に使う
    vl has_negative_loop_in_path() {
        vl has_loop(v, false);
        rep(_, v - 1) {
            for (const auto &e1 : edges) {
                if (d[e1.to] > d[e1.from] + e1.cost) {
                    has_loop[e1.from] = true;
                }
                if (has_loop[e1.from]) {
                    has_loop[e1.to] = true;
                }
            }
        }
        return move(has_loop);
    }
    */
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
 
    // 頂点sからの閉路検出
    // もし閉路がないならば v + 1の大きさのベクトルを返す。
    /*
    vl cyclic(ll s) {
        queue<ll> que;
        que.push(s);
        pre.assign(v, -1);
        d.assign(v, ll_inf);
        d[s] = 0;
        while (!que.empty()) {
            ll now = que.front();
            que.pop();
            each(e, table[now]) {
                if (d[e.to] != ll_inf) continue;
                d[e.to] = d[e.from] + 1;
                pre[e.to] = e.from;
                que.push(e.to);
            }
        }
 
        P best(ll_inf, -1);
        rep(i, v) {
            if (i == s) continue;
            each(e, table[i]) {
                if (e.to == s) {
                    best = min(best, {d[e.from], e.from});
                }
            }
        }
        if (best.first == ll_inf) return vl(v + 1);
        vl ret;
        ll now = best.second;
        while (now != -1) {
            ret.emplace_back(now + 1);
            now = pre[now];
        }
        return ret;
    }
 
    // 二部グラフ判定
    bool bipartite() {
        vl ids(v, -1);
        auto dfs = [&](auto &&f, ll s, ll id) -> bool {
            if (ids[s] == -1) {
                ids[s] = id;
            } else {
                return ids[s] != id;
            }
            each(e, table[s]) {
                if (f(f, e.to, 1 - id)) return true;
            }
            return false;
        };
        return dfs(dfs, 0, 1);
    };
    */
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

