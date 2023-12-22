=

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long k=scan.nextLong();
//		System.out.println((1^0)+" "+(6^0)+" "+(3^0));
		long ar[]=new long[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextLong();
			
		}
		long now=0l;
		long ans=0l;
		for(int j=50;j>=0;j--)
		{
			if(((1L<<j)+now)>k)continue;
			int num=0;
//			System.out.println(j);
			for(int i=0;i<n;i++)
			{
				if((ar[i]&(1L<<(j)))>=1)num++;
				
			}
			if(num<=(n/2)) {
				now+=(1L<<j);
//				System.out.println("yes"+" "+num);
			}
		}
//		System.out.println(now);
		for(int i=0;i<n;i++)
		{
			ans+=(ar[i]^now);
		}
		System.out.println(ans);
	}
}
