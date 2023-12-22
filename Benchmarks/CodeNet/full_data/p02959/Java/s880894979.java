import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
    	int n=x.nextInt();
		long c=0;
    	long a[]=new long[n+1];
		long b[]=new long[n];
		for(int i=0;i<n+1;i++)
		{
			a[i]=x.nextLong();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=x.nextLong();
		}
		for(int i=0;i<n;i++)
		{
			c+=Math.min((a[i]+a[i+1]),b[i]);
		}
		System.out.println(c);
	}
}