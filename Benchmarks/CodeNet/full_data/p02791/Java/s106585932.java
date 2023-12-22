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
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int max=a[0];
		int min=a[0];
		int count=1;
		for(int i=1;i<n;i++)
		{if(a[i]<=max && a[i]<min)
		{count++;min=a[i];}
		else
		{max=a[i];}}
		System.out.println(count);}}