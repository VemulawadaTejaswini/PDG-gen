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
	    int n=s.nextInt();
	    long k=s.nextLong();
	    long a[]=new long[n];
	    long sum=0;
	    for(int i=0;i<n;i++)
	    {a[i]=s.nextLong();}
	    Arrays.sort(a);
	    for(int i=0;i<n-k;i++)
	    {sum+=a[i];}
	    System.out.println(sum);
	}}