/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		InputStreamReader isr = new InputStreamReader(System.in);
　　　　　　　　　　BufferedReader br = new BufferedReader(isr);
　　　　　　　　　　String buf = br.readLine();
　　　　　　　　　　int num = Integer.parseInt（buf）;
        	int a[];
        	a = new int[num];
        	a[0] = 2;
        	a[1] = 1;
        	for(int i = 2;i < num; i++ ){
        		for(int g = 0;g < num; g++){
        		a[i] = a[g] + a[g+1];
        	}
        	}
        	System.out.println(a[num]);
	}
}