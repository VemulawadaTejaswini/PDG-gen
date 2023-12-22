/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long ans = 1;
		for(int i = 0; i < n; ++i) {
			ans = lcm(ans, in.nextLong());
		}
		
		System.out.println(ans);
	}
	
	
	public static long gcd(long a, long b) {
		if( b == 0 ) return a;
		return gcd(b, a%b);
	}
	
	public static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}
}