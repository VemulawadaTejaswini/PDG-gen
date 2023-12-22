/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static Scanner sc ;
	public static void main (String[] args) throws java.lang.Exception
	{
	    sc = new Scanner(System.in) ;
	    long ans = 0 ;
	    int n = sc.nextInt() ;
	    for(int i = 0 ; i<n ; i++)
	    {
	    long l = sc.nextInt() ;
	    long r = sc.nextInt() ;
	    ans+=(r-l+1) ;
	    }
	    System.out.println(ans);
	}
}
