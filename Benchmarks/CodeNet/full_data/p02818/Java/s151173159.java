import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		long a=in.nextLong();
		long b=in.nextLong();
		long k=in.nextLong();
		if(k>=a)
		{
			k=k-a;
			a=0;
		}
		else
		{
			a=a-k;
			k=0;
		}
		if(k>b)
		{
			b=0;
		}
		else
		{
			b=b-k;
		}
		System.out.println(a+" "+b);
	}
}
	