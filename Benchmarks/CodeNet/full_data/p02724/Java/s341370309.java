/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String s=br.readLine().trim();
		//System.out.println(s);
		
		int t=Integer.parseInt(br.readLine());
		
		int coin_big= t/500;
		int rem= t%500;
		
		int coin_small=rem/5;
		
		int ans= (coin_big*1000 + coin_small*5 );
		
		System.out.println(ans);
		
		/*if((s.charAt(2)==s.charAt(3)) && (s.charAt(4)==s.charAt(5)))
		    System.out.println("Yes");
		else
		    System.out.println("No");*/
	}
}
