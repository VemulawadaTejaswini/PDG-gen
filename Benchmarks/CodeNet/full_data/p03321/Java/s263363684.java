import java.util.*;
import java.io.*;
class Main {

	static int []col;
	static boolean [][]adj;
	static boolean []visited;
	
	static int dfs2(int u)
	{
		visited[u]=true;
		int ans=1;
		for(int v=0;v<visited.length;v++)
			if(!visited[v] && adj[u][v])
				ans+=dfs2(v);
		return ans;
				
	}
	static void dfs(int u) {
		visited[u]=true;
		int n=visited.length;
		for(int i=0;i<n;i++)
			if(!visited[i] && adj[u][i])
				dfs(i);
	}
	static boolean color (int u)
	{
		
		for(int v=0;v<visited.length;v++)
		{
			if(adj[u][v] || u==v)
				continue;
			if(col[v]==-1)
			{
				col[v]=1-col[u];
				if(!color(v))
					return false;
			}
			else if(col[v]==col[u])
			{
				
				return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt(),m=sc.nextInt();
		adj=new boolean [n][n];
		visited=new boolean[n];
		while(m-->0)
		{
			int u=sc.nextInt()-1,v=sc.nextInt()-1;
			adj[u][v]=adj[v][u]=true;
		}
		int cc=0;
		for(int i=0;i<n;i++)
			if(!visited[i])
			{
				dfs(i);
				cc++;
			}
		
		if(cc>2)
		{
			System.out.println(-1);
			return;
		}
		if(cc==2)
		{
			Arrays.fill(visited, false);
			int []finish=new int [n];
			int nodes=dfs2(0);
			
			long ans=0;
			long edges=0;
			for(int i=0;i<n;i++)
				if(visited[i])
				{
					finish[i]=1;
					for(int j=0;j<n;j++)
						if(adj[i][j])
							edges++;
				}
		
			ans+=edges;
			if(edges!=(nodes-1)*1L*nodes)
			{
				System.out.println(-1);
				return;
			}
			
			edges=0;
			for(int i=0;i<n;i++)
				if(!visited[i])
					nodes=dfs2(i);
			for(int i=0;i<n;i++)
				if(finish[i]==0)
				{
					
					for(int j=0;j<n;j++)
						if(adj[i][j])
							edges++;
				}
			ans+=edges;
			if(edges!=(nodes-1)*1L*nodes)
			{
				System.out.println(-1);
				return;
			}
			
			pw.println(ans/2);
		}
		else
		{
			
			col=new int [n];
			Arrays.fill(col, -1);
			for(int i=0;i<n;i++)
			{
				if(col[i]!=-1)
					continue;
				int size=0;
				for(int j=0;j<n;j++)
					if(adj[i][j])
						size++;
				
				if(size!=n-1)
				{
					col[i]=0;
					if(!color(i))
					{
						System.out.println(-1);
						return ;
					}
				}
			}
			int A=0,B=0;
			for(int i=0;i<n;i++)
				if(col[i]==0)
					A++;
				else if(col[i]==1)
					B++;
			int rem=n-A-B;
			int diff=Math.abs(A-B);
			if(A<B)
				A+=Math.min(diff, rem);
			else
				B+=Math.min(diff, rem);
			rem-=Math.min(diff, rem);
			if(rem>0)
			{
				A+=rem/2;
				B+=(rem+1)/2;
			}
			long ans=A*1L*(A-1)/2+B*1L*(B-1)/2;
			pw.println(ans);
		}
		
		pw.close();
		
	}
	
	static class Scanner {
        StringTokenizer st;
        BufferedReader br;
 
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
 
        public Scanner(FileReader s) {
            br = new BufferedReader(s);
        }
 
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
 
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
 
        public String nextLine() throws IOException {
            return br.readLine();
        }
        public boolean ready() throws IOException {return br.ready();}
        public double nextDouble() throws IOException {return Double.parseDouble(next());}
       
    }

}