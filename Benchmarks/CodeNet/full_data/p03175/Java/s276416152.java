import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	static long[] dp1;
	static long[] dp2;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		graph G=new graph(N);
		for (int i = 0; i < N-1; i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			G.addEdge(a, b, 1);
			G.addEdge(b, a, 1);
		}
		dp1=new long[N];
		dp2=new long[N];//kuro
		G.Treedfs(0, -1);
		System.out.println((dp1[0]+dp2[0])%MOD);
   	}
	static class Edge implements Comparable<Edge>{
		int to;
		long v;
		public Edge(int to,long v) {
			this.to=to;
			this.v=v;
		}
		@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Edge) {
    			Edge other = (Edge) obj;
    			return other.to==this.to && other.v==this.v;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.to,this.v);
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
		void addEdge(int from,int to,long w) {
			list[from].add(new Edge(to,w));
		}
		void Treedfs(int v, int p ) {
			long c1=1;
			long c2=1;
			for (Edge nv : list[v]) {
				if (nv.to == p) continue;  
				Treedfs(nv.to, v);
				c2*=dp1[nv.to];
				c2%=MOD;
				c1*=(dp1[nv.to]+dp2[nv.to]);
				c1%=MOD;
			}
			dp1[v]=c1;
			dp2[v]=c2;
		}
	    int[] topological(){
			int[] indegree = new int[size];//入次数
	        for (int i = 0; i < size; i++) {
	        	for (Edge edge: list[i]) {
					indegree[edge.to]++;
				}
	        }
	        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
	        int[] count=new int[size];
	        for (int i = 0; i < size; i++) {
	            if (indegree[i] == 0) {
	                q.addLast(i);
	            }
	        }
	        int cnt = 0;
	        List<Integer> res = new ArrayList<Integer>();
	        while (!q.isEmpty()) {
	            // 接続先の頂点を探索開始
	            int u = q.removeLast();
	            res.add(u);
	            for (Edge edge : list[u]) {
	                indegree[edge.to]--;
	                count[edge.to]=Math.max(count[u]+1,count[edge.to]);
	                if (indegree[edge.to] == 0) {
	                    q.addFirst(edge.to);
	                }
	            }
	            cnt++;
	        }
	        if (cnt<size) {
				return null;
			}//閉路があればその頂点は一度もキューに入らない
	        return count;
	        //countはその頂点までの最大パス長
	        //resにcountの値が小さい順にソートされたものが入っている。
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
