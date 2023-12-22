/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		long sum = 0;
		for(int i=0;i<n;++i){
			sum+=sc.nextInt();
		}
		if(sum >= h) System.out.print("Yes");
		else System.out.print("No");
		
	}
}