

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] adj;
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		adj=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			adj[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			u--;v--;
			adj[u].add(v);
		}
//		System.out.println(adj[0].get(0));
		int dist[][]=new int[n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
				dist[i][j]=Integer.MAX_VALUE-10;
		}
		Queue<fok> que=new LinkedList<fok>();
		int s=scan.nextInt()-1;
		int t=scan.nextInt()-1;
		que.add(new fok(s,0));
		dist[s][0]=0;
		while(!que.isEmpty())
		{
			
			fok cur=que.poll();
//			System.out.println(cur.a);
			int pos=cur.a;
			int rem=cur.b;
			for(int to:adj[pos])
			{
//				System.out.println("LOL");
				if(dist[to][(rem+1)%3]>dist[pos][rem]+1) {
					dist[to][(rem+1)%3]=dist[pos][rem]+1;
					que.add(new fok(to,(rem+1)%3));
				}
			}
			
		}
	
		if(dist[t][0]==Integer.MAX_VALUE-10) {
			dist[t][0]=-3;
		}
		System.out.println(dist[t][0]/3);
	}
}
class fok{
	int a;int b;
	fok(int x,int y)
	{
		a=x;
		b=y;
		
	}
}
