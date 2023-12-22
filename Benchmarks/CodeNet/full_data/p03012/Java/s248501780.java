import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		int [] w=new int [n];
		for(int i=0;i<n;i++)
		{
			w[i]=in.nextInt();
			sum=sum+w[i];
		}
		int min=10000000;
		int leftsum=0;
		for(int i=n-1;i>=0;i--)
		{
			sum=sum-w[i];
			leftsum=leftsum+w[i];
			int diff=Math.abs(sum-leftsum);
			if(min>diff)
				min=diff;
		}
		System.out.println(min);
	}
}
	