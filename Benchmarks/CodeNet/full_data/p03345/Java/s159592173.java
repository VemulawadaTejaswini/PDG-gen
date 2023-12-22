//package codeforces;
import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		long t = sc.nextLong();
		long n = sc.nextLong();
		long h = sc.nextLong();
		
		long k =sc.nextLong();
		
		long p,q,r;
		long hh = 0;
		while(hh<k)
		{
			p = n+h;
			q = t+h;
			r = t+n;
			
			t = p;
			n = q;
			h = r;
			
			hh++;
			//System.out.print("1"+" ");
		}
		//System.out.println("hiii");
		long answer = t - n;
		long absolute = Math.abs(answer);
		
		if(absolute>(int)(Math.pow(10, 18)))
		{
			System.out.println("Unfair");
		}
		else
		{
			System.out.println(answer);
		}
		
	}
}
