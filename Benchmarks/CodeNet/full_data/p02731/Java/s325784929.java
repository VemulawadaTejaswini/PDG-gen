/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double len = 0.0;
		double a=0.0,b=0.0;
		if(n%3==0)
		{
		    len = n/3.0;
		    a=n/3.0;
		    b=n/3.0;
		}
		else{
		    if(n%3==1)
		    {
		        a = (n-1.0)/3.0;
		        len=a;
		        b = (double)n-(2.0*a);
		    }
		    else
		    {
		        a = (n+1.0)/3.0;
		        len=a;
		        b = (double)n-(2.0*a);
		    }
		}
		double ans = len*a*b;
		System.out.printf("%.12f",ans);
		
	}
}