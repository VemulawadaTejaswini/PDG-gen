/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int n=s.nextInt();
		int k=Math.max(r,c);
		int d=n/k;
		int g=n%k;
		if(g==0)
		System.out.println(d);
		else
		System.out.println(d+1);}}