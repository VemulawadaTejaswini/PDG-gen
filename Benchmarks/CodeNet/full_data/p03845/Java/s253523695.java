import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.ThreadLocalRandom;
public class Main 
{
	
	static long gcd(long a, long b) 
	{
		if (b == 0)
		{	
			return a;
		}
		
		else
		{
			 return gcd(b, a % b);
		}
	}
	public static void main(String[] args) throws Exception
	{

		
		   PrintWriter out = new PrintWriter(System.out);
		   Scanner in = new Scanner(System.in);
		 // long n , k , q;
		  
		int n;
		n = in.nextInt();
		//b = in.nextInt();
		int t[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			t[i] = in.nextInt();
		}
		int p = in.nextInt();
		int pro[] = new int[p];
		int nw[] = new int[p];
		for(int i = 0 ; i < p; i++)
		{
			pro[i] = in.nextInt();
			pro[i]--;
			nw[i] = in.nextInt();
			int k = t[pro[i]];
			t[pro[i]] = nw[i];
			int sum = 0;
			for(int j = 0; j < n; j++)
			{
				sum += t[j];
			}
			t[pro[i]] = k;
			out.println(sum);
		}
		int sum = 0;
//		for(int i = 0; i < n; i++)
//		{
//			sum += t[i];
//		}
//		out.println(sum);
	   out.close();
	}
}