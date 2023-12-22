/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int s[]=new int[n];
		for(int i=0;i<n;i++)s[i]=in.nextInt();
		int a[]=new int[n];
		a[n-1]=0;
		a[n-2]=s[n-1]>s[n-2]?(s[n-1]-s[n-2]):(s[n-2]-s[n-1]);
		for(int i=n-3;i>=0;i--){
		    int m1=a[i+2]+((s[i+2]>s[i])?(s[i+2]-s[i]):(s[i]-s[i+2]));
		    int m2=a[i+1]+((s[i+1]>s[i])?(s[i+1]-s[i]):(s[i]-s[i+1]));
		    a[i]=m1>m2?m2:m1;
		}
		System.out.println(a[0]);
	}
}
