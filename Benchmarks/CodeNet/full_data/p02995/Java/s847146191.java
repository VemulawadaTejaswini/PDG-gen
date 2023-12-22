import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		long a=in.nextLong();
		long b=in.nextLong();
		long c=in.nextLong();
		long d=in.nextLong();
		long g=gcd(c,d);
		long q=c*d/g;
		long ans=b/c-(a-1)/c;
		ans=ans+b/d-(a-1)/d;
		ans=ans-b/q+(a-1)/q;
		ans=b-a-ans+1;
		System.out.println(ans);
	}
	
	public static long gcd(long a,long b)
	{
		if(a%b==0)
			return b;
		return gcd(b,a%b);
	}
}
	