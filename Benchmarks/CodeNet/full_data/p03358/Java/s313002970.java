import java.io.*;
import java.util.*;

public class Main{
	static int n,col[];
	static LinkedList<Integer>[]adj;
	static int dist,farthest;
	static void dfs(int i,int par,int curD) {
		if(col[i]==1) {
			if(curD>dist) {
				dist=curD;
				farthest=i;
			}
		}
		for(int j:adj[i]) {
			if(j==par)continue;
			dfs(j, i, curD+1);
		}
	}
	static boolean[]notReturn;//if notReturn[i]=true , we don't need to move back to par[i]
	static boolean[]hasWhite;
	static void dfs2(int i,int par) {
		hasWhite[i]=col[i]==1;
		if(i==farthest) {
			notReturn[i]=true;
			return;
		}
		for(int j:adj[i]) {
			if(j==par)continue;
			dfs2(j, i);
			notReturn[i]|=notReturn[j];
			hasWhite[i]|=hasWhite[j];
		}
	}
	static int ans(int i,int par) {
		int seconds=0;
		for(int j:adj[i]) {
			if(j==par || !hasWhite[j])continue;
			col[j]^=1;
			if(notReturn[j]) {
				seconds+=1+ans(j, i);
			}
			else {
				col[i]^=1;
				seconds+=2+ans(j, i);
			}
		}
		
		return seconds+(col[i]==1?1:0);
	}
	static void main() throws Exception{
		n=sc.nextInt();
		adj=new LinkedList[n];
		for(int i=0;i<n;i++)adj[i]=new LinkedList<Integer>();
		for(int i=0;i<n-1;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1;
			adj[x].add(y);
			adj[y].add(x);
		}
		char[]colors=sc.nextLine().toCharArray();
		col=new int[n];
		int cntW=0;
		int start=-1;
		for(int i=0;i<n;i++) {
			col[i]=colors[i]=='W'?1:0;
			cntW+=col[i];
			if(col[i]==1) {
				start=i;
			}
		}
		if(cntW<2) {
			pw.println(cntW);
			return;
		}
		dfs(start, -1, 0);
		start=farthest;
		dist=0;//maximum distance between 2 whites
		dfs(start, -1, 0);
		//best path is to go from start to farthest
		
		notReturn=new boolean[n];
		hasWhite=new boolean[n];
//		System.out.println(start+" "+farthest);
		dfs2(start, -1);
		
		pw.println(ans(start, -1));
	}
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
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
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
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
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}
