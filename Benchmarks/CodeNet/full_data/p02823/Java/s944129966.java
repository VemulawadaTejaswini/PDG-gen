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
		long ans=0;
		if((b-a)%2==1)
		{
			if(b>(n-a))
			{
				ans=n-a-1;
			}
			else
			{
				ans=b-1;
			}
		}
		else
		{
			ans=(b-a)/2;
		}
		System.out.println(ans);
	}
}
	