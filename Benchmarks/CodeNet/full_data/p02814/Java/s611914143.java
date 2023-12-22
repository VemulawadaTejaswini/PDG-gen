/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
  
    static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long k=s.nextLong();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextLong();
		HashSet<Long>hs1=new HashSet<Long>();
		HashSet<Long>hs2=new HashSet<Long>();
		for(int i=0;i<n;i++)
		hs1.add(a[i]/2);
		Iterator<Long>it=hs1.iterator();
		long kk=1;
		for(int i=0;it.hasNext();i++)
		{kk=lcm(kk,it.next());}
		if(kk>k)
		System.out.println("0");
		else
		{long count=0;
		    for(int i=1;kk*(i)<k;i+=2)
		{count++;}
		System.out.println(count);}}}
		
		