import java.io.*;
import java.util.*;
public class Main {
	static LinkedList<Integer>[]adj;
	static long[][]memo;
	static int m,n;
	static int ifBlack[];
	static boolean dfs(int i,int parent,int destination,int x,int y) {
		if(i==destination)return true;
		for(int j:adj[i]) {
			if(j!=parent) {
				if(dfs(j, i, destination,x,y)) {
					if((i==x && j==y) || (i==y && j==x)) {
						EdgeInPath=true;
					}
					
					return true;
				}
			}
		}
		return false;
	}
	static boolean EdgeInPath;
	
	static long dp(int i,int mask) {
		if(i==n-1) {
			if(mask==(1<<m)-1) {
				return 1;
			}
			return 0;
		}
		if(memo[i][mask]!=-1)return memo[i][mask];
		long black=dp(i+1,mask|ifBlack[i]);
		long white=dp(i+1,mask);
		return memo[i][mask]=black+white;
	}
	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		n=sc.nextInt();
		adj=new LinkedList[n];
		for(int i=0;i<n;i++) {
			adj[i]=new LinkedList<Integer>();
		}
		int[][]edges=new int[n-1][2];
		for(int i=0;i<n-1;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1;
			adj[x].add(y);
			adj[y].add(x);
			edges[i][0]=x;edges[i][1]=y;
		}
		m=sc.nextInt();
		int[][]conditions=new int[m][2];
		for(int i=0;i<m;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1;
			conditions[i][0]=x;conditions[i][1]=y;
		}
		ifBlack=new int[n-1];
		for(int i=0;i<n-1;i++) {
			int x=edges[i][0],y=edges[i][1];
			for(int j=0;j<m;j++) {
				int u=conditions[j][0],v=conditions[j][1];
				EdgeInPath=false;
				dfs(u,-1,v,x,y);
				if(EdgeInPath) {
					ifBlack[i]|=(1<<j);
				}
			}
		}
		memo=new long[n-1][1<<m];
		for(long []i:memo)Arrays.fill(i, -1);
		pw.println(dp(0,0));
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
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] takearrl(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public Integer[] takearrobj(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] takearrlobj(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
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
