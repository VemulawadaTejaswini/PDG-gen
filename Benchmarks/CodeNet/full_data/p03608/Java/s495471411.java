import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws Throwable {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);
		
		n=sc.nextInt();
		m=sc.nextInt();
		r=sc.nextInt();
		a=new int [r];
		for(int i=0;i<r;i++)
			a[i]=sc.nextInt()-1;
		adj=new int [n][n];
		for(int [] x : adj)
			Arrays.fill(x, inf);
		for(int i=0;i<n;i++)
			adj[i][i]=0;
		while(m-->0){
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			int c=sc.nextInt();
			adj[u][v]=c;
			adj[v][u]=c;
		}
		
		for(int k=0;k<n;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					adj[i][j]=Math.min(adj[i][j], adj[i][k]+adj[k][j]);
		
		mem=new int [r][1<<r];
		for(int [] x : mem)
			Arrays.fill(x, -1);
		int ans=dp(0, 1);
		for(int i=1;i<r;i++)
			ans=Math.min(ans, dp(i, 1<<i));
		pw.println(ans);
		pw.flush();
		pw.close();
	}
	static int inf=(int)1e8;
	static int n,m,r;
	static int [] a;
	static int [][] adj;
	static int [][] mem;
	
	static int dp(int i,int msk){
		if(Integer.bitCount(msk)==r)
			return 0;
		if(mem[i][msk]!=-1)
			return mem[i][msk];
		int ans=inf;
		for(int j=0;j<r;j++)
			if((msk & (1<<j))==0)
				ans=Math.min(ans, adj[a[i]][a[j]]+dp(j, msk | (1<<j)));
		return mem[i][msk]=ans;
	}
	
	static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {while (st == null || !st.hasMoreElements()) {
			try {st = new StringTokenizer(br.readLine());}
			catch (IOException e) {e.printStackTrace();}}
		return st.nextToken();}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());}
		double nextDouble() {return Double.parseDouble(next());}
		String nextLine(){String str = "";
		try {str = br.readLine();}
		catch (IOException e) {e.printStackTrace();}
		return str;}
	}
}