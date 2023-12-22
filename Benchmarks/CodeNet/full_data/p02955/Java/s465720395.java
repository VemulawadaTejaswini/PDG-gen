

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int ar[]=new int[n];
		long sum=0;
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
			sum+=ar[i];
		}
		ArrayList<Integer> div=new ArrayList<Integer>();
		for(int i=1;i*i<=sum;i++)
		{
			if(sum%i==0)
			{
				div.add(i);
				div.add((int)(sum/i));
				
			}
			
		}
		int ans=1;
		for(int x:div)
		{
			int r[]=new int[n];
			for(int i=0;i<n;i++)
			{
				r[i]=ar[i]%x;
			}
			Arrays.sort(r);
			int inc[]=new int[n+1];
			int dec[]=new int[n+1];
			for(int j=0;j<n;j++)
			{
				dec[j+1]=dec[j]+r[j];
				inc[j+1]=inc[j]+(x-r[j]);
				
			}
//			if(x==7) {
//				for(int q:r)System.out.print(q+" ");
//				System.out.println();
////				for(int w:dec)
//				for(int q:dec)System.out.print(q+" ");
//				System.out.println();
//				for(int q:inc)System.out.print(q+" ");
//				System.out.println("new");
//				}
			for(int j=0;j<=n;j++)
			{
				if(dec[j]-dec[0]==inc[n]-inc[j])
				{
					if(dec[j]-dec[0]<=k)
					{
						ans=Math.max(ans,x);
						break;
					}
				}
			}
			
						
			
		}
		System.out.println(ans);
	}
}
