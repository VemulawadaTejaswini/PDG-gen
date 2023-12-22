/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


public class Main {
    static int gcd(int a,int b,int c)
    {int d=gcdd(a,b);
    return gcdd(d,c);
    }
    static int gcdd(int a,int b)
    {if(b==0)
    return a;
    return gcdd(b,a%b);
    }
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	long ans=0;
	for(int i=1;i<=n;i++)
	{for(int j=1;j<=n;j++)
	{for(int k=1;k<=n;k++)
	{ans+=gcd(i,j,k);}}}
	System.out.println(ans);
	}
}