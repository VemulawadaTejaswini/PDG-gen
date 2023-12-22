import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			String h[]=inp.readLine().split(" ");

			int n=Integer.parseInt(h[0]);
			int k=Integer.parseInt(h[1]);
			String aa[]=inp.readLine().split(" ");
			long arr[]=new long[n];

			for(int i=0;i<arr.length;i++)
			{
				arr[i]=Long.parseLong(aa[i]);
			}
			// PriorityQueue<Pair>pr=new PriorityQueue<>((a,b)->(int)(a.b-b.a));
			// boolean visited[]=new boolean[n];
			// visited[0]=true;
			// pr.offer(new Pair(0,(long)0));
			long cost[]=new long[n];
			cost[1]=Math.abs(arr[1]-arr[0]);
			for(int i=2;i<n;i++)
			{
				long min=Integer.MAX_VALUE;
				for(int j=1;j<=k && i>=j;j++){
				min=Math.min(cost[i-j]+Math.abs(arr[i]-arr[i-j]),min);}
				cost[i]=min;
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