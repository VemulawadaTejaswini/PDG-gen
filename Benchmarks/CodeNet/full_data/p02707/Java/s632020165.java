/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */
public class Main
 
 
{
    static Scanner in = new Scanner(System.in);
    
    public static void solve()
    {
        int n=in.nextInt();
        int[] a = new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            a[i]=in.nextInt();
        }
        
        int[] ans= new int[n+1];
        
        for(int i=0;i<n-1;i++)
        {
            ans[a[i]]++;
        }
        
        for(int i=1;i<=n;i++)
        {
            System.out.println(ans[i]);
        }
        
        
        
    }
    

    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int t=1;
		//in.nextLine();
		
		while(t>0)
		{
		    
		    solve();
		    t--;
		}
		
		
	
	//	System.out.println(x);
	}
}
