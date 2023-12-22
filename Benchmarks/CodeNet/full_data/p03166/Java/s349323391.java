/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static HashMap<Integer,HashMap<Integer,Integer>>gr;
	public static long solve(int i,long []dp,HashMap<Integer,HashMap<Integer,Integer>>gr)
	{
		
		if(dp[i]!=-1)
		return dp[i];
		long ret=0;
		if(gr.containsKey(i))
		{
		for(int y:gr.get(i).keySet())
		{
		//	System.out.println(i+" "+y);
			ret=Math.max(ret,solve(y,dp,gr)+1);
		}
		}
	//	System.out.println(ret+" i hai"+i);
		
		dp[i]=ret;
		return ret;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		gr=new HashMap<>();
		while(m-->0)
		{
			int a,b;
			a=scn.nextInt();
			b=scn.nextInt();
			if(gr.containsKey(a))
			{
				gr.get(a).put(b,1);
			}
			else
			{
				HashMap<Integer,Integer>map=new HashMap<>();
				map.put(b,1);
				gr.put(a,map);
			}
		}
		//System.out.println(gr);
		// StringBuilder sb=new StringBuilder();
		// for(int x:gr.keySet())
		// {
		// 	sb.append(x+"->");
		// 	for(int y:gr.get(x).keySet())
		// 	{
		// 		sb.append(y+",");
		// 	}
		// 	sb.append("\n");
		// }
		// System.out.println(sb);
		long an=-1;
		long []dp=new long[100000];
		for(int i=0;i<=n;i++)
		{
			dp[i]=-1;
		}
		for(int x:gr.keySet())
		{
		
			an=Math.max(an,solve(x,dp,gr));
		}
		System.out.println(an);
	}
}