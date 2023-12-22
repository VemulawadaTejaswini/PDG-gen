import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main{
	
	static boolean visited[];
	static ArrayList<Integer> g[];
	static long arr[];
	static void dfs(int u , long sum)				
	{
		visited[u] = true;

		arr[u] += sum;
		for(int v: g[u])
			if(!visited[v])
			{
				dfs(v , arr[u]);
			}
	}


	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st1.nextToken());
		int q = Integer.parseInt(st1.nextToken());
		
		arr = new long [n];
		
		g = new ArrayList[n];
		visited = new boolean[n];
		for(int i = 0 ; i < n ; i++)
			g[i] = new ArrayList<>();
		
		for(int i = 1 ; i <= n-1 ; i++)
		{
			st1 = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st1.nextToken())-1;
			int y = Integer.parseInt(st1.nextToken())-1;
			
			g[x].add(y);
			g[y].add(x);
		}
		
		while(q-- > 0)
		{
			st1 = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st1.nextToken())-1;
			int w = Integer.parseInt(st1.nextToken());
			
			arr[x] += w;
		}
		
		dfs(0 , 0l);
		
		for(int i = 0 ; i < n ; i++)
			out.print(arr[i] + " ");
		
		
		
		out.flush();
		out.close();
	}
	
	
	


}
