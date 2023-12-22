/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int a=in.nextInt();
	    int b=in.nextInt();
	    if(Math.abs(a-b)%2==0){
	        System.out.println("Alice");
	    }
	    else{
	        System.out.println("Borys");
	    }
	}
}
