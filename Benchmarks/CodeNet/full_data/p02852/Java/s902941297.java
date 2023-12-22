import java.io.*;
import java.util.*;


public class Main {
	static class next{
		int ans,v;
		next(int a,int u){
			ans=a;v=u;
		}
		public String toString() {return ans+" "+v;}
	}
	static public class SegmentTree {		// 1-based DS, OOP
		
		int N; 			//the number of elements in the array as a power of 2 (i.e. after padding)
		
		next[]sTree,lazy;
		SegmentTree(int n)		
		{
			N = n - 1;
			sTree = new next[N<<1];		//no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new next[N<<1];
			for(int i=0;i<sTree.length;i++)sTree[i]=new next(1000000, 1000000);

			for(int i=0;i<sTree.length;i++)lazy[i]=new next(1000000, 1000000);
		}
		
		
		
		void update_range(int i, int j, int val,int par)		// O(log n) 
		{
			update_range(1,1,N,i,j,val,par);
		}
		
		void update_range(int node, int b, int e, int i, int j, int val,int par)
		{
			if(i > e || j < b)		
				return;
			if(b >= i && e <= j)		
			{
				
				if(val<=sTree[node].ans) {
					sTree[node] = new next(val, par);			
					
				}
				next z=new next(val, par);
				if(compare(z, lazy[node])==z)
					lazy[node] = new next(val, par);				
			}							
			else		
			{
				int mid = b + e >> 1;
				propagate(node, b, mid, e);
				update_range(node<<1,b,mid,i,j,val,par);
				update_range(node<<1|1,mid+1,e,i,j,val,par);
				next z = compare(sTree[node<<1] , sTree[node<<1|1]);
				sTree[node]=new next(z.ans, z.v);
			}
			
		}
		void propagate(int node, int b, int mid, int e)		
		{
			if(compare(lazy[node], lazy[node<<1])==lazy[node])
				lazy[node<<1] = new next(lazy[node].ans,lazy[node].v);
			
			if(compare(lazy[node], lazy[node<<1|1])==lazy[node])
				lazy[node<<1|1] = new next(lazy[node].ans,lazy[node].v);
			
			//if(b==1 && mid==1)
				//System.out.println(lazy[node]+" "+sTree[node<<1]+" "+sTree[node<<1|1]+" "+b+" "+mid+" "+e);
			if(compare(lazy[node], sTree[node<<1])==lazy[node])
				sTree[node<<1] =new next(lazy[node].ans,lazy[node].v);
			
			if(compare(lazy[node], sTree[node<<1|1])==lazy[node])
				sTree[node<<1|1] =new next(lazy[node].ans,lazy[node].v);
			
			lazy[node] = new next(1000000,1000000);
		}
		
		next query(int i, int j)
		{
			return query(1,1,N,i,j);
		}
		
		next query(int node, int b, int e, int i, int j)	// O(log n)
		{
			if(i>e || j <b)
				return new next(1000000, 1000000);		
			if(b>= i && e <= j) {
				return sTree[node];
			}
			int mid = b + e >> 1;
			propagate(node, b, mid, e);
			next q1 = query(node<<1,b,mid,i,j);
			next q2 = query(node<<1|1,mid+1,e,i,j);
			return compare(q1,q2);
					
		}
		next compare(next q1,next q2) {
			if(q1.ans<q2.ans) {
				return q1;
			}
			else {
				if(q2.ans<q1.ans) {
					return q2;
				}
				else {
					if(q1.v<=q2.v)return q1;
					else
						return q2;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n=sc.nextInt(),m=sc.nextInt();
		char[]in=sc.nextLine().toCharArray();
		int N = 1; while(N < in.length) N <<= 1; //padding
		N++;
		SegmentTree st=new SegmentTree(N);
		st.update_range(in.length, in.length, 0, in.length);
		for(int i=in.length-1;i>0;i--) {
			if(in[i]=='0') {
				int r=i+1;
				int l=Math.max(1, r-m);
				int ans=st.query(r, r).ans;
				st.update_range(l, r-1, ans+1, r);
			}
		}
		
		/*for(int i=1;i<=in.length;i++) {
			System.out.println(st.query(i, i).ans+" "+st.query(i, i).v);
		}*/
		int ans=st.query(1, 1).ans;
		if(ans>=100007) {
			pw.println(-1);pw.flush();return;
		}
		int i=1;
		while(true) {
			if(i>=in.length)break;
			next q=st.query(i, i);
			pw.print((q.v-(i))+" ");
			i=q.v;
		}
		pw.flush();
	}

	static class MScanner {
		StringTokenizer st;
		BufferedReader br;

		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int[] takearr(int n) throws IOException {
			int[] in = new int[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public long[] takearrl(int n) throws IOException {
			long[] in = new long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public Integer[] takearrobj(int n) throws IOException {
			Integer[] in = new Integer[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public Long[] takearrlobj(int n) throws IOException {
			Long[] in = new Long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}