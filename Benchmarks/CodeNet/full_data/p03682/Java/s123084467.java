import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();

    	int n = sc.nextInt();
    	
    	ArrayList<Pair> l = new ArrayList<>();
    	
    	for(int i=0;i<n;i++){
    		l.add(new Pair(i,sc.nextInt(),sc.nextInt()));
    	}

    	WGraph g = new WGraph(n);
    	
    	Collections.sort(l);
    	
    	for(int i=0;i<n-1;i++){
    		g.addEdge(l.get(i).n,l.get(i+1).n,Math.abs(l.get(i).a -l.get(i+1).a));
    	}
    	
    	Collections.sort(l,new PC2());
    	
    	for(int i=0;i<n-1;i++){
    		g.addEdge(l.get(i).n,l.get(i+1).n,Math.abs(l.get(i).b -l.get(i+1).b));
    	}
    	
    	int sum = 0;
    	for(WGraph.WEdge2 e:g.Kraskal()){
    		sum += e.w;
    	}
    	
    	System.out.println(sum);
    }
    
}

class Pair implements Comparable<Pair>{
	int a,b;
	int n;
	
	public Pair(int n, int a, int b){
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	@Override
	public int compareTo(Pair o){
		if(a!=o.a){
			return Integer.compare(a,o.a);
		}
		return Integer.compare(b, o.b);
	}
}

class PC2 implements Comparator<Pair>{
	@Override
	public int compare(Pair o1,Pair o2){
		if(o1.b!=o2.b){
			return Integer.compare(o1.b,o2.b);
		}
		return Integer.compare(o1.a, o2.a);
	}
}

class WGraph {
	WEdgeList[] elist;
	static int[] g;
	
	public WGraph(int vnum){
		this.elist = new WEdgeList[vnum];
		for(int i=0;i<vnum;i++){
			elist[i] = new WEdgeList();
		}
	}

	//同じ辺を複数回追加すると多重辺が生まれてしまう
	public void addEdge(int a, int b, int w){
		elist[a].add(new WEdge(b,w));
		elist[b].add(new WEdge(a,w));
	}
	
	//頂点数を返す
	int vnum(){
		return elist.length;
	}
	
	//辺数を返す
	int edgeNum(){
		int sum = 0;
		for(WEdgeList l:elist){
			sum += l.size();
		}
		return sum/2;
	}
	
	//隣接判定
	boolean isNext(int n, int m){
		return elist[n].contains(m);
	}
	
	//隣接する全ての頂点を返す
	ArrayList<Integer> nextList(int n){
		ArrayList<Integer> l = new ArrayList<>();
		for(WEdge e:elist[n]){
			l.add(e.to);
		}
		return l;
	}
	
	//隣接する全ての辺を返す
	WEdgeList EList(int n){
		return elist[n];
	}
	
	//ダイクストラ法でsからgまでの最短距離を求める。到達不可は-1。
	class NodeD implements Comparable<NodeD>{
		int n;
		
		public NodeD(int n){
			this.n = n;
		}
		
		@Override
		public int compareTo(NodeD o){
			return Integer.compare(g[n], g[o.n]);
		}

		private WGraph getOuterType() {
			return WGraph.this;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + n;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			NodeD other = (NodeD) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (n != other.n)
				return false;
			return true;
		}
	}
	int Dijkstra(int start, int goal){
		
		PriorityQueue<NodeD> frontier = new PriorityQueue<>();
		g = new int[vnum()];
		Arrays.fill(g, -1);
		boolean[] isExplored = new boolean[vnum()];
		
		frontier.add(new NodeD(start));
		g[start] = 0;
		
		
		while(!frontier.isEmpty()){
			NodeD now = frontier.poll();
			if(now.n == goal){
				return g[now.n];
			}
			isExplored[now.n] = true;
			
			for(WEdge e:EList(now.n)){
				if(isExplored[e.to]){
					continue;
				}
				
				NodeD next = new NodeD(e.to);
				if(g[next.n] != -1){
					if(g[next.n] <= g[now.n] + e.w){
						continue;
					}
					else{
						frontier.remove(next);
					}
				}
				
				g[next.n] = g[now.n] + e.w;
				frontier.add(next);
			}	
		}
		
		return -1;
	}
	
	//ダイクストラ法でsからの最短距離列を求める。到達不可は-1。
	int[] DijkstraArray(int start){
		PriorityQueue<NodeD> frontier = new PriorityQueue<>();
		g = new int[vnum()];
		Arrays.fill(g, -1);
		boolean[] isExplored = new boolean[vnum()];
		
		frontier.add(new NodeD(start));
		g[start] = 0;
		
		
		while(!frontier.isEmpty()){
			NodeD now = frontier.poll();
			isExplored[now.n] = true;
			
			for(WEdge e:EList(now.n)){
				if(isExplored[e.to]){
					continue;
				}
				
				NodeD next = new NodeD(e.to);
				if(g[next.n] != -1){
					if(g[next.n] <= g[now.n] + e.w){
						continue;
					}
					else{
						frontier.remove(next);
					}
				}
				
				g[next.n] = g[now.n] + e.w;
				frontier.add(next);
			}	
		}
		
		return g;
	}

	//全ての辺のリストを返す
	ArrayList<WEdge2> EdgeList(){
		ArrayList<WEdge2> ans = new ArrayList<>();
		
		for(int i=0;i<vnum();i++){
			for(WEdge e:elist[i]){
				if(i>e.to){
					ans.add(new WEdge2(i,e.to,e.w));
				}
			}
		}
		
		return ans;
	}
	//クラスカル法で最小全域木を求める
	ArrayList<WEdge2> Kraskal(){		
		//UFT
		class UFT{
			int[] par;
			int[] rank;
			
			public UFT(int n){
				par = new int[n];
				rank = new int[n];
				
				for(int i=0;i<n;i++){
					par[i] = i;
				}
			}
			
			//木の根を求める
			public int find(int x){
				if(par[x] == x){
					return x;
				}
				else{
					return par[x] = find(par[x]);
				}
			}
			
			//xとyの属する集合を併合
			void unite(int x, int y){
				int px = find(x);
				int py = find(y);
				
				if(px == py){
					return;
				}
				else if(rank[px] < rank[py]){
					par[px] = py;

				}
				else{
					par[py] = px;
					if(rank[px]==rank[py]){
						rank[px]++;
					}
				}
				
			}
			
			//xとyが同じ集合に属するか
			boolean isEquivalent(int x, int y){
				return find(x) == find(y);
			}
		}
		
		ArrayList<WEdge2> s = EdgeList();
		ArrayList<WEdge2> forest = new ArrayList<>();
		Collections.sort(s);
		UFT uft = new UFT(vnum());
		
		while(!s.isEmpty()){
			WEdge2 now = s.remove(0);
			
			if(!uft.isEquivalent(now.u,now.v)){
				forest.add(now);
				uft.unite(now.u, now.v);
			}
		}
		
		return forest;
	}
	
	class WEdgeList extends ArrayList<WEdge>{
		private static final long serialVersionUID = 4901656039324433445L;
	}
	class WEdge{
		int to;
		int w;
		
		public WEdge(int to, int w){
			this.to = to;
			this.w = w;
		}
	}
	class WEdge2 implements Comparable<WEdge2>{
		int u;
		int v;
		int w;
		
		public WEdge2(int u, int v, int w){
			this.u = u;
			this.v = v;
			this.w = w;
		}
		
		@Override
		public int compareTo(WEdge2 o){
			return Integer.compare(w, o.w);
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}