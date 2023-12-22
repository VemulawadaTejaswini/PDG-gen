//package work1;
import java.io.*;
import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		BigInteger []a=new BigInteger[n+1];
		int []x=new int[n*4];
		int []y=new int[n*4];
		int cnt=0;
		for(int i=1;i<=n;++i)
		{
			a[i]=cin.nextBigInteger();
			if(i>1)
			{
				if(a[i].compareTo(a[i-1])<0)
				{
					if(a[i].compareTo(BigInteger.ZERO)>0) 
					{
						x[cnt]=i-1; 
						y[cnt++]=i;
						a[i].add(a[i-1]);
					}
					else if(a[i].equals(BigInteger.ZERO))
					{
						x[cnt]=i-1;
						y[cnt++]=i;
						a[i].add(a[i-1]);
					}
					else if(a[i-1].compareTo(BigInteger.ZERO)<=0)
					{
						x[cnt]=i;
						y[cnt++]=i-1;
					}
					else if(a[i].abs().compareTo(a[i-1].abs())>=0) 
					{
						x[cnt]=i; y[cnt++]=i-1;
						x[cnt]=i; y[cnt++]=i-1;
					}
					else 
					{
						x[cnt]=i-1; y[cnt++]=i;
						x[cnt]=i-1; y[cnt++]=i;
						a[i].add(a[i-1].multiply(BigInteger.valueOf(2)));
					}
				}
			}
		}
		System.out.println(cnt);
		for(int i=0;i<cnt;++i) System.out.println(x[i]+" "+y[i]);
	}
}