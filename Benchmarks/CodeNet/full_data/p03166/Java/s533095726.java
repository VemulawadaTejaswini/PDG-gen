import java.io.*; 
import java.util.*; 

public class Main{ 
	
	static class FastReader{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	}

	static ArrayList<Integer>[] graph;
	static int[] dp;

	static int dfs(int u){
		if(dp[u]!=0)
			return dp[u];

		int vl = 0;
		ArrayList<Integer> curlist = (ArrayList<Integer>) graph[u];
		for(int v: curlist){
			vl = Math.max(vl, dfs(v));
		}

		return dp[u] = vl+1;
	}

	public static void main(String[] args) 
	{ 
        FastReader sc = new FastReader(); 
        //PrintWriter out = new PrintWriter(System.out); 

        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList[n+1];
        dp = new int[n+1];

        for(int i=0;i<=n;i++)
        	graph[i] = new ArrayList<Integer>();

        while(m-->0){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	graph[a].add(b);
        }

        for(int i=1;i<=n;i++)
        	dfs(i);

        int ans = 0;
        for(int i=1;i<=n;i++)
        	ans = Math.max(ans, dp[i]);

        System.out.println(ans-1);
        
	}
}
