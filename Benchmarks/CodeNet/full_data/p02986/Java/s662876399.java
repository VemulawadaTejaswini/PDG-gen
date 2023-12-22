import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        WGraph g = new WGraph(n);
        
        for(int i=0;i<n-1;i++){
        	int u = sc.nextInt()-1;
        	int v = sc.nextInt()-1;
        	int c = sc.nextInt();
        	int w = sc.nextInt();
        	g.addEdge(u,v,w,c);
        }
        
        for(int i=0;i<q;i++){
        	int col = sc.nextInt();
        	int toW = sc.nextInt();
        	int start = sc.nextInt()-1;
        	int goal = sc.nextInt()-1;
        	out.println(g.Dijkstra(start, goal, col, toW));
        }
        
        out.flush();
    }

}

class WGraph {
	WEdgeList[] elist;
	
	public WGraph(int vnum){
		this.elist = new WEdgeList[vnum];
		for(int i=0;i<vnum;i++){
			elist[i] = new WEdgeList();
		}
	}

	//同じ辺を複数回追加すると多重辺が生まれてしまう
	public void addEdge(int a, int b, int w, int col){
		elist[a].add(new WEdge(b,w,col));
		elist[b].add(new WEdge(a,w,col));
	}
	
	//頂点数を返す
	public int vnum(){
		return elist.length;
	}
	
	//辺数を返す
	public int edgeNum(){
		int sum = 0;
		for(WEdgeList l:elist){
			sum += l.size();
		}
		return sum/2;
	}
	
	//隣接判定
	public boolean isNext(int n, int m){
		return elist[n].contains(m);
	}
	
	//次数
	public int dig(int i){
		return elist[i].size();
	}
	
	//全ての辺の重みの合計
	public int totalWeight(){
		int total = 0;
		for(int i=0;i<vnum();i++){
			for(WEdge e:elist[i]){
				total += e.w;
			}
		}
		return total/2;
	}
	
	//隣接する全ての頂点を返す
	public ArrayList<Integer> nextList(int n){
		ArrayList<Integer> l = new ArrayList<>();
		for(WEdge e:elist[n]){
			l.add(e.to);
		}
		return l;
	}
	
	//隣接する全ての辺を返す
	public WEdgeList EList(int n){
		return elist[n];
	}
	
	//ダイクストラ法でsからの最短距離列を求める。到達不可はMAXVALUE。
	public long Dijkstra(int start, int goal, int col, int toW){
		
		PriorityQueue<NextNode> frontier = new PriorityQueue<>((x,y)->Long.compare(x.g, y.g));
		boolean[] isExplored = new boolean[vnum()];
		long[] g = new long[vnum()];
		Arrays.fill(g, Long.MAX_VALUE);
		
		g[start] = 0;
		frontier.add(new NextNode(start,0,-1));
		
		while(!frontier.isEmpty()){
			NextNode now = frontier.poll();
			if(now.i == goal){
				return g[now.i];
			}
			
			if(!isExplored[now.i]){
				isExplored[now.i] = true;
				if(now.maxcol < col){
					addEdge(start,now.i,0,(int)now.g);
				}
				
				for(WEdge e:EList(now.i)){
					int w = e.w;
					if(e.col == col){
						w = toW;
					}
					
					if(isExplored[e.to]){
						continue;
					}
					
					int next = e.to;
					if(g[next] <= g[now.i] + w){
						continue;
					}
					
					g[next] = now.g + w;
					frontier.add(new NextNode(next,g[next],e.col));
				}	
			}
		}
		
		return -1;
	}
	class NextNode{
		int i;
		long g;
		int maxcol;
		public NextNode(int i, long g, int col){
			this.i=i;
			this.g=g;
			this.maxcol = Math.max(maxcol, col);
		}
	}
	
	//全点対最短距離をワーシャルフロイド法で求める
	public long[][] WarshallFloyd(){
		long[][][] d = new long[vnum()+1][vnum()][vnum()];
		
		for(int k=0;k<vnum()+1;k++){
			for(int i=0;i<vnum();i++){
				Arrays.fill(d[k][i], Long.MAX_VALUE);
				d[k][i][i] = 0;
			}
		}

		for(int i=0;i<vnum();i++){
			for(WEdge e:elist[i]){
				d[0][i][e.to] = Math.min(d[0][i][e.to], e.w);	//多重辺対策
			}
		}
		
		for(int k=1;k<vnum()+1;k++){
			for(int i=0;i<vnum();i++){
				for(int j=0;j<vnum();j++){
					if((d[k-1][i][k-1] != Long.MAX_VALUE) && (d[k-1][k-1][j] != Long.MAX_VALUE)){
						d[k][i][j] = Math.min(d[k-1][i][j], d[k-1][i][k-1] + d[k-1][k-1][j]);
					}
					else{
						d[k][i][j] = d[k-1][i][j];
					}
				}
			}
		}
		
		return d[vnum()];
	}


	//木の高さ
	public int[] treeHeight(){
		int[][] dp = new int[vnum()][vnum()]; //iからj方向に向かうときの最大距離
		for(int i=0;i<vnum();i++){
			Arrays.fill(dp[i],Integer.MIN_VALUE);
		}
		int[] height = new int[vnum()];
		
		for(int i=0;i<vnum();i++){
			for(WEdge e:EList(i)){
				dfsth(i,e.to,e.w,dp);
			}
		}
		
		for(int i=0;i<vnum();i++){
			for(WEdge e:EList(i)){
				height[i] = Math.max(height[i],dp[i][e.to]);
			}
		}
		
		return height;
	}
	int dfsth(int i, int j, int w, int[][] dp){
		if(dp[i][j]==Integer.MIN_VALUE){
			int max = 0;
			for(WEdge e:EList(j)){
				if(e.to!=i){
					max = Math.max(max,dfsth(j,e.to,e.w,dp));
				}
			}
			dp[i][j] = max + w;
			return dp[i][j];
		}
		else{
			return dp[i][j];
		}
	}
	
	//木の高さ（再帰なし、若干遅い）
	public int[] treeHeight2(){
		
		int[][] dp = new int[vnum()][vnum()]; //iからj方向に向かうときの最大距離
		for(int i=0;i<vnum();i++){
			Arrays.fill(dp[i],Integer.MIN_VALUE);
		}
		
		int[] height = new int[vnum()];
		
		int[] ord = new int[vnum()];
		int[] ordidx = new int[vnum()]; //そのオーダーを持つ頂点のインデックス
		
		//DFS木を作り、ordを求める
		ArrayDeque<Integer> a = new ArrayDeque<>();
		a.offerFirst(0);
		int noword = 0;
		boolean isVisited[] = new boolean[vnum()];
		
		while(!a.isEmpty()){
			int now = a.pollFirst();
			
			if(isVisited[now]){
				continue;
			}
			isVisited[now] = true;
			
			ord[now] = noword;
			ordidx[noword] = now;
			noword++;
			
			for(WEdge e:EList(now)){
				a.offerFirst(e.to);
			}
		}
		
		WEdge[] par = new WEdge[vnum()];
		
		//親→子の方向をまず埋める
		for(int o=vnum()-1;o>0;o--){
			int dpnum = 0;
			int idx = ordidx[o];
			for(WEdge e:EList(idx)){
				if(ord[e.to]<o){
					par[idx] = e;
				}
				else{
					dpnum = Math.max(dpnum, dp[idx][e.to]);
				}
			}
			dp[par[idx].to][idx] = dpnum + par[idx].w;
		}
		
		//子→親の方向を埋める
		for(int o=1;o<vnum();o++){
			int idx = ordidx[o];
			int dpnum = 0;
			for(WEdge e:EList(par[idx].to)){
				if(e.to != idx){
					dpnum = Math.max(dpnum, dp[par[idx].to][e.to]);
				}
			}
			dp[idx][par[idx].to] = dpnum + par[idx].w;
		}
		
		for(int i=0;i<vnum();i++){
			for(WEdge e:EList(i)){
				height[i] = Math.max(height[i],dp[i][e.to]);
			}
		}
		
		return height;
	}
	
	class WEdgeList extends ArrayList<WEdge>{
		private static final long serialVersionUID = 4901656039324433445L;
	}
	class WEdge{
		int to;
		int w;
		int col;
		
		public WEdge(int to, int w, int col){
			this.to = to;
			this.w = w;
			this.col = col;
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
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
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
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}