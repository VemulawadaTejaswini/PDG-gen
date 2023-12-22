import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        int s = h+w;
        int t = h+w+1;
        
        FlowGraph g = new FlowGraph(h+w+2);
        
        for(int i=0;i<h;i++){
        	char[] a = sc.next().toCharArray();
        	for(int j=0;j<w;j++){
        		
        		switch(a[j]){
        		case '.':
        			
        			break;
        		case 'o':
        			g.addEdge(i, h+j, 1);
        			g.addEdge(h+j, i, 1);
        			break;
        		case 'S':
        			g.addEdge(i, h+j, 1);
        			g.addEdge(h+j, i, 1);
        			g.addEdge(s,i,Integer.MAX_VALUE/2);
        			g.addEdge(s,h+j,Integer.MAX_VALUE/2);
        			break;
        		case 'T':
        			g.addEdge(i, h+j, 1);
        			g.addEdge(h+j, i, 1);
        			g.addEdge(i,t,Integer.MAX_VALUE/2);
        			g.addEdge(h+j,t,Integer.MAX_VALUE/2);
        			break;
        		}
        	}
        }
        
        long ans = g.EdmondsKarp(s, t);
        
        if(ans > Integer.MAX_VALUE/3){
        	System.out.println(-1);
        }
        else{
        	System.out.println(ans);
        }

    }
    
}

class FlowGraph {
	
	int V;
	FEdgeList[] elist;
	int[] level; //dinic用
	int[] iter; //dinic用
	
	public FlowGraph(int n){
		this.V = n;
		elist = new FEdgeList[n];
		for(int i=0;i<n;i++){
			elist[i] = new FEdgeList();
		}
	}
	
	void addEdge(int from, int to, int c){
		FEdge e = new FEdge(to,c);
		FEdge rev = new FEdge(from,0);
		e.setRevEdge(rev);
		rev.setRevEdge(e);
		elist[from].add(e);
		elist[to].add(rev);	//逆辺
	}
	
	//残余グラフで流せる量
	int res(FEdge e){
		return e.c - e.f;
	}
	
	//sからtまでの最大フローをFord-Fulkerson法で求める(O(E*maxflow))
	long FordFulkerson(int s, int t){
		long totalflow = 0;
		
		while(true){
			ArrayDeque<Integer> q = new ArrayDeque<>();
			int[] par = new int[V]; //親
			int[] eid = new int[V]; //親→自身への辺のid
			Arrays.fill(par,-1);
			q.add(s);
			par[s] = -2;
			
			while(!q.isEmpty()){
				int from = q.pollFirst();
				for(int i=0;i<elist[from].size();i++){
					FEdge e = elist[from].get(i);
					if(res(e)<=0){	//残余グラフになければ
						continue;
					}
					if(par[e.to]!=-1){	//既に訪れていれば
						continue;
					}
					par[e.to] = from;
					eid[e.to] = i;
					q.offerFirst(e.to);	//offerLastならEdmonds-Karp
				}
			}
			
			if(par[t]==-1){	//残余グラフ上にtへのパスが存在しないなら終了
				break;
			}
			//目一杯流す
			int pathmax = Integer.MAX_VALUE;
			for(int i=t; par[i]!=-2; i=par[i]){
				pathmax = Math.min(pathmax,res(elist[par[i]].get(eid[i])));
			}
			for(int i=t; par[i]!=-2; i=par[i]){
				elist[par[i]].get(eid[i]).f += pathmax;
				elist[par[i]].get(eid[i]).rev.f -= pathmax; //逆辺用
			}
			
			totalflow += pathmax;
		}
		
		return totalflow;
	}
	
	//sからtまでの最大フローをEdmonds-Karp法で求める(O( V * E^2 ))
	long EdmondsKarp(int s, int t){
		long totalflow = 0;
		
		while(true){
			ArrayDeque<Integer> q = new ArrayDeque<>();
			int[] par = new int[V]; //親
			int[] eid = new int[V]; //親→自身への辺のid
			Arrays.fill(par,-1);
			q.add(s);
			par[s] = -2;
			
			while(!q.isEmpty()){
				int from = q.pollFirst();
				for(int i=0;i<elist[from].size();i++){
					FEdge e = elist[from].get(i);
					if(res(e)<=0){	//残余グラフになければ
						continue;
					}
					if(par[e.to]!=-1){	//既に訪れていれば
						continue;
					}
					par[e.to] = from;
					eid[e.to] = i;
					q.offerLast(e.to);
				}
			}
			
			if(par[t]==-1){	//残余グラフ上にtへのパスが存在しないなら終了
				break;
			}
			//目一杯流す
			int pathmax = Integer.MAX_VALUE;
			for(int i=t; par[i]!=-2; i=par[i]){
				pathmax = Math.min(pathmax,res(elist[par[i]].get(eid[i])));
			}
			for(int i=t; par[i]!=-2; i=par[i]){
				elist[par[i]].get(eid[i]).f += pathmax;
				elist[par[i]].get(eid[i]).rev.f -= pathmax; //逆辺用
			}
			
			totalflow += pathmax;
		}
		
		return totalflow;
	}
	
	//sからtまでの最大フローをDinic法で求める(O(V^2 * E))
	long Dinic(int s, int t){
		level = new int[V];
		iter = new int[V];
		long totalflow = 0;
		
		while(true){
			level = bfs(s);
			if(level[t] == -1){
				return totalflow;
			}
			
			iter = new int[V];
			
			long[] f = new long[1];
			f[0] = Integer.MAX_VALUE;
			
			f[0] = dfs(s,t,f);
			
			while(f[0]>0){
				totalflow += f[0];
				f[0] = dfs(s,t,f);
			}
		}
	}
	//sから各ノードへの最短距離（全辺の長さ1）をbfsで求める。
	int[] bfs(int s){
		int[] level = new int[V];
		Arrays.fill(level,-1);
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.offerLast(s);
		level[s] = 0;
		
		while(!q.isEmpty()){
			int from = q.pollFirst();
			
			for(FEdge e:elist[from]){
				if(res(e)<=0){
					continue;
				}
				if(level[e.to]!=-1){
					continue;
				}
				level[e.to] = level[from] + 1;
				q.offerLast(e.to);
			}
		}
		
		return level;
	}
	//vからtまでのパスをdfsで探す
	long dfs(int v, int t, long[] f){
		if(v==t){
			return f[0];
		}
		for(int i=iter[v];i<elist[v].size();i++){
			iter[v] = i;
			FEdge e = elist[v].get(i);
			if(res(e) > 0 && level[v] < level[e.to]){
				f[0] = Math.min(f[0],res(e));
				long d = dfs(e.to,t,f);
				if(d>0){
					e.f += d;
					e.rev.f -= d;
					return d;
				}
			}
		}
		return 0;
	}

	
	public class FEdgeList extends ArrayList<FEdge>{
		private static final long serialVersionUID = -3222721656143220018L;
	}
	public class FEdge{
		public int to;
		public int c;
		public int f;
		public FEdge rev;
		
		public FEdge(int to, int w){
			this.to = to;
			this.c = w;
			this.f = 0;
		}
		
		public void setRevEdge(FEdge e){
			this.rev = e;
		}
		
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}