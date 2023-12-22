/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static int findXORofRange(int  m,int n) {
    int[] patternTracker;

    if(m % 2 == 0)
        patternTracker = new int[] {n, 1, n^1, 0};
    else
        patternTracker = new int[] {m, m^n, m-1, (m-1)^n};

    return patternTracker[(n-m) % 4];
}


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=findXORofRange(a,b);
		System.out.println(c);
	}
}
