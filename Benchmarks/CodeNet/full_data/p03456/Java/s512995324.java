/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		long a = Long.parseLong(in.nextInt() + "" + in.nextInt());
		
		long s = (long) Math.sqrt(a);
		if(s * s == a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}