

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int gcd(int a, int b) 
	{ 
	    if (a == 0) 
	        return b; 
	    return gcd(b%a, a); 
	} 
	  

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int cur=scan.nextInt();
		ar[i]=cur;	
		}
		int gcd=gcd(ar[0],ar[1]);
		for(int i=2;i<n;i++)
		{
			gcd=gcd(ar[i],gcd);
		}
		System.out.println(gcd);
}	
}
