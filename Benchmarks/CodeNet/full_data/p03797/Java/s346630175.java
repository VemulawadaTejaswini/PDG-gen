/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long c = sc.nextLong();
		long count = 0;
		
		if(c >= s * 2) {
			count += s;
			c = c - s * 2;
		} else {
			count += c / 2;
		}
		
		if(c >= 4) {
			count += c / 4;
		}
		
		System.out.println(count);
	}
}