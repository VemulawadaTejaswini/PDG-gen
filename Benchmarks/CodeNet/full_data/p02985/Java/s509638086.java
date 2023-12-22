

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static ArrayList<Integer>[] adj;
	static int k=0;
	static int ans=k;
	static int mod=1000000007;
	public static void dfs(int u,int p)
	{
		int count=k-1;
		if(p!=-1)count--;
		for(int to:adj[u])
		{
			if(to==p)continue;
			if(count<=0)
			{
				ans=0;
//				System.out.println("lol");
				return;
			}
//			System.out.println("g");
//			System.out.println(count);
			ans=(int)(ans*1L*count)%1000000007;
//			System.out.println(ans);
			count--;
//			ans=ans%mod;
			dfs(to,u);
		}
		
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		 k=scan.nextInt();
		adj=new ArrayList[n];
		ans=k;
		for(int i=0;i<n;i++)
		{
			adj[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n-1;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			u--;v--;
			adj[u].add(v);
			adj[v].add(u);
		}
		dfs(0,-1);
		System.out.println(ans);
	}
}
