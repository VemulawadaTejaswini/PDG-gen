import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
 
		long n=s.nextLong();
		long a=s.nextLong);
		long b=s.nextLong();
 
		long d=Math.abs(a-b);
		int ans=0;
		if(d%2==0)
		ans=d/2;
		else
		ans=Math.max(a,b)-1;
 
		System.out.println(ans);
		}
}