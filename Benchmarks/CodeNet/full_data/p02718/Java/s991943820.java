/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
public class Main{
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m=s.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++)
	{a[i]=s.nextInt();
	sum+=a[i];}
	Arrays.sort(a);
	if(a[n-m]>=(int)Math.ceil(sum/(4.0*m)))
	System.out.println("Yes");
	else
	System.out.println("No");
	}
}