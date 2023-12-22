//atcoder library for java 感謝します。
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	static long[] colorsum;
	static long[] distsum;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		graph G=new graph(N);
		for (int i = 0; i < N-1; i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			int color=sc.nextInt()-1;
			long d=sc.nextLong();
			G.addEdge(a, b, d, color);
			G.addEdge(b, a, d, color);
		}
		colorsum=new long[N-1];
		distsum=new long[N-1];
		int[] x=new int[Q];
		long[] y=new long[Q];
		int[] u=new int[Q];
		int[] v=new int[Q];
		HashMap<Integer, Long>[] hashMaps1=new HashMap[N];//距離のsum
		HashMap<Integer, Long>[] hashMaps2=new HashMap[N];//個数のsum
		for (int i = 0; i < hashMaps2.length; i++) {
			hashMaps1[i]=new HashMap<>();
			hashMaps2[i]=new HashMap<>();
		}
		int[] l=new int[Q];
		LCA lca=new LCA(N, 0, G);
		for (int i = 0; i < v.length; i++) {
			x[i]=sc.nextInt()-1;
			y[i]=sc.nextLong();
			u[i]=sc.nextInt()-1;
			v[i]=sc.nextInt()-1;
			l[i]=lca.query(u[i], v[i]);
			hashMaps1[u[i]].put(x[i],0L);
			hashMaps1[v[i]].put(x[i],0L);
			hashMaps1[l[i]].put(x[i],0L);
		}
		long[] d=new long[N];
		G.Treedfs(0, -1, hashMaps1, hashMaps2, 0, d);
		for (int i = 0; i < Q; i++) {
			long du=hashMaps1[u[i]].get(x[i]);
			long cu=hashMaps2[u[i]].get(x[i]);
			long dv=hashMaps1[v[i]].get(x[i]);
			long cv=hashMaps2[v[i]].get(x[i]);
			long dl=hashMaps1[l[i]].get(x[i]);
			long cl=hashMaps2[l[i]].get(x[i]);
			long uL=d[u[i]]-du+y[i]*cu;
			long vL=d[v[i]]-dv+y[i]*cv;
			long lL=d[l[i]]-dl+y[i]*cl;
			out.println(uL+vL-2*lL);
		}
		out.flush();
	}
	static class LCA{
		int[][] par;
		int[] dist;//LCA用
		int K = 1;
		public LCA(int n,int root,graph G) {
	        while ((1 << K) < n) K++;
			par=new int[K][n];
			dist=new int[n];
			Arrays.fill(dist, -1);
			bfs(G, root, 0);
			for (int k = 0; k + 1 < K; k++) {
	            for (int v = 0; v < n; v++) {
	                if (par[k][v] < 0) {
	                    par[k + 1][v] = -1;
	                } else {
	                    par[k + 1][v] = par[k][par[k][v]];
	                }
	            }
	        }
		}
		void bfs(graph G,int v,int d) {
			ArrayDeque<Integer> qArrayDeque=new ArrayDeque<Integer>();
			par[0][v]=-1;
			boolean[] visited=new boolean[G.size];
			qArrayDeque.add(v);
			visited[v]=true;
			while (!qArrayDeque.isEmpty()) {
				int u=qArrayDeque.poll();
				for (Edge nv: G.list[u]){
					if (visited[nv.to]){
						continue;
					}
					visited[nv.to]=true;
					dist[nv.to]=dist[u]+1;
					par[0][nv.to]=u;
					qArrayDeque.add(nv.to);
				}
			}
		}
		int query(int u, int v) {
	        if (dist[u] < dist[v]) {
	        	int swap=u;
	        	u=v;
	        	v=swap;
	        }  // u の方が深いとする
	        int K = par.length;
	        // LCA までの距離を同じにする
	        for (int k = 0; k < K; k++) {
	            if ((((dist[u] - dist[v]) >> k) & 1)==1) {
	                u = par[k][u];
	            }
	        }
	        // 二分探索で LCA を求める
	        if (u == v) return u;
	        for (int k = K - 1; k >= 0; k--) {
	            if (par[k][u] != par[k][v]) {
	                u = par[k][u];
	                v = par[k][v];
	            }
	        }
	        return par[0][u];
	    }//u,vのlcaを返す
	}
	static class Edge implements Comparable<Edge>{
		int to;
		long v;
		int color;
		public Edge(int to,long v,int color) {
			this.to=to;
			this.v=v;
			this.color=color;
		}
		@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Edge) {
    			Edge other = (Edge) obj;
    			return other.to==this.to && other.v==this.v&&other.color==this.color;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.to,this.v,this.color);
    	}
    	@Override
		  public int compareTo( Edge p2 ){
			 if (this.v>p2.v) {
				return 1;
			}
			 else if (this.v<p2.v) {
				return -1;
			}
			 else {
				return 0;
			}
		  }
	}
	static class graph{
		ArrayList<Edge>[] list;
		int size;
		long INF=Long.MAX_VALUE/2;
		int[] color;
		@SuppressWarnings("unchecked")
		public graph(int n) {
			size = n;
			list = new ArrayList[n];
			color =new int[n];
			for(int i=0;i<n;i++){
				list[i] = new ArrayList<Edge>();
			}
		}
		void addEdge(int from,int to,long w,int color) {
			list[from].add(new Edge(to,w,color));
		}
		void Treedfs(int v, int p,HashMap<Integer,Long>[] hashMaps1,HashMap<Integer,Long>[] hashMaps2,long distance,long[] d){
			d[v]=distance;
			for (int i: hashMaps1[v].keySet()) {
				hashMaps1[v].put(i, distsum[i]);
				hashMaps2[v].put(i, colorsum[i]);
			}
			for (Edge nv : list[v]) {
				if (nv.to == p) continue;
				distsum[nv.color]+=nv.v;
				colorsum[nv.color]++;
				Treedfs(nv.to, v, hashMaps1, hashMaps2, distance+nv.v,d);
				distsum[nv.color]-=nv.v;
				colorsum[nv.color]--;
			}
		}
	}
		static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
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
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
