/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static long solve(long n){
		long ans = 1l;
		while(n>0){
			n >>= 1l;
			ans <<= 1l;
		}
		return ans-1l;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(solve(n));
		// your code goes here
	}
}