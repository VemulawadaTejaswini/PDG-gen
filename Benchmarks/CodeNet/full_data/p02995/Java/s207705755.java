

import java.util.Scanner;

public class Main {
	   static long gcd(long a, long b) 
	    { 
	    if (a == 0) 
	        return b;  
	    return gcd(b % a, a);  
	    } 
	      
	    // method to return LCM of two numbers 
	    static long lcm(long a, long b) 
	    { 
	        return (a*b)/gcd(a, b); 
	    } 
	static long find(long x,long c,long d)
	{
		long ans=0;
		ans=x/d;
		ans+=x/c;
		ans-=x/lcm(c,d);
		return ans;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		long c=scan.nextLong();
		long d=scan.nextLong();
		
		long ans=(b-find(b,c,d))-((a-1)-find(a-1,c,d));
		System.out.println(ans);
	}
}
