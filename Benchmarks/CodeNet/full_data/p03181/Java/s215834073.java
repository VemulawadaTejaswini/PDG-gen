import java.util.*;
import java.io.*;

public class Main
{
  	int n;
  	long mod;
  	int[][] sz;
  	long[] ans;
  	ArrayList[] G;
  
    Main(Scanner in, PrintWriter out)
    {
      n = in.nextInt();
      mod = in.nextLong();
      G = new ArrayList[n];
      for (int i = 0; i < n; i++)
        G[i] = new ArrayList<>();
      for (int i = 0; i < n; i++)
      {
        int u = in.nextInt();
        int v = in.nextInt();
        G[u].add(v); G[v].add(u);
      }
      
      sz = new int[n];
      for (int i = 0; i < n; i++)
        sz[i] = new int[G[i].size()];
      dfs(0, 0);
      ans = new long[n];
      Arrays.fill(ans, 1L);
      for (int i = 0; i < n; i++)
        for (int j = 0; j < sz[i].length; j++)
        {
          ans *= (1+sz[i][j]);
          ans %= mod;
        }
      for (int i : ans)
        out.println(i);
    }
  
  	int dfs(int at, int p)
    {
      int e = 0;
      for (int to : G[at])
      {
        if (to == p) continue;
        sz[at][e++] += dfs(to, at);
      }
      
      sz[at][e] = n-1;
      for (int i = e; i >=0; i--)
        sz[at][e] -= sz[at][i];
      
      return 1;
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}