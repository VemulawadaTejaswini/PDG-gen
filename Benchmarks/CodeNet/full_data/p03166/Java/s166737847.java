import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static Stack<Integer> st;

	static void topologicalSort(ArrayList<Integer> graph[], int n)
	{
		int visited[]=new int[n];
		for(int i=0;i<n;i++)
		{
			dfs(graph, i, visited);
		}
	}

	static void dfs(ArrayList<Integer> graph[], int i, int visited[])
	{
		if(visited[i]==1)
			return;
		visited[i]=1;

		for(int child: graph[i])
			dfs(graph, child, visited);

		st.add(i);
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();

		ArrayList<Integer> graph[]=new ArrayList[n];
		for(int i=0;i<n;i++)
			graph[i]=new ArrayList<>();

		for(int i=0;i<m;i++)
		{
			graph[scan.nextInt()-1].add(scan.nextInt()-1);
		}

		st=new Stack<>();
		topologicalSort(graph, n);
		int dp[]=new int[n];
		int maxAns=0;

		while(!st.isEmpty())
		{
			int top=st.pop();
			for(int ch: graph[top])
			{
				dp[ch]=Math.max(dp[ch], 1+dp[top]);
				maxAns=Math.max(maxAns, dp[ch]);
			}
		}
		System.out.println(maxAns);

	}
}