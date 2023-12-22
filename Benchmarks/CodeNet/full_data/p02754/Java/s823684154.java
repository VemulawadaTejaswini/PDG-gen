import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long a=in.nextLong();
		long b=in.nextLong();
		long q=a+b;
		long m=0;
		if(n%q<=a)
		{
			m=n%q;
		}
		else
		{
			m=a;
		}
		System.out.println((n/q)*a+m);
	}
}
	