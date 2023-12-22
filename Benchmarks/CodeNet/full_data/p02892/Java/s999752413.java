import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
 
 
public class  Main{
	static int adj[][];
	static boolean[]v;
	static int ans=-1;
	static void bfs(int i) {
		int[]color=new int[adj.length];
		v[i]=true;
		color[i]=0;
		LinkedList<Integer>l=new LinkedList<Integer>();
		l.add(i);
		int max=0;
		while(!l.isEmpty()) {
			int u=l.poll();
			for(int j=0;j<adj.length;j++) {
				if(adj[u][j]==1) {
					if(!v[j]) {
						l.add(j);v[j]=true;color[j]=color[u]+1;
						max=Math.max(color[j], max);
					}
					else {
						if(Math.abs(color[u]-color[j])!=1) {
							return;
						}
					}
				}
			}
		}
		ans=Math.max(ans, max+1);
	}
	public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        adj=new int[n][n];
        for(int i=0;i<n;i++) {
        	char[]in=sc.nextLine().toCharArray();
        	for(int j=0;j<n;j++) {
        		if(in[j]=='1') {
        			adj[i][j]=1;
        		}
        	}
        }
        for(int i=0;i<n;i++) {
        	v=new boolean[n];
        	bfs(i);
        }
        pw.println(ans);
        pw.flush();
        pw.close();
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