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
		int a[][]=new int[2][n];
		for(int i=0;i<2;i++)
		{for(int j=0;j<n;j++)
		{a[i][j]=s.nextInt();}}
		boolean flag=true;
		int count=0;
		for(int i=1;i<n;i++)
		{if(a[0][i-1]<=a[0][i])
		{
		    if(a[0][i-1]>a[1][i] && a[0][i]>a[1][i-1] && a[1][i]<=a[1][i-1])
		    {a[0][i]=a[1][i-1];
		    a[0][i-1]=a[1][i];count++;}
		    flag=true;
		}
		else
		{
		    if(i!=1 && a[0][i-2]<=a[1][i] && a[1][i-1]>=a[1][i])
		    {a[0][i]=a[1][i-1];
		    a[0][i-1]=a[1][i];count++;}
		    else if(i==1 && a[1][i-1]>=a[1][i])
		    {a[0][i]=a[1][i-1];
		    a[0][i-1]=a[1][i];count++;count++;}
		    else
		    {flag=false;break;}
		}}   
		if(flag)
		System.out.println(count);
		else
		System.out.println("-1");}}