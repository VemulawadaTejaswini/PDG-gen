/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a[]=new int [n];
			int []strg=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
			strg[i]=-1;
		}
	
	
		System.out.println(steps(a,n,0,strg));
	}
	public static int steps(int a[],int n,int ind,int []strg)
	{
		if(ind>=n)
		{
			return 0;
		}
		if(strg[ind]!=-1)
		return strg[ind];
		int max=Integer.MAX_VALUE;
		int ans=0;
		for(int i=ind;i<n;i++)
		{
			int d=Integer.MAX_VALUE;
			if(i+1<n)
			{
				 d=steps(a,n,i+1,strg)+Math.abs(a[i]-a[i+1]);
			}
		int f=Integer.MAX_VALUE;
			if(i+2<n)
			{
				f=steps(a,n,i+2,strg)+Math.abs(a[i]-a[i+2]);
			}
			ans+=(Math.min(d,f)==Integer.MAX_VALUE)?0:Math.min(d,f);
			max=Math.min(max,ans);
		}
		strg[ind]=max;
		return max;
	}
}