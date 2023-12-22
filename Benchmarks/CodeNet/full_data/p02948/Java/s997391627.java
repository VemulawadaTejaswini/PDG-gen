

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		ArrayList<Integer>[] adj=new ArrayList[100001];
		for(int i=0;i<=m;i++)
		{
			adj[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			adj[u].add(v);
		}
		long tot=0;
		PriorityQueue<Integer> que=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=1;i<=m;i++)
		{
			for(int x:adj[i])
			{
				que.add(x);
			}
			if(!que.isEmpty())
			{
				int q=que.poll();
//				System.out.println(q);
				tot+=q;
			}
		}
		System.out.println(tot);
	}
}
