/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double a[]=new double[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextDouble();
		
		double p[][]=new double[n+1][n+1];
		p[0][0]=1;
		for(int i=1;i<=n;i++){
		    double h=a[i-1];
		    double t=1-h;
		    p[0][i]=t*p[0][i-1];
		    for(int j=1;j<=i;j++){
		        p[j][i]=h*p[j-1][i-1]+t*p[j][i-1];
		    }
		}
		double ans=0;
		for(int i=n/2 + 1;i<=n;i++){
		    ans+=p[i][n];
		}
		System.out.println(ans);
		
	}
}
