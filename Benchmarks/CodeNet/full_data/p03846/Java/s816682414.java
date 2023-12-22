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
		int cnt = 0;
		boolean flag = true;
		HashSet<Integer> s = new HashSet<Integer>(); 
		int kk[] = new int[n];
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			
			a[i] = in.nextInt();
		    kk[a[i]]++;
		}
	//	for(int i = 0; i < n; i++) out.print(kk[i] + " ");
		if( n % 2 == 0)
		for(int i = 0; i < n; i++)
		{
			
			if(kk[i]!= 2&& kk[i]!= 0) flag = false;
		}
		else 
		for(int i = 1 ; i < n; i++)
		{
			
			if(kk[i]!= 2 && kk[i]!= 0) flag = false;
		}
	  if( n % 2 != 0)if(kk[0] != 1) flag = false;
		cnt = 1;
		int i = 0;
		while(i < n / 2){ cnt = cnt * 2 % (1000000000 + 7);i++;}
		if(flag)
		out.println(cnt);
		else out.println(0);
	
		
//		for(int i = 0; i < n; i++)
//		{
//			sum += t[i];
//		}
//		out.println(sum);
	   out.close();
	}
}