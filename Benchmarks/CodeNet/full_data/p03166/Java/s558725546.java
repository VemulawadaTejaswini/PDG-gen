import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;


public class Main{
	
	static class FastReader 
    { 
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
                catch (IOException  e) 
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
	//static long INF = (Long.MAX_VALUE/2);
	static List<Integer> ar[];
	static boolean vis[];
	static int dp[];
	static int dfs(int s)
	{
		Iterator<Integer> itr = ar[s].iterator();
		if(!itr.hasNext())
		{
			dp[s] = 1;
			return 1;
		}
		while(itr.hasNext())
		{
			int n = itr.next();
			if(!vis[n])
			{
				vis[n] = true;
				dp[s] = Math.max(dp[s], dfs(n)+1);
			}
			else
			{
				dp[s] = Math.max(dp[s],dp[n]+1);
			}
			
		}
		return dp[s];
		
	}
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        int n = sc.nextInt();
        int m = sc.nextInt();
        dp = new int[n];
        ar = new List[n];
        
        for(int i = 0; i < n; i++)
        {
        	ar[i] = new ArrayList<>();
        }
        vis = new boolean[n];
        Arrays.fill(vis,false);
        for(int i = 0; i < m; i++)
        {	
        	int f = sc.nextInt();
        	int t = sc.nextInt();
        	ar[f-1].add(t-1);
        }
        for(int i = 0; i < n; i++)
        {	
        	if(!vis[i])
        	dfs(i);
        }
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
        	ans = Math.max(ans,dp[i]);
        }
        out.println(ans-1);
        out.close();
	}

}
