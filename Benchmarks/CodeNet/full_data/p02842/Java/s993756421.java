/* package codechef; // don't place package name! */

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
		double kk=(n/1.08);
		long k=(long)kk;
		if((long)(k*1.08)==n)
		System.out.println(k);
		else if((long)((k+1)*1.08)==n)
		System.out.println(k+1);
		else
		System.out.println(":(");
	}
}