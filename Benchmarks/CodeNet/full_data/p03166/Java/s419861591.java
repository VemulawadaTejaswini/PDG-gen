/*													   *********************
													   	  G. LONGEST PATH
													   *********************                                                    */
													   
import java.util.*;
import java.io.*;
public class Main
{
	
	static int c=0;
	public static int util(int n,LinkedList<Integer> graph[],int [] max)
	{
		
		if(max[n]>=0)
			return max[n];
		if(graph[n].size()==0){
			max[n]=0;
			return 0;}
		
		for(int i=0;i<graph[n].size();i++)
			max[n]=Math.max(1+util(graph[n].get(i),graph,max),max[n]);
			
		return max[n];
		
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inp[]=br.readLine().split(" ");
		int n=Integer.parseInt(inp[0]),m=Integer.parseInt(inp[1]);
		LinkedList<Integer> graph[]=new LinkedList[n+1];
		for(int i=1;i<=n;i++)
			graph[i]=new LinkedList<Integer>();
		
		for(int i=0;i<m;i++)
		{
			inp=br.readLine().split(" ");
			graph[Integer.parseInt(inp[0])].add(Integer.parseInt(inp[1]));
		}
		int max[]=new int[n+1];
		Arrays.fill(max,Integer.MIN_VALUE);
		for(int i=0;i<n;i++)
		util(i+1,graph,max);
		long ans=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++)
			if(max[i]>ans)
				ans=max[i];
		
		System.out.println(ans);

	}
}