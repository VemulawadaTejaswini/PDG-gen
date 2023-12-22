/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static long solve(long a){
		if(a==0){
			return 0;
		}
		return 1l+solve(a/2l)*2l;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		System.out.println(solve(a));
		// your code goes here
	}
}