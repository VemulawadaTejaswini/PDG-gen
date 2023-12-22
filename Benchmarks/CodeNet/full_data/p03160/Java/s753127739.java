import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			int n=Integer.parseInt(inp.readLine());
			String aa[]=inp.readLine().split(" ");
			long arr[]=new long[n];

			for(int i=0;i<arr.length;i++)
			{
				arr[i]=Long.parseLong(aa[i]);
			}
			PriorityQueue<Pair>pr=new PriorityQueue<>((a,b)->(int)(a.b-b.a));
			boolean visited[]=new boolean[n];
			visited[0]=true;
			pr.offer(new Pair(0,(long)0));
			long cost[]=new long[n];
			while(pr.size()!=0)
			{
				// if(pr.peek().a==arr.length-1){break;}
				Pair t=pr.poll();
				
				for(int k=t.a+1;k<=t.a+2 && k<arr.length;k++)
				{
					if(!visited[k] || cost[k]>t.b+Math.abs(arr[k]-arr[t.a]))
					{
						visited[k]=true;
						pr.offer(new Pair(k,t.b+Math.abs(arr[k]-arr[t.a])));
						cost[k]=t.b+Math.abs(arr[k]-arr[t.a]);

					}
				}
			}
			System.out.println(cost[n-1]);
		
	}
	
}
class Pair
{
	int a;
	long b;
	
	Pair(int e, long f)
	{
		a=e;
		b=f;
		
	}
}