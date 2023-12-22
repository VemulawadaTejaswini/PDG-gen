/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{

    
    
    
    int i;
    
    int n;
        Scanner s = new Scanner(System.in);
       
        
        n = s.nextInt();
        int a[] = new int[n];
        
        
       
        
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
          
        }
   int  val ;
    int num =n;
    while(num!=1)
    {
        
        for(i=0;i<num-1;i++)
        {
           val = a[i]-a[i+1] ;
           
           val = Math.abs(val);
           
           a[i]=val;
           
        }
        
        num=num-1;
        
	}
    
    System.out.println(a[0]);
    
    
	}
}
