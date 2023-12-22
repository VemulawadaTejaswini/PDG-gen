/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		String s=bu.readLine();
		if(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5)) System.out.print("Yes");
		else System.out.print("No");
	}
}