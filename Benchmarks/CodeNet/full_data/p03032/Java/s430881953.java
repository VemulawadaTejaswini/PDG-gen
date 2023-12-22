

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> ans;
	static int r;
	static long s;
	static int n;
	static long realans=0;
	public static void solve(int n)
	{
		int d=0;
		for(int ii=0;ii<Math.min(n, r);ii++)
		{
			if(ans.get(ii)>=0)continue;
			d+=ans.get(ii);
		}
		
		s-=d;
		realans=Math.max(realans,s);
	}
	public static void main(String args[])
	
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int k=scan.nextInt();
		ans=new ArrayList<Integer>();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
			
		}
		for(int i=1;i<=Math.min(n, k);i++)
		{
			for(int l=0;l<=i;l++)
			{
				ans=new ArrayList<Integer>();
				 s=0;
				for(int j=0;j<l;j++)
				{
					ans.add(ar[j]);
					s+=ar[j];
				}
				for(int h=n-1;h>=n-i+l;h--)
				{
					ans.add(ar[h]);
					s+=ar[h];
				}
				Collections.sort(ans);
				
				
				 r=k-i;
				solve(i);
				
			}
			
		}
		System.out.println(realans);
	}
}
