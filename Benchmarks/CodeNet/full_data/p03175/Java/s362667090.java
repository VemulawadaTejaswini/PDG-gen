
import java.io.*;
import java.util.*;

public class Main{

	
	static int MOD=(int)1e9+7;
	static int [][]memo;
	static ArrayList<Integer> []adj;
	static int dp(int u,int p,int col) {
		if(memo[col][u]!=-1)
			return memo[col][u];
		long ans=1;
//		boolean leaf=true;
		for(int v:adj[u])
			if(v!=p)
			{
				long x=dp(v,u,1-col);
				
//				leaf=false;
				
				
				if(col==0) {
					x=x+dp(v,u,col);
					if(x>=MOD)
						x-=MOD;
					
				}
				ans=ans*x%MOD;
			}
		
		return memo[col][u]=(int)ans;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt();
		memo=new int [2][n];
		Arrays.fill(memo[1],-1);
		Arrays.fill(memo[0],-1);
		adj=new ArrayList[n];
		for(int i=0;i<n;i++) {
			adj[i]=new ArrayList<>();
		}
		for(int i=1;i<n;i++) {
			int u=sc.nextInt()-1,v=sc.nextInt()-1;
			adj[u].add(v);
			adj[v].add(u);
		}
		int ans=dp(0,0,0)+dp(0,0,1);
		if(ans>=MOD)
			ans-=MOD;
		out.println(ans);
		out.close();
	}
	
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
