package practise;

import java.util.*;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long right;
		long left;
		
		long min=1000000000;
		long max;
		for(long i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				right=n/i;
				if(right>i) max=right;
				else max=i;
				min=Math.min(min,(long)Math.log10(max)+1);
				
			}
		}
		System.out.println(min);
		
	}

}
